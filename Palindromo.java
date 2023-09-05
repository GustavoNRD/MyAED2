
public class Palindromo {
    public static void main (String args[])
    {

        String palavra;

        do
        {
            palavra = MyIO.readLine();  

            if (palavra.toUpperCase().equals("FIM")) //achei essa forma de comparação mas não sei se posso usar
            {
                //nada (posso por um break tbm funciona)
            }
            else
            {
                ifPalindromo(palavra); //chama o metodo ifPalindromo passando a palavra como parametro
            }
        }while(!palavra.toUpperCase().equals("FIM")); // não sei se posso utilizar toUpperCase também, mas deixa por enquanto
    }

    public static void ifPalindromo (String S) /**metodo para verificar se a palavra é palindromo ou não**/
    {
        boolean teste = true;

        for (int i = 0; i < S.length()/2; i++)
        {
            if (S.charAt(i) != S.charAt(S.length()-i-1)) //comparação entre caracteres "inversos" (1º com ultimo, 2º com penultimo etc)
            {
                teste = false; //falso se forem diferentes
            }
        }

        if (teste == true)
        {
            MyIO.println("SIM");
        }
        else
        {
            MyIO.println("NAO");
        }
    }
}
