package com.proyectoHorario.horarioSemanal.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Semana")
public class SemanaModel {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    private String nsemana;
    private String lunes;
    private String martes;
    private String miercoles;
    private String jueves;
    private String viernes;
    private String sabado;
    private String domingo;
    private Integer completado;

    public SemanaModel() {
    }

    public SemanaModel(String nsemana, String lunes, String martes, String miercoles, String jueves, String viernes, String sabado, String domingo, Integer completado) {
        this.nsemana = nsemana;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.domingo = domingo;
        this.completado = completado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNsemana() {
        return nsemana;
    }

    public void setNsemana(String nsemana) {
        this.nsemana = nsemana;
    }

    public String getLunes() {
        return lunes;
    }

    public void setLunes(String lunes) {
        this.lunes = lunes;
    }

    public String getMartes() {
        return martes;
    }

    public void setMartes(String martes) {
        this.martes = martes;
    }

    public String getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(String miercoles) {
        this.miercoles = miercoles;
    }

    public String getJueves() {
        return jueves;
    }

    public void setJueves(String jueves) {
        this.jueves = jueves;
    }

    public String getViernes() {
        return viernes;
    }

    public void setViernes(String viernes) {
        this.viernes = viernes;
    }

    public String getSabado() {
        return sabado;
    }

    public void setSabado(String sabado) {
        this.sabado = sabado;
    }

    public String getDomingo() {
        return domingo;
    }

    public void setDomingo(String domingo) {
        this.domingo = domingo;
    }

    public Integer getCompletado() {
        return completado;
    }

    public void setCompletado(Integer completado) {
        this.completado = completado;
    }
}
