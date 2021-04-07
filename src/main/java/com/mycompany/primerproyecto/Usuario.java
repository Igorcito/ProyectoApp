/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primerproyecto;

/**
 *
 * @author IGOR
 */
public class Usuario {

    //ATRIBUTOS:
    private String nombre;
    private String password;
    private String email;

    //CONSTRUCTOR VACÍO:

    /**
     *
     */
    public Usuario() {
    }

    //CONSTRUCTOR CON PARÁMETROS:

    /**
     *
     * @param nombre
     * @param password
     * @param email
     */
    public Usuario(String nombre, String password, String email) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }

    //GETTERS & SETTERS: -------------------------------------------------------
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    //MÉTODOS: -----------------------------------------------------------------

    /**
     *  Verifica si nuestro nombre de ususario es apto/correcto al contener,
     *  com minimo, 6 letras.
     * @param nombre
     * @return Nos devuelve el estado de la variable "NOMBREOK".
     */
    public boolean NombreCorrecto(String nombre) {
        //return nombre.length() >= 6; --- Es lo mismo el el if de abajo.

        boolean nombreok = false;
        if (nombre.length() >= 6) {
            nombreok = true;
        }
        return nombreok;
    }

    /**
     * Verifica si la contraseña que hemos introducido es apta según el
     * criterio que hemos definido.
     * @param password
     * @return Nos devuelte el estado de la variable "PASSOK"
     *         que puede ser True o False.
     */
    public boolean PassCorrecta(String password) {
        boolean passok = false;
        if (password.length() > 7) {
            if (password.matches(".*[A-Z].*")) {
                passok = true;
            }
        }
        return passok;

        /*ESTE MÉTODO ESTÁ HECHO SIN UTILIZAR .MATCHES PARA VER SI LA
          CONTRASEÑA CONTIENE MAYÚSCULAS DENTRO.
        
        if(password.length()>7)
        {
            int Mayus = 0;
            for (int i=0; i<=password.length(); i++)
            {
               if (password.charAt(i)>=65 && password.charAt(i)<=90)
               {
                   Mayus++;
               }
            }
            if(Mayus>=1)
            {
                return true;
            } else { 
                return false;
            }     
            
        }
        return true;*/
    }

    /**
     *
     * @param email
     * @return
     */
    public boolean EmailCorrecto(String email) {
        //return email.matches("[.*@.*]")

        boolean emailok = false;
        if (email.matches("[.*@.*]")) {
            emailok = true;
        }
        return emailok;
    }

}
