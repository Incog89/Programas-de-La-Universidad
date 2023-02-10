#Practica 13: Pilas

class pila:
    def __init__(self):
        self.stack = []

    def setElements(self, elemento):
        self.stack.append(elemento)

obj = pila()

#obj.stack
obj.setElements(6)
obj.setElements(5)
obj.setElements(8)
obj.setElements(10)

while(obj.stack):
    print(obj.stack.pop())