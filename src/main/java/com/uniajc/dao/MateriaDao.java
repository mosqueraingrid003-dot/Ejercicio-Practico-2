package com.uniajc.dao;

import com.uniajc.modelo.Materia;
import com.uniajc.config.ConexionPostgresDatabase;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MateriaDao {
    private Connection conn;

    public MateriaDao() {
        conn = ConexionPostgresDatabase.getConnection();
    }

    public void insertar(Materia materia) throws SQLException {
        String sql = "INSERT INTO materia (id, nombre, creditos) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, materia.getId());
        ps.setString(2, materia.getNombre());
        ps.setInt(3, materia.getCreditos());
        ps.executeUpdate();
    }

    public List<Materia> listar() throws SQLException {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            Materia m = new Materia(rs.getInt("id"), rs.getString("nombre"), rs.getInt("creditos"));
            materias.add(m);
        }
        return materias;
    }
}
