import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        // Entrada das 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º Bimestre: ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculos
        double primeiroSemestre = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        double segundoSemestre = (notas[4] + notas[5] + notas[6] + notas[7]) / 4;
        double mediaFinal = (primeiroSemestre + segundoSemestre) / 2;

        // Saída dos resultados
        System.out.println("\n--- Resultados ---");
        for (int i = 0; i < 8; i++) {
            System.out.printf("%dº Bimestre: %.1f%n", i + 1, notas[i]);
        }

        System.out.printf("1º Semestre: %.1f%n", primeiroSemestre);
        System.out.printf("2º Semestre: %.1f%n", segundoSemestre);
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        scanner.close();
    }
}
