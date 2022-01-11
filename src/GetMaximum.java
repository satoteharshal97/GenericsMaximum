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

    public static void main(String[] args) {
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, maximumFloat((float) 6.6, (float) 8.8, (float) 7.7));

    }
}