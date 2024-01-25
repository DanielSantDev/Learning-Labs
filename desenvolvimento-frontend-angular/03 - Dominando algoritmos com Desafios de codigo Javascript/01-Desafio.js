//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

/*Agora, para testar seus conhecimentos em lógica computacional utilizando conceitos de entradas e saídas, atribuição de variáveis e concatenação de Strings, vamos desenvolver uma solução algorítmica que simule o comportamento de um agendamento de pagamento. Buscando auxiliar os clientes de um sistema bancário a agendar seus pagamentos recorrentes, o programa deverá solicitar ao usuário informações sobre a conta a ser paga, como o nome do beneficiário, o valor da conta a ser paga e a data de vencimento. Em seguida, o programa fornecerá uma mensagem de confirmação do agendamento com as informações fornecidas.
*/
let nomeBeneficiario;
let valorConta;
let dataVencimento;

nomeBeneficiario = gets("Sabrina");
valorConta = parseFloat(gets(5000));
dataVencimento = gets("04/12/2023");

print(`Pagamento Agendado! Valor: R$ ${valorConta}, vencimento ${dataVencimento}.`);