/*Desafio
Imagine que você é um consultor financeiro em uma instituição bancária e precisa criar uma calculadora para ajudar seus clientes a estimar o montante que eles terão em suas contas de investimento após um determinado período, levando em consideração um investimento inicial e uma taxa de juros mensal. Você precisa criar um programa que faça essa estimativa de maneira rápida e eficaz.*/

const contaBancaria = {
    investimentoInicial: parseFloat(gets()),
    taxaJurosMensal: parseFloat(gets()),
    periodoMeses: parseInt(gets()),
};

const taxaJurosDecimal = contaBancaria.taxaJurosMensal / 100;

const montante = contaBancaria.investimentoInicial * Math.pow((1 + taxaJurosDecimal), contaBancaria.periodoMeses);

print("Investimento: " + contaBancaria.investimentoInicial.toFixed(2));
print("Juros: " + contaBancaria.taxaJurosMensal);
print("Período: " + contaBancaria.periodoMeses);
print("Resultado: " + montante.toFixed(2));