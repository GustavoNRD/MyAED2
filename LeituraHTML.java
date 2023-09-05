import java.io.*;
import java.net.*;
import java.nio.charset.*;

public class LeituraHTML {
    public static void main(String args[]) throws Exception
    {
        String nome;
        String link;

        do 
        {
            nome = MyIO.readLine();
            if (nome.toUpperCase().equals("FIM"))
            {
                //nada
            }
            else
            {
                link = MyIO.readLine();
                try {
                    Testes(nome, link);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }while(!nome.toUpperCase().equals("FIM"));
    }

    public static void Testes(String nome, String link) throws Exception
    {
        URL url = new URL(link);
        URLConnection conexao = url.openConnection();//Estabelecer coneccao
        BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream(), Charset.forName("UTF-8")));

        String linha;
        int A= 0; //A
        int E= 0; //E
        int II= 0; //I
        int O= 0; //O
        int U= 0; //U
        int A1= 0; //Á
        int E1= 0; //É
        int I1= 0; //Í
        int O1= 0; //Ó
        int U1= 0; //Ú
        int A2= 0; //À
        int E2= 0; //È
        int I2= 0; //Ì
        int O2= 0; //Ò
        int U2= 0; //Ù
        int A3= 0; //Ã
        int A4= 0; //Â
        int E3= 0; //Ê
        int O3= 0; //Õ
        int O4= 0; //Ô
        int I3= 0; //Î
        int U3= 0; //Û
        int consoantes= 0;
        int br = 0; //<br>
        int table = 0; //<table>
        
        while ((linha = leitor.readLine()) != null) 
        {
            if(isTable(linha) == true)
            {
                table++;
            } 
            else if (isBr(linha) == true)
            {
                br++;
            }
            else
            {
                for(int i = 0; i < linha.length(); i++)
                {
                    if(linha.charAt(i) == 'a')
                    {
                        A++;
                    }
                    else if (linha.charAt(i) == 'e')
                    {
                        E++;
                    }
                    else if(linha.charAt(i) == 'i')
                    {
                        II++;
                    }
                    else if(linha.charAt(i) == 'o')
                    {
                        O++;
                    }
                    else if(linha.charAt(i) == 'u')
                    {
                        U++;
                    }
                    else if(linha.charAt(i) == '\u00E1') // \u00E1 == á
                    {
                        A1++;
                    }
                    else if (linha.charAt(i) == '\u00E9') //\u00E9 == é
                    {
                        E1++;
                    }
                    else if(linha.charAt(i) == '\u00ED') //\u00ED == í
                    {
                        I1++;
                    }
                    else if(linha.charAt(i) == '\u00F3') // \u00F3 == ó
                    {
                        O1++;
                    }
                    else if(linha.charAt(i) == '\u00FA') // \u00FA == ú
                    {
                        U1++;
                    }
                    else if(linha.charAt(i) == '\u00E0') // \u00E0 == à
                    {
                        A2++;
                    }
                    else if (linha.charAt(i) == '\u00E8') // \u00E8 == è
                    {
                        E2++;
                    }
                    else if(linha.charAt(i) == '\u00EC') //\u00EC == ì
                    {
                        I2++;
                    }
                    else if(linha.charAt(i) == '\u00F2') //\u00F2 == ò
                    {
                        O2++;
                    }
                    else if(linha.charAt(i) == '\u00F9') // \u00F9 == ù
                    {
                        U2++;
                    }
                    else if(linha.charAt(i) == '\u00E3') // \u00E3 == ã
                    {
                        A3++;
                    }
                    else if(linha.charAt(i) == '\u00E2') //\u00E2 ==â
                    {
                        A4++;
                    }
                    else if (linha.charAt(i) == '\u00EA') //\u00EA ==ê
                    {
                        E3++;
                    }
                    else if(linha.charAt(i) == '\u00F5') //\u00F5 == õ
                    {
                        O3++;
                    }
                    else if(linha.charAt(i) == '\u00F4') //\u00F4 == ô
                    {
                        O4++;
                    }
                    else if(linha.charAt(i) == '\u00EE') //\u00EE ==î
                    {
                        I3++;
                    }
                    else if(linha.charAt(i) == '\u00FB') //\u00FB == û
                    {
                        U3++;
                    }
                    else if (linha.charAt(i) >= 'a' && linha.charAt(i) <= 'z')
                    {
                        consoantes++;
                    }
                }
            }
        }
        MyIO.println("a(" +A+ ") e(" +E+ ") i(" +II+ ") o(" +O+ ") u(" +U+ ") á(" + A1 +") é("+ E1 +") í("+I1+") ó(" +O1+") ú("+U1+") à("+A2+") è("+E2+") ì("+I2+") ò("+O2+") ù("+U2+") ã("+A3+") õ("+O3+") â("+A4+") ê("+E3+") î("+I3+") ô("+O4+") û("+U3+") consoante("+consoantes+") <br>("+br+") <table>("+table+") " + nome);
        leitor.close();
    }



    public static boolean isTable(String linha)
    {
        if((linha.length() == 7) && (linha.charAt(0) == '<') && (linha.charAt(1) == 't') && (linha.charAt(2) == 'a') && (linha.charAt(3) == 'b') && (linha.charAt(4) == 'l') && (linha.charAt(5) == 'e') && (linha.charAt(6) == '>'))
        {
            return true;
        }
        return false;
    }

    public static boolean isBr(String linha)
    {
        if((linha.length() == 4) && (linha.charAt(0) == '<') && (linha.charAt(1) == 'b') && (linha.charAt(2) == 'r') && (linha.charAt(3) == '>'))
        {
            return true;
        }
        return false;
    }
}
