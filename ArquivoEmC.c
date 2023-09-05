#include <stdio.h>
#include <stdlib.h>

/*-----MAIN-----*/
int main ()
{
    int N; //número de valores a serem salvos em arquivo
    scanf("%d", &N); 
    
    FILE *arquivo = fopen("exemploC.txt", "w"); //abrir arquivo

    for (int i =0; i < N; i++)
    {
        double X = 0;

        scanf("%lf", &X); //recebe o valor real
        fprintf(arquivo, "%lf\n", X); //guarda em arquivo 
    }
    fclose(arquivo); //fecha o arquivo para salvar 

    FILE *arquivo2 = fopen("exemploC.txt", "r"); //abrindo arquivo para leitura
    
    double array[N]; //array para armazenar os valores em aquivo

    for (int i = 0; i < N; i++)
    {
        fscanf(arquivo2, "%lf", &array[i]); //lê do arquivo o numero real e salva no array
    }
    
    fclose(arquivo2); //fecha o arquivo

    for (int i = 0; i < N; i++)
    {
        printf("%g\n", array[N - i -1]); //printa o array o contrario
    }


    return 0; //fim
}


