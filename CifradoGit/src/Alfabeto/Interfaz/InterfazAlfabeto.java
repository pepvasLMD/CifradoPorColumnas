/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alfabeto.Interfaz;

import java.util.Collection;

/**
 *
 * @author Cheko-Ivan
 */
public interface InterfazAlfabeto {
    public Boolean existeEnAlfabeto(Collection<Character> mensaje);
    public Integer getTamanioMaximoBinario();   
}
