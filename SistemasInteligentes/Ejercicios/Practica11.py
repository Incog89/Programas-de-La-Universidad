#Practica 11: Clases

class calculadora:
    #constructor de clase
    def __init__(self):
        print("constructor")

    def suma(a,b):
        return a+b

    def resta(a,b):
        return a-b

    def multi(a,b):
        return a*b

    def divi(a,b):
        return a/b

objeto = calculadora

print(objeto.suma(10,5))
