package org.ramofpy.patrones.composite.ejemplo;

import org.ramofpy.patrones.composite.Archivo;
import org.ramofpy.patrones.composite.Directorio;

public class EjemploComposite {
    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.pdf"));

        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpeg"));
        doc.addComponente(new Archivo("gitHub.git"));

        System.out.println(doc.mostrar(0));
    }
}
