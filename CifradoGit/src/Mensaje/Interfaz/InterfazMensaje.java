/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensaje.Interfaz;

import java.util.Map;

/**
 *
 * @author Cheko-Ivan
 */
public interface InterfazMensaje {
    public Integer getTamanio();
    public String toString();
    public Map<Integer,Character> toMap();
}
