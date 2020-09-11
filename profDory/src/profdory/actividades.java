package profdory;

import static java.lang.Math.*;

public class actividades {

    public double Dec_to_real(String dec, String min,String max, String longx) {
        int d, xmin, xmax, l;
        double r;
        int de= Integer.parseInt(dec);
        int mi=Integer.parseInt(min);
        int ma=Integer.parseInt(max);
        int lonx=Integer.parseInt(longx);
        d = de;
        xmin = mi;
        xmax = ma;
        l = lonx;
        r = xmin + (d * ((xmax - xmin) / ((pow(2, l)) - 1)));
        System.out.println(r);
        return r;
    }

    public int Bin_to_dec(String a) {
        char[] numbers = a.toCharArray();
        int result = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == '1') {
                result += Math.pow(2, (numbers.length - i - 1));
            }
        }
        System.out.println(result);
        return result;
    }

    public double Real_to_adaptation(double resa) {
        double res,r;
        res=resa;
        double b = Math.toRadians(res);
        r = (5 * cos(b)) + (res * 2);
        System.out.println(r);
        return r;
    }
}
