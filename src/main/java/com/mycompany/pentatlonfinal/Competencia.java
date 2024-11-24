
package com.mycompany.pentatlonfinal;
public class Competencia {
    private String Nombre;
    private int Concursantes;
    private int Innasistentes;
    private String FechaInicio;
    private String FechaFinal;
    private String Descrip;
    private Usuario Ganador;

    public Competencia() {
    }

    public Competencia(String nombre) {
        this.Nombre = nombre;
    }

    public Competencia(String nombre, int Concursantes, int Innasistentes, String FechaInicio, String FechaFinal, String Descrip, Usuario Ganador) {
        this.Nombre = nombre;
        this.Concursantes = Concursantes;
        this.Innasistentes = Innasistentes;
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
        this.Descrip = Descrip;
        this.Ganador = Ganador;
    }

    public Usuario getGanador() {
        return Ganador;
    }

    public void setGanador(Usuario Ganador) {
        this.Ganador = Ganador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getConcursantes() {
        return Concursantes;
    }

    public void setConcursantes(int Concursantes) {
        this.Concursantes = Concursantes;
    }

    public int getInnasistentes() {
        return Innasistentes;
    }

    public void setInnasistentes(int Innasistentes) {
        this.Innasistentes = Innasistentes;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(String FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }

    @Override
    public String toString() {
        return "Competencia{" + "nombre=" + Nombre + ", Concursantes=" + Concursantes + ", Innasistentes=" + Innasistentes + ", FechaInicio=" + FechaInicio + ", FechaFinal=" + FechaFinal + ", Descrip=" + Descrip + ", Ganador=" + Ganador + '}';
    }
    
    
    
    
}
