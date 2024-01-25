//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

/*Demonstre como aplicar conceitos de lógica de programação como validação de dados, entradas e saídas, cálculos e condicionais. Então, desenvolva uma solução algorítmica para o cálculo de juros simples em uma corporação bancária, onde, o programa deve solicitar como entrada o capital inicial, a taxa de juros e o período de tempo em meses. Em seguida, deverá ser retornado o montante final a ser pago, incluindo os juros, e fornecer o resultado.
*/

const capitalInicial = parseFloat(gets());
const taxaJuros = parseFloat(gets());
const tempoMeses = parseInt(gets());

if (!isNaN(capitalInicial) && !isNaN(taxaJuros) && !isNaN(tempoMeses) && tempoMeses > 0) {
  const jurosSimples = (capitalInicial * taxaJuros * tempoMeses) / 100;
  const montanteFinal = capitalInicial + jurosSimples;
  print(`Montante em ${tempoMeses} meses, com R$ ${capitalInicial.toFixed(2)} iniciais, ${taxaJuros}% juros, e: R$ ${montanteFinal.toFixed(2)}.`);
} else {
  print('Por favor, insira valores validos e um periodo de tempo adequado.');
}