#Construccion del arbol n-ario estatico

class arbol:
    def __init__(self, valor):
        self.valor = valor
        self.hijos = []

def menu():
    print("Menú de opciones:")
    print("1. Busqueda Profunda Por la Derecha")
    print("2. Busqueda Profunda Por la Izquierda")
    print("3. Busqueda en Anchura Por la Derecha")
    print("4. Busqueda en Anchura Por la Izquierda")
    print("5. Salir")
    opcion = int(input("Selecciona una opción: "))
    return opcion

#Definir arbol n-ario
raiz = arbol("A")

#hijos del nodo raiz
raiz.hijos.append(arbol("B")) #Hijo en indice 0
raiz.hijos.append(arbol("C")) #Hijo en indice 1
raiz.hijos.append(arbol("D")) #Hijo en indice 2

#Hijos del nodo B (indice 0)
raiz.hijos[0].hijos.append(arbol("E")) #Hijos del nodo B, indice 0
raiz.hijos[0].hijos.append(arbol("F")) #Hijos del nodo B, indice 1


#Hijos del nodo C (indice 1)
raiz.hijos[1].hijos.append(arbol("I")) #Hijos del nodo C, indice 0
raiz.hijos[1].hijos.append(arbol("F")) #Hijos del nodo C, indice 1

#Hijos del nodo D (indice 2)
raiz.hijos[2].hijos.append(arbol("G")) #Hijos del nodo D, indice 0
raiz.hijos[2].hijos.append(arbol("H")) #Hijos del nodo D, indice 1

#Hijos del nodo E
raiz.hijos[0].hijos[0].hijos.append(arbol("I")) #Hijos del nodo E, indice 0
raiz.hijos[0].hijos[0].hijos.append(arbol("J")) #Hijos del nodo E, indice 1

#Hijos del nodo F
raiz.hijos[0].hijos[1].hijos.append(arbol("K")) #Hijos del nodo F, indice 0
raiz.hijos[0].hijos[1].hijos.append(arbol("L")) #Hijos del nodo F, indice 1

#Hijos del nodo G
raiz.hijos[2].hijos[0].hijos.append(arbol("M")) #Hijos del nodo G, indice 0

#Hijos del nodo H
raiz.hijos[2].hijos[1].hijos.append(arbol("L")) #Hijos del nodo H, indice 0

agenda=[]
agenda.append(raiz)
nodoBuscar = "J"

while True:
    opcion = menu()
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
        # Busqueda por Anchura
        while (agenda):
            nodo = agenda.pop(0)
            print("Nodo visitando", nodo.valor)
            if (nodo.valor == nodoBuscar):
                break
            else:
                for i in nodo.hijos:
                    agenda.append(i)
        break
    elif opcion == 4:
        # busqueda de anchura por la izquierda
        while (agenda):
            nodo = agenda.pop(0)
            print("Nodo visitando", nodo.valor)
            if (nodo.valor == nodoBuscar):
                break
            else:
                for i in reversed(nodo.hijos):
                    agenda.append(i)
        break
    elif opcion == 5:
        print("Hasta luego!")
        break
    else:
        print("Opción inválida. Por favor, selecciona una opción válida.")


