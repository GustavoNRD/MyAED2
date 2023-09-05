import java.io.*;

public class Arquivo {
    
    public static void main (String args[])throws Exception //ao usar RandomAccessFile usar tratamento de exeção 
    {
        int N; //número de valores a serem salvos em arquivo
        N = MyIO.readInt();
        RandomAccessFile Arq = new RandomAccessFile("exemplo.txt", "rw"); //abrindo arquivo para escrita e leitura

        for(int i = 0; i < N; i++) 
        {
            double X = 0; 

            X = MyIO.readDouble(); //lendo um número real
            Arq.writeDouble(X); //salvando no arquivo
        }
        Arq.close();

        RandomAccessFile Arq2 = new RandomAccessFile("exemplo.txt", "r"); //abrindo o arquivo novamente para leitura

        do
        {
            long position = (N - 1) * 8;  //posição do ponteiro (final do arquivo) **aparentemente o x8 é por conta do tamanho em bytes de um double
        
            Arq2.seek(position); //posicionando o ponteiro 
        
            double Y = Arq2.readDouble(); //lendo o valor
            
            if (Y == (int) Y) //checa se o valor é inteiro
            {
                System.out.println((int) Y);  //se sim, printa como inteiro
            } else {
                System.out.println(Y);  //printa como double
            }
        
            N--; //passando pra próxima posição
        } while (N > 0);
        
        Arq2.close();
    }
}
