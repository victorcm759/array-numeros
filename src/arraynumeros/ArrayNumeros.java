package arraynumeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayNumeros {

    public static void main(String[] args) {
        int valor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        if (!sc.hasNextInt()) {
            System.out.println("¡Tiene que ser un número entero!");
        }
        if (valor < 0) {
            System.out.println("¡Tiene que ser un número positivo!");
        }
        valor = sc.nextInt();
        int [] nums = new int [valor];
        List <Integer> pares = new ArrayList();
        List <Integer> impares = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                pares.add(nums[i]);
            } else {
                impares.add(nums[i]);
            }
        }
        System.out.println("Números impares: ");
        for (int i = 0; i < impares.size(); i++) {
            if (i == impares.size() - 1) {
                System.out.print(impares.get(i) + "\n");
            } else {
                System.out.print(impares.get(i) + " ");
            }
        }
        System.out.println("Números pares: ");
        for (int i = 0; i < pares.size(); i++) {
            if (i == pares.size() - 1) {
                System.out.print(pares.get(i) + "\n");
            } else {
                System.out.print(pares.get(i) + " ");
            }
        }
    }    
}
