#Practica 16: Problema del 8-puzzle
import numpy as np


def imprimir(matriz):
    for i in matriz:
        print(i)

def h_bienColocadas(fx,s_meta):
    cont = 0
    for i in range(3):
        for j in range(3):
            if(fx[i][j]==s_meta[i][j]):
                cont = cont + 1

    return cont

s_actual = [[1,6,7],
          [2,5,8],
          [0,3,4]]

s_meta = [[1,5,7],
          [2,5,8],
          [3,4,0]]

#Definir los vecinos
#Buscar donde esta el cero
f0=np.zeros((3,3))
f1=np.zeros((3,3))
f2=np.zeros((3,3))
f3=np.zeros((3,3))
imprimir(s_actual)

if(s_actual[2][0]==0):
    #Generar dos vecinos
    f0=np.copy(s_actual)
    f1 = np.copy(s_actual)

    temp = f0[1][0]
    f0[1][0] = f0[2][0]
    f0[2][0] = temp
    imprimir(f0)

    temp = f1[2][1]
    f1[2][1] = f1[2][0]
    f1[2][0] = temp
    imprimir(f1)

    print(h_bienColocadas(f0,f1))