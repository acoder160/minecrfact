package com.mariaanasanz.examen.ut7;

public abstract class Item {
    protected int cantidad;

    public Item(int cantidad){
        this.cantidad = cantidad;
    }

    abstract void usar(Entidad e);
    abstract public String getNombre();
}
