import java.util.Scanner;

public class warmup2{
    public static void main(String args[]) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int contadorGeral = 0;

        do
        {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            

            if(num1 > num2)
            {
                int[] array = new int[((num1 - num2) + 1) * 2];
                int contador = 0;

                for(int i = 0; i < array.length/2; i++)
                {
                    array[i] = num2 + contador;
                    System.out.print(array[i]);
                    contador++;
                }
                contador = 0;
                for(int i = array.length/2; i < array.length; i++)
                {
                    array[i] = mirrorNum((num1 - contador));
                    contador++; 
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
                    System.out.print(array[i]);
                    contador++;
                }
                contador = 0;
                for(int i = array.length/2; i < array.length; i++)
                {
                    array[i] = mirrorNum((num2 - contador));
                    contador++; 
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
            contadorGeral ++;
        }while (contadorGeral < 3);
        scanner.close();
    }


    public static int mirrorNum (int numero) throws Exception
    {
        String espelho = Integer.toString(numero);
        String newEspelho = "";

        for (int i = espelho.length()-1; i >= 0 ; i--)
        {
            newEspelho += espelho.charAt(i);
        }

        MyIO.print(newEspelho);
        numero = Integer.parseInt(newEspelho);

        return numero;
    }
}