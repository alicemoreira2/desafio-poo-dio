<h1 align="center">
<h1 align="center">
  <br>
  <img src="https://user-images.githubusercontent.com/93685200/204018285-c0264742-fdb1-4f74-8106-364b2b5bb340.png" alt="logo" height="200">
</h1>

<h3 align="center"> Desafio: Número Feliz </h3>

Um número feliz é um número definido pelo seguinte processo:

* Começando com qualquer número inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.
* Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito em um ciclo que não inclua 1.
* Aqueles números para os quais esse processo termina em 1 são felizes.
* Retorna true se **n** for um número feliz e false se não for.

Escreva um algoritmo para determinar se o número **n** é feliz.

## Entrada
A entrada será feita por um número inteiro, correpondente ao valor de entrada para verificar se  o número é feliz ou não.
  
## Saída
Retorne true, caso o número seja feliz, e retorne false, caso o número não seja feliz.

Confira exemplo abaixo:
  
#### Exemplo:

| Entrada  |   Saída   |
| ---------| ------------- |
| 19     |   true   |
  
<i>**Explicação:**<br />
1² + 9² = 82<br />
8² + 2² = 68<br />
6² + 8² = 100<br />
1² + 0² + 0² = 1</i>
 <br />
  <br />
| Entrada  |   Saída   |
| ---------| ------------- |
| 2     |   false  |
