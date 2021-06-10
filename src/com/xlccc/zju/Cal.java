package com.xlccc.zju;

/**
 * @author Linker
 * @date 2021/4/18 15:26
 * @description：
 */
public class Cal {

    public double ent(Double[] values) {
        double sum = sum(values);
        if (sum == 0) {
            return 0;
        }
        double result = 0.0;

        for (double v : values
        ) {
            if (v == 0) {
                continue;
            }
            result += v / sum * log2(v / sum);

        }
        return result;

    }

    public double ent2(double[] values) {
        double sum = 0.0;
        for (double value : values
        ) {
            if (value == 0) {
                continue;
            }
            sum += value * log2(value);
        }
        return sum;
    }

    public double sum(Double[] nums) {
        double sum = 0.0;
        for (double n : nums
        ) {
            sum += n;
        }
        return sum;
    }


    /**
     * @param value1
     * @param value2
     * @return log(value1) / log(value1)
     */
    public double logAB(double value1, double value2) {
        return Math.log(value2) / Math.log(value1);
    }

    /**
     * @param value1
     * @return
     */
    public double log2(double value1) {
        return Math.log(value1) / Math.log(2);
    }
}
