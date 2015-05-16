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

import java.io.*;
import java.util.*;

public class Archivo 
{
    private File archivo;
    private FileReader fileReader;
    private FileWriter fileWriter;
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    private ArrayList <Character> listaCaracteres;
    private ArrayList <Integer> conteoCaracter;
    private String diccionario = "abcdefghijklmnopqrstuvwxyz0123456789. ,";
    
    Archivo (String path) 
    {
        archivo = new File(path);
        initArray();
    }
    
    //Metodos Set's y Get's
    public void setDiccionario(String diccionario) 
    {
        this.diccionario = diccionario;
    }
    
    public String getDiccionario() 
    {
        return diccionario;
    }
    
    public void setArchivo(File archivo) 
    {
        this.archivo = archivo;
    }
    
    public File getArchivo() 
    {
        return archivo;
    }
    
    public void setFileReader(FileReader fileReader) 
    {
        this.fileReader = fileReader;
    }
    
    public FileReader getFileReader() 
    {
        return fileReader;
    }
    
    public void setFileWriter(FileWriter fileWriter) 
    {
        this.fileWriter = fileWriter;
    }
    
    public FileWriter getFileWriter() 
    {
        return fileWriter;
    }
    
    public void setBufferedReader(BufferedReader bufferedReader) 
    {
        this.bufferedReader = bufferedReader;
    }
    
    public BufferedReader getBufferedReader() 
    {
        return bufferedReader;
    }
    
    public void setPrintWriter (PrintWriter printWriter) 
    {
        this.printWriter = printWriter;
    }
    
    public PrintWriter getPrintWriter() 
    {
        return printWriter;
    }
    
    public ArrayList <Character> getListaCaracteres() 
    {
        return listaCaracteres;
    }
    
    public void setListaCaracteres(ArrayList <Character> listaCaracteres) 
    {
        this.listaCaracteres = listaCaracteres;
    }
    
    public ArrayList <Integer> getConteoCaracter() 
    {
        return conteoCaracter;
    }
    
    public void setConteoCaracter(ArrayList <Integer> conteo) 
    {
        this.conteoCaracter = conteo;
    }
    
    public void initArray()
    {
        Character caracter;
        
        listaCaracteres = new ArrayList <Character> ();
        conteoCaracter = new ArrayList <Integer> ();
        
        for (int i = 0; i < getDiccionario().length(); i++)
        {
            caracter = getDiccionario().charAt(i);
            
            getListaCaracteres().add(caracter);
            getConteoCaracter().add(0);
        }
    }
    
