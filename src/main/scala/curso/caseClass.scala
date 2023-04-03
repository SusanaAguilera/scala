package curso;

// Object Companion apply
// toString hashCode equals copy

case class Estudiante(nombre: String, edad: Int);

object Principal {
    def main(args: Array[String]): Unit = {
        var estudiante1 = Estudiante("Susana", 27);

        println(estudiante1.hashCode());

        val estudiante2 = estudiante1.copy(nombre="Daniel", edad=28);

        println(estudiante1 == estudiante2);
        println(estudiante1)
        println(estudiante1.equals(estudiante2));
    }
}