// Exemplo de Função em JavaScript

// 1. Declaração da função
function calcularAreaRetangulo(largura, altura) {
    
    // 2. Corpo da função: lógica para calcular a área
    const area = largura * altura;

    // 3. Retorno da função
    return area;
}

// 4. Chamada da função com valores específicos
const larguraRetangulo = 5;
const alturaRetangulo = 10;
const areaCalculada = calcularAreaRetangulo(larguraRetangulo, alturaRetangulo);

// 5. Exibindo o resultado
console.log(`A área do retângulo com largura ${larguraRetangulo} e altura ${alturaRetangulo} é: ${areaCalculada}`);
