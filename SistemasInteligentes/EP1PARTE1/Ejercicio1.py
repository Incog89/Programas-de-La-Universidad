#Ejercicio 1 Ejercicios

class arbol:
    def __init__(self, valor):
        self.valor = valor
        self.hijos = []

def menu():
    print("Menú de opciones:")
    print("1. Busqueda Profunda Por la Derecha")
    print("2. Busqueda Profunda Por la Izquierda")
    print("3. Salir")
    opcion = int(input("Selecciona una opción: "))

    return opcion

def valorBusqueda():
    nodoBuscar = input("Seleccione el valor a buscar: ")

    return nodoBuscar

#Definir arbol n-ario
raiz = arbol("Arad")

#hijos del nodo raiz
raiz.hijos.append(arbol("Timisura")) #Hijo en indice 0
raiz.hijos.append(arbol("Sibu")) #Hijo en indice 1
raiz.hijos.append(arbol("Zerind")) #Hijo en indice 2

#Hijos del nodo Timisura (indice 0)
raiz.hijos[0].hijos.append(arbol("Lugoj")) #Hijos del nodo Timisura, indice 0


#Hijos del nodo Sibiu (indice 1)
raiz.hijos[1].hijos.append(arbol("Rimnicu")) #Hijos del nodo Sibiu, indice 0
raiz.hijos[1].hijos.append(arbol("Fagaras")) #Hijos del nodo Sibiu, indice 1

#Hijos del nodo Zerind (indice 2)
raiz.hijos[2].hijos.append(arbol("Oradea")) #Hijos del nodo Zerind, indice 0

#Hijos del nodo Lugoj
raiz.hijos[0].hijos[0].hijos.append(arbol("Mehadia")) #Hijos del nodo Timisura, indice 0

#Hijos del nodo Rimnicu
raiz.hijos[1].hijos[0].hijos.append(arbol("Craiova")) #Hijos del nodo Rimnicu, indice 0
raiz.hijos[1].hijos[0].hijos.append(arbol("Pitesti")) #Hijos del nodo Rimnicu, indice 1

#Hijos del nodo Fagaras
raiz.hijos[1].hijos[1].hijos.append(arbol("Bucharest")) #Hijos del nodo Fagaras, indice 0

#Hijos del nodo Oradea
raiz.hijos[2].hijos[0].hijos.append(arbol("Sibu")) #Hijos del nodo Oradea, indice 0

#Hijos del nodo Mehadia
raiz.hijos[0].hijos[0].hijos[0].hijos.append(arbol("Dobreta"))#Hijos del nodo Mehadia, indice 0

#Hijos del nodo Pitesti
raiz.hijos[1].hijos[0].hijos[1].hijos.append(arbol("Bucharest"))#Hijos del nodo Pitesti, indice 0

#Hijos del nodo Sibu
raiz.hijos[2].hijos[0].hijos[0].hijos.append(arbol("Rimnicu")) #Hijos del nodo Sibu, indice 0
raiz.hijos[2].hijos[0].hijos[0].hijos.append(arbol("Fagaras")) #Hijos del nodo Sibu, indice 1

#Hijos del nodo Dobreta
raiz.hijos[0].hijos[0].hijos[0].hijos[0].hijos.append(arbol("Craiova"))#Hijos del nodo Dobreta, indice 0

agenda=[]
agenda.append(raiz)

while True:
    opcion = menu()
    nodoBuscar = valorBusqueda()
    if opcion == 1:
        # Busqueda profundidad derecha
        while (agenda):
            nodo = agenda.pop()
            print("Nodo visitando", nodo.valor)
            if (nodo.valor == nodoBuscar):
                break
            else:
                for i in nodo.hijos:
                    agenda.append(i)
        break
    elif opcion == 2:
        # busqueda por la izquierda
        while (agenda):
            nodo = agenda.pop()
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


