public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello TestNG World.");

        Calculator demo_1 = new Calculator();
        int result = demo_1.add(2, 3);
        System.out.println("2 + 3 = ? ... " + String.valueOf(result));
    }
}