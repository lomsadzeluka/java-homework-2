package Project1;

public class C {
    private int a;
    private int b;
    private int c;

    public void setABC(int num1, int num2, int num3) {
        a = num1;
        b = num2;
        c = num3;
    }

    public int getA() {
        return a % 10;
    }

    public int getB() {
        while (b >= 10) b /= 10;
        return b;
    }

    public int getC() {
        int digit, sum = 0;
        while (c > 0) {
            digit = c % 10;
            sum += digit;
            c /= 10;
        }
        return sum;
    }

    public int getABProduct() {
        return getA() * getB();
    }

    public int getBCSum() {
        return getB() + getC();
    }
}
