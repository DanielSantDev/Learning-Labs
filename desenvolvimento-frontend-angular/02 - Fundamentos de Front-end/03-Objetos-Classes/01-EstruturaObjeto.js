// Definindo a estrutura do objeto Livro
let livro = {
    titulo: "O Senhor dos Anéis",
    autor: "J.R.R. Tolkien",
    anoPublicacao: 1954,
    genero: "Fantasia",
    paginas: 1178,
  
    // Método para exibir informações do livro
    exibirInfo: function() {
      console.log(`Título: ${this.titulo}`);
      console.log(`Autor: ${this.autor}`);
      console.log(`Ano de Publicação: ${this.anoPublicacao}`);
      console.log(`Gênero: ${this.genero}`);
      console.log(`Páginas: ${this.paginas}`);
    }
  };
  
  // Acessando propriedades do objeto
  console.log(`Título do livro: ${livro.titulo}`);
  console.log(`Autor do livro: ${livro.autor}\n`);
  
  // Chamando o método para exibir informações do livro
  livro.exibirInfo();

  //acesso dinamico
  livro['autor'] = 'Rick Riordan';