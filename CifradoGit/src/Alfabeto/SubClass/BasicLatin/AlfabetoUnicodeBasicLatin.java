/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alfabeto.SubClass.BasicLatin;

import java.util.LinkedHashSet;

/**
 *
 * @author Cheko-Ivan
 */
public class AlfabetoUnicodeBasicLatin extends Alfabeto.AlfabetoUnicode{
    public AlfabetoUnicodeBasicLatin(){
    super(new LinkedHashSet<>());
    rellena();
    }
    private void rellena(){
        agregar(Character.UnicodeBlock.BASIC_LATIN);
        setCantidad();
    }
}
