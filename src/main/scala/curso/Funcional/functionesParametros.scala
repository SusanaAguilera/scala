class Practica {

    // Ejemplo1
    def ejemplo1( funcion : (Unit) ) = {
        funcion;
    }

    // Ejemplo2
    def ejemplo2(cifra1: Int, f: (Int) => Int) : Int = {
        f(cifra1);
    }

    // Ejemplo3
}

object Principal {
    def main(args: Array[String]): Unit = {
        // Ejemplo1
        var pr1 = new Practica();
        pr1.ejemplo1(println("nada"));

        // Ejemplo2
        def multi(numero : Int) = {
            numero * 5
        }
        println(pr1.ejemplo2(10, multi))

        // Ejemplo3
        println(pr1.ejemplo2(10, (x:Int) => x*20))
    }
}

