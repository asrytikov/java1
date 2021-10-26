import java.util.Locale;

public class Prog {

    public static void main(String[] args) {
       /* int x1, x2;
        x1 = 5;
        x2 = 6;
        int x3 = 40;
        int x4 = x2/x1;
        System.out.println(x4);
        double x6 = 6;
        double x5 = x6/x1;
        System.out.println(x5);

        String str = "Hello";
        String str1 = " world";
        String str2 = str + str1;
        System.out.println(str2);

        char a  = 'a';
        char b = 'b';

        System.out.print(b-a);

        boolean f = true;
        f = false;


        for (int i = 5; i<=10; i++){
            System.out.print("test "+i);
        }

        int s = 5;

        if (s>10){
            System.out.println("s>10");
        }

        // Найти сумму всех нечетных чисел от 0 до 1000
        //s%2 == 1

        // 1 вариант
        int sum =0;

        for (int i = 1; i < 1000; i=i+2) {
            sum = sum + i;
        }
        System.out.println(sum);

        //2 вариант
        int sum2 = 0;

        for (int i = 0; i < 1000; i++) {
            if (i%2 == 1){
                sum2 = sum2 +i;
            }
        }
        System.out.println(sum2);

        //3 вариант

        int sum3 = ((0+1000)/2)*500;
        System.out.println(sum3);

        //Распечатать все числа кратные 2 и 5 в диапазоне от 1 до 1000

        // Распечатать и найти сумму всех числа кратных 3 и 7 в диапазоне от 1 до 5000

        int sum = 0;
        for (int i = 1; i <=5000 ; i++) {
            if ((i%3 == 0) && (i%7 == 0)){
                System.out.print(i + " ");
                sum = sum + i;

            }

        }
        System.out.println();
        System.out.println(sum);

        int x = 5;
        int y = 10;
        x++; //x = x + 1
        x  = x + 2;
        x += 2;
        System.out.println(x++);
        //++x;
        System.out.println(++x);
        x--;
        --x;
        System.out.println(x);

        System.out.println(x++);

        System.out.println(x);
        x = x + 1;

        System.out.println(++x);

        x  = x + 1;
        System.out.println(x);



        int sh = 10;
        double db = sh;
        System.out.println(db);

        float c = (float) 20.9;
        System.out.println(c);

        String str = "Hello";
        String str1 = "world";
        System.out.println(str.length());
        str = str.toLowerCase();
        String str2 = str.substring(0, 4);
        System.out.println(str2);

        char ch = str.charAt(0);
        System.out.println(ch);

        String strA = "Hello";
        String strB = "Hello";

        boolean f = strA.equals(strB);
        System.out.println(f);
*/
        String strS = "Hello world Java";
        String[] masStr = strS.split(" ");
        for (int i = 0; i < masStr.length; i++) {
                System.out.println(masStr[i]);
        }

        int x = 10;

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int[][] arr = new int[15][15];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random()*100);
            }
        }
        System.out.println();
        System.out.println("-------------2 array--------------------");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            System.out.println("---------------------------------");

        }
    // Найти сумму элементов двумерного массива
        // Распечатать нечетные элементы (значение элемента нечетное число) двумерного массива







    }

}
