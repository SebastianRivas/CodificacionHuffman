/**
 *  Nombre del Archivo:
 *  Versión:
 *  Fecha de Creacion:
 *  Fecha de Ultima Modificacion:
 *  Autores:
 */

/**
 *  Clase:
 *  Responsabilidad:
 *  Colaboracion:
 */

import java.util.*;

public class Codificar 
{
    private Archivo objArchivo;
    private Lista objLista;
    private Arbol objArbol;
    private ArrayList <Character> caracteresFinales;
    private ArrayList <String> codigoHuffman;
    
    public Codificar(String path)
    {
        objArchivo = new Archivo(path);
        objLista = new Lista();
        objArbol = new Arbol();
        caracteresFinales = new ArrayList <Character> ();
        codigoHuffman = new ArrayList <String> ();
        
        initCifrado();
    }
    
    public void setObjArchivo(Archivo objArchivo) 
    {
        this.objArchivo = objArchivo;
    }
    
    public Archivo getObjArchivo() 
    {
        return objArchivo;
    }
    
    public void setObjLista(Lista objLista) 
    {
        this.objLista = objLista;
    }
    
    public Lista getObjLista() 
    {
        return objLista;
    }
    
    public void setObjArbol(Arbol objArbol) 
    {
        this.objArbol = objArbol;
    }
    
    public Arbol getObjArbol() 
    {
        return objArbol;
    }
    
    public void setCaracteresFinales(ArrayList <Character> caracter) 
    {
        this.caracteresFinales = caracter;
    }
    
    public ArrayList <Character> getCaracteresFinales() 
    {
        return caracteresFinales;
    }
    
    public void setCodigoHuffman(ArrayList <String> codigoHuffman) 
    {
        this.codigoHuffman = codigoHuffman;
    }
    
    public ArrayList <String> getCodigoHuffman() 
    {
        return codigoHuffman;
    }
    
    public void initCifrado()
    {
        objArchivo.leerArchivo();
        
        objLista.generarLista(objArchivo.getListaCaracteres(), objArchivo.getConteoCaracter());
        objLista.ordenarLista();
    }
    
    public void cifrarHuffman()
    {
        Nodo objNodo;
        
        while (getObjLista().getListaNodos().size() > 1) 
        {
            objNodo = new Nodo();
            objNodo = getObjArbol().construirArbol(getObjLista().getListaNodos().get(0), getObjLista().getListaNodos().get(1));
            
            getObjLista().getListaNodos().remove(0); 
            getObjLista().getListaNodos().remove(0);
            
            getObjLista().getListaNodos().add(objNodo);
            getObjLista().ordenarLista();
        }
    }
    
    public void generarCodigoHuffman() 
    {
        int tamanioListaHojas;
        String huffmanCode;
        Nodo objNodoActual;
        
        getObjArbol().generarListaHojas(objArbol.getRoot());
        tamanioListaHojas = objArbol.getHojas().size();
        
        for (int i = 0; i < tamanioListaHojas; i++) 
        {
            huffmanCode = "";
            objNodoActual = objArbol.getHojas().get(i);
            
            getCaracteresFinales().add(objNodoActual.getCaracter());
            
            while (objNodoActual.getPadre() != null) 
            {
                huffmanCode += objNodoActual.getValorCamino();
                objNodoActual = objNodoActual.getPadre();
            }
            
            getCodigoHuffman().add(huffmanCode);
        }
    }
    
    public String completar8Bits(String cadena) 
    {
        int longitudCadena, bitsFaltantes;
        
        longitudCadena = cadena.length();
        
        if (longitudCadena % 8 != 0)
        {
            bitsFaltantes = 8 - longitudCadena % 8;
            
            for (int i = 0; i < bitsFaltantes; i++)
            {
                cadena += "0";
            }
        }
        
        return cadena;
    }
    
    public int generarAscii(String cadena)
    {
        int Ascii, potencia, valorBite;
        String lineaAscii;
        
        Ascii = 0;
        valorBite = 0;
        
        if (cadena.length() < 8) 
        {
            lineaAscii = completar8Bits(cadena);
        }
        
        else 
        {
            lineaAscii = cadena;
        }
        
        for (int i = 0; i < lineaAscii.length(); i++) 
        {
            valorBite = Integer.parseInt(String.valueOf(lineaAscii.charAt(i)));
            
            if (valorBite == 1) 
            {
                potencia = (int) Math.pow(2, i);
                Ascii += potencia;
            }
        }
        
        return Ascii;
    }
}