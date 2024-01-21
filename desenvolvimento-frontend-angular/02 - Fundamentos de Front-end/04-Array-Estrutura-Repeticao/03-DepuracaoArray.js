// Array de nomes
let nomes = ["Alice", "Bob", "Charlie", "David", "Eva"];

// Exibindo o array original
console.log("Array original:", nomes);

// Adicionando um novo nome ao final do array
let novoNome = "Frank";
nomes.push(novoNome);
console.log(`Novo nome adicionado: ${novoNome}`);
console.log("Array após adição:", nomes);

// Iterando sobre o array e exibindo cada nome
console.log("Nomes no array:");
for (let i = 0; i < nomes.length; i++) {
  console.log(`Índice ${i}: ${nomes[i]}`);
}

// Filtrando nomes que começam com a letra 'C'
let nomesComC = nomes.filter(function(nome) {
  return nome.startsWith("C");
});
console.log("Nomes que começam com 'C':", nomesComC);