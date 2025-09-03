public class MathArrayUtils {
    private MathArrayUtils() {}

    public static int sum(int[] values) {
        int num = 0;
        for (int i = 0; i < values.length; i++) {
            num += values[i];
        }
        return num;
    }
    public static double average(int[] values) {
        int num = 0;
        for (int i = 0; i < values.length; i++) {
            num += values[i];
        }
        return (num / values.length);
    }

    public static int min(int[] values) {
        int num = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < num) {
                num = values[i];
            }
        }
        return num;
    }

    public static int max(int[] values) {
        int num = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > num) {
                num = values[i];
            }
        }
        return num;
    }
}
