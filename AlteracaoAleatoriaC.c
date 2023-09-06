#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>


/*---------FUNÇÕES-----------*/

void alterador(char* palavra, char letra1, char letra2);
void getString(char *a, int b); //função para pegar o input do teclado

/*------------MAIN------------*/

int main ()
{
    int size = 400;
    char* palavra = (char *)malloc(sizeof(char) * size); //alocando espaço para a string
    do
    {
        getString(palavra, size);
        
        if (strcmp(palavra,"FIM") == 0)
        {
            //nada
        }
        else
        {
            //gerar duas l etras aleatórias (ainda não sei a seed testei com 4)
            srand(15); 
            char letra1 = 'a' + (rand()%26);
            char letra2 = 'a' + (rand()%26);

            alterador(palavra, letra1, letra2);
            printf("%s\n", palavra);
        }
    } while (strcmp(palavra, "FIM") != 0);
    
    free(palavra); // Desalocar a memória 

    return 0;
}

/*---------FUNÇÕES-----------*/

void alterador(char* palavra, char letra1, char letra2)
{
    char alteracao[strlen(palavra)]; //array de char para realizar as alterações
    strcpy(alteracao, palavra);

    for(int i = 0; i < strlen(palavra); i++)
    {
        if(alteracao[i] == letra1)
        {
            alteracao[i] = letra2;
        }
    }

    strcpy(palavra, alteracao);
}

void getString(char *a, int b) 
{
    fgets(a, b, stdin);
    a[strcspn(a, "\n")] = '\0'; // Remover o caractere de nova linha (tive que pesquisar)
}