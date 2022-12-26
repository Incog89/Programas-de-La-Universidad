#include <stdlib.h>
#include <stdio.h>

typedef struct nodo{    //Estructura Del Nodo
	struct nodo *izq;   //nodo hijo por la izquierda
    int hijosIzq;       //
    struct nodo *padre; //nodo padre o node del centro
    int dato;           //
    int hijosDer;       //
    struct nodo *der;   //nodo hijo por la derecha
}Nodo;

Nodo* crearNodo(int dato){//Constructor para crear un Nodo, el cual recibe el dato que nosotros le demos
	Nodo *aux=(Nodo*) malloc(sizeof(Nodo));//le asignamos el tamaño a el Nodo, lo cual crea al Nodo
    aux->izq=NULL;//
    aux->padre=NULL;//al inicio esta vacio por lo tanto todo debe de apuntar a NULL con un valor de 0 en la variables hijoIzq y Der
    aux->der=NULL;//
    aux->hijosIzq=0;//
    aux->hijosDer=0;//
    aux->dato=dato;//Inicialisamos el dato que recibimos del usuario y lo retornamos
    return aux;
}

typedef struct arbol{ //Estructura del Arbol
	int totalIzq;     //
    Nodo *raiz;       //Apuntador a Nodo
    int totalDer;     //
}Arbol;

Arbol* crearArbol(){ //Constructor que nos permite crear un arbol
	Arbol *aux=(Arbol*)malloc(sizeof(Arbol)); //Creamos el espacio del apuntador llamado "Arbol"
    aux->totalIzq=0;//Se crea por primera vez asi que sus hijos valdran 0
    aux->totalDer=0;//
    aux->raiz=NULL;//la raiz se mantiene apuntando a null en un principio
    return aux;
}

int estaVacioElArbol(Arbol *a){//Funcion para verificar si el Arbol Esta vacio
	if(a->raiz==NULL){//Recibimos el apuntador, el cual verifica si la raiz se encuentra vacia
		return 1; //Si esta se encuentra vacia devuelve un 1
	}else{
		return 0; //En caso contrario devuelve el 0
	}
}

void insertarNodo(Arbol *a,Nodo *n){//Funcion para insertar un Nodo en el arbol recibiendo el apuntador del arbol y del nodo
	Nodo *aux,*ant;     //El aux es el que se movera entre los nodos y el nodo ant estara apuntando un nodo anterior a aux
	if(estaVacioElArbol(a)){
		a->raiz=n; //si la raiz se encuentra vacia, insertamos el dato directamente en el nodo
	}else{
		aux=a->raiz; //el aux comienza apuntando al nodo padre o la raiz
		while(aux!=NULL){//el while nos permite buscar un espacio libre entre los hijos del nodo
			ant=aux;//antes de mover a aux, ant adquiere su valor para permanecer atras
			if(n->dato > aux ->dato){//Recibimos nuestro nuevo nodo, con la variable n apuntando a el y verificamos si es mas grande que nuestro aux
				aux=aux->der;//si este es mayor, aux se mueve a la derecha
			}else{
				aux=aux->izq;//en caso contrario, aux se mueve a la izq
			}
		}
		n->padre=ant;//ahora el nuevo padre aparece, y va a ser donde alla finalizado ant dentro del ciclo while
		if(n->dato > ant->dato){//ahora revisamos si el nuevo dato es mayor que nuestro nuevo padre
			ant->der=n; //si este es mayor lo manda a la derecha al nuevo dato
		}else{
			ant->izq=n; //en caso contrario lo manda a la izquierda
		}
	}
}

void preorden(Nodo *n){//Funcion para preorden
	if(n!=NULL){ //Preguntamos si el Nodo recibido es diferente de NULL
		printf(" %d ",n->dato);//si es distinto imprimimos su valor
		preorden(n->izq);//volvemos a ejecutarlo, con el nodo de la izquierda
		preorden(n->der);//realizamos lo anterior, pero con los nodos de la derecha
	}
}

void inorden(Nodo *n){//Funcion para inorden
	if(n!=NULL){//Preguntamos si el Nodo recibido es diferente de NULL
		inorden(n->izq);//Primeramente visitamos el nodo izquierdo
		printf(" %d ",n->dato);//imprimirmos el nodo raiz o padre
		inorden(n->der);//visitamos el nodo de la derecha
	}
}

void postorden(Nodo *n){//Funcion para postorden
	if(n!=NULL){//Preguntamos si el Nodo recibido es diferente de NULL
		postorden(n->izq);//recorremos los nodos izquierdos
		postorden(n->der);//recorremos los nodos derechos
		printf(" %d ",n->dato);//imprimimos el nodo por ultimo
	}
}

void imprimirPostorden(Arbol *a){//Funcion para imprimir Postorden recibiendo de dato nuestro arbol
	if(!estaVacioElArbol(a)){//verificamos si esta vacio el arbol
		postorden(a->raiz);//si este no esta vacio, llamamos la funcion postorden
	}
}

