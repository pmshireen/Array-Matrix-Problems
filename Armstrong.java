package ArrayPP;

public class Armstrong {
    public static void main(String[] args) {

            int n = 370;
            int temp = n;
            int arm = 0;


            while(n != 0){
                int rem = n%10;
                arm = arm + (rem*rem*rem);
                System.out.println(arm);
                n = n/10;
            }
            System.out.println(arm);
            if(temp == arm){
                System.out.println("Armstrong");
            }
            else{
                System.out.println("Not Armstrong");
            }
        }
    }

