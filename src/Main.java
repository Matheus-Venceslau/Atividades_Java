//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Média de três números
        int num01 = 77;
        int num02 = 71;
        int num03 = 77;

        double media = (num01 + num02 + num03) / 3.0;
        int media01 = (num01 + num02 + num03) / 3;

        System.out.println("A média do inteiro é: " + media01);
        System.out.println("A média do real é: " + media);

        System.out.println();

        // Declaração de Long
        long distancia = 149600000L;

        System.out.println("A distância da Terra ao Sol é: " + distancia + " km.");

        System.out.println();

        // Valor Unicode de um caractere

        char letra1 = 'A';
        char letra2 = 'X';
        char letra3 = 'm';
        char letra4 = 'z';
        char letra5 = 'K';
        char letra6 = 't';

        System.out.println("O valor Unicode de '" + letra1 + "' é: " + (int) letra1);
        System.out.println("O valor Unicode de '" + letra2 + "' é: " + (int) letra2);
        System.out.println("O valor Unicode de '" + letra3 + "' é: " + (int) letra3);
        System.out.println("O valor Unicode de '" + letra4 + "' é: " + (int) letra4);
        System.out.println("O valor Unicode de '" + letra5 + "' é: " + (int) letra5);
        System.out.println("O valor Unicode de '" + letra6 + "' é: " + (int) letra6);

      // Usando arrays

        int[] numeros = {17770, 20, 30, 474545112, 50, 70, 68, 99};
        System.out.println("O quarto valor é: " + numeros[3]);

        // Exercício 05 - Área do retângulo

        double largura = 5.0;
        double altura = 3.0;

        double area = largura * altura;

        System.out.println("A area do retângulo é: " + area);

        // Trabalhando com strings e dados multivalorados

        String nome = "Matheus";
        int idade = 46;
        double peso = 72.7;

        System.out.println("Olá meu nome é: " + nome + "Minha idade é: " + idade + "Meu peso é: " + peso);

    }
}