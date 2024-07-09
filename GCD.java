package ArrayPP;

public class GCD {
    public static void main(String[] args){

        int Num1= 75, Num2= 125, Temp, GCD=0;
        while(Num2 != 0)
        {
            Temp = Num2;
            System.out.println("temp "+Temp);
            Num2 = Num1 % Num2;
            Num1 = Temp;
        }
        GCD = Num1;
        System.out.println("\n GCD =  " + GCD);
    }

}
