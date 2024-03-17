package programaestagio;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProgramaEstagio {

    public static void main(String[] args) {
        //QUESTÃO 01
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        JOptionPane.showMessageDialog(null, "Soma Questao 01 = " + SOMA);

        //QUESTÃO 02
        String numeroStr = JOptionPane.showInputDialog("Digite um numero: ");
        int numero = Integer.parseInt(numeroStr);
        
        if (verificarFibonacci(numero)) {     
            JOptionPane.showMessageDialog(null, "O numero " + numero + " pertence a sequencia de Fibonacci.");
        } else {
            JOptionPane.showMessageDialog(null, "O numero " + numero + " nao pertence a sequencia de Fibonacci.");
        }

        //QUESTÃO 03
        //A) 9
        //B) 128
        //C) 42
        //D) 100
        //E) 13
        //F) 200

        //QUESTÃO 04
        //Ligue um dos interruptores e aguarde. Desligue e ligue um segundo interruptor. 
        //Vá até a sala. A lâmpada desligada e quente corresponde ao primeiro interruptor, 
        //a lâmpada acesa ao segundo e a lâmpada apagada e fria ao terceiro.

        
        //QUESTÃO 05
        ReverseString reverseString = new ReverseString();
        reverseString.exibirStringInvertida();
    }

    public static boolean verificarFibonacci(int numero) {
        int primeiro = 0;
        int segundo = 1;

        while (primeiro <= numero) {
            if (primeiro == numero) {
                return true;
            }
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        return false;
    }

    static class ReverseString {
        String texto = "Hello, world!"; // String pré-definida

        public void exibirStringInvertida() {
            String textoInvertido = inverterString(texto);
            JOptionPane.showMessageDialog(null, "String original: " + texto + "\nString invertida: " + textoInvertido);
        }

        public String inverterString(String texto) {
            char[] caracteres = texto.toCharArray();
            int tamanho = caracteres.length;
            char[] caracteresInvertidos = new char[tamanho];

            for (int i = 0; i < tamanho; i++) {
                caracteresInvertidos[i] = caracteres[tamanho - 1 - i];
            }

            return new String(caracteresInvertidos);
        }
    }
}
