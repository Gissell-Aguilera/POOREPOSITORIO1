/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth.hn.poo.p1.objetos;

/**
 *
 * @author Gisell Aguilera
 */
public class Asignatura {
    private String codigo;
    private String Nombre;
    private Nivel nivel; 

    public Asignatura() {
    }

    public Asignatura(String codigo, String Nombre, Nivel nivel) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.nivel = nivel;
    }
    

    public String getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    
}
