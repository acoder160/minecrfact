package com.mariaanasanz.examen.ut7;

public class PatataPodrida extends Item{


    public PatataPodrida(int cantidad){
        super(cantidad);
    }

    @Override
    public void usar(Entidad objetivo) {
        if(cantidad>0 && objetivo instanceof Jugador){
            System.out.println(((Jugador)objetivo).getNombre()+" ha usado "+this.getNombre()+"["+cantidad+"]");
            ((Jugador) objetivo).recibirAtaque(5);
            cantidad--;
        }
    }

    @Override
    public String getNombre() {
        return this.getClass().getSimpleName();
    }
}
