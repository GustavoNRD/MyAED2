#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

/* --------Funções--------- */

bool IsPalindromo(char* S, int i, bool teste); //função que recebe um ponteiro para uma "string", um inteiro (controle) e um teste bool e testa se a string é um palindromo
void getString(char *a, int b); //função para pegar input do teclado


/* --------Main--------- */
int main ()
{
    int size = 400;
    char *palavra = (char *)malloc(sizeof(char) * size); //alocando espaço para a string
    

    do
    {
        getString(palavra, size); //recebendo uma palavra
        bool teste = true; //iniciando o teste como true
       
        if(strcmp(palavra, "FIM") == 0) //se palavra igual a FIM nada acontece
        {
            //nada
        }
        else
        {
            palavra[strcspn(palavra, "\n")] = '\0'; // Remover o caractere de nova linha (tive que pesquisar)
            teste = IsPalindromo(palavra, 0, teste);
            if (teste == true)
            {
                printf("SIM\n");
            }
            else
            {
                printf("NAO\n");
            }
        }
    } while (strcmp(palavra, "FIM") != 0);
}


/* --------Funções--------- */


bool IsPalindromo(char* S, int i, bool teste)
{
    if(i < strlen(S)) //se i for menor que o tamanho da string
    {
        if (S[i] == S[strlen(S) - i - 1]) //compara a primeira letra com a ultima, a segunda com a penultima, etc... e se forem iguais
        {
            teste = IsPalindromo(S, i + 1, teste); //testa a proxima letra
        }
        else
        {
            teste = false; 
        }

    }
    return teste;
}

void getString(char *a, int b) 
{
    fgets(a, b, stdin);
    a[strcspn(a, "\n")] = '\0'; // Remover o caractere de nova linha (tive que pesquisar)
}