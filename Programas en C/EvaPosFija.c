#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <math.h>

#define MaxElementos 100

typedef struct pila{//estructura para la definicion de la pila
    int indice;
    int total;
    float datos[MaxElementos];
}PilaFloat;//la realizamos flotante para caso de numeros flotantes

PilaFloat * crear(){//Estructura para crear pilas
    PilaFloat *p;//asignamos apuntador para la nueva pila
    p=(PilaFloat *)malloc(sizeof(PilaFloat));//generamos el espacio de la pila
    p->indice=0;//debido a que apenas se creo todo debe apuntar a 0
    p->total=0;// siguiendo la misma metodologia que en el arbol
    return p; //regresamos la pila
}

int estaVacia(PilaFloat pila){ //Estrucutra para verificar si la pila esta vacia, recibiendo a la pila
    if(pila.total==0){
        return 1; //si se encuentra vacia retorna 1
    }else{
        return 0; // en caso contrario retorna 0
    }
}

int estaLlena(PilaFloat pila){//Estrucutra para verificar si se encuentra llena, recibe a la pila
    if(pila.total==MaxElementos){
        return 1;//si la pila tiene la cantidad maxima de elementos devuelve 1
    }else{
        return 0;//en caso contrario devuelve 0
    }
}

int push(PilaFloat *pila, float dato){
    if(pila->total<MaxElementos){
        pila->datos[pila->indice]=dato;
        pila->indice++;
        pila->total++;
        return 1;
    }else{
        return 0;
    }
}
float pop(PilaFloat *pila){
    int aux;
    if(pila->total>0){
        aux=pila->datos[pila->indice-1];
        pila->indice--;
        pila->total--;
        return aux;
    }else{
        return -1;
    }
}

float realizarOperacion(char operador, float a, float b){
    float resultado = 0;
    switch(operador){
    case '+':
        resultado = a + b;
        break;
    case '-':
        resultado = a - b;
        break;
    case '*':
        resultado = a * b;
        break;
    case '/':
        resultado = a / b;
        break;
    case '^':
        resultado = pow(a,b);
        break;
    }
}

int esOperador(char elemento){
    if(elemento == '+' || elemento == '-' || elemento == '*' ||
       elemento == '/' || elemento == '^'){
        return 1;
       }else{
        return 0;
       }
}

int esOperando(char elemento){
    if(elemento >= '0' && elemento <= '9'){
        return 1;
    }else{
        return 0;
    }
}

float evaluarPostfija(char *posfija){
    float a,b,resultado;
    int i=0;
    int total=strlen(posfija);
    char elemento;
    PilaFloat *pila;
    pila=crear();
    while(i<total){
        elemento=posfija[i];
        i++;
        if(esOperando(elemento)){
            push(pila,elemento - '0');
        }else{
            b=pop(pila);
            a=pop(pila);
            resultado=realizarOperacion(elemento,a,b);
            push(pila,resultado);
        }
    }
    return pop(pila);
}

int main(){
    int i=0;
    char postfija[] = "24*5+";
    float resultado=evaluarPostfija(postfija);
    printf("%f",resultado);
    return 0;
}
