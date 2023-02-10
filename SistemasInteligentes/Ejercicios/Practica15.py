#Practica 15: Grafica

from matplotlib import pyplot
import math

def f_cuadratica(x):
    return math.pow(x,2)

def f_lineal(x):
    return 4+x

def f_inversa(x):
    return 1/x

x = range(-10,10)
y=range(1,100)

pyplot.plot(x,[f_cuadratica(i) for i in x])
pyplot.plot(x,[f_lineal(i) for i in x])
#pyplot.plot(x,[f_inversa(i) for i in y])


pyplot.xlim(-10,10)
pyplot.ylim(-10,10)

pyplot.savefig("salida.png")
pyplot.show

    