    public void leerArchivo()
    {
        Character caracter;
        int asciiCaracter, contadorCaracter;
        String linea;
        
        try
        {
            setFileReader(new FileReader(getArchivo()));
            setBufferedReader(new BufferedReader(getFileReader()));
            
            while((linea = getBufferedReader().readLine()) != null)
            {
                for (int j = 0; j < linea.length(); j++) 
                {
                    caracter = linea.charAt(j);
                    
                    asciiCaracter = (int) caracter;
                    contadorCaracter = 0;
                    
                    switch(asciiCaracter)
                    {
                        case 65: case 97:
                        {
                            contadorCaracter = getConteoCaracter().get(0);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(0, contadorCaracter);
                        }; break; //0 ~ A
                        
                        case 66: case 98: 
                        {
                            contadorCaracter = getConteoCaracter().get(1);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(1, contadorCaracter);
                        }; break; //1 ~ B 
                            
                        case 67: case 99: 
                        {
                            contadorCaracter = getConteoCaracter().get(2);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(2, contadorCaracter);
                        }; break; //2 ~ C
                            
                        case 68: case 100: 
                        {
                            contadorCaracter = getConteoCaracter().get(3);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(3, contadorCaracter);
                        }; break; //3 ~ D
                            
                        case 69: case 101: 
                        {
                            contadorCaracter = getConteoCaracter().get(4);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(4, contadorCaracter);
                        }; break; //4 ~ E
                            
                        case 70: case 102: 
                        {
                            contadorCaracter = getConteoCaracter().get(5);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(5, contadorCaracter);
                        }; break; //5 ~ F
                            
                        case 71: case 103: 
                        {
                            contadorCaracter = getConteoCaracter().get(6);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(6, contadorCaracter);
                        }; break; //6 ~ G
                            
                        case 72: case 104: 
                        {
                            contadorCaracter = getConteoCaracter().get(7);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(7, contadorCaracter);
                        }; break; //7 ~ H
                            
                        case 73: case 105: 
                        {
                            contadorCaracter = getConteoCaracter().get(8);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(8, contadorCaracter);
                        }; break; //8 ~ I
                            
                        case 74: case 106: 
                        {
                            contadorCaracter = getConteoCaracter().get(9);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(9, contadorCaracter);
                        }; break; //9 ~ J
                            
                        case 75: case 107: 
                        {
                            contadorCaracter = getConteoCaracter().get(10);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(10, contadorCaracter);
                        }; break; //10 ~ K
                            
                        case 76: case 108: 
                        {
                            contadorCaracter = getConteoCaracter().get(11);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(11, contadorCaracter);
                        }; break; //11 ~ L
                            
                        case 77: case 109: 
                        {
                            contadorCaracter = getConteoCaracter().get(12);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(12, contadorCaracter);
                        }; break; //12 ~ M
                            
                        case 78: case 110: 
                        {
                            contadorCaracter = getConteoCaracter().get(13);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(13, contadorCaracter);
                        }; break; //13 ~ N
                            
                        case 79: case 111: 
                        {
                            contadorCaracter = getConteoCaracter().get(14);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(14, contadorCaracter);
                        }; break; //14 ~ O
                            
                        case 80: case 112: 
                        {
                            contadorCaracter = getConteoCaracter().get(15);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(15, contadorCaracter);
                        }; break; //15 ~ P
                            
                        case 81: case 113: 
                        {
                            contadorCaracter = getConteoCaracter().get(16);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(16, contadorCaracter);
                        }; break; //16 ~ Q
                            
                        case 82: case 114: 
                        {
                            contadorCaracter = getConteoCaracter().get(17);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(17, contadorCaracter);
                        }; break; //17 ~ R
                            
                        case 83: case 115: 
                        {
                            contadorCaracter = getConteoCaracter().get(18);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(18, contadorCaracter);
                        }; break; //18 ~ S
                            
                        case 84: case 116: 
                        {
                            contadorCaracter = getConteoCaracter().get(19);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(19, contadorCaracter);
                        }; break; //19 ~ T
                            
                        case 85: case 117: 
                        {
                            contadorCaracter = getConteoCaracter().get(20);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(20, contadorCaracter);
                        }; break; //20 ~ U
                            
                        case 86: case 118: 
                        {
                            contadorCaracter = getConteoCaracter().get(21);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(21, contadorCaracter);
                        }; break; //21 ~ V
                            
                        case 87: case 119: 
                        {
                            contadorCaracter = getConteoCaracter().get(22);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(22, contadorCaracter);
                        }; break; //22 ~ W
                            
                        case 88: case 120: 
                        {
                            contadorCaracter = getConteoCaracter().get(23);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(23, contadorCaracter);
                        }; break; //23 ~ X
                            
                        case 89: case 121: 
                        {
                            contadorCaracter = getConteoCaracter().get(24);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(24, contadorCaracter);
                        }; break; //24 ~ Y
                            
                        case 90: case 122: 
                        {
                            contadorCaracter = getConteoCaracter().get(25);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(25, contadorCaracter);
                        }; break; //25 ~ Z
                            
                        case 48: 
                        {
                            contadorCaracter = getConteoCaracter().get(26);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(26, contadorCaracter);
                        }; break; //26 ~ 0
                            
                        case 49: 
                        {
                            contadorCaracter = getConteoCaracter().get(27);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(27, contadorCaracter);
                        }; break; //27 ~ 1
                            
                        case 50: 
                        {
                            contadorCaracter = getConteoCaracter().get(28);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(28, contadorCaracter);
                        }; break; //28 ~ 2
                            
                        case 51: 
                        {
                            contadorCaracter = getConteoCaracter().get(29);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(29, contadorCaracter);
                        }; break; //29 ~ 3
                            
                        case 52: 
                        {
                            contadorCaracter = getConteoCaracter().get(30);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(30, contadorCaracter);
                        }; break; //30 ~ 4
                            
                        case 53: 
                        {
                            contadorCaracter = getConteoCaracter().get(31);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(31, contadorCaracter);
                        }; break; //31 ~ 5
                            
                        case 54: 
                        {
                            contadorCaracter = getConteoCaracter().get(32);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(32, contadorCaracter);
                        }; break; //32 ~ 6
                            
                        case 55: 
                        {
                            contadorCaracter = getConteoCaracter().get(33);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(33, contadorCaracter);
                        }; break; //33 ~ 7
                            
                        case 56: 
                        {
                            contadorCaracter = getConteoCaracter().get(34);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(34, contadorCaracter);
                        }; break; //34 ~ 8
                            
                        case 57: 
                        {
                            contadorCaracter = getConteoCaracter().get(35);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(35, contadorCaracter);
                        }; break; //35 ~ 9
                            
                        case 46: 
                        {
                            contadorCaracter = getConteoCaracter().get(36);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(36, contadorCaracter);
                        }; break; //36 ~ .
                            
                        case 32: 
                        {
                            contadorCaracter = getConteoCaracter().get(37);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(37, contadorCaracter);
                        }; break; //37 ~ ' '
                            
                        case 44: 
                        {
                            contadorCaracter = getConteoCaracter().get(38);
                            contadorCaracter++;
                            
                            getConteoCaracter().set(38, contadorCaracter);
                        }; break; //38 ~ ,
                    }
                }
            }
        }
        
        catch(FileNotFoundException fnfe)
        {
            System.err.println(fnfe.getMessage());
        }
        
        catch(IOException ioe)
        {
            System.err.println(ioe.getMessage());
        }
        
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        
        finally 
        {
            try
            {
                if (getFileReader() != null) 
                {
                    getFileReader().close();
                }
            }
            
            catch (Exception e) 
            {
                System.err.println(e.getMessage());
            }
        }
    }
    
