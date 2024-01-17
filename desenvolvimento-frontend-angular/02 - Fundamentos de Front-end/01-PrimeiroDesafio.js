/*Faça um programa para calcular o valor de uma viagem.
*
* -Voce tera 3 variaveis:
* 1-Preco combustivel
* 2-Gasto medio de combustivel por KM
* 3-Distancia em KM da viagem
*
* Imprima no console o valor que sera gasto de combustivel para realizar a viagem
*----------------------------------------------------*/

const precoCombustivel = 5;
let gastoMedioKM = 10;
let distanciaViagem = 150;

console.log('Viajei 40 KM');
console.log('Logo meu carro consumiu o total de R$');
console.log((distanciaViagem / gastoMedioKM) * precoCombustivel);