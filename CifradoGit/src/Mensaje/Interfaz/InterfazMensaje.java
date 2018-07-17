/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensaje.Interfaz;

import java.util.Stack;

/**
 *
 * @author LMD
 */
public interface InterfazMensaje {
    public int getLongitud();
    public Stack<Character> getPila();
    public void imprimir();
}
