package com.black.out.cine.model;

import com.black.out.cine.dao.Funcion;

import java.util.List;

public class Funciones {

    private List<Funcion> funciones;

    public Funciones(List<Funcion> funciones){
        this.funciones = funciones;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    @Override
    public String toString() {
        return "Funciones{" +
                "funciones=" + funciones +
                '}';
    }
}
