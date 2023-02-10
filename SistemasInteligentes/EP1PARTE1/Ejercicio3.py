#Ejercicio 3 Ejercicios

class arbol:
    def __init__(self, valor, limite):
        self.valor = valor
        self.limite = limite
        self.hijos = []

def menu():
    print("Menú de opciones:")
    print("1. Busqueda Profundidad Limitada Por la Derecha")
    print("2. Busqueda Profundidad Limitada Por la Izquierda")
    print("3. Salir")
    opcion = int(input("Selecciona una opción: "))

    return opcion

def valorBusqueda():
    nodoBuscar = input("Seleccione el valor a buscar: ")

    return nodoBuscar

def valorLimite():
    nodoLimite = int(input("Seleccione el limite de busqueda: "))

    return nodoLimite

#Definir arbol n-ario
raiz = arbol("Arad",0)

#hijos del nodo raiz
raiz.hijos.append(arbol("Timisura",1)) #Hijo en indice 0
raiz.hijos.append(arbol("Sibu",1)) #Hijo en indice 1
raiz.hijos.append(arbol("Zerind",1)) #Hijo en indice 2

#Hijos del nodo Timisura (indice 0)
raiz.hijos[0].hijos.append(arbol("Lugoj",2)) #Hijos del nodo Timisura, indice 0


#Hijos del nodo Sibiu (indice 1)
raiz.hijos[1].hijos.append(arbol("Rimnicu",2)) #Hijos del nodo Sibiu, indice 0
raiz.hijos[1].hijos.append(arbol("Fagaras",2)) #Hijos del nodo Sibiu, indice 1

#Hijos del nodo Zerind (indice 2)
raiz.hijos[2].hijos.append(arbol("Oradea",2)) #Hijos del nodo Zerind, indice 0

#Hijos del nodo Timisura
raiz.hijos[0].hijos[0].hijos.append(arbol("Mehadia",3)) #Hijos del nodo Timisura, indice 0

#Hijos del nodo Rimnicu
raiz.hijos[1].hijos[0].hijos.append(arbol("Craiova",3)) #Hijos del nodo Rimnicu, indice 0
raiz.hijos[1].hijos[0].hijos.append(arbol("Pitesti",3)) #Hijos del nodo Rimnicu, indice 1

#Hijos del nodo Fagaras
raiz.hijos[1].hijos[1].hijos.append(arbol("Bucharest",3)) #Hijos del nodo Fagaras, indice 0

#Hijos del nodo Oradea
raiz.hijos[2].hijos[0].hijos.append(arbol("Sibu",3)) #Hijos del nodo Oradea, indice 0

#Hijos del nodo Mehadia
raiz.hijos[0].hijos[0].hijos[0].hijos.append(arbol("Dobreta",4))#Hijos del nodo Mehadia, indice 0

#Hijos del nodo Pitesti
raiz.hijos[1].hijos[0].hijos[1].hijos.append(arbol("Bucharest",4))#Hijos del nodo Pitesti, indice 0

#Hijos del nodo Sibu
raiz.hijos[2].hijos[0].hijos[0].hijos.append(arbol("Rimnicu",4)) #Hijos del nodo Sibu, indice 0
raiz.hijos[2].hijos[0].hijos[0].hijos.append(arbol("Fagaras",4)) #Hijos del nodo Sibu, indice 1

#Hijos del nodo Dobreta
raiz.hijos[0].hijos[0].hijos[0].hijos[0].hijos.append(arbol("Craiova",5))#Hijos del nodo Dobreta, indice 0

agenda=[]
agenda.append(raiz)

while True:
    opcion = menu()
    nodoBuscar = valorBusqueda()
    nodoLimite = valorLimite()
    if opcion == 1:
        # Busqueda Profunda lIMITADA
        while (agenda):
            nodo = agenda.pop()
            if (nodo.limite <= nodoLimite):
                print("Nodo visitando", nodo.valor)
                if (nodo.valor == nodoBuscar):
                    break
                else:
                    for i in nodo.hijos:
                        agenda.append(i)
        break
    elif opcion == 2:
        # Busqueda Profunda izquierda lIMITADA
        while (agenda):
            nodo = agenda.pop()
            if (nodo.limite <= nodoLimite):
                print("Nodo visitando", nodo.valor)
                if (nodo.valor == nodoBuscar):
                    break
                else:
                    for i in reversed(nodo.hijos):
                        agenda.append(i)
        break
    elif opcion == 3:
        print("Hasta luego!")
        break
    else:
        print("Opción inválida. Por favor, selecciona una opción válida.")
