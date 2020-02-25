package basic;

public class Exercise3 {
    public String phanTichSoNguyen(int n){
        String kq = "";
        if(n < 2)
            return kq + n;
        for(int i = 2; i <= n; i++){
            while (n % i == 0){
                n /= i;
                if(n==1)
                    n += i;
                else
                    kq += i + "*";
            }
        }
        return kq;
    }
}
