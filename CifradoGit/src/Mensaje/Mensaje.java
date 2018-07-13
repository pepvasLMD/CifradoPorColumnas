/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensaje;

import Excepciones.Mensaje.MensajeExepcion;
import Mensaje.Interfaz.InterfazMensaje;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LMD
 */
public class Mensaje implements InterfazMensaje{
    private Map<Integer, Character> mensaje;
    
    public Mensaje(String textoPlano) throws MensajeExepcion{
        if(textoPlano == null) throw new MensajeExepcion("El mensaje debe recibir un valor no nulo");
        mensaje = new HashMap<>();
        if(textoPlano.isEmpty()) throw new MensajeExepcion("El mensaje debe tener al menos 1 caracter");
        for (Integer i = 0; i < textoPlano.length(); i++)
            mensaje.put(i, textoPlano.charAt(i));
    }
    
    public Mensaje(Map<Integer, Character> mensaje) throws MensajeExepcion{
        if(mensaje.isEmpty()) throw new MensajeExepcion("El mensaje debe tener al menos un caracter");
        this.mensaje = mensaje;
    }
    
    @Override
    public Integer getTamanio(){return mensaje.size();}
    
    
    @Override
    public Map<Integer,Character> toMap(){
        return mensaje;
    }
    @Override
    public String toString(){return mensaje.values().stream().map(val->val.toString()).reduce("",String::concat); }
    
    
    public void mostrar(){
        mensaje.values().stream().forEach(System.out::print);
        System.out.println();
    }
}
