#Ejercicio 10 Ejercicios

import random

# La clase Node representa una casilla del tablero
class Node:
    def __init__(self, x, y, parent=None):
        self.x = x # Asigna el valor de x a la variable x
        self.y = y # Asigna el valor de y a la variable y
        self.parent = parent # Asigna el valor de parent a la variable parent
        self.g = 0  # Valor de movimientos horizontales o verticales (a tu elección)
        self.h = abs(x - planta.x) + abs(y - planta.y)  # Distancia de Manhattan como heurística
        self.f = self.g + self.h  # Costo total f = g + h

    def __eq__(self, other):
        return self.x == other.x and self.y == other.y

# La clase Plant representa la planta
class Plant:
    def __init__(self):
        self.x = 0  # Columna x de la planta
        self.y = random.randint(0, 4)  # Fila y de la planta (determinada aleatoriamente)

# La clase Zombie representa al zombi
class Zombie:
    def __init__(self):
        self.x = 4  # Columna x del zombi
        self.y = random.randint(0, 4)  # Fila y del zombi (determinada aleatoriamente)

    def move(self, plant):
        open_list = []  # Lista de nodos abiertos (por explorar)
        closed_list = []  # Lista de nodos cerrados (explorados)

        start_node = Node(self.x, self.y)  # Nodo inicial (posición actual del zombi)
        goal_node = Node(planta.x, planta.y)  # Nodo objetivo (posición de la planta)

        #Añade el nodo inicial a la lista de nodos abiertos
        open_list.append(start_node)

        # Mientras la lista de nodos abiertos no esté vacía
        while len(open_list) > 0:
            # Encuentra el nodo con menor costo f en la lista de nodos abiertos
            current_node = min(open_list, key=lambda x: x.f)
            # Remueve el nodo de la lista de nodos abiertos
            open_list.remove(current_node)
            # Añade el nodo a la lista de nodos cerrados
            closed_list.append(current_node)

            # Si el nodo objetivo es alcanzado
            if current_node == goal_node:
                # Crea una lista vacía para guardar el camino
                path = []
                # Agrega la posición actual del nodo a la lista y sigue revisando el padre del nodo
                # hasta llegar al nodo inicial
                while current_node.parent:
                    path.append((current_node.x, current_node.y))
                    current_node = current_node.parent
                # Agrega la posición inicial del zombi a la lista
                path.append((start_node.x, start_node.y))
                # Regresa el camino en orden inverso
                return path[::-1]  # Devolver el camino en orden inverso

            # Generar vecinos (casillas adyacentes)
            neighbors = []
            # Se recorren las posibles opciones de desplazamiento (arriba, abajo, derecha, izquierda)
            for dx, dy in [(1, 0), (-1, 0), (0, 1), (0, -1)]:
                # Se calcula la posición x e y del vecino
                x = current_node.x + dx
                y = current_node.y + dy
                # Se verifica si la posición del vecino está dentro del tablero
                if x >= 0 and x < 5 and y >= 0 and y < 5:
                    neighbor = Node(x, y, current_node)
                    neighbors.append(neighbor)
            # Se recorren los vecinos generados
            for neighbor in neighbors:
                # Si el vecino ya ha sido explorado, se continua con el siguiente
                if neighbor in closed_list:
                    continue

                # Se calcula el valor g del vecino (costo de los movimientos horizontales o verticales)
                if abs(neighbor.x - current_node.x) + abs(neighbor.y - current_node.y) == 1:
                    neighbor.g = current_node.g + 1
                else:
                    neighbor.g = current_node.g + 1.5

                # Si el vecino ya está en la lista abierta, se continua con el siguiente
                if neighbor in open_list:
                    continue
                # Se agrega el vecino a la lista abierta
                open_list.append(neighbor)


if __name__ == '__main__':
    # Crear una instancia de la clase Plant
    planta = Plant()
    # Crear una instancia de la clase Zombie
    zombi = Zombie()

    # Obtener el camino para eliminar a la planta
    path = zombi.move(planta)

    # Imprimir tablero con cada movimiento del zombi hasta que elimine a la planta
    for x, y in path:
        # Crear un tablero vacio
        board = [['.' for _ in range(5)] for _ in range(5)]
        # Posicionar la planta en el tablero
        board[planta.y][planta.x] = 'P'
        # Posicionar al zombie en el tablero
        board[y][x] = 'Z'
        # Imprimir el tablero
        for row in board:
            print(row)
        # Salto de linea
        print()





