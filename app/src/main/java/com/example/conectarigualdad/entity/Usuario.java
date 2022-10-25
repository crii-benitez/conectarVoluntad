package com.example.conectarigualdad.entity;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
    private int idUsuario;
    private String email;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String contrasena;
    private String estado;

    private ArrayList<Evento> eventosInscripto;
    private ArrayList<Evento> eventosCreados;
}
