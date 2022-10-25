package com.example.conectarigualdad.entity;

import com.example.conectarigualdad.TipoEventoEnum;

import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private int idEvento;
    private Date fechaCreacion;
    private String titulo;
    private TipoEventoEnum tipo;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaCierre;
    private String ubicacion;
    private String notas;
    private String imagen;
    private String estado;

    private ArrayList<Usuario> usuariosInscriptos;
}
