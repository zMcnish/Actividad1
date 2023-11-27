public class SumaEspecial {
    public static void main(String[] args) {
        int suma = 0;
        int x = 20; // Valor inicial de x
        int y = 40; // Valor inicial de y

        suma = suma + x;
        x = x + y * y; // x incrementa en el cuadrado de y
        suma = suma + x / y;

        System.out.println("El valor de la suma es: " + suma);
    }
}
