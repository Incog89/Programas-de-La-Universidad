#include <stdio.h>

int main(){
    int n;
	int numeros[n];
	int mayor, menor;
	mayor = menor = numeros[0];
    scanf("%d",&n);
    for(int i=0;i<=n;i++){
        scanf("%d",&numeros[i]);
    }
	for (int i = 1; i < sizeof(numeros) / sizeof(numeros[0]); ++i)
	{
	    printf("%d\n", mayor);
		if (numeros[i] > mayor) mayor = numeros[i];
		if (numeros[i] < menor) menor = numeros[i];
	}
	printf("El mayor es %d y el menor es %d\n", mayor, menor);
}
