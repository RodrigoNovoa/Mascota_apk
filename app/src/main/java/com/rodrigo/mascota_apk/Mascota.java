package com.rodrigo.mascota_apk;

/**
 * Created by Medias on 09/08/2016.
 */
public class Mascota {
    String nombre;
    int ranting;
    int imagen;

    public Mascota(String nombre, int ranting, int imagen) {
        this.nombre = nombre;
        this.ranting = ranting;
        this.imagen=imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRanting() {
        return ranting;
    }

    public void setRanting(int ranting) {
        this.ranting = ranting;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }


}


