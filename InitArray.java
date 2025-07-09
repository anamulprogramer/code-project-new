public class InitArray {
    public static void main(String[] args) {
        // যদি ইনপুট ৩টি না হয়, তাহলে error মেসেজ দেখাবে
        if (args.length != 3) {
            System.out.printf("Error: Please re-enter the entire command, including%n" +
                              "an array size, initial value and increment.%n");
        } else {
            // সঠিক: arrayLength হবে int, array হবে int[]
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            // অ্যারেতে ইনিশিয়াল ভ্যালু ও ইনক্রিমেন্ট অনুযায়ী মান বসানো
            for (int counter = 0; counter < array.length; counter++) {
                array[counter] = initialValue + increment * counter;
            }

            // হেডার প্রিন্ট
            System.out.printf("%s%8s%n", "Index", "Value");

            // অ্যারের প্রতিটি মান প্রিন্ট
            for (int counter = 0; counter < array.length; counter++) {
                System.out.printf("%5d%8d%n", counter, array[counter]);
            }
        }
    }
}
