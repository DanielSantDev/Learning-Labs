//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

/*Agora, vamos combinar vários conceitos de lógica de programação, como manipulação de strings, operações matemáticas, controle de fluxo e expressões regulares, aplicados para o desenvolvimento de uma solução de correção para a equipe de administração de uma empresa bancária. Eles precisam de uma solução para a validação de números de contas com base em regras específicas. O programa solicitará ao usuário que insira um número de conta e verificará se ele atende aos critérios predefinidos de validação. Além disso, você pode adicionar a capacidade de informar ao usuário qual regra específica não foi cumprida caso a validação falhe.
*/

const numeroConta = gets();

if (/^\d{6}$/.test(numeroConta)) {
    const numArray = numeroConta.split('').map(Number);

    const sum = numArray.reduce((a, b) => a + b, 0);

    if (numArray[0] > 0 && sum <= 30) {
        print('Numero de conta valido.');
    } else {
        if (numArray[0] ===0 ) {
            print('Numero de conta invalido: O primeiro digito deve ser maior que zero.');
        } else {
            print('Numero de conta invalido: A soma dos digitos e maior que 30.');
        }
    }
}