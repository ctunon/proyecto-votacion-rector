package com.example.proyecto_votacion_rector.entidades;

public class Datos {

    private Integer id;
    private String cedula;
    private Integer voto;



    public Integer getId() {
        return id;
    }

    public void setId(int id_){
        this.id = id_;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula_){
        this.cedula = cedula_;
    }

    public Integer getVoto() {
        return voto;
    }

    public void setVoto(int voto_){
        this.voto = voto_;
    }




}