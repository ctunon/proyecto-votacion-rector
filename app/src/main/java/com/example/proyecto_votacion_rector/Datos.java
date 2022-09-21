package com.example.proyecto_votacion_rector;

public class Datos {

    private String cedula;
    private int voto;

    public Datos(String cedula_, int voto_){
        cedula = cedula_;
        voto = voto_;


    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula_){
        cedula = cedula_;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto_){
        voto = voto_;
    }




}