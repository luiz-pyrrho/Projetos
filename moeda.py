# -*- coding: utf-8 -*-
"""
Created on Sat Sep  2 21:39:41 2023

@author: luiz
"""


import moedinha

n=(input("Digite um valor: R$ ")).replace(",",".")

while True:
   if n.isalpha() == True:
      print("ERROR, você digitou ")      
      n=(input("Digite um valor: R$ ")).replace(",",".")   
   elif n.strip() == "":
      print("Vazio, tente novamente!")
      n=(input("Digite um valor: R$ ")).replace(",",".")    
      if n.isdigit() == True:
         break
            
n=float(n)

moedinha.aumentar(n)
moedinha.diminuir(n)
moedinha.metade(n)
moedinha.dobro(n)
moedinha.resumo(n,10,20)