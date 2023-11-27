public class CalculoCirculo {
    public static void main(String[] args) {
        double radio = 7.5; // Modificar según el radio deseado
        final double pi = 3.14159;

        double area = pi * radio * radio;
        double longitudCircunferencia = 2 * pi * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia);
    }
}
