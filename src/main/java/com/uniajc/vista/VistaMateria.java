package com.uniajc.vista;

import com.uniajc.controlador.ControladorMateria;
import com.uniajc.modelo.Materia;
import java.sql.SQLException;
import java.util.Scanner;

public class VistaMateria {
    private ControladorMateria controlador;
    private Scanner sc;

    public VistaMateria() {
        controlador = new ControladorMateria();
        sc = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("=== Gestión de Materias ===");
        System.out.println("1. Registrar materia");
        System.out.println("2. Listar materias");
        System.out.println("0. Salir");

        int opcion = sc.nextInt();
        sc.nextLine();

        try {
            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Créditos: ");
                    int creditos = sc.nextInt();

                    Materia m = new Materia(id, nombre, creditos);
                    controlador.agregarMateria(m);
                    System.out.println("Materia registrada.");
                    break;

                case 2:
                    for (Materia materia : controlador.listarMaterias()) {
                        System.out.println(materia.getId() + " - " + materia.getNombre() + " (" + materia.getCreditos() + " créditos)");
                    }
                    break;

                default:
                    System.out.println("Saliendo...");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
