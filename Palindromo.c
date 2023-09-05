#include <string.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>



void isPalindromo (char* S) //função que verifica se a palavra recebida é ou não palindromo
{
    int teste = 1;
    int tamanho = strlen(S) - 1; //pegando o tamanho da palavra

    for (int i = 0, j = tamanho; i < tamanho/2; i++, j--)
    {
        if (S[i] != S[j]) //comparando as letras inversas (1ª com ultima, 2ª com penultima etc)
        {
            teste = 0; //se forem diferentes teste falso
        }
    }

    if (teste == 0)
    {
        printf("NAO\n");
    }
    else
    {
        printf("SIM\n");
    }
}

void getString(char *a, int b) //função de um amigo meu para pegar o input do teclado
{
    fgets(a, b, stdin);
    a[strcspn(a, "\n")] = '\0'; // Remover o caractere de nova linha (tive que pesquisar)
}

int main ()
{
    int size = 400;
    char *palavra = (char *)malloc(sizeof(char) * size);

    do
    {
        getString(palavra, size);
        if (strcmp(palavra, "FIM") == 0) //se a palavra for FIM não acontece nada
        {
            //nada
        }
        else
        {
            palavra[strcspn(palavra, "\n")] = '\0'; // Remover o caractere de nova linha (tive que pesquisar)
            isPalindromo (palavra);
        }

    } while (strcmp(palavra, "FIM") != 0); //se a palavra for FIM o while acaba
    
    free(palavra); // Liberar a memória alocada
    return 0; //fim
}

