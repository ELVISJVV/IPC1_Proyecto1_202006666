/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Elvis
 */
public class Bibliografia {

    private String tipo; // tipo de bibliografia: libro, revista o tesis
    private String autor;
    private String titulo;
    private String descripcion;
    private String edicion;
    private String[] temas;
    private String frecuancia;
    private String ejemplares;
    private String area;
    private String copias;
    private String disponibles;

    private String temasConcatenados; //Presentación concatenada de los temas, separados por coma
    private String strTipo;
    private String strEdicion;
    private String strEjemplares;
    private String strCopias; //Presentación de tipo String del atributo copias
    private String strDisponibles; //Presentación de tipo String del atributo disponibles

    public Bibliografia(
            String tipo,
            String autor,
            String titulo,
            String descripcion,
            String edicion,
            String temas,
            String frecuancia,
            String ejemplares,
            String area,
            String copias,
            String disponibles) {

        this.tipo = tipo;
        this.autor = autor;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.edicion = edicion;
        this.temas = temas.split(",");
        this.frecuancia = frecuancia;
        this.ejemplares = ejemplares;
        this.area = area;
        this.copias = copias;
        this.disponibles =disponibles;

        this.temasConcatenados = temas.replace(',', ',');
        this.strTipo = tipo;
        this.strEdicion = edicion;
        this.strEjemplares = ejemplares;
        this.strCopias = copias;
        this.strDisponibles = disponibles;

    }

    public void mostrarTemas() {
        for (String temas : getTemas()) {
            System.out.println(temas);
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo( String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

   

    public String[] getTemas() {
        return temas;
    }

    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    public String getFrecuancia() {
        return frecuancia;
    }

    public void setFrecuancia(String frecuancia) {
        this.frecuancia = frecuancia;
    }

    public String getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(String ejemplares) {
        this.ejemplares = ejemplares;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCopias() {
        return copias;
    }

    public void setCopias(String copias) {
        this.copias = copias;
    }

    public String getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(String disponibles) {
        this.disponibles = disponibles;
    }

    public String getTemasConcatenados() {
        return temasConcatenados;
    }

    public void setTemasConcatenados(String temasConcatenados) {
        this.temasConcatenados = temasConcatenados;
    }

    public String getStrCopias() {
        return strCopias;
    }

    public void setStrCopias(String strCopias) {
        this.strCopias = strCopias;
    }

    public String getStrDisponibles() {
        return strDisponibles;
    }

    public void setStrDisponibles(String strDisponibles) {
        this.strDisponibles = strDisponibles;
    }

    public String getStrTipo() {
        return strTipo;
    }

    public void setStrTipo(String strTipo) {
        this.strTipo = strTipo;
    }

    public String getStrEdicion() {
        return strEdicion;
    }

    public void setStrEdicion(String strEdicion) {
        this.strEdicion = strEdicion;
    }

    public String getStrEjemplares() {
        return strEjemplares;
    }

    public void setStrEjemplares(String strEjemplares) {
        this.strEjemplares = strEjemplares;
    }

}
