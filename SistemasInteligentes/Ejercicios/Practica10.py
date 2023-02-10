#Practica 10: Funciones

#def nombre(valor1, valor2,....):

def factorial(n):
    fact = 1
    for i in range (2,n+1):
        fact = fact*i
    return fact

res = factorial(int(input("ingresa el valor del factorial: ")))
print(res)

def suma(a,b):
    return a+b

def resta(a,b):
    return a-b

def multiplicacion(a,b):
    return a*b

def division(a,b):
    return a/b

if __name__ == "__main__":
    print(suma(10,20))