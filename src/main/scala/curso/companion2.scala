;

// Instancias sin keyword New
// Los companion objects siempre deben estar en el mismo file que la

// Clase principal
class Alumno {
    var nombre : String =_;
}

// Companion Object
object Alumno {

    // Metodo apply
    def apply(nombre: String): Alumno = {
        var alumno1 = new Alumno();
        alumno1.nombre = nombre;
        alumno1 // La última línea de scala es lo que regresa como return.
    } 
}

object Principal {
    def main(args: Array[String]): Unit = {
        
        // Definir variable sin NEW
        var alumno = Alumno("Susana");
        println(alumno.nombre);
    }
}

