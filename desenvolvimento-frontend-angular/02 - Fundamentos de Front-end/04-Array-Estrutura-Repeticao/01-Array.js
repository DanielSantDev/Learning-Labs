// Criando um array de números
let numeros = [1, 2, 3, 4, 5];

// Adicionando um número ao final do array
numeros.push(6);

// Exibindo o array no console
console.log("Array original:", numeros);

// Iterando sobre o array e multiplicando cada elemento por 2
for (let i = 0; i < numeros.length; i++) {
  numeros[i] *= 2;
}

// Exibindo o array após a multiplicação
console.log("Array após a multiplicação por 2:", numeros);

// Filtrando os números pares
let numerosPares = numeros.filter(function(numero) {
  return numero % 2 === 0;
});

// Exibindo os números pares
console.log("Números pares:", numerosPares);

// Removendo primeiro e ultimo indice
console.log("Array antes da remocao ", numeros);
numeros.pop();
numeros.shift()
console.log("Array após a remocao ", numeros);