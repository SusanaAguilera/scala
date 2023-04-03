package curso;

class Alumno(nombre: String, apellidos: String) {
    var edad : Int = _;
    def visualizar() : Unit ={
        println(nombre);
        println(apellidos);
        println(edad);
    }
}

object Principal {
    def main(args: Array[String]): Unit = {
        var alumno1 = new Alumno("Susana", "Aguilera");
        println(alumno1);
        alumno1.edad = 27;
        println(alumno1.visualizar());
    }
}
