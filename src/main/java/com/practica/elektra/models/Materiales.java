package com.practica.elektra.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Materiales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String material;
    private int idDepartamento;
    private int idSubDepartamento;
    private int idClase;
    private int idSubClase;

    public Materiales(String dato, String dato1, String dato2, String dato3, String dato4) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Materiales() {
    }

    public Materiales(String material, int idDepartamento, int idSubDepartamento, int idClase, int idSubClase) {
        this.material = material;
        this.idDepartamento = idDepartamento;
        this.idSubDepartamento = idSubDepartamento;
        this.idClase = idClase;
        this.idSubClase = idSubClase;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
