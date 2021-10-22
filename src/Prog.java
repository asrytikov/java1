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
*/
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


    }

}
