<h1 align="center">
<h1 align="center">
  <br>
  <img src="https://user-images.githubusercontent.com/93685200/204018285-c0264742-fdb1-4f74-8106-364b2b5bb340.png" alt="logo" height="200">
</h1>

<h3 align="center"> Desafio: Emboscada no RPG</h3>

Você e seus amigos estão jogando uma partida de RPG (Role-Playing Game) utilizando um dado de 10 lados. Em um determinado momento, em uma masmorra escura, o seu personagem foi emboscado por um terrível goblin. Como em todo bom RPG, temos alguns parâmetros que definem os status dos personagens:

* Vida: Pontos que devem ser maiores que 0, se não o personagem morre.
* Ataque: Pontos que definem quanto de dano ele inflingirá nos outros personagens.
* Defesa: Pontos que definem quanto dano será mitigado quando ele levar um ataque.

O dado é um modificador desses parâmetros. Quando você joga o dado o valor dele deve ser somado ao seu ataque ou a sua defesa. Quando o valor do dado for maior que 8 e menor que 10, o jogador tira um crítico e essa soma deve ser DOBRADA.

O dano causado ao jogador é calculado dessa forma:  
* vidaDoJogador - (ataqueInimigo - (defesaDoJogador + dados))

O dano causado ao inimigo é calculado dessa forma:  
* vidaDoInimigo - (ataqueDoJogador + dados)

Caso o jogador sobreviva a emboscada, ele contra-ataca.

Para deixar a jogatina mais rápida, fazendo o computador realizar as contas matemáticas, você decidiu criar esse programa para verificar se seu personagem vai sobreviver e contra-atacar ou morrer.

## Entrada
A entrada serão seis parâmetros nessa ordem: <br />
1-Dados;<br />
2-Vida do Jogador;<br />
3-Ataque do Jogador;<br />
4-Defesa do Jogador;<br />
5-Vida do Inimigo;<br />
6-Ataque do Inimigo;<br />

## Saída
A saída deve ser verificado se o jogador sobreviveu ao ataque ou não. Caso ele tenha sobrevivido, verificar se o contra-ataque dele foi eficaz e matou o inimigo ou não. Em seguida, para cada caso, imprima na tela as respectivas ocorrências.

## Exemplo:
| Entrada  |   Saída   |
| ---------| ------------- |
| 2<br />6<br />6<br />4<br />5<br />14 |  "Jogador nao sobreviveu" 
| 8<br />6<br />6<br />4<br />5<br />14 | "Jogador sobreviveu e derrotou o inimigo" 
|6<br />12<br />6<br />8<br />14<br />7| "Jogador sobreviveu e nao derrotou o inimigo" 
