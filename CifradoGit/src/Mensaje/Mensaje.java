/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensaje;

import Mensaje.Interfaz.InterfazMensaje;
import java.util.Stack;

/**
 *
 * @author LMD
 */
public class Mensaje implements InterfazMensaje{
    private Stack<Character> mensaje;
    
    public Mensaje(String mensaje){
        this.mensaje = new Stack();
        for (int i = 0; i < mensaje.length(); i++)
            this.mensaje.push(mensaje.charAt(i));
    }
    
    public Mensaje(Stack<Character> mensaje){
        this.mensaje = mensaje;
    }
    
    @Override
    public int getLongitud(){
        return mensaje.size();
    }
    
    @Override
    public Stack<Character> getPila(){
        return mensaje;
    }
    
    @Override
    public void imprimir(){
        mensaje.stream().forEach(System.out::print);
        System.out.println();
    }
}
