//funcao q escreve meu nome

function escreveNome1(){
    return 'Meu nome eh Daniel Santana';
}

//passando parametro

function escreveNome2(nome){
    console.log('Meu nome eh ' + nome);
    return nome;
}

escreveNome1();
escreveNome2('Daniel Santana');

//funcao q veja se vc eh maior de idade

function verificaIdade(idade){
    if(idade >= 18){
        console.log( escreveNome2('Daniel Santana') + ' Voce eh maior de idade !');
    } else {
        console.log( escreveNome1() + ' Voce eh menor de idade !');
    }
}

verificaIdade(17);

//exercicio do juros com funcao

let produto = 4500;
let formaPagamento;

function retornaValorFinal(formaPagamento){
    if ( formaPagamento === 'debito') {
        console.log('CLIENTES QUE PAGAM NO DEBITO GANHAM 10% DE DESCONTO');
        console.log('Preco do produto R$' + produto);
        console.log('Preco do produto com desconto R$' + (produto - ((produto / 100) * 10)));
    } else if ( formaPagamento === 'dinheiro' || formaPagamento === 'pix' ) {
        console.log('CLIENTES QUE PAGAM NO PIX OU DINHEIRO GANHAM 15% DE DESCONTO');
        console.log('Preco do produto R$' + produto);
        console.log('Preco do produto com desconto R$' + (produto - ((produto / 100) * 15)));
    } else if (formaPagamento === 'duasParcelas') {
        console.log('CLIENTES QUE PARCELAM EM 2 VEZES PAGAM O VALOR PADRAO');
        console.log('Preco do produto R$' + produto);
    } else if (formaPagamento === 'variasParcelas'){
        console.log('CLIENTES QUE PARCELAM EM MAIS DE 2 VEZES PAGAM 10% DE JUROS');
        console.log('Preco do produto R$' + produto);
        console.log('Preco do produto com juros de 10% - R$' + (produto + ((produto / 100) * 10)) );
    } else {
        console.log('ERRO!');
    }
}

retornaValorFinal('debito');
retornaValorFinal('dinheiro');
retornaValorFinal('pix');
retornaValorFinal('duasParcelas');
retornaValorFinal('variasParcelas');
