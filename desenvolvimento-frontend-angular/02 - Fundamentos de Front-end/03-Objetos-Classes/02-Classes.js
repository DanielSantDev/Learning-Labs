// Definindo a classe Carro
class Carro {
    // Construtor da classe
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
  let meuCarro = new Carro("Civic", "Prata", 2020);
  
  // Acessando propriedades da instância
  console.log(`Modelo do carro: ${meuCarro.modelo}`);
  console.log(`Cor do carro: ${meuCarro.cor}`);
  
  // Chamando o método para exibir informações do carro
  meuCarro.exibirInfo();