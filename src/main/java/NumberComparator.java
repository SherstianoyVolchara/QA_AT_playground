public class NumberComparator {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        int number1 = getRandomNumber(10, 80);
        int number2 = getRandomNumber(1, 1000);
        int number3 = getRandomNumber(1, 500);
        int number4 = getRandomNumber(2, 400);

        int summ1 = number1 + number2;
        int summ2 = number3 + number4;
        System.out.println(summ1 > summ2);

        int result1 = summ1 + 1;
        int result2 = summ2 - 2;
        System.out.println(summ1 > summ2);

        boolean isparity1 = result1 % 2 == 0;
        boolean isparity2 = result2 % 2 == 0;
        System.out.println(isparity1);
        System.out.println(isparity2);

        System.out.println(isparity1 || isparity2);
    }

}
