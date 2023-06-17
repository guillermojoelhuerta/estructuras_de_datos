package _1_TAD;

public class App {

    /**
     Un TAD es un acrónimo que se utiliza para referirse a un "Tipo Abstracto de Datos"
     (en inglés, "Abstract Data Type" o ADT). Un TAD es una estructura de datos que define un conjunto
     de operaciones permitidas y las propiedades de los datos que se almacenan. En otras palabras, un
     TAD define cómo se pueden utilizar y manipular los datos, sin especificar cómo se implementan
     internamente.

     Un TAD proporciona una abstracción para representar un concepto o una entidad en un programa. Por
     ejemplo, algunos ejemplos comunes de TAD son listas, pilas, colas, árboles, conjuntos, etc. Cada uno
     de estos TAD tiene un conjunto específico de operaciones que se pueden realizar sobre ellos, como
     agregar elementos, eliminar elementos, buscar elementos, etc.

     La idea detrás de un TAD es separar la interfaz (las operaciones permitidas) de la implementación
     (cómo se almacenan y manipulan los datos). Esto permite que los programas se centren en el uso de los
     datos sin preocuparse por los detalles internos de cómo se implementan.

     En resumen, un TAD es una abstracción que define un conjunto de operaciones y propiedades para
     manipular datos, proporcionando una interfaz clara y separada de los detalles de implementación.

     Ejemplos de TAD: Conjuntos, Listas enlazadas, Colas, Pilas, Árboles, Grafos,
    * */
    public static void main(String[] args){
        Punto objetoPunto = new Punto();
        objetoPunto.setX(23);
        objetoPunto.setY(4);
        objetoPunto.setZ(54);
        objetoPunto.setDimension("3D");
        System.out.println("Dimensión: " + objetoPunto.getDimension());
        System.out.println("Coordenada X: " + objetoPunto.getX());
        System.out.println("Coordenada Y: " + objetoPunto.getY());
        System.out.println("Coordenada Z: " + objetoPunto.getZ());
    }
}
