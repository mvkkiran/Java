package sample;

 
class RecNumbers 
{

    public static void main(String[] args) 
    {
        printNos(1);
    }
    
    static void printNos(int n)
    {
        if(n < 100)
        {
            printNos(n + 1);
            System.out.print(n + " ");
        }
        return;
    }
}