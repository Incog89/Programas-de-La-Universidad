#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

//---------------------------------------------------


//Defino la estructura de �rbol.
struct arbol
{
    int num;
    struct arbol *izq;
    struct arbol *der;

};

//-----------------------------------------------------------------

//Procedimiento para empezar a usar un �rbol con la ra�z vac�a.
void crear_arbol(struct arbol *raiz)
{
  raiz=NULL;

};

//Procedimiento para insertar en un �rbol un nro entero que no debe existir en el mismo.

void insertar_arbol(struct arbol *raiz, int n)
{
  struct arbol *p,*ant,*nuevo;

     nuevo=new struct arbol; //pido un nuevo nodo del arbol

     nuevo->num =n;
     nuevo->der =NULL;
     nuevo->izq =NULL;

     if(raiz!=NULL)
     {
       p=raiz;          //p es = r
       ant=raiz;       //anterior es = r
       //este while es para buscar adonde lo tengo que colocar
       while(p!=NULL)
       {
         ant=p;
          if(p->num>n)
             p=p->izq;
          else
            p=p->der;
       }
       //con este algoritmo chequeo el numero si lo inserto a la izquierda o a la derecha de la raiz
       if(ant->num>n)
          ant->izq=nuevo;
       else
         ant->der=nuevo;
     }
       else
         raiz=nuevo;

}

/* Funci�n que determina si un nro entero est� o no en el �rbol.
   Devuelve 0 si no est� y 1 si est�. bool esta _arbol(struct �rbol *ra�z, int n). */

bool esta_arbol(struct arbol *raiz, int n)
{
   bool res;
   struct arbol *p;

   p=raiz;
   res=false;
   //este while valida si esta en el arbol.
   while(p!=NULL && res==false)
   {
     if(p->num==n)
        res=true;
     else
       if(p->num>n)
         p=p->izq;
     else
        p=p->der;

   }

   return res;

}

//algoritmo con IRD: ORDENA DE MENOR A MAYOR
void mostrar_arbol(struct arbol *raiz)
{
  if(raiz!=NULL)  //raiz != de nulo
  {
    mostrar_arbol(raiz->izq); //llamo a recorrer arbol donde raiz apunta al nodo de la izquierda
    printf("\n %d",raiz->num); //mostrar el nodo raiz
    mostrar_arbol(raiz->der); //llamo a recorrer arbol donde raiz apunta al nodo de la derecha
  }
};

void borrar_dos_hijos(struct arbol *&raiz,struct arbol *p, struct arbol *ant, int n)
{
   struct arbol *dere;
   struct arbol *izqui;
   struct arbol *anterior;

   izqui=p->izq;
   anterior=izqui;
   dere=izqui;

   while(dere->der!=NULL)
   {
     anterior=dere;
     dere=dere->der;
   }
   if(izqui->der!=NULL)
   {
      anterior->der=dere->izq;
      p->num=dere->num;
      delete(dere);
   }
   else
   {
      p->izq=izqui->izq;
      p->num=izqui->num;
      delete(izqui);
   }

}

void borrar_hoja(struct arbol *&raiz,struct arbol *p,struct arbol *ant,int n)
{
  if(p==raiz)
      raiz=NULL;
  else
    if(ant->der==p)
       ant->der=NULL;
    else
      ant->izq=NULL;

      delete(p);

}

void borrar_un_hijo(struct arbol *&raiz,struct arbol *p,struct arbol *ant,int n)
{
   if(p==raiz)
    if(raiz->der!=NULL)
        raiz=raiz->der;
    else
       raiz=raiz->izq;

    else
      if(ant->der==p)
        if(p->der!=NULL)
            ant->der=p->der;
         else
            ant->der=p->izq;
            else if(p->der!=NULL)
                ant->izq=p->der;
                  else ant->izq=p->izq;

                  delete(p);

}
void borrar_de_arbol(struct arbol *&raiz,struct arbol *p,struct arbol *ant,int n)
{
   if(p->der==NULL && p->izq==NULL)
      borrar_hoja(raiz,p,ant,n);
   else
     if(p->der!=NULL && p->izq!=NULL)
         borrar_dos_hijos(raiz,p,ant,n);
      else
        borrar_un_hijo(raiz,p,ant,n);

};

