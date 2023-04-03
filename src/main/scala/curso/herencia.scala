package curso;

class Vehiculo {
    var cv: Int =_;
    var bastidor: String =_;

    def visualizarDatos() : Unit = {
        println(s"Tiene $cv caballos y el numero de bastidor es $bastidor");
    }
}

class Coche extends Vehiculo {
    var ruedas : Int =_;

    def verDatos : Unit = {
        println(s"El vehiculo tiene $ruedas ruedas");
    }
}

object Herencia {
    def main(args: Array[String]): Unit = {
        var coche1 = new Coche();
        coche1.cv = 100;
        coche1.ruedas = 4;
        coche1.visualizarDatos();
        coche1.verDatos; // Sin parentesis, porque así lo definí en la clase
    }
}
