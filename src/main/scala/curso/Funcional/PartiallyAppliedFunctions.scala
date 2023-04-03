
object Principal {
    def main(args: Array[String]): Unit = {
        def calcular (n1: Int, n2: Int, n3: Int) = {
            n1 + n2 + n3;
        }

        val x = calcular(10,20,_:Int); //Una función aplicada partialmente, queda a la espera del tercer parametro.
        println(x);

        // Pasamos ahora el valor faltante:
        println(x(40)); // El resultado debe ser 10 + 20 + 40 = 70

        // Se puede pasar otro valor y así obtener otro resultado
        println(x(45)); // El resultado debe ser 10 + 20 + 45 = 75
    }    
}