void imprimirPreorden(Arbol *a){//Funcion para imprimir Preorden recibiendo de dato nuestro arbol
	if(!estaVacioElArbol(a)){//verificamos si esta vacio el arbol
		preorden(a->raiz);//si este no esta vacio, llamamos la funcion preorden
	}
}

void imprimirInorden(Arbol *a){//Funcion para imprimir Inorden recibiendo de dato nuestro arbol
	if(!estaVacioElArbol(a)){//verificamos si esta vacio el arbol
		inorden(a->raiz);//si este no esta vacio, llamamos la funcion inorden
	}
}

Nodo* buscarNodo (Arbol *a,int valor){//Funcion para buscar, recibimos el arbol y el valor a buscar
	Nodo *aux=NULL; //recibimos un nodo aux con valor NULL
    if(!estaVacioElArbol(a)){//Rebisamos si nuestro arbol no se encuentra vacio
		aux=a->raiz;//nuestro auxiliar tomara el valor de la raiz de nuestro arbol
        while(aux!=NULL && aux->dato!=valor){//mientras que sea distinto de NULL y ademas que el dato de aux sea distinto al que busco
			if(valor < aux->dato){//si el valor es menor a el aux, el aux se movera al valor del nodo de la izq
				aux=aux->izq;
            }else{
                aux=aux->der;//si el valor es menor a el aux, el aux se movera al valor del nodo de la der
            }
        }
    }
    return aux;//esto seguira asta que encontremos el valor o terminemos en NULL
}

Nodo* buscarNodoRecorrido (Arbol *a,int valor){//Funcion para buscar, recibimos el arbol y el valor a buscar
	Nodo *aux=NULL; //recibimos un nodo aux con valor NULL
    if(!estaVacioElArbol(a)){//Rebisamos si nuestro arbol no se encuentra vacio
		aux=a->raiz;//nuestro auxiliar tomara el valor de la raiz de nuestro arbol
        while(aux!=NULL && aux->dato!=valor){//mientras que sea distinto de NULL y ademas que el dato de aux sea distinto al que busco
			if(valor < aux->dato){//si el valor es menor a el aux, el aux se movera al valor del nodo de la izq
				aux=aux->izq;
				printf("Recorrido: Izquierda\n");
            }else{
                aux=aux->der;//si el valor es menor a el aux, el aux se movera al valor del nodo de la der
                printf("Recorrido: Derecha\n");
        }
    }
    return aux;//esto seguira asta que encontremos el valor o terminemos en NULL
}
}

Nodo * hijoNoNullDelNodo(Nodo *nodo){//Funcion que nos permite conocer cual nodo no esta vacio
	if(nodo->izq!=NULL){//verificamos si el nodo por la izquierda no esta vacio
		return nodo->izq;//retornamos el nodo de la izquierda
	}else{
		return nodo->der;//en caso contrario retornamos el nodo de la derecha
	}
}

void eliminarNodo(Arbol *a, int valor){//funcion para eliminar, recibe el arbol y el valor a eliminar
	Nodo *aux=buscarNodo(a,valor);//inicializamos un nodo auxiliar que adquiere el valor del resultado de la funcion buscarNodo
	Nodo *aux2;//Inicializamos un segundo auxiliar
	Nodo *padre;//Inicializamos un Nodo Padre
	if(aux!= NULL){//si localizamos el nodo podemos proseguir
		padre=aux->padre;//Loxalizamos a padre
		if(aux->izq == NULL && aux->der==NULL){ //Verificamos si el nodo se encuentra sin hijos
			if (padre!=NULL){//no es la raiz
				if  ( aux->dato  < padre->dato){//verificamos si el aux es menor que el padre
					padre->izq=NULL;//padre por la izquierda apunta a NULL
				}else{
					padre->der=NULL;//en caso contrario padre por la derecha apuntara a NULL
				}
			}else{
				a->raiz=NULL;//por ultimo eliminamos la raiz
		    }
            free (aux);//liberamos el valor de la memora a aux
		}else if(aux->der==NULL || aux->izq==NULL){//Nodos con un solo hijo
			if (padre!=NULL){//no es la raiz
				if  ( aux->dato  < padre->dato){//si el aux es menor que el padre
					padre->izq=hijoNoNullDelNodo(aux);//el padre va a ser igual a hijo que si tiene dato de aux
					padre->izq->padre=padre;//y lo ingresa al lado izquierdo, ademas le indicamos el nuevo padre
				}else{
					padre->der=hijoNoNullDelNodo(aux);//en caso contrario ingresa a la derecha el nodo no vacio
					padre->der->padre=padre;//indicamos cual es el nuevo padre
				}
			}else{
				a->raiz=hijoNoNullDelNodo(aux);//en caso de que sea la raiz, y conectamos al hijo no null de nuestro aux
		    }
		    free (aux);//libreamos el aux
		}else{//Nodo con ambos hijos
			aux2=aux->izq;//el auxiliar 2 se posicionara en el nodo de la izquierda del aux
			while(aux2->der !=NULL){//ciclo para mover el aux2 por la derecha
				aux2=aux2->der;
			}
			padre=aux2->padre;//adquirimos el nodo padre de aux2
			if  ( aux2->dato  < padre->dato){//si aux2 es menor a padre
				padre->izq=aux2->izq;//la parte izquierda de padre tomara la parte izquierda de aux2
			}else{
				padre->der=aux2->izq;//en caso contrario la parte derecha de padre, tomara la partre izquierda de aux2
			}
			aux2->izq->padre=padre;//le asignamos el nuevo padre
			aux->dato=aux2->dato;//Intercambiamos el contenido de aux por aux2
			free(aux2);//eliminamos el aux2
		}
	}
}

