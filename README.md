# CODIFICACION HUFFMAN (JAVA)
Este proyecto tiene una implementación en el lenguaje de programación JAVA del algoritmo de compresión de datos llamado Codificación Huffman.

## ESTRUCTURA DE DIRECCTORIOS 🗂️
```bash
    .
    ├── bin
    ├── build
    │   └── MANIFEST.MF
    ├── lib
    │   ├── junit-jupiter-api-5.13.0-M2.jar
    │   ├── junit-jupiter-engine-5.13.0-M2.jar
    │   └── junit-platform-launcher-1.13.0-M2.jar
    ├── README.md
    └── src
        ├── main
        │   └── java
        │       └── com
        │           └── fada
        │               └── CodificacionHuffman
        │                   ├── app
        │                   │   ├── App.java
        │                   │   ├── gui
        │                   │   │   └── Principal.java
        │                   │   └── logica
        │                   │       ├── Arbol.java
        │                   │       ├── Archivo.java
        │                   │       ├── CodificacionHuffman.java
        │                   │       ├── Lista.java
        │                   │       ├── Nodo.java
        │                   │       └── ProcesarStrings.java
        │                   ├── input
        │                   │   └── text
        │                   │       └── Lorem Ipsum.txt
        │                   ├── output
        │                   │   └── text
        │                   └── resources
        └── test
            └── java
                └── com
                    └── fada
                        └── CodificacionHuffman
                            ├── app
                            │   ├── AppTest.java
                            │   ├── gui
                            │   │   └── PrincipalTest.java
                            │   └── logica
                            │       ├── ArbolTest.java
                            │       ├── ArchivoTest.java
                            │       ├── CodificacionHuffmanTest.java
                            │       ├── ListaTest.java
                            │       ├── NodoTest.java
                            │       └── ProcesarStringsTest.java
                            └── resources
```

## EJECUCION DEL PROYECTO ⌨️
⚠️ La compilacion y posterior ejecucion del proyecto se debe hacer desde la raiz del proyecto ⚠️

⚠️ La salida del programa se almacena en ⚠️
```bash
src/main/java/com/fada/CodificacionHuffman/output/text
```

* Compilacion y ejecucion

Compilacion
```bash
    javac -d bin/classes/ src/main/java/com/fada/CodificacionHuffman/app/logica/*.java src/main/java/com/fada/CodificacionHuffman/app/gui/*.java src/main/java/com/fada/CodificacionHuffman/app/*.java
```
Ejecucion
```bash
    java -cp bin/classes/ com.fada.CodificacionHuffman.app.App
```

* Creacion del fichero JAR

Construccion del JAR
```bash
    jar -cmfv build/MANIFEST.MF build/CodificacionHuffman-1.0-SNAPSHOT.jar -C bin/classes .
```
Ejecucion del JAR
```bash
    java -jar build/CodificacionHuffman-1.0-SNAPSHOT.jar
```