public class GetMaximum {
    public static Integer maximum(Integer x, Integer y, Integer z) {

        Integer max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static Float maximumFloat(Float a, Float b, Float c) {

        Float max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
    public static String maximum(String x, String y, String z) {

        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.printf("Max of %s, %s and %s is %s\n","peach",
                "apple", "banana", maximum("peach", "apple", "banana"));
    }
}