package basic;

public class Exercise1 {
    public int timUcln(int a, int b) {
        if (a == 0 || b == 0)
            return 0;

        if (a % b == 0) {
            return b;
        }
        return timUcln(b, a % b);
    }

    public int timBcnn(int a, int b) {
        return (a * b) / timUcln(a, b);
    }
}
