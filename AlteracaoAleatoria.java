import java.util.Random;

public class AlteracaoAleatoria {
    public static void main (String args[])
    {
        
        String palavra;
        do
        {
            palavra = MyIO.readLine(); //recebendo uma palavra
            char[] alterar = new char[palavra.length()]; //array de char

            if (palavra.toUpperCase().equals("FIM"))//se for FIM
            {
                //nada
            }
            else
            {
                Random gerador = new Random(); //gerador com seed 4 
                gerador.setSeed(4);

                int num;
                int num2;
                do 
                {
                    num = gerador.nextInt();//gerando o primeiro num
                }while(num < 0);//garantindo que o numero é positivo
                do
                {
                    num2 = gerador.nextInt();//gerando o segundo num
                }while(num2 < 0);//garantindo que o numero é positivo
                alterador(palavra, alterar, num, num2);
            }
        
        }while(!palavra.toUpperCase().equals("FIM")); 
    }


    public static void alterador (String palavra, char[] alterar, int num, int num2) //função que altera as ocorrências da primeira letra pela segunda na palavra
    {
        for (int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == (char) ('a' + (num%26))) //se o caractere na palavra for igual ao caractere gerado
            {
                alterar[i] = (char) ('a' + (num2%26)); //substitui
            }
            else
            {
                alterar[i] = palavra.charAt(i); //coloca a letra atual
            }
        }

        MyIO.println(palavra); //printa o array de caracteres gerado após as mudanças
    }
}
