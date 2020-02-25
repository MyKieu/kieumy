package basic;

public class Exercise2 {
    public int tinhTongSoNguyen(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}