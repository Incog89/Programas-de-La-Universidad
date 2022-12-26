#include <stdio.h>
#include <string.h>

int main()
{
    char Cadena[100];
    int Suma=0, Tam, Ascii;
    scanf("%c",&Cadena);
    printf("%i",strlen(Cadena));
    Tam=strlen(Cadena);
    printf("%i",Tam);
    for(int i=0;i<Tam;i++){
        Ascii = Cadena[i];
        if(Ascii>90){
            Ascii-=32;
            Suma+=Ascii;
        }
    }
    int Divisores=0;
    for(int i=0;i<Suma;i++){
        if(Suma%i==0){
            Divisores++;
        }
    }
    printf("%i",Divisores);
    return 0;
}
