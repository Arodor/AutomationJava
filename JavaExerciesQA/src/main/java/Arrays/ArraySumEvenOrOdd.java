package Arrays;

public class ArraySumEvenOrOdd {
    public static void main(String[] args) {
        int[] elements = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int even = 0;
        int odd = 0;
        for (int element : elements) {
            if (element % 2 == 0) {
                even += element;
            }
            odd += element;

        }
        System.out.println("The sum of the even numbers is: " + even);
        System.out.println("The sum of the odd numbers is: " + odd);

    }
}
