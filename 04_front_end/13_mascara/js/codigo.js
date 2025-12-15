const form = document.querySelector('form');
const cpfMask = document.querySelector('#cpf');
const telefoneMask = document.querySelector('#telefone');
const cepMask = document.querySelector('#cep');



const exibirInfo = () => {
    let nome = document.querySelector('#nome').value;
    let email = document.querySelector('#email').value;
    let nascimento = document.querySelector('#nascimento').value;
    let cpf = document.querySelector('#cpf').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;
    let endereco = document.querySelector('#endereco').value; // sem acento

    // saída de dados
    document.querySelector("#nomeResult").innerHTML = `<b>Nome:</b> ${nome}`;
    document.querySelector("#emailResult").innerHTML = `<b>E-mail:</b> ${email}`;
    document.querySelector("#nascimentoResult").innerHTML = `<b>Data de Nascimento:</b> ${nascimento}`;
    document.querySelector("#cpfResult").innerHTML = `<b>CPF:</b> ${cpf}`;
    document.querySelector("#telefoneResult").innerHTML = `<b>Telefone:</b> ${telefone}`;
    document.querySelector("#cepResult").innerHTML = `<b>CEP:</b> ${cep}`;
    document.querySelector("#enderecoResult").innerHTML = `<b>Endereço:</b> ${endereco}`;

    // apaga os dados de todo o formulário
    form.reset();
}
cpfMask.addEventListener('input', function () {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d{1,2})$/, '$1-$2');
});



telefoneMask.addEventListener('input', function () {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{2})(\d)/, '($1) $2')
        .replace(/(\d{4,5})(\d)/,  "$1-$2")
        .replace(/(-\d{4})\d+?$/, '$1');


});

CepMask.addEventListener('input', function () {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{5})(\d)/, '$1-$2')
        .replace(/(-\d{3})\d+?$/, '$1');


});







form.addEventListener('submit', function (event) {
    event.preventDefault();
    exibirInfo();
});
