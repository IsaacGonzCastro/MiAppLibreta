/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miapp;

import javax.swing.JOptionPane;

/**
 * En esta clase,están los grupos y los métodos de edición
 * @author Isaac
 * @version 2.0
 */
public class Grupo {

    private String nombreGrupo;

    public Contacto[] arrayContacto;

    /**
     * Constructores por defecto.
     */
    public Grupo() {
    }

    /**
     *
     * @return nombre del Grupo.
     */
    public String getNombreGrupo() {
        return nombreGrupo;
    }

    /**
     * En este método obtenemos el nombre del grupo.
     *
     * @return name
     */
    public String pedirNombre() {
        String res;
        do {
            res = JOptionPane.showInputDialog("Introduzca el nombre de grupo");

            return res;
        } while (res.equals(""));
    }

    /**
     *
     * @param nombreGrupo Nombre del grupo.
     */
    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    /**
     *
     * @return arrayContacts.
     */
    public Contacto[] getArrayContacto() {
        return arrayContacto;
    }

    /**
     *
     * @param arrayContacto
     */
    public void setArrayContacto(Contacto[] arrayContacto) {
        this.arrayContacto = arrayContacto;
    }

    /**
     * Añade un contacto nuevo,si hay un hueco libre.
     */
    public void engadirContactoGrupo() {

        int libre = cualLibre();
        if (libre < 0) {
            JOptionPane.showMessageDialog(null, "No hay hueco");
        } else {

            String nombre = JOptionPane.showInputDialog("Introduzca el nombre");
            String apellido = JOptionPane.showInputDialog("Introduzca el apellido");
            String telefono = JOptionPane.showInputDialog("Introduzca el telefono");
            String email = JOptionPane.showInputDialog("Introduzca el email");

            arrayContacto[libre - 1].setNombre(nombre);
            arrayContacto[libre - 1].setApellido(apellido);
            arrayContacto[libre - 1].setTelf(telefono);
            arrayContacto[libre - 1].setEmail(email);
        }
    }

    /**
     * Enseña todos los contactos de la lista.
     */
    public void listadoContactoGrupo() {
        String lista = "";

        for (int l = 0; l < arrayContacto.length; l++) {

            if (arrayContacto[l].getNombre().equals("")) {
            } else {
                lista = lista + arrayContacto[l].getId() + arrayContacto[l].toString();
            }
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    /**
     *
     * @return la posición libre.
     */
    public int cualLibre() {

        for (int i = 0; i < arrayContacto.length; i++) {

            if (arrayContacto[i].getNombre().equals("")) {
                return i;
            }
        }
        return -1;
    }
}
