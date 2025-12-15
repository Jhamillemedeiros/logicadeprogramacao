//Declaração de variáveis globais
const form = document.querySelector('form');

form.addEventListerner("submit", function(event) {
    //desativa o submit
    event.preventDefault();

    //declaração de variáveis locais
    let texto = document.querySelector('#texto').value;

    //exibe texto em forma de caixa de dialogo
    alert(texto);

});