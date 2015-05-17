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

package Logica;

public class main 
{
    public static void main (String args[])
    {
        CodificacionHuffman objCodificacionHuffman;
        
        objCodificacionHuffman = new CodificacionHuffman("src/txt/laptop.txt");
        objCodificacionHuffman.cifrarHuffman();
        objCodificacionHuffman.generarCodigoHuffman();
        
        objCodificacionHuffman.getObjArchivo().escribirInforme(objCodificacionHuffman.getObjArbol(), objCodificacionHuffman.getCaracteresFinales(), objCodificacionHuffman.getCodigoHuffman());
        objCodificacionHuffman.getObjArchivo().escribirArchivoHuffman(objCodificacionHuffman.getCaracteresFinales(), objCodificacionHuffman.getCodigoHuffman());
        objCodificacionHuffman.getObjArchivo().escribirArchivoAscii();
    }
}
