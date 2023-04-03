package curso;

class Curso (v_parameter : Int){ // Parametros son privados (Solo para uso de la misma clase)
    var v_publica : Int = _; // No poner nada, la hace una variable publica. (Se accede a ella desde cualquier lado)
    private var v_privada : Int = _; // Solo accesible desde la clase Curso
    protected var v_protected : Int = _; // solo para uso de la clase y sus herencias. (Asignatura puede acceder a ella)
}

// Si al parametro de la clase le agrego un "var" la varialbe se hace publica;
class Curso2 (var v_param : Int){

}

class Asignatura extends Curso(30 : Int) {
    var z : Int = 0;
}

object Principal {
    def main(args: Array[String]): Unit = {
        var curso1 = new Curso(100);
        var curso2 = new Curso2(200);
        curso1.v_publica = 10;
        println("El valor de la variable publica de Curso 1: " + curso1.v_publica);
        println("El parametro de Curso 2 es publico: " + curso2.v_param);

    }
}