int main(){
	Arbol *a=crearArbol();//creamos nuestro Arbol
	Nodo *aux;//agragamos un nodo auxiliar para la busqueda de datos y su impresion
    int Nodos=0,NumNuev, NumElim,NumBusc, primerNodo,opc,flag = 0,valor=1;
    printf("Ingresa la cantidad de nodos a Realizar: ");//Le pedimos al usuario la cantidad de nodos a realizar en el arbol
    scanf("%d",&Nodos);
    printf("Usted Eligio la cantidad de %d Nodos\n", Nodos);//le confirmamos la cantidad
    do{//Ciclo para evitar la salida sin pedido del usuario
    printf("Eliga una de las siguientes Opciones\n");//despliegue de opciones para el usuario
    printf("-----Menu De Opciones-----\n");
    printf("1.-Insertar Nodo\n");
    printf("2.-Eliminar Nodo\n");
    printf("3.-Pre-Orden\n");
    printf("4.-In-Orden\n");
    printf("5.-Post-Orden\n");
    printf("6.-Busqueda de Elementos\n");
    printf("7.-Imprimir Nodo\n");
    printf("8.-Salir\n");
    scanf("%d",&opc);//leemos la opcion del usuario y la ingresamos a un switch
    switch(opc){
        case 1://insertar nodos
            if(flag>=Nodos){//si llegas al limite de nodos, no te dejara insertar mas y mandara un mensaje de limite
                printf("LLegaste a tu limite de nodos\n");
            }else{
                printf("Inserta un nuevo nodo\n");//le pedimos que ingrese un nuevo nodo al usuario
                scanf("%i",&NumNuev);
                insertarNodo(a,crearNodo(NumNuev));//llamamos a la funcion insertar, invocando dentro de ella la funcion crear un nodo e ingresando el arbol creado
                flag++;//aumentamos la bandera para delimitar los nodos
            }
            break;
        case 2://eliminacion de nodos
            printf("Inserte el nodo a eliminar\n");
            scanf("%i",&NumElim);//leemos el numero a eliminar que dio el usuario
            eliminarNodo(a,NumElim);//llamamos a la funcion eliminar nodo
            break;
        case 3://Imprimir preorden
            printf("\nImprimiendo preorden\n");
            imprimirPreorden(a);//invocamos la funcion de imprimir ingresando el arbol
            printf("\n");
            break;
        case 4://Imprimir inorden
            printf("\nImprimiendo inorden\n");
            imprimirInorden(a);//invocamos la funcion de imprimir ingresando el arbol
            printf("\n");
            break;
        case 5://Imprimir postorden
            printf("\nImprimiendo postorden\n");
            imprimirPostorden(a);//invocamos la funcion de imprimir ingresando el arbol
            printf("\n");
            break;
        case 6://buscar
            printf("Inserte el nodo a buscar\n");
            scanf("%i",&NumBusc);//leemos el dato metido por el usuario
            aux = buscarNodoRecorrido(a,NumBusc);//en el nodo aux ingresamos el valor que encontremos de la funcion buscar nodo
            if(aux != NULL){//si el nodo aux es diferente de NULL
                printf("Nodo Localizado\n");//Imprime un mensaje de que fue encontrado
            }else{
                printf("El Nodo no se encuentra insertado en el arbol");//en caso contrario imrpime que no se encuentra en el arbol
            }
            break;
        case 7://Imprimir Nodo
            printf("Inserte el nodo a buscar\n");
            scanf("%i",&NumBusc);//realizamos los mismos pasos de anteriormente
            aux=buscarNodo(a,NumBusc);
            if(aux != NULL){
                printf("Nodo localizado: %d\n", aux->dato);//imprime el nodo que encontro la funcion y se alojo en el aux
            }else{
                printf("El Nodo no se encuentra insertado en el arbol");
            }
            break;
        case 8://salida
            valor=0;//adquiere el valor de 0 lo cual termina el ciclo do while
            break;
    }
    }while(valor!=0);
}

