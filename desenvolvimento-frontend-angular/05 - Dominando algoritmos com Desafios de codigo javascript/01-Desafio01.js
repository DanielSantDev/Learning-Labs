/*Desafio
A empresa "DIO Bank" precisa receber os dados de uma conta bancária por um objeto JSON e imprimir na tela as seguintes informações: o nome do cliente, o número da conta e o saldo. 

Entrada
A entrada deve receber os valores que preencherão o objeto JSON contaBancaria. Ele deve conter as seguintes propriedades:

cliente: uma string com o nome do cliente.
numeroConta: uma string com o número da conta.
saldoInicial: um número que representa o saldo inicial da conta.
Importante: a entrada deverá ocorrer de acordo com a ordem de informações fornecidas acima.


Saída
Deverá retornar uma mensagem (string) que informa o nome do cliente, o número da conta e o saldo final, da seguinte maneira:

Nome do cliente: ${contaBancaria.cliente}
Número da conta: ${contaBancaria.numeroConta}
Saldo: R$ ${contaBancaria.saldo.toFixed(2)}
*********************************************************************************
***
**
*/

let contaBancaria = {
  
    cliente: gets(),
    numeroConta: gets(),
    saldoInicial: parseFloat(gets())
    
};

print(`Nome do cliente: ` + contaBancaria.cliente);
print(`Número da conta: ` + contaBancaria.numeroConta);
print(`Saldo: R$ `+ contaBancaria.saldoInicial.toFixed(2));