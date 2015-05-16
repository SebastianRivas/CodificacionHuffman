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
        Codificar objCodificar;
        
        objCodificar = new Codificar("/home/android/NetBeansProjects/Proyecto_Fada/src/laptop.txt");
        objCodificar.cifrar();
        objCodificar.generarCodigoHuffman();
        
        objCodificar.getObjArchivo().escribirInforme(objCodificar.getObjArbol(), objCodificar.getCaracteresFinales(), objCodificar.getCodigoHuffman());
        objCodificar.getObjArchivo().escribirArchivo(objCodificar.getCaracteresFinales(), objCodificar.getCodigoHuffman());
    }
}