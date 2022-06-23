/*// teste lógico usando o if e operações simples

var turista = prompt ("Qual é o seu nome?");
var valor = parseFloat(prompt("Qual é o valor em dinheiro que você trouxe?"));

var recomendacao1 = "*Turista*, recomendamos você a visitar todos os brinquedos do parque e o restaurante"
var recomendacao2 = "*Turista*, recomendamos você a ir apenas nos brinquedos"

if (valor >= 10) {

var novoNome = recomendacao1.replace("*Turista*",turista)
    alert (novoNome)

} 

else {
    var novoNome = recomendacao2.replace("*Turista*",turista)
    alert (novoNome)
}

// end teste lógico usando o if e operações simples */

//////////////////////////////////////////////////////////////

/*// mudar o preço do ingresso de acordo com o numero de visitantes

var visitantes = parseInt3(prompt ("Por favor, informe o número de visitantes"));

if (visitantes <= 5){
    alert ("O preço do ingresso é 20 reais");
}

else if (visitantes <=15){
    alert ("O preço do ingresso é 15 reais");
}

else if (visitantes <=30) {
    alert ("O preço do ingresso é 10 reais");
}

else {
    alert ("O preço do ingresso é 8 reais");
}


// end mudar o preço do ingresso de acordo com o numero de visitantes */

//////////////////////////////////////////////////////////////

 /* //utilizando o switch para criar uma seleção multipla

var combo = parseInt (prompt ("Qual o número do seu combo?"))

switch (combo) {

    case 1:
        alert ("O valor do seu combo é de: 20 reais")
        break;
    case 2: 
        alert ("O valor do seu combo é de: 22 reais")
        break;
    case 3:
        alert ("O valor do seu combo é de: 24 reais")
        break;
    default:
        alert ("Valor inserido não está correto")

}

//utilizando o switch para criar uma seleção multipla */

//////////////////////////////////////////////////////////////

/*// utilizando While para criar loop

var credito = 10;

while (credito > 0) {
    alert ("Você tem: " + credito + " reais");
var compra = parseFloat(prompt ("Qual o valor da sua compra?"));

if (compra > credito) {
    alert ("Você não tem dinheiro para efetuar este pagamento");
}
else (credito = credito - compra);

if (credito == 0) {
    alert ("Seu dinheiro acabou :(");
}

}

// utilizando While para criar loop */

//////////////////////////////////////////////////////////////

/*// Utilizando o Do-While 

var totalCompra = 0.0;
do{
    var valorCompra = parseFloat (prompt ("Qual é o valor do produto que acaba de ser comprado?"))
    totalCompra = totalCompra + valorCompra;
    var resposta = prompt("Você deseja informar outro produto? SIM ou NÃO")
}while(resposta == "Sim") ;
alert ("O total da compra é: " + totalCompra);

// End utilizando o Do-While */

//laço de repetição for



//End laço de repetição for;
