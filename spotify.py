# -*- coding: utf-8 -*-
"""
Created on Sun Jul 23 22:19:38 2023

@author: luiz
"""
#Colocar o horário

from termcolor import colored
import pygame
import random
pygame.init()


print("[Lista de músicas]")
print("1°- Andy Grammer - My Own Hero ")
print("2°- 王OK - City of Stars ")
print("3°- Amy Winehouse - Back to Black")

n1='Andy Grammer - My Own Hero.mp3'
n2='王OK - City of Stars'
n3='Amy Winehouse - Back to Black'

lista=[n1,n2,n3]


random_song=random.choice(lista)
msg="Tocando agora: "

if random_song == n1:
    pygame.mixer.music.load('myownhero.mp3')
    print(colored(msg+ n1,"green" ))
elif random_song == n2:
    pygame.mixer.music.load('city.mp3')
    print(colored(msg+ n2,"green"))
elif random_song == n3:
    pygame.mixer.music.load('backtoblack.mp3')
    print(colored(msg+ n3,"green"))
    
pygame.mixer.music.play()
pygame.event.wait()