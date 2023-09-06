import java.util.Scanner;

public class warmup2{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;

        while (scanner.hasNextInt())
        {
            num1 = MyIO.readInt();
            num2 = MyIO.readInt();
            

            if(num1 > num2)
            {
                int[] array = new int[((num1 - num2) + 1) * 2];
                int contador = 0;

                for(int i = 0; i < array.length/2; i++)
                {
                    array[i] = num2 + contador;
                    contador++;
                }
                for(int i = array.length-1; i >= array.length/2; i--)
                {
                    contador--;
                    array[i] = num1 - contador; 
                }
                for (int i = 0; i < array.length; i++)
                {
                    System.out.print(array[i]);
                }
                 System.out.println("");
            }
            else if (num2 > num1)
            {
                int[] array = new int[((num2 - num1) +1) * 2];
                int contador = 0;

                for(int i = 0; i < array.length/2; i++)
                {
                    array[i] = num1 + contador;
                    contador++;
                }
                for(int i = array.length-1; i >= array.length/2; i--)
                {
                    contador--;
                    array[i] = num2 - contador; 
                }
                for (int i = 0; i < array.length; i++)
                {
                    System.out.print(array[i]);
                }
                 System.out.println("");
            }
            else
            {
                int[] array = new int[2];

                for(int i = 0; i < array.length; i++)
                {
                    array[i] = num1;
                }
                for (int i = 0; i < array.length; i++)
                {
                    System.out.print(array[i]);
                }
                 System.out.println("");
            }
            
        }
        scanner.close();
    }
}