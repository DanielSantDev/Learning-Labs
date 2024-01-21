// Definindo a classe Carro
class Carro {
    // Construtor da classe(ou seja, oq acontece quando uma classe é instanciada ?)
    constructor(modelo, cor, anoFabricacao) {
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    // Método para exibir informações do carro
    exibirInfo() {
        console.log(`Modelo: ${this.modelo}`);
        console.log(`Cor: ${this.cor}`);
        console.log(`Ano de Fabricação: ${this.anoFabricacao}`);
    }
}

// Criando instância da classe Carro
let meuCarro1 = new Carro("Civic", "Prata", 2020);
let meuCarro2 = new Carro("Fiat", "Uno", 2018)

// Acessando propriedades da instância
console.log(`Modelo do carro: ${meuCarro1.modelo}`);
console.log(`Cor do carro: ${meuCarro1.cor}`);

console.log(`Modelo do carro: ${meuCarro2.modelo}`);
console.log(`Cor do carro: ${meuCarro2.cor}`);

// Chamando o método para exibir informações do carro
meuCarro.exibirInfo();
