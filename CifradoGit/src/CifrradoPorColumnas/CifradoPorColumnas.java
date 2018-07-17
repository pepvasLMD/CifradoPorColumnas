package CifrradoPorColumnas;

import Mensaje.Mensaje;
import java.util.Stack;
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
        Map<Integer, Character> mapMensaje = new HashMap<>(mensaje.toMap());
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
        Map<Integer, Character> mapMensaje = new HashMap<>(mensaje.toMap());
        Map<Integer, Character> salida = new HashMap();
        
        
        for (Integer i = 0; i < numeroColumnas; i++)
            descifrar(mapMensaje, salida, i, numeroColumnas);
        
        return new Mensaje(salida);
    }
    
    private void descifrar(Map<Integer, Character> pilaMensaje, Map<Integer, Character> salida, Integer inicio, Integer numerColumnas){
        if(pilaMensaje.size()/2 > inicio){
            //salida.push(pilaMensaje.get(inicio - 1));
            //salida.push(pilaMensaje.get(inicio + pilaMensaje.size()/2));
            descifrar(pilaMensaje, salida, inicio + 1, numerColumnas);
        }
    }
    
    /*
    @Override
    public InterfazMensaje cifrar(InterfazMensaje mensaje) throws MensajeExcepcion, PermutacionExcepcion{
        Stack<Character> pila = mensaje.getPila();    
        verificar(pila, permutacion);
        Stack<Character> salida = new Stack<>();
        cifrarColeccion(pila, permutacion, salida);
        return new Mensaje(salida);
    }
    
    @Override
    public InterfazMensaje descifrar(InterfazMensaje mensaje, InterfazNumero permutacion) throws MensajeExcepcion, PermutacionExcepcion{
        InterfazMensaje descifrar = cifrar(mensaje, new Numero(permutacion.getInversa()));
        return descifrar;
    }       
    
    private void cifrarColeccion(Stack<Character> entrada, InterfazNumero permutacion, Stack<Character> salida){
        for(Integer i=0; i<entrada.size(); i=i+permutacion.getDigitoMayor()){
            cifrarSeccion(entrada, salida, permutacion.invertido(), i-1);
        }
    }
    
    private void cifrarSeccion(Stack<Character> entrada, Stack<Character> salida, Integer permutacion, Integer indice){
        if(!permutacion.equals(0)){
            salida.push(entrada.get(indice + permutacion%10));
            cifrarSeccion(entrada, salida, permutacion/10, indice);
        }
    }
    
    private void verificar(Stack<Character> pila, InterfazNumero permutacion) throws MensajeExcepcion, PermutacionExcepcion{
        verificarColeccion(pila, permutacion);
        verificarPermutacion(permutacion);
        verificarSecuencia(permutacion);
    }
    
    private void verificarSecuencia(InterfazNumero permutacion) throws PermutacionExcepcion{
        for(Integer i=1;i<= permutacion.getDigitoMayor();i++)
            if(!permutacion.contieneDigito(i))
                throw new PermutacionExcepcion("No cumple la secuencia de " + 1 + " a " + permutacion.getDigitoMayor());
                
    }
    
    private void verificarColeccion(Stack<Character> pila, InterfazNumero permutacion)throws MensajeExcepcion{
        if(pila.size()% permutacion.getDigitoMayor() !=0) 
            throw new MensajeExcepcion("La longitud del mensaje no es multiplo de la permutacion");
    }
    
    private void verificarPermutacion(InterfazNumero permutacion)throws PermutacionExcepcion{
        if(! (permutacion.getValorEntero() > 1.1*Math.pow(10, permutacion.getDigitoMayor()-1)  &&
                permutacion.getValorEntero()<9.9*Math.pow(10, permutacion.getDigitoMayor()-1)))
            throw new PermutacionExcepcion("la permutacion no tiene los valores del 1 al "+ permutacion.getDigitoMayor() +" una sola vez");
    }

*/
}