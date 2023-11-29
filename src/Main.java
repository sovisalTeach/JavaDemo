public class Main {
    public static void main(String[] args) {
        int iterations = 10000;

        // Using + operator for concatenation
        long startTime = System.nanoTime();
        String result = "";
        for (int i = 0; i < iterations; i++) {
            result += "Hello";
        }
        long endTime = System.nanoTime();
        long timeWithPlusOperator = endTime - startTime;
        System.out.println("Time taken with + operator: " + timeWithPlusOperator + " nanoseconds");

        // Using StringBuilder for concatenation
        startTime = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            builder.append("Hello");
        }
        result = builder.toString();
        endTime = System.nanoTime();
        long timeWithStringBuilder = endTime - startTime;
        System.out.println("Time taken with StringBuilder: " + timeWithStringBuilder + " nanoseconds");




    }
}