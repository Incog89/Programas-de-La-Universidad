# Algoritmo de Busqueda Ciega: Busqueda en profundidad limitada por derecha (BPLder)

# Construccion del arbol n-ario estatico

class arbol:
    def __init__(self, valor, limite):
        self.valor = valor
        self.limite = limite
        self.hijos = []

def menu():
    print("Menú de opciones:")
    print("1. Busqueda Profunda Limitada Por la Derecha")
    print("2. Busqueda en Anchura Limitada Por la Derecha")
    print("3. Busqueda Profunda Limitada Por la Izquierda")
    print("4. Busqueda en Anchura Limitada Por la Izquierda")
    print("3. Salir")
    opcion = int(input("Selecciona una opción: "))
    return opcion

# Definir arbol n-ario
raiz = arbol(1, 0)

# hijos del nodo raiz
raiz.hijos.append(arbol(2, 1))  # Hijo en indice 0
raiz.hijos.append(arbol(3, 1))  # Hijo en indice 1
raiz.hijos.append(arbol(4, 1))  # Hijo en indice 2

# Hijos del nodo 2 (indice 0)
raiz.hijos[0].hijos.append(arbol(5, 2))  # Hijos del nodo 2, indice 0
raiz.hijos[0].hijos.append(arbol(6, 2))  # Hijos del nodo 2, indice 1
raiz.hijos[0].hijos.append(arbol(7, 2))  # Hijos del nodo 2, indice 2

# Hijos del nodo 4 (indice 2)
raiz.hijos[2].hijos.append(arbol(8, 2))  # Hijos del nodo 4, indice 0
raiz.hijos[2].hijos.append(arbol(9, 2))  # Hijos del nodo 4, indice 1

# Hijos del nodo 5
raiz.hijos[0].hijos[0].hijos.append(arbol(10, 3))  # Hijos del nodo 5, indice 0

# Hijos del nodo 7
raiz.hijos[0].hijos[2].hijos.append(arbol(11, 3))  # Hijos del nodo 7, indice 0
raiz.hijos[0].hijos[2].hijos.append(arbol(12, 3))  # Hijos del nodo 7, indice 1

# Hijos del nodo 9
raiz.hijos[2].hijos[1].hijos.append(arbol(13, 3))  # Hijos del nodo 9, indice 0
raiz.hijos[2].hijos[1].hijos.append(arbol(14, 3))  # Hijos del nodo 9, indice 1

agenda = []
agenda.append(raiz)
nodoBuscar = 2
nodoLimite = 3

while True:
    opcion = menu()
    if opcion == 1:
        #Busqueda Profunda lIMITADA
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
        # Busqueda por Anchura Limitada
        while (agenda):
            nodo = agenda.pop(0)
            if (nodo.limite <= nodoLimite):
                print("Nodo visitando", nodo.valor)
                if (nodo.valor == nodoBuscar):
                    break
                else:
                    for i in nodo.hijos:
                        agenda.append(i)
        break
    elif opcion == 3:
        #Busqueda Profunda izquierda lIMITADA
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
    elif opcion == 4:
        # Busqueda por Anchura izquierda Limitada
        while (agenda):
            nodo = agenda.pop(0)
            if (nodo.limite <= nodoLimite):
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


