// Array de nomes
let nomes = ["Vadiâ", "Alice", "Bob", "Vernice", "Charlie", "Victoria", "David", "Eva"];

// Exibindo o array original
console.log("Array original:", nomes);

// Filtrando nomes que começam com a letra 'V'
let nomesComV = nomes.filter(function(nome) {
  return nome.startsWith("V");
});
console.log("Nomes que começam com 'V':", nomesComV);