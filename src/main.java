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

public class main 
{
    public static void main (String args[])
    {
        CodificacionHuffman objCodificacionHuffman;
        
        objCodificacionHuffman = new CodificacionHuffman("/home/android/NetBeansProjects/Proyecto_Fada/src/txt/laptop.txt");
        objCodificacionHuffman.cifrarHuffman();
        objCodificacionHuffman.generarCodigoHuffman();
        
        objCodificacionHuffman.getObjArchivo().escribirInforme(objCodificacionHuffman.getObjArbol(), objCodificacionHuffman.getCaracteresFinales(), objCodificacionHuffman.getCodigoHuffman());
        objCodificacionHuffman.getObjArchivo().escribirArchivoHuffman(objCodificacionHuffman.getCaracteresFinales(), objCodificacionHuffman.getCodigoHuffman());
        objCodificacionHuffman.getObjArchivo().escribirArchivoAscii();
    }
}
