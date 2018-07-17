/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alfabeto;

import Alfabeto.Interfaz.InterfazAlfabeto;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Cheko-Ivan
 */
public abstract class AlfabetoUnicode implements InterfazAlfabeto{
   private final Set<Character.UnicodeBlock> simbolos;
   private Map<Integer, Character> alfabeto;
   
   private Integer tamanioMaximoBinario;
    public AlfabetoUnicode(Set<Character.UnicodeBlock> simbolos){
        this.simbolos = simbolos;
    }
    protected Boolean agregar(Character.UnicodeBlock lenguaje){
        return simbolos.add(lenguaje);
    }
    protected void setCantidad(){
        Integer z = 0;
        for(Integer cInt = 0; cInt <= Character.MAX_VALUE; cInt++)
            if(simbolos.contains(Character.UnicodeBlock.of(cInt)))
                z = cInt;
        tamanioMaximoBinario = Integer.toBinaryString(z).length();
    }
    
   @Override
    public Boolean existeEnAlfabeto(Collection<Character> mensaje){
       if (!mensaje.stream().map((currentChar) -> Character.UnicodeBlock.of(currentChar)).noneMatch((unicodeBlock) -> (!simbolos.contains(unicodeBlock)))) {
           return Boolean.FALSE;
       }
        return Boolean.TRUE;
    }
   @Override
    public Integer getTamanioMaximoBinario(){return tamanioMaximoBinario;}
}