void eliminar_de_arbol(struct arbol *&raiz,int n)
{
  struct arbol *p, *ant, *nuevo;

  p=raiz;
  ant=raiz;

  while(p->num!=n)
  {
    ant=p;
      if(p->num>n)
         p=p->izq;
      else
         p=p->der;
  }
  borrar_de_arbol(raiz,p,ant,n);

};


int mostrar_nivel(struct arbol* raiz, int numero)
{

    int cont;
    bool seguir=true;

    if(raiz!=NULL && seguir) //raiz != de nulo
    {
      mostrar_nivel(raiz->izq, numero); //llamo a recorrer arbol donde raiz apunta al nodo de la izquierda

      if(raiz->num == numero)
      {
        seguir=false;
            return false;
      }
      else
         if(seguir)
             cont++;

       mostrar_nivel(raiz->der, numero); //llamo a recorrer arbol donde raiz apunta al nodo de la derecha
    }
    return true;
}


//int mostrar_nivel(struct arbol* raiz, int numero)
//{
//    struct arbol* p;
//    p = raiz;
//    int cont = 0;
//
//    while(p->der != NULL)
//    {
//        if(p->num == numero)
//          return cont;
//
//            p = p->der;
//    }
//    return -1;
//}


void detecta_nivel(struct arbol *&raiz,int num )
{
    struct arbol *p;

    p=raiz;
    int cont =0;

    while(p->num!=num)
    {
      if(p->num>num)
      {
        p=p->izq;
        cont++;

      }
      else
      {
        p=p->der;
        cont++;
      }
    }
}



void leer_numero(char cade[30], int &a)
{

  printf("\n %s:",cade);
  scanf("%d",&a);
  fflush(stdin);

}


void pausar()
{
   printf("\n");
   system("pause");

}
//---------------------------------------------------------------------------

int main()
{

    int i;
    struct arbol *ar; //la raiz del arbol
    int x,nro;

     crear_arbol(ar); //llamo a crear arbol y me devuelve la raiz del arbo, ar = NULL

    printf("\nIngrese un numero para insertar en el arbol: ");
    scanf("%d",&nro);
    fflush(stdin);


    while(nro!=0)
    {
       //si esta_en_arbol(ar,nro)== false, llamo a insertar en el arbol con la raiz del arbol con el numero
       if(esta_arbol(ar,nro)== false)
           insertar_arbol(ar,nro); //este procedimiento sabe donde lo tiene que colocar !!!
       else
          printf("\nEl numero esta repetido en el arbol !!! ");

          printf("\nIngrese un numero para insertar en el arbol: ");
          scanf("%d",&nro);
          fflush(stdin);

    }
    //llamo a recorrer en el arbol y depende como yo haya escrito yo el procedimiento recorrer_arbol me va a mostrar ordenado, desordenado
    mostrar_arbol(ar);
    printf("\n");

    //e) Luego otra vez leer varios nros (con cualquier criterio)
    //f) intentar eliminarlos de la estructura.

    printf("_____________________________________________________\n");
    printf("\n ingrese un numero para eliminar del arbol: ");
    scanf("%d", &nro);
    fflush(stdin);

    while(nro!=0)
    {
      if(esta_arbol(ar,nro)==true)
          eliminar_de_arbol(ar,nro);
      else
         printf("\nel numero NO esta en el arbol !!! ");

         printf("\nIngrese un numero para eliminar del arbol: ");
         scanf("%d",&nro);
         fflush(stdin);

    }
    mostrar_arbol(ar);
    printf("\n");

    printf("\nIngresar un numero y mostrar en que nivel del arbol se encuentra: ");
    scanf("%d",&nro);
    fflush(stdin);

    //detecta_nivel(ar,nro);

    int nivel=mostrar_nivel(ar,nro);
    printf("\n el numero esta en  el nivel %d ", nivel);
    printf("\n");



    pausar();

    return 0;

}
