package com.practica.elektra.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;

@Entity
public class Clasificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int idDepartamento;
    private int idSubDepartamento;
    private int idClase;
    private int idSubClase;

    // Métodos getter y setter para id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Constructor vacío
    public Clasificacion() {
    }

    // Constructor con parámetros
    public Clasificacion(int idDepartamento, int idSubDepartamento, int idClase, int idSubClase) {
        this.idDepartamento = idDepartamento;
        this.idSubDepartamento = idSubDepartamento;
        this.idClase = idClase;
        this.idSubClase = idSubClase;
    }

    //Getters and Setters


    public void setId(long id) {
        this.id = id;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getIdSubDepartamento() {
        return idSubDepartamento;
    }

    public void setIdSubDepartamento(int idSubDepartamento) {
        this.idSubDepartamento = idSubDepartamento;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public int getIdSubClase() {
        return idSubClase;
    }

    public void setIdSubClase(int idSubClase) {
        this.idSubClase = idSubClase;
    }



}
