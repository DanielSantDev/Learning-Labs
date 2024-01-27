/*Desafio
O objetivo deste desafio é criar um programa em JavaScript que compare duas contas bancárias e determine se elas possuem ou não as mesmas informações. O programa deve criar dois objetos JSON contendo o número da conta e o saldo da conta.

Entrada
O programa receberá os dados necessários para criar duas contas bancárias para comparação:

Conta Bancária 1:

Número da Conta (número inteiro): número da conta da primeira conta bancária.
Saldo (número): saldo da primeira conta bancária.
Conta Bancária 2:

Número da Conta (número inteiro): número da conta da segunda conta bancária.
Saldo (número): saldo da segunda conta bancária.
Importante: a entrada deverá ocorrer de acordo com a ordem de informações fornecidas acima.


Saída
Se todos os dados das contas bancárias forem estritamente iguais, o programa deverá retornar a mensagem:
As contas bancárias são iguais.

Caso contrário, o programa deverá retornar a mensagem:
As conas bancárias são diferentes
***
**
*/

//objetos JSON 1 e 2
const cliente1 = {
    nome: gets(),
    conta: gets(),
    saldo: parseFloat(gets())
};

const cliente2 = {
    nome: gets(),
    conta: gets(),
    saldo: parseFloat(gets())
};

function comparaConta() {
    if ((cliente1.nome === cliente2.nome) && (cliente1.conta === cliente2.conta) && (cliente1.saldo === cliente2.saldo)) {
        print("As contas bancárias são iguais.");
    } else {
        print("As contas bancárias são diferentes.")
    }
}

comparaConta();