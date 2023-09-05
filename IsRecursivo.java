public class IsRecursivo {
    public static void main (String args[])
    {
        String palavra;
        boolean teste = true; //inicia o teste como true
        int i = 0;
        do
        {
            palavra = MyIO.readLine(); //recebendo a palavra da entrada
           
            if(palavra.toUpperCase().equals("FIM")) //se a palavra for igual a FIM nada acontece
            {
                //nada acontece
            }
            else 
            {
                teste = true; //reseta o teste
                teste = IsVogal(palavra, i, teste); // testa se é composta por vogais
                if (teste== true) //se true
                {
                    MyIO.print("SIM");
                }
                else
                {
                    MyIO.print("NAO");
                }
                System.out.print(" ");
                
                teste = true; //reseta o teste
                teste = IsConsoante(palavra, i, teste);
                if (teste == true)
                {
                    MyIO.print("SIM");
                }
                else
                {
                    MyIO.print("NAO");
                }
                System.out.print(" ");
    
                teste = true; //reseta o teste
                teste = IsInteiro(palavra, i, teste);
                if (teste == true)
                {
                    MyIO.print("SIM");
                }
                else
                {
                    MyIO.print("NAO");
                }
                System.out.print(" ");
    
                teste = true; //reseta o teste
                teste = IsReal(palavra, i, teste, 0);
                if (teste == true)
                {
                    MyIO.print("SIM");
                }
                else
                {
                    MyIO.print("NAO");
                }
                System.out.print("\n");
            }
            

        }while (!palavra.toUpperCase().equals("FIM")); // fim da repetição
    }


    public static boolean IsVogal(String palavra, int i, boolean teste) //função que recebe uma string palavra, um inteiro i (controle) e um boolean teste e testa se a palavra só tem vogais
    {
        if(i < palavra.length())
        {
            if ((palavra.toUpperCase().charAt(i) >= 'A') && (palavra.toUpperCase().charAt(i) <= 'Z')) //se for uma letra
            {
                if((palavra.toUpperCase().charAt(i) == 'A') ||(palavra.toUpperCase().charAt(i) == 'E') || (palavra.toUpperCase().charAt(i) == 'I') || (palavra.toUpperCase().charAt(i) == 'O') || (palavra.toUpperCase().charAt(i) == 'U')) //se for uma vogal
                {
                    teste = IsVogal(palavra, i + 1, teste); //testa a proxima letra 
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
        return teste;
    }

    public static boolean IsConsoante (String palavra, int i, boolean teste) //função que recebe uma string palavra, um inteiro i (controle) e um boolean teste e testa se a palavra só tem consoantes
    {
        if(i < palavra.length())
        {
            if ((palavra.toUpperCase().charAt(i) >= 'A') && (palavra.toUpperCase().charAt(i) <= 'Z')) //se for uma letra
            {
                if((palavra.toUpperCase().charAt(i) == 'A') ||(palavra.toUpperCase().charAt(i) == 'E') || (palavra.toUpperCase().charAt(i) == 'I') || (palavra.toUpperCase().charAt(i) == 'O') || (palavra.toUpperCase().charAt(i) == 'U')) //se for uma vogal
                {
                    teste = false;
                }
                else
                {
                    teste = IsConsoante(palavra, i + 1, teste); //testa a proxima letra
                }
            }
            else 
            {
                teste = false;
            }
        }
        return teste;
    }

    public static boolean IsInteiro (String palavra, int i, boolean teste) //função que recebe uma string, um inteiro (controle) e um boolean teste e verifica se a string é um número inteiro
    {
        if(i < palavra.length())
        {
            if ((palavra.charAt(i) >= '0') && (palavra.charAt(i) <= '9')) //se for um número
            {
                teste = IsInteiro(palavra, i + 1, teste); //testa o proximo valor
            }
            else
            {
                teste = false;
            }
        }

        return teste;
    }

    public static boolean IsReal (String palavra, int i , boolean teste, int virgulas) //função que recebe uma string, um inteiro (controle), um boolean teste e um inteiro de controle de virgulas e verifica se a string é um número real
    {
        if(i < palavra.length())
        {
            if ((palavra.charAt(i) >= '0') && (palavra.charAt(i) <= '9')) //se for numero
            {
                teste = IsReal(palavra, i+1, teste, virgulas); //testa o próximo valor
            }
            else
            {
                if ((palavra.charAt(i) == '.') || (palavra.charAt(i) == ',')) //se for um ponto ou uma virgula
                {
                    if (virgulas == 0) //se nenhuma virgula ou ponto apareceu na string até então
                    {
                        teste = IsReal(palavra, i + 1, teste, virgulas + 1); //testa o proximo e incrementa 1 ao teste de virgulas
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
        return teste;
    }
}
