/*Desafio

*Crie um programa em JavaScript que permita ao usuário realizar uma única operação a partir de um menu com quatro opções: Depósito, Saque, Saldo e Sair. Após a escolha de uma dessas opções, o programa deve executar a operação correspondente e exibir as informações atualizadas do saldo. Após a execução da operação, o programa encerrará automaticamente.

*Entrada:
O programa inicia com uma conta bancária fictícia, com as seguintes informações:

Nome do Cliente: João
Saldo Inicial: R$ 1,000.00
O usuário interage com o programa por meio de um menu com as seguintes opções:

Depósito: O usuário insere o valor do depósito, que é adicionado ao saldo da conta.
Saque: O usuário insere o valor do saque, que é deduzido do saldo, desde que haja saldo suficiente.
Saldo: O programa exibe o saldo atual da conta de João.
Sair: O usuário pode encerrar o programa.

*Saída:
O programa deverá executar uma das 4 opçoes do menu (Depósito/Saque/Saldo/Sair) e exibir as informações atualizadas do saldo. 
Caso digite a opção 4, deverá retornar a mensagem "Encerrando programa".
*/

const contaBancaria = {
    nomeCliente: "João",
    saldo: 1000.0,
};

function realizarOperacao() {
  
    const opcao = parseInt(gets());
    
    switch (opcao) {
        case 1:
            const valorDeposito = parseFloat(gets());
            contaBancaria.saldo += valorDeposito;
            print("Operação de depósito concluída.");
            print(`Saldo atual: R$ ${contaBancaria.saldo.toFixed(2)}`);
            break;

        case 2:
            const valorSaque = parseFloat(gets());
            if (valorSaque <= contaBancaria.saldo) {
                contaBancaria.saldo -= valorSaque;
                print("Operação de saque concluída.");
                print(`Saldo atual: R$ ${contaBancaria.saldo.toFixed(2)}`);
            } else {
                print("Saldo insuficiente. Operação de saque cancelada.");
                print(`Saldo insuficiente. Saldo atual: R$ ${contaBancaria.saldo.toFixed(2)}`);
            }
            break;

        case 3:
            print(`Saldo atual: R$ ${contaBancaria.saldo.toFixed(2)}`);
            break;

        case 4:
            print("Encerrando o programa.");
            return;
            
        default:
            print("Opção inválida.");
    }
}

realizarOperacao();