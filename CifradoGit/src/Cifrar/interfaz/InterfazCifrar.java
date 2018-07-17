/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cifrar.interfaz;

import Mensaje.Interfaz.InterfazMensaje;
/**
 *
 * @author Administrador
 */
public interface InterfazCifrar{
    public InterfazMensaje cifrar(InterfazMensaje mensaje);
    public InterfazMensaje descifrar(InterfazMensaje mensaje);
}
