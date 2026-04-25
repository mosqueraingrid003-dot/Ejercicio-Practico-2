package com.uniajc.main;

import com.uniajc.config.ConexionPostgresDatabase;
import com.uniajc.controlador.ControladorEstudiante;
import com.uniajc.servicios.EstudianteService;
import com.uniajc.vista.VistaEstudiante;

import com.uniajc.controlador.ControladorMateria;
import com.uniajc.servicios.MateriaService;
import com.uniajc.vista.VistaMateria;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practica MVC - Sistema académico Uniajc!");

        // Conexión a la base de datos (Postgres/MySQL según config.properties)
        ConexionPostgresDatabase.getConnection();

        // ============================
        // Bloque Estudiante
        // ============================
        VistaEstudiante vistaEstudiante = new VistaEstudiante();
        EstudianteService estudianteService = new EstudianteService();
        ControladorEstudiante controladorEstudiante = new ControladorEstudiante(vistaEstudiante, estudianteService);

        controladorEstudiante.mostrarTodosLosEstudiantes(); 
        controladorEstudiante.registrarEstudiante(); 
        controladorEstudiante.mostrarTodosLosEstudiantes(); 

        // ============================
        // Bloque Materia
        // ============================
        VistaMateria vistaMateria = new VistaMateria();
        MateriaService materiaService = new MateriaService();
        ControladorMateria controladorMateria = new ControladorMateria();

        // Ejemplo de uso del menú de Materia
        vistaMateria.menu();
    }
}

