/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cifrar.interfaz;

import Excepciones.Mensaje.MensajeExepcion;
import Mensaje.Interfaz.InterfazMensaje;
/**
 *
 * @author Administrador
 */
public interface InterfazCifrar{
    public InterfazMensaje cifrar(InterfazMensaje mensaje, Integer numeroColumnas) throws MensajeExepcion;
    public InterfazMensaje descifrar(InterfazMensaje mensaje);
}