    public void escribirArchivo(ArrayList <Character> caracteres, ArrayList <String> codigoHuffman) 
    {
        Character caracter;
        int asciiCaracter;
        String lineaArchivo, nuevaLinea;
        
        try 
        {
            setFileReader(new FileReader(getArchivo()));
            setBufferedReader(new BufferedReader(getFileReader()));
            
            setFileWriter(new FileWriter("/home/android/NetBeansProjects/Proyecto_Fada/src/txt/" + "Hufmman_" + archivo.getName()));
            setPrintWriter(new PrintWriter(getFileWriter()));
            
            while((lineaArchivo = getBufferedReader().readLine()) != null)
            {
                nuevaLinea = "";
                nuevaLinea = lineaArchivo;
                
                for (int j = 0; j < caracteres.size(); j++)
                {
                    caracter = caracteres.get(j);
                    asciiCaracter = (int) caracter;
                    
                    switch(asciiCaracter)
                    {
                        case 97:
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[a|A]", codigoHuffman.get(j));
                        }; break; //0 ~ A
                        
                        case 98: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[b|B]", codigoHuffman.get(j));
                        }; break; //1 ~ B 
                            
                        case 99: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[c|C]", codigoHuffman.get(j));
                        }; break; //2 ~ C
                            
                        case 100: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[d|D]", codigoHuffman.get(j));
                        }; break; //3 ~ D
                            
                        case 101: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[e|E]", codigoHuffman.get(j));
                        }; break; //4 ~ E
                            
