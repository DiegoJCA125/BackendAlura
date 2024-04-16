public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDelasEvaluaciones;
    int totalDeLasEvaluciones;

    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Su duracion en minutos es: " + duracionEnMinutos);
    }

    void evalua(double nota){
        sumaDelasEvaluaciones += nota;
        totalDeLasEvaluciones++;
    }

    double calculaMedia(){
        return sumaDelasEvaluaciones / totalDeLasEvaluciones;
    }
}