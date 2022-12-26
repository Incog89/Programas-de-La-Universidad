#include <stdio.h>
#include <string.h>

int main()
{
    int Costales,limas=0,naranjas=0;
    scanf("%i",&Costales);
    int frutas[Costales];
    for(int i=0;i<Costales;i++){
        scanf("%d",&frutas[i]);
        if(frutas[i]%2==0){
            naranjas++;
        }else{
            limas++;
        }
    }
    printf("%d %d",naranjas,limas);
    return 0;
}
