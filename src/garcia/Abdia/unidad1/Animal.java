/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package garcia.Abdia.unidad1;


public class Animal {
    private String nombre;
    private float peso;
    private int edad;
    private boolean carnivoro;
    
   
    public Animal(){
        
    }
    public Animal (float peso){
        this.peso=peso;
    }
    public Animal (String nombre, float peso){
        this.peso=peso;
        this.nombre=nombre;
    }
    public Animal (String nombre){
       this.nombre=nombre;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }


}
