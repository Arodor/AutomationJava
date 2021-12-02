package Arrays;

public class ArrayAvg {

    public static void main(String[] args) {
        int[] elements = new int [] {1, 2, 3, 4, 5, 6, 7 ,8 ,9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        float sum = 0;
        float avg = 0;
        for (int i = 0; i < elements.length ; i++) {

            sum += elements[i];

        }
        avg = sum / elements.length;
        System.out.println("The avg of all elements in the array is "+  avg);
    }
}
