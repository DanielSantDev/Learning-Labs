// Exemplos de Estruturas Condicionais em JavaScript

// 1. Definindo a idade da pessoa
const idade = 18;

// 2. Verificando se a pessoa pode votar usando uma estrutura condicional
if (idade >= 18) {
    // Se a idade for maior ou igual a 18, a pessoa pode votar
    console.log("Você tem idade suficiente para votar!");
} else {
    // Se a idade for menor que 18, a pessoa não pode votar
    console.log("Você ainda não tem idade para votar. Aguarde até completar 18 anos.");
}

// 3. Adicionando uma condição extra
const cidadaniaBrasileira = true;

if (idade >= 18 && cidadaniaBrasileira) {
    // Se a idade for maior ou igual a 18 e a pessoa for brasileira, ela pode votar
    console.log("Você pode votar nas eleições brasileiras!");
} else {
    // Caso contrário, ela não pode votar
    console.log("Você não atende aos requisitos para votar nas eleições brasileiras.");
}