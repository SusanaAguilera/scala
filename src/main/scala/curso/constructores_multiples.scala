package curso;

class Empleado { // Para constructores multiples, es mejor no inicializar nada en parametros.

    println("Estoy en el constructor primario");

    private var nombre : String =_;
    private var direccion : String =_;
    private var edad : Int =_;

    def imprimir : Unit = {
        println(s"El empleado se llama $nombre, vive en $direccion y tiene $edad años");
    }

    // Segundo Constructor
    def this(nombre: String) = {
        // Siempre se tiene que llamar a un constructor anterior, puede ser el principal como en este caso.
        this(); // Está vacío porque el constructor principal no tiene ningun parametro.
        this.nombre = nombre;
    }

    // Tercer constructor
    def this(nombre:String, direccion:String, edad:Int) = {
        this(nombre); // Está usando el constructor anterior. (Linea 15)
        this.direccion = direccion;
        this.edad = edad;
    }

}

object principal {
    def main(args: Array[String]): Unit = {
        var empleado1 = new Empleado("Susana");
        empleado1.imprimir;

        // Usaremos ahora el tercer constructor
        var empleado2 = new Empleado("Daniel","Mexico",27);
        empleado2.imprimir;
    }

}