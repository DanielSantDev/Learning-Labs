// Exemplo de estrutura de repetição com o for
console.log("Usando o loop for:");

//declaraçãos / condições / execuções
for (let i = 1; i <= 5; i++) {
    console.log(i);
}

// Exemplo de estrutura de repetição com o while
console.log("\nUsando o loop while:");

let j = 1;
while (j <= 5) {
    console.log(j);
    j++;
}

// Exemplo de estrutura de repetição com o do-while
console.log("\nUsando o loop do-while:");

let k = 1;
do {
    console.log(k);
    k++;
} while (k <= 5);

// Percorre uma string
const nome = 'DanielSantDev';
for (let y = 0; y < nome.length; y++) {
    const element = nome[y];
    console.log(element);
}

console.log(nome);