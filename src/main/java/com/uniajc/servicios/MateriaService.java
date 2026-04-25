package com.uniajc.servicios;

import com.uniajc.dao.MateriaDao;
import com.uniajc.modelo.Materia;
import java.sql.SQLException;
import java.util.List;

public class MateriaService {
    private MateriaDao dao;

    public MateriaService() {
        dao = new MateriaDao();
    }

    public void registrarMateria(Materia materia) throws SQLException {
        dao.insertar(materia);
    }

    public List<Materia> obtenerMaterias() throws SQLException {
        return dao.listar();
    }
}
