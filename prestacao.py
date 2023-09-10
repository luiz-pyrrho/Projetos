# -*- coding: utf-8 -*-
"""
Created on Fri Jul 28 00:46:59 2023

@author: luiz
"""

casa=float(input("Qual seria o valor da casa? R$ "))
s=float(input("Qual é o valor do salário do comprador? R$ "))
ano=int(input("Em quantos anos o comprador pretende pagar? "))
prestação= casa/(ano*12)
minimo = s * 30//100

print(" ")
print("Para comprar sua casa de R${} você deverá ter o mínimo para prestação de R$ {} para pagar em tantos {} anos".format(casa, minimo,ano))
print(" ")

if prestação <= minimo:
    print("Parabéns, o empréstimo pode ser concedido")
else:
    print("Infelizmente, seu empréstimo não pode ser concedido")
    