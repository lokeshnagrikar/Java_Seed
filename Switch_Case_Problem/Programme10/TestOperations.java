package Programme10;






public class TestOperations {
    public static void main(String[] args) {
        Operations ops = new Operations();

        int result1 = ops.addTwoNumbers(5, 3);
        System.out.println("Addition of two numbers: " + result1);

        int result2 = ops.addThreeNumbers(5, 3, 2);
        System.out.println("Addition of three numbers: " + result2);

        double result3 = ops.addTwoFloatValues(5.5, 3.2);
        System.out.println("Addition of two float values: " + result3);
    }
}
