package com.black.out.cine.dao;


import jakarta.persistence.*;

@Entity
@Table(name="funciones")
public class Funcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "complejo")
    private String complejo;

    @Column(name = "pelicula")
    private String pelicula;

    @Column(name = "formato")
    private String formato;

    @Column(name = "dia")
    private String dia;

    @Column(name = "horario")
    private String horario;

    public Funcion() {
    }

    public Funcion(Long id, String complejo, String pelicula, String formato, String dia, String horario) {
        this.id = id;
        this.complejo = complejo;
        this.pelicula = pelicula;
        this.formato = formato;
        this.dia = dia;
        this.horario = horario;
    }

    public Funcion(String complejo, String pelicula, String formato, String dia, String horario) {
        this.complejo = complejo;
        this.pelicula = pelicula;
        this.formato = formato;
        this.dia = dia;
        this.horario = horario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComplejo() {
        return complejo;
    }

    public void setComplejo(String complejo) {
        this.complejo = complejo;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
