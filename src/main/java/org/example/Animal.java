package org.example;

public abstract class Animal {

    protected String nombre;
    protected int peso;
    protected String sexo;

    public Animal(String nombre, int peso, String sexo) {
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String toString(){
        return "Nombre: "+this.nombre+", peso: "+this.peso+", sexo: "+this.sexo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getSexo() { return this.sexo; }

    public void setSexo(String sexo) { this.sexo = sexo; }

    public abstract void hacerSonido();




}
