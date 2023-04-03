// Lambda es un expresion que usa una funcion anonima

object Principal {
    def main(args: Array[String]): Unit = {
        val cuadrado = (numero:Int) => {numero * numero};
        println(cuadrado);

        val par = (numero: Int) => {numero % 2 == 0};
        println(par);

        val lista = List.range(1,10);
        println(lista.filter(par));

        // Devolver funciones

        def metodo1 = {
            (x:Int) => x * 2;
        }

        val v1 = metodo1
        println(v1);
        println(v1(100));
    }
}