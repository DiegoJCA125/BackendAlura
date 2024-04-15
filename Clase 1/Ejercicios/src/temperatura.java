public class temperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 32.4;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensaje = String.format("La tempratura de %f Celsius es equivalente a %f Fahrenheit", temperaturaCelsius, temperaturaFahrenheit);

        System.out.println(mensaje);

        int temperaturaFahrenheitEntero  = (int) temperaturaFahrenheit;
        System.out.println("La tempertatura en Fahrenheit entera es: " + temperaturaFahrenheitEntero);
    }
}
