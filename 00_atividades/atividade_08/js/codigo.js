const form = document.querySelector('#form');

const calcular = () => {

    const nome = document.getElementById("nome").value;
    const dataNascimento = document.getElementById("dataNascimento").value;
    const genero = document.getElementById("genero").value;
    const email = document.getElementById("email").value;
    const telefone = document.getElementById("telefone").value;
    const peso = parseFloat(document.getElementById("peso").value);
    const altura = parseFloat(document.getElementById("altura").value);

    // Cálculo IMC
   const imc = peso / (altura * altura);


    // Diagnóstico segundo o IMC
    let diagnostico = "";

    if (imc < 18.5) diagnostico = "Abaixo do peso";
    else if (imc < 24.9) diagnostico = "Peso normal";
    else if (imc < 29.9) diagnostico = "Sobrepeso";
    else if (imc < 34.9) diagnostico = "Obesidade Grau I";
    else if (imc < 39.9) diagnostico = "Obesidade Grau II";
    else diagnostico = "Obesidade Grau III (mórbida)";

    // Exibir resultado
    const resultado = document.querySelector("#resultado");
    resultado.classList.remove("d-none");


    document.querySelector("#resultado").innerHTML = `
        <h5>Dados Informados:</h5>
        <strong>Nome:</strong> ${nome} <br>
        <strong>Data de Nascimento:</strong> ${new Date(dataNascimento).toLocaleDateString("pt-BR")} <br>
        <strong>Gênero:</strong> ${genero} <br>
        <strong>E-mail:</strong> ${email} <br>
        <strong>Telefone:</strong> ${telefone} <br>
        <strong>Peso:</strong> ${peso} kg <br>
        <strong>Altura:</strong> ${altura} m <br><hr>

        <strong>IMC:</strong> ${imc.toFixed(2)} <br>
        <strong>Diagnóstico:</strong> ${diagnostico}
    `;
};

form.addEventListener('submit', function (event) {
    event.preventDefault();
    calcular();
});

