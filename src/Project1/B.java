package Project1;

import java.util.Arrays;
import java.util.Collections;

public class B {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setABC(int num1, int num2, int num3) {
        a = num1;
        b = num2;
        c = num3;
    }

    public int getMax() {
        return Collections.max(Arrays.asList(a, b, c));
    }

    public int getMin() {
        return Collections.min(Arrays.asList(a, b, c));
    }
}
