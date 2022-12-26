#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char q0(){
    printf("Cadena valida");
}

char q1(){
    printf("Cadena no valida");
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
            if(revision = 1){
                if(cadena[i]=='b'){
                    exit(q0());
                }else{
                    exit(q1());
                }
            }
            if(i>=revision-1){
                if(cadena[i]=='a' && revision %2 == 0){
                    exit(q0());
                }else{
                    exit(q1());
                }
            }
        }
    }
    return 0;
}
