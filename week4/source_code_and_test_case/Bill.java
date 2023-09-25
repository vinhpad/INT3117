public class Bill {
    public static int getBill(int deltaW) throws Exception {
        if (!(0 <= deltaW && deltaW < Math.pow(2, 31)))
            throw new Exception("ERROR: W must be in interval [0; 2^31 -1]");

        if (deltaW <= 50)
            return deltaW * 1678;

        if (deltaW <= 100)
            return 83900 + (deltaW-50)*1734;

        if (deltaW <= 200)
            return 170600 + (deltaW-100)*2014;

        if (deltaW <= 300)
            return 372000 + (deltaW-200)*2536;

        if (deltaW <= 400)
            return 625600 + (deltaW-300)*2834;

        return 909000 + (deltaW-400)*2927;
    }
}