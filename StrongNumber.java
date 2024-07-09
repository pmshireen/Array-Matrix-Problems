package ArrayPP;

public class StrongNumber {
    public static void main(String[] args) {
        int n = 534; //145
        int ans = strongNumber(n);
        System.out.println(ans);
        if(ans == n){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong number");
        }
        automorphicNumber(25);
        isAbundantNumber(12);
    }

    public static int strongNumber(int num){

        int sum = 0;
        int temp = num;
        while(temp != 0){
            int rem  = temp%10;
            int ans = factorial(rem);
            sum = sum + ans;
            temp = temp/10;
        }
        return sum;
    }

    public static int factorial(int n){

        if(n <= 1)
            return 1;
        else{
            return  n * factorial(n-1);
        }
    }


    public static void automorphicNumber(int n){

        int res = n % 10;
        if(n > 0){
            n = n * n;
        }
        int rem  = n %10;
        if( res == rem){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }

    public static void isAbundantNumber(int n)
    {
        // To store the sum of divisors
        int sum = 0;

        // Loop through the numbers [1,n-1]
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        // A number n is said to be Abundant Number if
        // sum of all the proper divisors of the number
        // is greater than the value of the number n.
        if (sum > n) {
            System.out.println("Abundant : True");
        }
        else {
            System.out.println("Abundant : False");
        }
    }

}

