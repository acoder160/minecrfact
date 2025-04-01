package com.mariaanasanz.examen.ut7;

public class Manzana extends Item {

    public Manzana(int cantidad){
        super(cantidad);
    }

    @Override
    public void usar(Entidad objetivo) {
        if(cantidad > 0 && objetivo instanceof Jugador){
            System.out.println(((Jugador)objetivo).getNombre()+" ha usado 1 "+this.getNombre()+"["+cantidad+"]");
            ((Jugador) objetivo).sanar(10);
            cantidad--;
        }
    }

    @Override
    public String getNombre() {
        return this.getClass().getSimpleName();
    }
}
