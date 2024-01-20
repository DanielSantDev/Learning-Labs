/*
    Faca um programa para calcular o valor de uma viagem.

    Voce tera 5 variaveis. Sendo elas:
     1. preco etanol
     2. preco gasolina
     3. o tipo de gasolina que esta no seu carro
     4. gasto medio de combustivel que esta no seu carro
     5. distancia em km da viagem

    Imprima no console o valor que será gasto para realizar esta viagem.
*/

const etanolPreco = 2.50;
const gasolinaPreco = 5.00;
let tipoCombustivel = 'gasolina';
let gastoMedioKM = 10;
let distanciaViagem = 250;

if (tipoCombustivel === "gasolina") {
    console.log('Viajei 200 KM');
    console.log('Logo meu carro consumiu o total de R$');
    console.log((distanciaViagem / gastoMedioKM) * gasolinaPreco);
} else {
    console.log('Viajei 200 KM');
    console.log('Logo meu carro consumiu o total de R$' + (distanciaViagem / gastoMedioKM) * etanolPreco);
}