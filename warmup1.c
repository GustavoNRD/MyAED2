#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*-----------FUNÇÃO-----------*/
void misturar (char* string1, char* string2); //função para misturar strings

/*-----------MAIN------------*/
int main ()
{
    int size = 400;

    char* string1 = (char *)malloc(sizeof(char)*size); //alocando mémoria pra primeira string
    char* string2 = (char *)malloc(sizeof(char)*size); //alocando mémoria pra segunda string
    

    while (scanf("%s", string1) == 1)
    {   
       if (string1 == NULL)
       {
            //nada
       }
       else
       {
            scanf("%s", string2);
            misturar(string1, string2);
       }
    
    }
    free(string1);
    free(string2);



    return 0;
}

/*-----------FUNÇÃO-----------*/


void misturar (char* string1, char* string2)
{
    int contador1 = strlen(string1);
    int contador2 = strlen(string2);
    int size = contador1 + contador2;
    contador1 = 0;
    contador2 = 0;

    char* resposta = (char *)malloc(sizeof(char)*size); //alocando mémoria pra string combinada

    for (int i = 0; i < size; i++)
    {
        if(i%2==0)
        {
            if (contador1 < strlen(string1))
            {
                resposta[i] = string1[contador1];
                contador1++;
            }
            else if (contador2 < strlen(string2))
            {
                resposta[i] = string2[contador2];
                contador2++;
            }
        }
        else
        {
            if(contador2 < strlen(string2))
            {
                resposta[i] = string2[contador2];
                contador2++;
            }
            else if (contador1 < strlen(string1))
            {
                resposta[i] = string1[contador1];
                contador1++;
            }
        }
    }
    printf("%s\n", resposta);
    free(resposta);
}