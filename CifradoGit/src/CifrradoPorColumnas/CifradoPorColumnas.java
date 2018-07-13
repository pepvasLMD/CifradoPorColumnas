package CifrradoPorColumnas;

import Mensaje.Mensaje;
import Cifrar.interfaz.InterfazCifrar;
import Mensaje.Interfaz.InterfazMensaje;
import java.util.HashMap;
import java.util.Map;
import Excepciones.Mensaje.MensajeExepcion;
/**
 *
 * @author LMD
 */
public class CifradoPorColumnas implements InterfazCifrar{

    @Override
    public InterfazMensaje cifrar(InterfazMensaje mensaje, Integer numeroColumnas) throws MensajeExepcion{
        Map<Integer, Character> mapMensaje = mensaje.toMap();
        Map<Integer, Character> salida = new HashMap();
        
        while(mapMensaje.size() % numeroColumnas != 0)
            mapMensaje.put(mapMensaje.size(), 'X');
        
        for (Integer i = 0; i < numeroColumnas; i++)
            cifrar(mapMensaje, salida, i, numeroColumnas);
        
        return new Mensaje(salida);
    }
    
    private void cifrar(Map<Integer, Character> pilaMensaje, Map<Integer,Character> salida, Integer inicio, Integer numeroColumnas){
        if(pilaMensaje.size() > inicio){
            salida.put(salida.size(), pilaMensaje.get(inicio));
            cifrar(pilaMensaje, salida, inicio + numeroColumnas, numeroColumnas);
        }
    }

    @Override
    public InterfazMensaje descifrar(InterfazMensaje mensaje, Integer numeroColumnas) throws MensajeExepcion {
        Map<Integer, Character> mapMensaje = mensaje.toMap();
        Map<Integer, Character> salida = new HashMap();
        Integer numeroFilas = mapMensaje.size() / numeroColumnas;
        
        for (Integer i = 0; i < numeroFilas; i++)
            descifrar(mapMensaje, salida, i, numeroFilas);
        
        while(salida.get(salida.size()-1) == 'X')
            salida.remove(salida.size()-1);
        
        return new Mensaje(salida);
    }
    
    private void descifrar(Map<Integer, Character> pilaMensaje, Map<Integer, Character> salida, Integer inicio, Integer numeroFilas){
        if(pilaMensaje.size() > inicio){
            salida.put(salida.size(), pilaMensaje.get(inicio));
            descifrar(pilaMensaje, salida, inicio + numeroFilas, numeroFilas);
        }
    }
}