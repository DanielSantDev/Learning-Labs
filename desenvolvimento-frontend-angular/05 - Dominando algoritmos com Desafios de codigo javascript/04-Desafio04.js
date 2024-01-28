/*Desafio

Agora, expandiremos o desafio anterior relacionado ao saldo bancário. Vamos criar um programa em JavaScript que simule o saldo de uma conta bancária, mas desta vez, o programa incluirá operações de depósitos e saques.

*Entrada

A entrada deve receber os valores que preencherão o objeto JSON contaBancaria. Ele deve conter as seguintes propriedades:

Conta Bancaria:

nomeCliente: uma string com o nome do cliente.
saldo: um número que representa o saldo inicial da conta.
numOperacoes: um número que indica o número de operações a serem realizadas.
Operações

Para cada operação, o usuário deve informar:

tipoOperacao: uma string que pode ser 'depósito' ou 'saque'.
valorOperacao: um número que representa o valor da operação.
Cálculo de Saldo

O saldo da conta deve ser atualizado com base nas operações de depósito e saque realizadas pelo usuário. O saldo inicial da conta é ajustado de acordo com essas operações.

Saída

Após todas as operações, exiba o nome do cliente e o saldo final da conta.

Nome do cliente: ${contaBancaria.cliente}
Saldo Final: R$ ${contaBancaria.saldo.toFixed(2)}
*/

const contaBancaria = {
    nomeCliente: "",
    saldo: 0,
};

contaBancaria.nomeCliente = gets();
contaBancaria.saldo = parseFloat(gets());

const numOperacoes = parseInt(gets());

for (let i = 0; i < numOperacoes; i++) {
    const tipoOperacao = gets();
    const valorOperacao = parseFloat(gets())

    if (tipoOperacao.toLowerCase() === "depósito") {
        contaBancaria.saldo += valorOperacao;
    } else if (tipoOperacao.toLowerCase() === "saque") {
        contaBancaria.saldo -= valorOperacao;
    }
}

print(`Nome do cliente: ${contaBancaria.nomeCliente}`);
print(`Saldo final: R$ ${contaBancaria.saldo.toFixed(2)}`);