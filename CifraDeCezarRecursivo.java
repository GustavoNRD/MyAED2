public class CifraDeCezarRecursivo {
    public static void main (String args[])
    {
        String palavra;
        int i = 0;

        do
        {
            palavra = MyIO.readLine(); //recebendo a palavra da entrada
            char[] cifra = new char[palavra.length()];

            if(palavra.toUpperCase().equals("FIM")) //se a palavra for igual a FIM nada acontece
            {
                //nada acontece
            }
            else 
            {
                cifra = ciframento(palavra, cifra, i); //enviando a palavra para ciframento 
                MyIO.println(new String(cifra));
            }
            

        }while (!palavra.toUpperCase().equals("FIM")); // fim da repetição
    }

    public static char[] ciframento(String palavra, char[] cifra, int i) //função que recebe uma string palavra, um array de char cifra e int i (controlador) e retorna um array de caracteres com a palavra criptografada
    {
        if (i < palavra.length()) //se o controlador for menor que o tamanho da palavra
        {
            cifra[i] = (char) (palavra.charAt(i)+3); //o array recebe o caractere da palavra + 3
            cifra = ciframento(palavra, cifra, i + 1); //refaz a função com i + 1
        }
        else
        {
            //nada
        }
        return cifra;
    }
}
