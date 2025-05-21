import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEje5 {
    public static void main(String[] args) {
        //escribir 10 numeros por teclado
        //mostrar los numeros con la palabra max o min al lado del max o minimo respectivamente
        Scanner scaner = new Scanner(System.in);
        ArrayList<Integer> numeros =  new ArrayList<>();

        int k = 0;

        while (k < 10){
            System.out.println("Ingrese el numero"+ (k+1));
            int numero = scaner.nextInt();
            numeros.add(numero);
            k++;
        }
        int maximo = Collections.max(numeros);
        int minimo = Collections.min(numeros);

        System.out.println("\nLos numeros son:");

        for (int numero : numeros){
            if (numero == maximo){
                System.out.println(numero + "(maximo)");
            } else if (numero == minimo) {
                System.out.println(numero + "(minimo)");
            }else {
                System.out.println(numero);
            }
        }
//        for (int i=0;i<numeros.size(); i++){
//            System.out.println("i es:"+ numeros.get(i));
//            for (int j=0; j<numeros.size();j++){
//                int valorI = numeros.get(i);
//                int valorJ = numeros.get(j);
//                if (valorI < valorJ){
//                    System.out.println("i es min: "+ numeros.get(i) + " j es :"+numeros.get(j));
//                }
//                else {
//                    System.out.println("i es max: "+ numeros.get(i)+ " j es :"+numeros.get(j));
//                }
//            }
//        }









    }
}