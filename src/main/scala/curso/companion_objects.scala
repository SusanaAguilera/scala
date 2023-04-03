package curso;

// Los companion objects siempre deben estar en el mismo file que la clase.

// Creación de la clase
class Estudiante(var nombre:String, var apellido:String, var tipo:String) {
    override def toString(): String = "Nombre: " + nombre + " " + apellido + " " + tipo;
}


// Creación del companion Object, este se tiene que llamar exactamente igual que la clase.
object Estudiante {
    val TIPO_VIP = "VIP";
    val TIPO_NORMAL = "NORMAL";

    def estatico = {
        println("Esto es un método estadico");
    }
}  


// Main
object Principal {
    def main(args: Array[String]): Unit = {
        var estudiante1 = new Estudiante("Susana", "Aguilera", tipo = Estudiante.TIPO_VIP);
        Estudiante.estatico
        println(estudiante1.toString());
    }
}