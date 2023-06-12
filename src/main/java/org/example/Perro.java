package org.example;

public class Perro extends Animal {

    public Perro(String nombre, int peso, String sexo) {
        super(nombre, peso, sexo);
    }

    public String toString() {
        return super.nombre + "," + super.peso + "," + super.sexo;
    }

    public void hacerSonido(){
        System.out.println("guau");

    }

}
