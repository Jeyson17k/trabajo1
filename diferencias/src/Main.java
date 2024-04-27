import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nombre = Jeyson miguel zapata Davila
        //carnet =2024-1362U

        //muestra un mensaje al usuario que ingrese 3 numeros  enteros diferentes
        System.out.println("Ingresa tres números enteros diferentes:");
        
        //declara variables para almacenar los 3 numeros ingresados 
        //y una variable booleana para verificar si los numeros son iguales
        int num1, num2, num3;
        boolean numerosIguales;
        
        //incia un bucles do-while, que se ejecutara mientras numerosIguales sea verdadero
        do {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            num3 = scanner.nextInt();
            numerosIguales = sonNumerosIguales(num1, num2, num3);

            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("Error: Ingresa tres números diferentes.");
            }
        } while (numerosIguales);

        int sumaDosMasPequenos = sumarDosMasPequenos(num1, num2, num3);
        int diferenciaDosMasGrandes = diferenciaDosMasGrandes(num1, num2, num3);
        int mayorDeTres = mayorDeTres(num1, num2, num3);

        System.out.println("La suma de los 2 números más pequeños es: " + sumaDosMasPequenos);
        System.out.println("La diferencia entre los 2 números más grandes es: " + diferenciaDosMasGrandes);
        System.out.println("El mayor de los 3 números es: " + mayorDeTres);
    }

    // Método para sumar los 2 números más pequeños
    public static int sumarDosMasPequenos(int a, int b, int c) {
        int[] numeros = {a, b, c};
        int min1 = Math.min(a, Math.min(b, c));
        int min2 = Integer.MAX_VALUE;

        for (int num : numeros) {
            if (num > min1 && num < min2) {
                min2 = num;
            }
        }

        return min1 + min2;
    }

    // Método para calcular la diferencia entre los 2 números más grandes
    public static int diferenciaDosMasGrandes(int a, int b, int c) {
        int max1 = Math.max(a, Math.max(b, c));
        int max2 = Integer.MIN_VALUE;

        for (int num : new int[]{a, b, c}) {
            if (num < max1 && num > max2) {
                max2 = num;
            }
        }

        return max1 - max2;
    }

    // Método para encontrar el mayor de los 3 números
    public static int mayorDeTres(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Método para verificar si los tres números son iguales
    public static boolean sonNumerosIguales(int a, int b, int c) {
        return a == b && b == c;
    }
}
