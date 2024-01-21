/*2) Crie uma classe para representar pessoas.
Para cada pessoa teremos os atributos nome, peso e altura.
As pessoas devem ter a capacidade de dizer o valor do seu IMC (IMC = peso / (altura * altura));
Instancie uma pessoa chamada José que tenha 70kg de peso e 1,75 de altura e 
peça ao José para dizer o valor do seu IMC;
*/

class Pessoa {

    constructor(nome, peso, altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    falarIMC() {
        this.imc = (this.peso / (this.altura * this.altura));
        console.log(`Me chamo ${this.nome} e meu IMC eh ${this.imc}`);
    }

    checaIMC() {
        if( this.imc < 18.5 ) {
            console.log('Abaixo do peso\n');
        } else if ( this.imc > 18.5 && this.imc < 25 ) {
            console.log('Peso normal\n');
        } else if ( this.imc > 25 && this.imc < 30 ){
            console.log('Acima do peso\n');
        } else if ( this.imc > 30 && this.imc < 40 ){
            console.log('Obeso\n');
        } else if ( this.imc > 40){
            console.log('Obesidade Grave\n');
        } else {
            console.log('ERRO');
        }
    }
};

const Daniel = new Pessoa("Daniel", 58, 1.80);
const Joao = new Pessoa("Joao", 74, 1.80);
const Jose = new Pessoa("Jose", 84, 1.76);
const Maria = new Pessoa("Maria", 96, 1.63);

Daniel.falarIMC();
Daniel.checaIMC();

Joao.falarIMC();
Joao.checaIMC();

Jose.falarIMC();
Jose.checaIMC();

Maria.falarIMC();
Maria.checaIMC();