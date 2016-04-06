/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miapp;

import javax.swing.JOptionPane;

/**
 * En esta clase,está la libreta de contactos y los métodos de edición
 *
 * @author Isaac
 * @version 2.0
 */
public class Libreta {

    private String propietario, dni;

    public Grupo[] arrayGrupo;

    /**
     * Constructor por defecto.
     */
    public Libreta() {
    }

    /**
     *
     * @param propietario introduce los valores del propietario.
     * @param dni introduce los valores del DNI.
     */
    public Libreta(String propietario, String dni) {
        this.propietario = propietario;
        this.dni = dni;
    }

    /**
     *
     * @return propietario. return el propietario de la libreta de contactos.
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     *
     * @param propietario El propietario de la libreta de contactos.
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     *
     * @return dni return el DNI del propietario.
     */
    public String getDni() {
        return dni;
    }

    /**
     *
     * @param dni DNI del propietario.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     *
     * @return arrayGrupo
     */
    public Grupo[] getArrayGrupo() {
        return arrayGrupo;
    }

    /**
     *
     * @param arrayGrupo
     */
    public void setArrayGrupo(Grupo[] arrayGrupo) {
        this.arrayGrupo = arrayGrupo;
    }

    /**
     *
     * @return la posición libre.
     *
     */
    public int cualLibreGrupo() {

        for (int i = 0; i < arrayGrupo.length; i++) {

            if (arrayGrupo[i].getNombreGrupo().equals("")) {
                return i;
            }
        }
        return -1;
    }

    /**
     * i hay hueco libre un grupo es añadido.
     */
    public void engadirGrupo() {
        int libre = cualLibreGrupo();
        if (libre < 0) {
            JOptionPane.showMessageDialog(null, "No hay hueco");
        } else {

            String nombre = JOptionPane.showInputDialog("Introduzca el nombre");

            arrayGrupo[libre - 1].setNombreGrupo(nombre);

        }
    }

    /**
     * Muestrar todo el grupo en una lista.
     *
     */
    public void listarGrupo() {
        String lista = "";

        for (int l = 0; l < arrayGrupo.length; l++) {

            if (arrayGrupo[l].getNombreGrupo().equals("")) {
            } else {
                lista = lista + arrayGrupo[l].getNombreGrupo() + arrayGrupo[l].toString();
            }
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    /**
     *
     * @param nombre El nombre del contacto al que quieres renunciar.
     */
    public void borrarGrupo(String nombre) {
        for (int i = 0; i < arrayGrupo.length; i++) {
            if (arrayGrupo[i].getNombreGrupo().equals(nombre)) {
                arrayGrupo[i].setNombreGrupo("");
            }

        }
    }

    @Override
    public String toString() {
        return "Libreta{" + "propietario=" + propietario + ", dni=" + dni + ", arrayGrupo=" + arrayGrupo + '}';
    }

}