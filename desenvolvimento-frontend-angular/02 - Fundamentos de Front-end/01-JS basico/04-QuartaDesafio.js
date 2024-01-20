//Calculo IMC

//kgs
let peso = 81;

//metros
let altura = 1.76;

let imc;

imc = (peso / (altura * altura));

console.log('Seu IMC eh: ' + imc);

if( imc < 18.5 ) {
    console.log('Abaixo do peso');
} else if ( imc > 18.5 && imc < 25 ) {
    console.log('Peso normal');
} else if ( imc > 25 && imc < 30 ){
    console.log('Acima do peso');
} else if ( imc > 30 && imc < 40 ){
    console.log('Obeso');
} else if ( imc > 40){
    console.log('Obesidade Grave');
} else {
    console.log('ERRO');
}