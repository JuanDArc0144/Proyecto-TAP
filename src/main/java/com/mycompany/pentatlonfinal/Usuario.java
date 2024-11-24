
package com.mycompany.pentatlonfinal;

import java.util.ArrayList;

public class Usuario {
    private String Name;
    private int Ganadas;
    private String Contraseña;
    private String Foto;
    private int innasistencias;
    private ArrayList<Competencia> Competencias = new ArrayList<>();
    
    public Usuario(){
        
    }
    public Usuario(String Name, int Ganadas, String Contraseña, String foto, ArrayList<Competencia> competencias, int innasistencias) {
        this.Name = Name;
        this.Ganadas = Ganadas;
        this.Contraseña = Contraseña;
        this.Foto = foto;
        this.Competencias = competencias;
        this.innasistencias = innasistencias;
    }

    public int getInnasistencias() {
        return innasistencias;
    }

    public void setInnasistencias(int innasistencias) {
        this.innasistencias = innasistencias;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String foto) {
        this.Foto = foto;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getGanadas() {
        return Ganadas;
    }

    public void setGanadas(int Ganadas) {
        this.Ganadas = Ganadas;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public ArrayList<Competencia> getCompetencias() {
        return Competencias;
    }

    public void setCompetencias(ArrayList<Competencia> competencias) {
        this.Competencias = competencias;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Name=" + Name + ", Ganadas=" + Ganadas + ", Contrase\u00f1a=" + Contraseña + ", foto=" + Foto + ", innasistencias=" + innasistencias + ", competencias=" + Competencias + '}';
    }

    
    
    
    
}
