# -*- coding: utf-8 -*-
"""
Created on Tue Jul 25 01:43:15 2023

@author: luiz
"""

nome=input("Por favor, qual é o seu nome ? ")
n=float(input("Senhor(a), {} digite a velocidade do seu carro: ".format(nome)))

if n>80:
    l=n-80
    l=l*7
    print("Você recebeu a multa no valor de R${}, dirija com cuidado, há vidas em jogo".format(l))
else:
    print("Nada de multa ;), o Detran tem muito orgulho de você!")    