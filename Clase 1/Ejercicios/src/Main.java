public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        
        double media = (8.2 + 6.0 + 9.8) / 3;
        System.out.println("La media de nota de la pelicula es de: " +media);

        String sinopsis = """
                Matriz es un paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en:
                """ + fechaDeLanzamiento + """
                 Con una nota de: 
                """ + media;
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

    }
}