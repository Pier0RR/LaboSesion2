/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion2.Entidades;

import seccion2.Personaje;

/**
 *
 * @author Estudiante
 */
public class Nave extends Personaje{

    
    private int puntaje;
    
    
    public Nave(int vidas, int nivel, int puntaje) {
        super(nivel,vidas);
        this.puntaje = puntaje;
    }
    
    public Nave(){}

    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    
}
