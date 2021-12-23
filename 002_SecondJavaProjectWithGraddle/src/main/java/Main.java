public class Main {
    public static void main(String[] args)
    {
        System.out.println("Helow world");
        for(int i =1; i < 101; i++)
        {
            System.out.println(i+" -> "+ (IsPrime(i) ? "Prime" : "No Prime"));
        }
    }
    public static Boolean IsPrime(int n)
    {
        if(n < 3)
        {
            return true;
        }
        if(n%2 == 0)
        {
            return false;
        }
        var sq = (int)Math.sqrt(n);
        for(int i = 3; i <= sq; i++)
        {
            if(n%sq==0)
            {
                return false;
            }
        }
        return true;
    }
}
