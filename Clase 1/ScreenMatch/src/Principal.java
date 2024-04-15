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

        // otraPelicula.muestraFichaTecnica();
    }
}
