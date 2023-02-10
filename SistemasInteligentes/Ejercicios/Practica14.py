#Practica 14: Cola

from collections import deque

class Cola:

    def __init__(self):
        self.queue = deque()

    def agregar(self,valor):
        self.queue.append(valor)

obj = Cola()

obj.agregar(2)
obj.agregar(4)
obj.agregar(8)
obj.agregar(10)

while(obj.queue):
    print(obj.queue.popleft())