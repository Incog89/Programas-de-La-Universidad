#Practica 6: varias condiciones

x = float(input("dame valor a calcular x: "))
y = float(input("dame valor a calcular y: "))
opcion = int(input("dame la opcion: "))

if(opcion == 1):
    z = x + y
    print(z)
elif(opcion==2):
    z = x - y
    print(z)
elif(opcion==3):
    z = x * y
    print(z)
elif(opcion==4):
    z = x / y
    print(z)
else:
    print("Error en la eleccion")
