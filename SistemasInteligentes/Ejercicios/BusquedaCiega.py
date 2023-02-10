#Algoritmo de Busqueda Ciega: Busqueda en profundidad por derecha (BPder)

#Construccion del arbol n-ario estatico

class arbol:
    def __init__(self, valor):
        self.valor = valor
        self.hijos = []


#Definir arbol n-ario
raiz = arbol(1)

#hijos del nodo raiz
raiz.hijos.append(arbol(2)) #Hijo en indice 0
raiz.hijos.append(arbol(3)) #Hijo en indice 1
raiz.hijos.append(arbol(4)) #Hijo en indice 2

#Hijos del nodo 2 (indice 0)
raiz.hijos[0].hijos.append(arbol(5)) #Hijos del nodo 2, indice 0
raiz.hijos[0].hijos.append(arbol(6)) #Hijos del nodo 2, indice 1
raiz.hijos[0].hijos.append(arbol(7)) #Hijos del nodo 2, indice 2

#Hijos del nodo 4 (indice 2)
raiz.hijos[2].hijos.append(arbol(8)) #Hijos del nodo 4, indice 0
raiz.hijos[2].hijos.append(arbol(9)) #Hijos del nodo 4, indice 1

#Hijos del nodo 5
raiz.hijos[0].hijos[0].hijos.append(arbol(10)) #Hijos del nodo 5, indice 0

#Hijos del nodo 7
raiz.hijos[0].hijos[2].hijos.append(arbol(11)) #Hijos del nodo 7, indice 0
raiz.hijos[0].hijos[2].hijos.append(arbol(12)) #Hijos del nodo 7, indice 1

#Hijos del nodo 9
raiz.hijos[2].hijos[1].hijos.append(arbol(13)) #Hijos del nodo 9, indice 0
raiz.hijos[2].hijos[1].hijos.append(arbol(14)) #Hijos del nodo 9, indice 1


agenda=[]
agenda.append(raiz)
nodoBuscar = 7

#while(agenda):
    #nodo = agenda.pop()
    #print("Nodo visitando", nodo.valor)
    #if (nodo.valor == nodoBuscar):
    #    break
    #else:
     #   for i in nodo.hijos:
      #      agenda.append(i)

#busqueda por la izquierda
#while(agenda):
    #nodo = agenda.pop()
    #print("Nodo visitando", nodo.valor)
    #if (nodo.valor == nodoBuscar):
        #break
    #else:
        #for i in reversed(nodo.hijos):
            #agenda.append(i)

#Busqueda por Anchura
while(agenda):
    nodo = agenda.pop(0)
    print("Nodo visitando", nodo.valor)
    if (nodo.valor == nodoBuscar):
        break
    else:
        for i in nodo.hijos:
            agenda.append(i)

#busqueda de anchura por la izquierda
#while(agenda):
    #nodo = agenda.pop(0)
    #print("Nodo visitando", nodo.valor)
    #if (nodo.valor == nodoBuscar):
        #break
    #else:
        #for i in reversed(nodo.hijos):
            #agenda.append(i)