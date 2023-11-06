package com.example.crudactivity.Modelo;

public class Usuario {

    private Integer ID;

    private String Nombre;

    private String Correo;

    public Usuario(Integer ID, String nombre, String correo) {
        this.ID = ID;
        Nombre = nombre;
        Correo = correo;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
}
