public class PalindromoRecursivo {
    public static void main (String args[])
    {
        String palavra;
        do
        {
            palavra = MyIO.readLine(); //recebendo uma palavra

            if (palavra.toUpperCase().equals("FIM"))//se for FIM
            {
                //nada
            }
            else
            {
                int i = 0; //controlador 
                boolean teste = true; //teste se palindromo
                teste = palindromo(palavra, i, teste); //enviando palavra, controle e o teste para a função
                if (teste == true)
                {
                    MyIO.println("SIM");
                }
                else
                {
                    MyIO.println("NAO");
                }
            }
        
        }while(!palavra.toUpperCase().equals("FIM"));
    }

    public static boolean palindromo(String palavra, int i, boolean teste) //função que recebe palavra, inteiro i (controle) e boolean teste e confere se a palavra é palindromo retornando true se sim e false se não
    {
        if (i == palavra.length()/2) //conferir até a metade da palavra
        {
            //nada
        }
        else
        {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - i -1)) //se primeira letra diferente da ultima, segunda da penultima etc...
            {
                teste = false; // false (não palindromo)
            }
            else
            {
                teste = palindromo(palavra, i + 1, teste); // testa a proxima letra
            }
        }
        return teste; //retorna o teste
    }
}
