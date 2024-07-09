package ArrayPP;

public class Recursion {
    public static void main(String args[]) {
        rec obj = new rec() ;
        System.out.print(obj.func(5));
    }
}

class rec{
    int func (int n)
    {
        int result;
        if (n == 1)
            return 1;
        result = func (n - 1);
        return result;
    }
}
