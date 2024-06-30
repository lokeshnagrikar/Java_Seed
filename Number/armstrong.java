package assignment;

public class armstrong {

    public static void main(String[] args) {

        int number = 253, origNum, rem, result = 0;

        origNum = number;

        while (origNum != 0)
        {
            rem = origNum % 10;
            result += rem*rem*rem;
            origNum /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
