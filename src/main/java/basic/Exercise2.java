package basic;

public class Exercise2 {

    public int tongSoNguyen(int n)
    {
        int sum =0;
        while (n>0){
            int sodu = n%10;
            n /=10;
            sum+=sodu;

        }
        return sum;
    }
}
