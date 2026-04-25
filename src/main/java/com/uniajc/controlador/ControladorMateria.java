package com.uniajc.controlador;

import com.uniajc.modelo.Materia;
import com.uniajc.servicios.MateriaService;
import java.sql.SQLException;
import java.util.List;

public class ControladorMateria {
    private MateriaService service;

    public ControladorMateria() {
        service = new MateriaService();
    }

    public void agregarMateria(Materia materia) throws SQLException {
        service.registrarMateria(materia);
    }

    public List<Materia> listarMaterias() throws SQLException {
        return service.obtenerMaterias();
    }
}
