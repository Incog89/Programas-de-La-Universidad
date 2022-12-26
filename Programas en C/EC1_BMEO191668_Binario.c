#include<stdio.h>
#include<string.h>
#define grafo 28

int numeros,buscar;

char archivo[100]="Binario";
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
    int i, j, aux,band,mitad;
  	FILE *out;
	int ban;
	ban=lee(archivo);
	if(ban)
	{
	    for(i=1; i<numeros; i++) {
            j = i;
            aux = arr[i];
            while(j>0 && aux<arr[j-1]) {
                arr[j] = arr[j-1];
                j=j-1;
            }
            arr[j] = aux;
        }
        printf("\n\nLos elementos ordenados del arreglo son: \n");
        for(i=0; i<numeros; i++) {
            printf("%d ", arr[i]);
        }

    int inf = 0;
    int sup = numeros;
    while (inf<=sup){
        mitad = (inf+sup)/2;

        if (arr[mitad] == buscar){
            band = 'V';
            break;
        }
        if (arr[mitad] > buscar){
            sup = mitad;
            mitad = (inf+sup)/2;
        }
        if (arr[mitad] < buscar){
            inf = mitad;
            mitad = (inf+sup)/2;
        }
    }
    if (band == 'V'){
        printf("\n");
        printf("El se encuentra en la posicion: %i\n",mitad+1);
    }

    return 0;
}
}
