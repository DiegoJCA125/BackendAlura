public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Scarface";
        miPelicula.fechaDeLanzamiento = 1983;
        miPelicula.duracionEnMinutos = 130;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println(miPelicula.sumaDelasEvaluaciones);
        System.out.println(miPelicula.totalDeLasEvaluciones);
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;
        System.out.println("Média de evaluaciones de la película: " +miPelicula.calculaMedia());

        otraPelicula.muestraFichaTecnica();

        Pelicula tercerPelicula = new Pelicula();
        miPelicula.nombre = "La familia del futuro";
        miPelicula.fechaDeLanzamiento = 2007;
        miPelicula.duracionEnMinutos = 95;
        miPelicula.incluidoEnElPlan = true;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println("Média de evaluaciones de la película: " +miPelicula.calculaMedia());
    }
}