                        case 102: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[f|F]", codigoHuffman.get(j));
                        }; break; //5 ~ F
                            
                        case 103: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[g|G]", codigoHuffman.get(j));
                        }; break; //6 ~ G
                            
                        case 104: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[h|H]", codigoHuffman.get(j));
                        }; break; //7 ~ H
                            
                        case 105: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[i|I]", codigoHuffman.get(j));
                        }; break; //8 ~ I
                            
                        case 106: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[j|J]", codigoHuffman.get(j));
                        }; break; //9 ~ J
                            
                        case 107: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[k|K]", codigoHuffman.get(j));
                        }; break; //10 ~ K
                            
                        case 108: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[l|L]", codigoHuffman.get(j));
                        }; break; //11 ~ L
                            
                        case 109: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[m|M]", codigoHuffman.get(j));
                        }; break; //12 ~ M
                            
                        case 110: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[n|N]", codigoHuffman.get(j));
                        }; break; //13 ~ N
                            
                        case 111: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[o|O]", codigoHuffman.get(j));
                        }; break; //14 ~ O
                            
                        case 112: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[p|P]", codigoHuffman.get(j));
                        }; break; //15 ~ P
                            
                        case 113: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[q|Q]", codigoHuffman.get(j));
                        }; break; //16 ~ Q
                            
                        case 114: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[r|R]", codigoHuffman.get(j));
                        }; break; //17 ~ R
                            
                        case 115: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[s|S]", codigoHuffman.get(j));
                        }; break; //18 ~ S
                            
                        case 116: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[t|T]", codigoHuffman.get(j));
                        }; break; //19 ~ T
                            
                        case 117: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[u|U]", codigoHuffman.get(j));
                        }; break; //20 ~ U
                            
                        case 118: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[v|V]", codigoHuffman.get(j));
                        }; break; //21 ~ V
                            
                        case 119: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[w|W]", codigoHuffman.get(j));
                        }; break; //22 ~ W
                            
                        case 120: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[x|X]", codigoHuffman.get(j));
                        }; break; //23 ~ X
                            
                        case 121: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[y|Y]", codigoHuffman.get(j));
                        }; break; //24 ~ Y
                            
                        case 122: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("[z|Z]", codigoHuffman.get(j));
                        }; break; //25 ~ Z
                            
                        case 48: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("0", codigoHuffman.get(j));
                        }; break; //26 ~ 0
                            
                        case 49: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("1", codigoHuffman.get(j));
                        }; break; //27 ~ 1
                            
                        case 50: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("2", codigoHuffman.get(j));
                        }; break; //28 ~ 2
                            
                        case 51: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("3", codigoHuffman.get(j));
                        }; break; //29 ~ 3
                            
                        case 52: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("4", codigoHuffman.get(j));
                        }; break; //30 ~ 4
                            
                        case 53: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("5", codigoHuffman.get(j));
                        }; break; //31 ~ 5
                            
                        case 54: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("6", codigoHuffman.get(j));
                        }; break; //32 ~ 6
                            
                        case 55: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("7", codigoHuffman.get(j));
                        }; break; //33 ~ 7
                            
                        case 56: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("8", codigoHuffman.get(j));
                        }; break; //34 ~ 8
                            
                        case 57: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("9", codigoHuffman.get(j));
                        }; break; //35 ~ 9
                            
                        case 46: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll("\\.", codigoHuffman.get(j));
                        }; break; //36 ~ .
                            
                        case 32: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll(" ", codigoHuffman.get(j));
                        }; break; //37 ~ ' '
                            
                        case 44: 
                        {
                            nuevaLinea = nuevaLinea.replaceAll(",", codigoHuffman.get(j));
                        }; break; //38 ~ ,
                    }
                }
                
                getPrintWriter().println(nuevaLinea);
            }
        }
        
        catch(FileNotFoundException fnfe)
        {
            System.err.println(fnfe.getMessage());
        }
        
        catch(IOException ioe)
        {
            System.err.println(ioe.getMessage());
        }
        
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        
        finally
        {
            try
            {
                if (getFileWriter() != null)
                {
                    getFileWriter().close();
                }
            }
            
            catch (Exception e) 
            {
                System.err.println(e.getMessage());
            }
        }
    }
    
    public void escribirInforme(Arbol root, ArrayList <Character> caracteres, ArrayList <String> codigoHuffman) 
    {
        root.altura(root.getRoot(), 1);
        root.conteoNodos(root.getRoot());
        
        try 
        {
            setFileWriter(new FileWriter("/home/android/NetBeansProjects/Proyecto_Fada/src/txt/Huffman.txt"));
            setPrintWriter(new PrintWriter(getFileWriter()));
            
            getPrintWriter().println("Nodos Creados: " + root.getNumeroNodos());
            getPrintWriter().println("Profundidad Maxima del Arbol Generado: " + root.getAltura());
            getPrintWriter().println("Tabla de Codificacion Generada:");
            getPrintWriter().println("Simbolo ---------- Codigo");
            
            for (int i = 0; i < caracteres.size(); i++)
            {
                getPrintWriter().format("%s ---------- %s\n", caracteres.get(i), codigoHuffman.get(i));
            }
        }
        
        catch(IOException ioe)
        {
            System.err.println(ioe.getMessage());
        }
        
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        
        finally
        {
            try
            {
                if (getFileWriter() != null)
                {
                    getFileWriter().close();
                }
            }
            
            catch (Exception e) 
            {
                System.err.println(e.getMessage());
            }
        }
    }
}