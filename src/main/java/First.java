public class First {
    public static void main(String[] args) {
        Second second = new Second();
        int temp = second.showNumber();
        System.out.printf("~~~%d~~~", temp);
    }
}
