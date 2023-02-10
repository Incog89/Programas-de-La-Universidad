#Practica 12: Clases 2

class Dog:
    tipo = "canino"

    def __init__(self, name):
        self.name = name

obj1 = Dog("Fido")
obj2 = Dog("Firulais")

print(obj1.tipo)
print(obj1.name)
print(obj2.name)
