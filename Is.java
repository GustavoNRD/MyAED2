public class Is {
    public static void main (String args[])
    {
        String palavra;

        do
        {
            palavra = MyIO.readLine(); //recebendo a palavra da entrada
           
            if(palavra.toUpperCase().equals("FIM")) //se a palavra for igual a FIM nada acontece
            {
                //nada acontece
            }
            else 
            {
                IsVogal(palavra);
                System.out.print(" ");
                IsConsoante(palavra);
                System.out.print(" ");
                IsInteiro(palavra);
                System.out.print(" ");
                IsReal(palavra);
                System.out.print("\n");
            }
            

        }while (!palavra.toUpperCase().equals("FIM")); // fim da repetição
    }



    public static void IsVogal(String S)
    {
        boolean teste = true;
        for (int i = 0; i < S.length(); i++)
        {
            if(S.toUpperCase().charAt(i) >= 'A' && S.toUpperCase().charAt(i) <= 'Z')
            {
                if((S.toUpperCase().charAt(i) != 'A') && (S.toUpperCase().charAt(i) != 'E') && (S.toUpperCase().charAt(i) != 'I') && (S.toUpperCase().charAt(i) != 'O') && (S.toUpperCase().charAt(i) != 'U'))
                {
                    teste = false;
                }
            }
            else
            {
                teste = false;
            }
        }
        if (teste == true)
        {
            System.out.print("SIM");
        }
        else
        {
            System.out.print("NAO");
        }
    }

    public static void IsConsoante(String S)
    {
        boolean teste = true;
        for (int i = 0; i < S.length(); i++)
        {
            if(S.toUpperCase().charAt(i) >= 'A' && S.toUpperCase().charAt(i) <= 'Z')
            {
                if((S.toUpperCase().charAt(i) == 'A') || (S.toUpperCase().charAt(i) == 'E') || (S.toUpperCase().charAt(i) == 'I') || (S.toUpperCase().charAt(i) == 'O') || (S.toUpperCase().charAt(i) == 'U'))
                {
                    teste = false;
                }
            }
            else
            {
                teste = false;
            }
        }
        if (teste == true)
        {
            System.out.print("SIM");
        }
        else
        {
            System.out.print("NAO");
        }
    }

    public static void IsInteiro(String S)
    {
        boolean teste = true;
        for (int i = 0; i < S.length(); i++)
        {
            if(!(S.charAt(i) >= '0' && S.charAt(i) <= '9'))
            {
                teste = false;
            }
        }
        if (teste == true)
        {
            System.out.print("SIM");
        }
        else
        {
            System.out.print("NAO");
        }
    }

    public static void IsReal(String S)
    {
        boolean teste = true;
        int testeVirgula = 0;
        for (int i = 0; i < S.length(); i++)
        {
            if(!(S.charAt(i) >= '0' && S.charAt(i) <= '9'))
            {
                if(S.charAt(i) == ',' || S.charAt(i) == '.')
                {
                    if (testeVirgula == 0)
                    {
                        testeVirgula += 1;
                    }
                    else
                    {
                        teste = false;
                    }
                }
                else
                {
                    teste = false;
                }
            }
        }
        if (teste == true)
        {
            System.out.print("SIM");
        }
        else
        {
            System.out.print("NAO");
        }
    }
}
