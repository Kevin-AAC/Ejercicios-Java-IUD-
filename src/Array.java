public class Array {
    public static void main(String[] args) {
        array1();


    }

    public static void array1(){
        int[] num;
        num = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;


        for (int i =0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
    public static void array2(){
        String simbolo[];
        simbolo  = new String[10];
        simbolo [0] = "a";
        simbolo [1] = "x";
        simbolo [2] = " ";
        simbolo [3] = " ";
        simbolo [4] = "@";
        simbolo [5] = " ";
        simbolo [6] = "''";
        simbolo [7] = "+";
        simbolo [8] = "Q";
        simbolo [9] = " ";

        for (int i =0; i < simbolo.length; i++){
            System.out.println(simbolo[i]);
        }

    }


}