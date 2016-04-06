/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miapp;

/**
 * En esta clase están los atributos de contacto.
 *
 * @author Isaac
 * @version 2.0
 */
public class Contacto {

    private int id;

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    /**
     * Constructor por defecto.
     */
    public Contacto() {
    }

    /**
     *
     * @param id introduce los valores de id.
     * @param nombre introduce los valores de nombre.
     * @param apellido introduce los valores de apellido.
     * @param telefono introduce los valores de telefono.
     * @param email introduce los valores de email.
     */
    public Contacto(int id, String nombre, String apellido, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     *
     * @return id de los contactos.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id id de los contactos.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return nombre de los contactos.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre nombre de los contactos.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return apellido de los contactos.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido apellidos de los contactos.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return telefono de contactos.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono telefono de contactos.
     */
    public void setTelf(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return email de los contactos.
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email de los contactos.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String texto;

        texto = "Contacto{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telf=" + telefono + ", email=" + email + '}';
        return texto;
    }

}
