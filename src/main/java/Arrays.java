public class Arrays {
    public static void main(String[] args) {
        int[] numbers  = {1,2,3,4,5};

        // foreach-Schleife
        for(int number: numbers) {
            System.out.println(number);
        }
        int[] numbers2 = new int[5];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        numbers2[3] = 4;
        numbers2[4] = 5;
        // for-Schleife
        // numbers2.length gibt uns die Laenge des Arrays zurueck
        for(int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        // Task
        int[] till10 = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        int largestNumber = 0;
        for(int number: till10) {
            if (largestNumber < number) {
                largestNumber = number;
            }
            sum += number;
            System.out.println(number);
        }
        System.out.println("Sum: " + sum);
        System.out.println("Largest Number: " + largestNumber);
        int[] till20 = {11,12,13,14,15,16,17,18,19,20};
        int[] sumOfTwoArrays = new int[10];
        System.out.print("[");
        for(int i = 0; i <sumOfTwoArrays.length ; i++) {
            sumOfTwoArrays[i] = till10[i] + till20[i];
            if (i != sumOfTwoArrays.length - 1) {
                System.out.print(sumOfTwoArrays[i] + ", ");
            }
            else {
                System.out.print(sumOfTwoArrays[i]);
            }
        }
        System.out.print("]");
    }
}