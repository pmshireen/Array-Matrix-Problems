package ArrayPP;

public class RevPalindrome {

        public static void main(String[] args) {
            int n = 456;
            int temp = n;
            int rev = 0;

            while(n != 0){
                int rem = n%10;
                rev = (rev*10) + rem;
                n = n/10;
            }
            System.out.println(rev);
            if(temp == rev){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not palindrome");
            }
        }
    }


