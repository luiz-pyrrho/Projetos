# -*- coding: utf-8 -*-
"""
Created on Sat Jul 22 23:52:35 2023

@author: luiz
"""

import pygame
pygame.init()
print("[Lista de músicas]")
print("1°- Andy Grammer - My Own Hero ")
print("2°- 王OK - City of Stars ")
print("3°- Amy Winehouse - Back to Black")

musica=input("Digite o número da música que você gostaria: ")

if musica == "1":
    pygame.mixer.music.load('myownhero.mp3')
    pygame.mixer.music.play()
    pygame.event.wait()
elif musica == "2":
    pygame.mixer.music.load('city.mp3')
    pygame.mixer.music.play()
    pygame.event.wait()
elif musica == "3":
    pygame.mixer.music.load('backtoblack.mp3')
    pygame.mixer.music.play()
    pygame.event.wait()
else:
    print("Erro")