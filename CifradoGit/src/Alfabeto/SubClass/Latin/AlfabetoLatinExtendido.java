/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alfabeto.SubClass.Latin;

import java.util.LinkedHashSet;

/**
 *
 * @author Cheko-Ivan
 */
public class AlfabetoLatinExtendido extends Alfabeto.AlfabetoUnicode{
     public AlfabetoLatinExtendido(){
    super(new LinkedHashSet<>());
    rellena();
    }
    private void rellena(){
        agregar(Character.UnicodeBlock.BASIC_LATIN);
        agregar(Character.UnicodeBlock.LATIN_1_SUPPLEMENT);
        setCantidad();
    }
}
