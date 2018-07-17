/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Cifrar.interfaz.InterfazCifrar;
import CifrradoPorColumnas.CifradoPorColumnas;
import Mensaje.Interfaz.InterfazMensaje;
import Mensaje.Mensaje;

/**
 *
 * @author LMD
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        InterfazCifrar cifradoPorColumnas = new CifradoPorColumnas();
        InterfazMensaje mensaje = new Mensaje("losmeridianosyparalelosterrestresformanunprecisosistemadecoordenadas".toUpperCase());
        InterfazMensaje mensajeCifrado = cifradoPorColumnas.cifrar(mensaje, 7);
        InterfazMensaje mensajeDescifrado = cifradoPorColumnas.descifrar(mensajeCifrado);
        
        mensaje.imprimir();
        mensajeCifrado.imprimir();
        System.out.println("LDPOSRRIENOIASTMESCASARTRACTODMNAEENIEOAEOLRSUSMRSRSERFNOADXIYLEOPSDEX");
        mensajeDescifrado.imprimir();
    }
}
