package curso;

import scala.compiletime.ops.int

class Producto(cod_producto:Int, var nombre:String) { // Se considera que los parametros son parte del constructor.
    println("Estoy en el constructor"); // Todo lo que esté dentro de la clase fuera de una función/metodo, es parte del constructor.

    def imprimir : Unit = {
        println(s"el código es $cod_producto y se llama $nombre y cuesta $pvp");
    }

    println("Sigo en el cosntructor");

    // Constructores Auxiliares
    private var pvp : Int = _;

    def this(cod_producto:Int, nombre:String, pvp:Int) = {
        this(cod_producto, nombre) // Tenemos que llamar al constructor padre, se hace con this
        this.pvp = pvp;
    }
}

object Principal {
    def main(args: Array[String]): Unit = {
        var producto1 = new Producto(10, "tornillos");
        producto1.imprimir;
        producto1.nombre = "Anillos"; // Es posible modificar el nombre porque tiene "var" en el parametro
        producto1.imprimir; 

        var producto2 = new Producto(20, "Cadenas", 5); // Al poner 3 parametros se fue al constructor auxiliar
        producto2.imprimir;

    }
}