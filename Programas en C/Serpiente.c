#include <stdio.h>

int main()
{
    int fil, col, k=0;
    scanf("%i", &col);
    scanf("%i", &fil);
    int matriz[col][fil], aux[fil];



    for(int i=0; i<col; i++){
        for(int j=0; j<fil; j++){
            k+=1;

            if(i%2==0){
            matriz[i][j]=k;
            }else{
                int aux2=j+1;
                matriz[i][fil-aux2]=k;
            }
        }
    }

    for(int i=0; i<col; i++){
        for(int j=0; j<fil; j++){
        printf(" %i", matriz[i][j]);
        }
        printf("\n");
    }
    return 0;
}
