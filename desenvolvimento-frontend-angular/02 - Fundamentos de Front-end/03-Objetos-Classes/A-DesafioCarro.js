/*1) Crie uma classe para representar carros. 
Os carros possuem uma marca, uma cor e um gasto médio de combustível por Kilômetro rodado.
Crie um método que dado a quantidade de quilómetros e o preço do combustível nos dê o valor 
gasto em reais para realizar este percurso.
*/

class Carro {

    constructor(marca, cor, anoFabricacao, gastoMedioKM, precoCombustivel, distanciaViagem) {
        this.marca = marca;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.gastoMedioKM = gastoMedioKM;
        this.precoCombustivel = precoCombustivel;
        this.distanciaViagem = distanciaViagem;
    }

    exibirInfo() {
        console.log(`Marca: ${this.marca}`);
        console.log(`Cor: ${this.cor}`);
        console.log(`Ano de Fabricação: ${this.anoFabricacao}`);
    }

    calculaValorGasolinaGasta() {
        let valorGasto = ((this.distanciaViagem / this.gastoMedioKM) * this.precoCombustivel);
        console.log(`Consumo Gasolina R$ ${valorGasto}\n`);
    }

}

const meuCarro1 = new Carro("Civic", "Prata", 2020, 10, 5, 200);
const meuCarro2 = new Carro("Fiat", "Uno", 2018, 12, 2.5, 1000)

meuCarro1.exibirInfo();
meuCarro1.calculaValorGasolinaGasta();
meuCarro2.exibirInfo();
meuCarro2.calculaValorGasolinaGasta();