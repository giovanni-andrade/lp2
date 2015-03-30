import java.util.Scanner;

public class NumeroMuitoGrande {

    String x, y;
    int[] intx = new int[30];
    int[] inty = new int[30];
    int[] intsoma = new int[31];
    int[] intmult = new int[61];

    public void lerNumero() {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        String x = input.next();
        for (int i = 0; i <= 29; i++) {
            char caracter = x.charAt(i);
            intx[i] = Character.getNumericValue(caracter);
        }

        System.out.println("Informe o segundo número: ");
        String y = input.next();
        for (int i = 0; i <= 29; i++) {
            char caracter = y.charAt(i);
            inty[i] = Character.getNumericValue(caracter);
        }
    }

    public void somar() {
        int aux, aux2 = 0;
        int j = 29;
        for (int i = 0; i < 31; i++) {
            aux = intx[j] + inty[j] + aux2;
            if (aux < 10) {
                intsoma[i] = aux;
                aux2 = 0;
            } else {
                intsoma[i] = aux % 10;
                aux2 = 1;
            }
        }
    }

    public void multiplicar() {
        int k = 0, aux, aux2 = 0, aux3 = 0;
        int[] intaux = new int[30];
        for (int i = 29; i >= 0; i--) {
            for (int j = 29; j >= 0; j--) {
                aux = (intx[i] * inty[j]) + aux2;
                if (aux < 10) {
                    intaux[k] = aux;
                    aux2 = 0;
                } else {
                    intaux[k] = aux % 10;
                    aux2 = aux / 10;
                }
                k = k + 1;
                for (int l = 0; l < 60; l++) {
                    aux = intaux[l] + intmult[l] + aux3;
                    if (aux < 10) {
                        intmult[i] = aux;
                        aux3 = 0;
                    } else {
                        intmult[i] = aux % 10;
                        aux3 = 1;
                    }
                }
            }
        }
    }

    public void imprimir() {
        System.out.println("A multiplicação é: ");
        int a = 0, i = 61;
        while (a == 0) {
            i = i - 1;
            if (intmult[i] == 0) {
                a = 0;
            } else {
                a = 1;
            }
        }
        for (int j = i; j <= 0; j--) {
            System.out.print(intmult[j]);
        }

        System.out.println("A soma é: ");
        a = 0;
        i = -1;
        while (a == 0) {
            i = i + 1;
            if (intsoma[i] == 0) {
                a = 0;
            } else {
                a = 1;
            }
        }
        for (int j = i; j <= 30; j--) {
            System.out.print(intsoma[j]);
        }
    }

    public static void main(String[] args) {
        NumeroMuitoGrande g1 = new NumeroMuitoGrande();
        g1.lerNumero();
        g1.imprimir();
        g1.multiplicar();
        g1.somar();
    }
}
