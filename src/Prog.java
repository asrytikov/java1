import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


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

        int[][] arr = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random()*100);
            }
        }
        int sum = 0;
        System.out.println();
        System.out.println("-------------2 array--------------------");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] % 2 == 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
            System.out.println("---------------------------------");

        }
        System.out.println("Сумма = "+sum);
    // Найти сумму элементов двумерного массива
        // Распечатать нечетные элементы (значение элемента нечетное число) двумерного массива


        int[] mas1 ={0,2,3};
        int[] mas2 = {3,2,0,6};
        boolean res = Arrays.equals(mas1, mas2);
        System.out.println(res);

        int[] mas3 = Arrays.copyOfRange(mas1, 0, 2);
        for (int i = 0; i < mas3.length; i++) {
            System.out.println(mas3[i]);
        }

        System.out.println(Arrays.toString(mas3));

        boolean r = Arrays.equals(mas1, mas3);
        System.out.println(r);

        Arrays.sort(mas2);
        System.out.println(Arrays.toString(mas2));

        int foundIndex = Arrays.binarySearch(mas2, 5);
        System.out.println(foundIndex);



        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        int myInt = input.nextInt();
        System.out.printf("Вы ввели %d.%n%n",myInt);
        double myDouble = input.nextDouble();
        System.out.printf("Вы ввели %.2f.%n%n",myDouble);
        System.out.print("Введите строку:");
        input.nextLine();
        String str = input.nextLine();
        System.out.printf("Вы ввели \"%s\".%n%n",str);

        int r = (int)(Math.random()*10);


        int a = 5;
        int b = 10;

        //условие ? значение для true : значение для false

        int numb = 3>2 ? 10 : 5;
        System.out.println(numb);

        if (3>2){
            numb = 10;
        }else{
            numb = 5;
        }

        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine().toUpperCase();
        switch (name){
            case "ОЛЕГ":
                System.out.println("Ваше имя Олег");
                break;
            case "ИВАН":
                System.out.println("Ваше имя Иван");
                break;
            default:
                System.out.println("Fail");
                break;
        }

        int[] mas = {1,2,3,4,5};
        for(int item : mas){
            System.out.println(item);
        }

        int cont = 5;

        while (cont > 0){
            System.out.print(cont);
            cont--;
        }
*/
        int cont2 = 100;
        do{
            System.out.print(cont2);
            cont2++;
        } while (cont2<0);




    }

}
