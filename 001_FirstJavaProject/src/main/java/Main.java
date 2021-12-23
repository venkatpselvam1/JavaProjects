public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world");
        PrintPascalTriangle(5);
    }
    public static void PrintPascalTriangle(int n)
    {
        var lis = new int[1];
        lis[0] = 1;
        Print(lis);
        for(int i = 2; i <= n; i++)
        {
            var newLis = new int[i];
            newLis[0] = 1;
            for(int j = 1; j < i-1;j++)
            {
                newLis[j] = lis[j-1]+lis[j];
            }
            newLis[i-1] = 1;
            lis = newLis;
            Print(lis);
        }
    }
    public static void Print(int[] arr)
    {
        for(var item: arr)
        {
            System.out.print(item);
        }
        System.out.println();
    }
}
