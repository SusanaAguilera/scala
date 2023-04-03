;

object Principal {
    def main(args: Array[String]): Unit = {
        var lista = List.range(1, 10);

        // Hacemos una función anonima dentri del filter para devolver los pares de lista
        var pares = lista.filter( (i: Int) => i%2 == 0 ); // Las funciones anonimas no tienen nombre.
        println(pares);

        // También se puede simplificar de la siguiente manera
        var pares2 = lista.filter( _%2 == 0); // Recordemos que "_" es el metacaracter.
        println(pares2);

        // Ejemplo de función anonima con foreach,
        lista.foreach( (i) => println(i));

        // También se puede reducir de la siguiente manera con el metacaracter:
        lista.foreach( println(_) );
    }
}
