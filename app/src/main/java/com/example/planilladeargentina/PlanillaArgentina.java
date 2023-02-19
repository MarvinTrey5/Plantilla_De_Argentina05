package com.example.planilladeargentina;


// Clase creada.

public class PlanillaArgentina {
    // Campos que se necesita del enunciado
    // Declaramos para mostrar la foto para obtenerla
    int MostrarFoto;
    String MostrarNombre;
    String MostrarEquipo;
    String MostrarPosicion;
    String MostrarNumero;
    String MostrarNacimiento;
    String Nacionalidad;

    // Creamos el constructor de cada campo de la clase
    public PlanillaArgentina(int mostrarFoto, String mostrarNombre, String mostrarEquipo, String mostrarPosicion,
                             String mostrarNumero, String mostrarNacimiento, String nacionalidad) {
        MostrarFoto = mostrarFoto;
        MostrarNombre = mostrarNombre;
        MostrarEquipo = mostrarEquipo;
        MostrarPosicion = mostrarPosicion;
        MostrarNumero = mostrarNumero;
        MostrarNacimiento = mostrarNacimiento;
        Nacionalidad = nacionalidad;
    }
    // Le asignamos un getter y un setter a cada campo

    public int getMostrarFoto() {
        return MostrarFoto;
    }

    public void setMostrarFoto(int mostrarFoto) {
        MostrarFoto = mostrarFoto;
    }

    public String getMostrarNombre() {
        return MostrarNombre;
    }

    public void setMostrarNombre(String mostrarNombre) {
        MostrarNombre = mostrarNombre;
    }

    public String getMostrarEquipo() {
        return MostrarEquipo;
    }

    public void setMostrarEquipo(String mostrarEquipo) {
        MostrarEquipo = mostrarEquipo;
    }

    public String getMostrarPosicion() {
        return MostrarPosicion;
    }

    public void setMostrarPosicion(String mostrarPosicion) {
        MostrarPosicion = mostrarPosicion;
    }

    public String getMostrarNumero() {
        return MostrarNumero;
    }

    public void setMostrarNumero(String mostrarNumero) {
        MostrarNumero = mostrarNumero;
    }

    public String getMostrarNacimiento() {
        return MostrarNacimiento;
    }

    public void setMostrarNacimiento(String mostrarNacimiento) {
        MostrarNacimiento = mostrarNacimiento;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }
}
