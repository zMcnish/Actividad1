public class CalculoSalario {
    public static void main(String[] args) {
        final int horasTrabajadas = 48;
        final int tarifaPorHora = 5000;
        final double retencionFuentePorcentaje = 12.5;

        int salarioBruto = horasTrabajadas * tarifaPorHora;
        double retencionFuente = (retencionFuentePorcentaje / 100) * salarioBruto;
        double salarioNeto = salarioBruto - retencionFuente;

        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Retención en la Fuente: $" + retencionFuente);
        System.out.println("Salario Neto: $" + salarioNeto);
    }
}
