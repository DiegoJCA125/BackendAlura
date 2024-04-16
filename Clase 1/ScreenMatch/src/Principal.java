import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Scarface");
        miPelicula.setFechaDeLanzamiento(1983);
        miPelicula.setDuracionEnMinutos(130);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.evalua(10);
        miPelicula.evalua(10);

        miPelicula.muestraFichaTecnica();
        System.out.println("Total de votos: "+ miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media de evalucion de la pelicula: " + miPelicula.calculaMedia());
        System.out.println("**********************");







        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);

        otraPelicula.evalua(9);
        otraPelicula.evalua(8);
        otraPelicula.evalua(9.8);

        otraPelicula.muestraFichaTecnica();
        System.out.println("Total de votos: " + otraPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Média de evaluaciones de la película: " +otraPelicula.calculaMedia());
        System.out.println("**********************");

        Pelicula tercerPelicula = new Pelicula();
        tercerPelicula.setNombre("La familia del futuro");
        tercerPelicula.setFechaDeLanzamiento(2007);
        tercerPelicula.setDuracionEnMinutos(95);

        tercerPelicula.evalua(10);
        tercerPelicula.evalua(10);
        tercerPelicula.evalua(7.8);
        tercerPelicula.evalua(6.8);

        tercerPelicula.muestraFichaTecnica();
        System.out.println("Total de votos: " + tercerPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Média de evaluaciones de la película: " + tercerPelicula.calculaMedia());
        System.out.println("**********************");
    }
}

