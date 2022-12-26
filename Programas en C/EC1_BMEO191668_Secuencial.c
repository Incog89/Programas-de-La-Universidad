#include<stdio.h>
#include<string.h>
#define grafo 28

int numeros,buscar;

char archivo[100]="Secuencial";
int arr[grafo];

int lee(char archivo[])
{
	FILE *in;
	char entrada[80];
	int i,j;
	strcpy(entrada,archivo);
	strcat(entrada,".txt");
	in=fopen(entrada,"rb+");
	if(in!=NULL)
	{
        for(int i=0; i<20; i++) {
            fscanf(in, "%c", &entrada[i]);
        }
        for(int i=0; i<20; i++) {
            printf("%c", entrada[i]);
        }
		fscanf(in,"%d",&numeros);
		printf("%d",numeros);
        for(int i=0; i<11; i++) {
            fscanf(in, "%c", &entrada[i]);
        }
        for(int i=0; i<11; i++) {
            printf("%c", entrada[i]);
        }
        for(int i=0;i<numeros;i++)
        {
            printf("\n");
   			fscanf(in,"%d",&arr[i]);
   			printf("%d ",arr[i]);
        }
        printf("\n");
        printf("%d",numeros);
        for(int i=0; i<9; i++) {
            fscanf(in, "%c", &entrada[i]);
        }
        for(int i=0; i<9; i++) {
            printf("%c", entrada[i]);
        }
        fscanf(in,"%d",&buscar);
        printf("\n");
		printf("%d",buscar);
	fclose(in);
	return 1;
	}
	else
	{
		printf("NO se encontro el archivo %s\n",entrada);
		return 0;
	}
}
int main()
{
  	FILE *out;
	int ban;
	ban=lee(archivo);
	if(ban)
	{
        for(int i=0;i<numeros;i++){
            if(arr[i]==buscar){
                printf("\nValor Encontrado");
                printf("\nPosicion: %d", i);
            }
        }
    }
    return 0;
}
