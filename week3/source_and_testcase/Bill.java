public class Bill {
    public static long[] CONFIG_W = new long[]{
            1678, 1734, 2014, 2536, 2834, 2927
    };

    public static long[] DELTA_W = new long[]{
            50, 50, 100, 100, 100
    };

    public static long evaluation(long deltaW) throws Exception {
        if (! (0 <= deltaW && deltaW < Math.pow(2, 31)) )
            throw new Exception("ERROR: delta_w, must be in interval [0; 2^31 -1]");

        if (deltaW <= 50)
            return deltaW * CONFIG_W[0];

        if (deltaW <= 100)
            return DELTA_W[0] * CONFIG_W[0]
                    + (deltaW - DELTA_W[0]) * CONFIG_W[1];

        if (deltaW <= 200)
            return DELTA_W[0] * CONFIG_W[0]
                    + DELTA_W[1] * CONFIG_W[1]
                    + (deltaW - DELTA_W[0] - DELTA_W[1]) * CONFIG_W[2];

        if (deltaW <= 300)
            return DELTA_W[0] * CONFIG_W[0]
                    + DELTA_W[1] * CONFIG_W[1]
                    + DELTA_W[2] * CONFIG_W[2]
                    + (deltaW - DELTA_W[0] - DELTA_W[1] - DELTA_W[2]) * CONFIG_W[3];

        if (deltaW <= 400)
            return DELTA_W[0] * CONFIG_W[0]
                    + DELTA_W[1] * CONFIG_W[1]
                    + DELTA_W[2] * CONFIG_W[2]
                    + DELTA_W[3] * CONFIG_W[3]
                    + (deltaW - DELTA_W[0] - DELTA_W[1] - DELTA_W[2] - DELTA_W[3]) * CONFIG_W[4];

        System.out.println(DELTA_W[0] * CONFIG_W[0]
                + " " + DELTA_W[1] * CONFIG_W[1]
                + " " + DELTA_W[2] * CONFIG_W[2]
                + " " + DELTA_W[3] * CONFIG_W[3]
                + " " + DELTA_W[4] + CONFIG_W[4]
                + " " +(deltaW - 400) * CONFIG_W[5]);
        return  DELTA_W[0] * CONFIG_W[0] + DELTA_W[1] * CONFIG_W[1] + DELTA_W[2] * CONFIG_W[2] + DELTA_W[3] * CONFIG_W[3] + DELTA_W[4] * CONFIG_W[4]+ (deltaW - 400) * CONFIG_W[5];
    }

    public static void main(String[] args) throws Exception {

            evaluation(200);
    }
}