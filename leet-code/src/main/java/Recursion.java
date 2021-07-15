public class Recursion {

    public int fibbonacci(int n) {
        if(n==1||n==0) return n;
        return fibbonacci(n-1)+ fibbonacci(n-2);
    }

    public int factorial(int n){
        if(n==0) return 0;
        return n* factorial(n-1);
    }

    public int power(int base, int pow){
        if(pow==0) return 1;
        return base * power(base,pow-1);
    }
}
