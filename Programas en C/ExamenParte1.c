#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char q0(){
    printf("Cadena no valida");
}

char q1(){
    printf("Cadena valida");
}

int main() {
    int i=0;
    int caracteres=0, revision;
    char cadena[caracteres];
    printf("Cuantos Caracteres desea ingresar: ");
    scanf("%i", &caracteres);
    if(caracteres == 0){
        q0();
    }else{
        printf("Coloca la cadena: ");
        scanf("%s",cadena);
        for(i=0;i>=sizeof(cadena);i++){
            revision = caracteres;
            if(i>=revision){
                if(cadena[i]=='a'){
                    exit(q0());
                }else{
                    exit(q1());
                }
            }
        }
    }
    return 0;
}
