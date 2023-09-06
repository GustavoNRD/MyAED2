import java.util.Random;

public class AlteracaoAleatoria {
    public static void main (String args[])
    {
        Random gerador = new Random(); //gerador com seed 4 
        gerador.setSeed(4);
        String palavra;
        do
        {
            palavra = MyIO.readLine(); //recebendo uma palavra
            //char[] alterar = new char[palavra.length()]; //array de char
            String resultado = "";

            if (palavra.toUpperCase().equals("FIM"))//se for FIM
            {
                //nada
            }
            else
            {
                resultado = alterador(palavra, gerador);

                MyIO.println(resultado);
            }
        
        }while(!palavra.toUpperCase().equals("FIM")); 
    }


    public static String alterador (String palavra, Random gerador) //função que altera as ocorrências da primeira letra pela segunda na palavra
    {
        String resultado = "";
        char char1 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
        char char2 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));

        for (int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i) == char1) //se o caractere na palavra for igual ao caractere gerado
            {
                resultado += char2; //substitui
            }
            else
            {
                resultado += palavra.charAt(i); //coloca a letra atual
            }
        }
        return resultado;
    }
}
