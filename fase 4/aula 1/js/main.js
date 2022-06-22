/////////////////////////////////////////////////////////

/* recebendo valores de usuários

 var notaP1 = parseFloat( prompt ("Por favor, informe a nota da primeira prova"));

 var notaP2 = parseFloat ( prompt ("Por favor, informe a nota da segunda prova"));

 var media = alert ((notaP1 + notaP2) / 2);

end recebendo valores de usuários */

/////////////////////////////////////////////////////////

/* calcular a área de um trapézio

var baseMaior = parseFloat (prompt ("Informe a base maior"));

var baseMenor = parseFloat (prompt ("Informe a base menor"));

var altura = parseFloat (prompt ("Informe a altura"));

var area = parseFloat (( + baseMaior + baseMenor)* altura / 2);

alert ("A área do trapézio é: " + area)

 end calcular a área de um trapézio */

/////////////////////////////////////////////////////////

/*  calcular salario liquido de um funcionário 

var salarioHora = parseFloat (prompt("Quanto você ganha por hora?"));

 var horasTrabalhadas = parseFloat (prompt ("Quantas horas você trabalha por dia?"));
 
 var diasTrabalhados = parseFloat (prompt("Quantos dias você trabalhou?"));

 var percentualDeImposto = parseFloat  (prompt ("Informe o percentual de imposto"));

var salarioBruto =  salarioHora * horasTrabalhadas * diasTrabalhados;

var imposto = salarioBruto * percentualDeImposto / 100;

var calculoSalario = alert ( "Seu salário com o desconto de impostos é: " + ( salarioBruto - imposto) + " reais");

end calcular salario liquido de um funcionário */ 

/////////////////////////////////////////////////////////

/*  buscar palavras

var texto = "blablablablabla blabla blablabla blablabl ablablala ablablabla ablabla";

var posicao = roteiro.search ("blabla")
alert (posicao);

//o alerta ira exibir o número da posição da palavra, caso não tenha a palavra no texto, ele ira exibir -1

posicao = roteiro.indexOf ("bla", 5);
alert (posicao);

// o alerta ira exibir a posição da palavra a partir de um valor */

/////////////////////////////////////////////////////////

/* // prefixos e sufixos

var endereco = "Av. Paulista, 875";

var resultado = endereco.startsWith ("Av");

alert (resultado);  

//nesse caso o site ira exibir um valor booleano (true or false) para caso o valor seja verdadeiro ou falso.

var endereco = "Av. Paulista, 875";

var resultado = endereco.endsWith ("875");

alert (resultado) ;

// end prefixos e sufixos */

/////////////////////////////////////////////////////////

/* // extraindo uma palavra de um texto maior

var anuncio = "Chevrolet Cruze 1.0 Gasolina, Manual";

var veiculo = anuncio.substring (10, 15);
alert (veiculo);

//nesse caso o alerta ira exibir a palavra Cruze, já que pedimos para ele pegar os caracteres entre a posição 10 e 15, começando a contagem do caractere 0 

var combustivel = veiculo.substr (20, 8);

// o sistema irá ler esse código como "a partir da posição 20, pegue 8 caracteres"

 // end extraindo uma palavra de um texto maior */

 /////////////////////////////////////////////////////////

/* // criação de listas e extração dos seus elementos

var cardapio = "hamburger;chesseburger;misto quente; hot-dog;hamburguer vegano;master blaster plus;mastodonte ultimate";

var listaProdutos = cardapio.split (";")

//essa função substitui o valor dentro dela por ponto e virgula e transforma as palavras separadas por virgula em um elemento da lista.

alert(listaProdutos)

//esse alerta irá exibir toda a lista

alert (listaProdutos[6])

//esse alerta ira exibir elemento na posição 6 da lista 

// end criação de listas e extração dos seus elementos */

//////////////////////////////////////////////////////////

 // substituindo palavras

var modeloMSG = "Muito obrigado **NOME** por participar deste evento sensacional conosco. Nos vemos em breve!";
var seuNome = prompt("Digite seu nome para a Lista VIP");

var novoNome = modeloMSG.replace("**NOME**", seuNome);

alert (novoNome);

//essa variável vai substituir a palavra inserida entre aspas pela variávek seuNome

var modelo = "Vamos sair do **ORIGEM** para **DESTINO**. Só que vamos de **MEIO**, beleza?";
var lugarOrigem = "MASP";
var lugarDestino = "Museu do Ipiranga";
var meioTransporte = "Táxi";

var resultado = modelo.replace("**ORIGEM**", lugarOrigem)
                   .replace("**DESTINO**", lugarDestino)
                   .replace("**MEIO**", meioTransporte);
console.log(resultado);

//nesse caso, fizemos a substituição múltipla do conteúdo

// substituindo palavras */

/////////////////////////////////////////////////////////

/* //substituição especial

var origem = prompt("Qual é a origem?");
var destino = prompt("Qual é o destino?");
var meioTransporte = prompt("Qual é o meio de transporte?");

var mensagem = `Vamos sair de ${origem} para o ${ destino}`;

alert (mensagem);

//neste caso o lugar que tiver ${} vai receber o valor da variável entre as chaves 

//end substituição especial */

/////////////////////////////////////////////////////////




