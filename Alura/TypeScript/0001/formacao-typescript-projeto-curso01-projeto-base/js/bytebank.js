let saldo = 3000;

const elementoSaldo = document.querySelector(".saldo-valor .valor");

elementoSaldo.textContent = saldo.toLocaleString("pt-BR", {
    style: "currency",
    currency: "BRL"
});

const elementoFormulario = document.querySelector(".block-nova-transacao form");

elementoFormulario.addEventListener("submit", function (evento) {
    evento.preventDefault();

    if(!elementoFormulario.checkValidity()){
        alert("Preencha os campos corretamente!");
        return;
    }

    const inputTipoTransicao = elementoFormulario.querySelector("#tipoTransacao");
    const inputValor = elementoFormulario.querySelector("#valor");
    const inputData = elementoFormulario.querySelector("#data");

    let tipoTransacao = inputTipoTransicao.value;
    let valor = parseFloat(inputValor.value);
    let data = inputData.value;

    if(tipoTransacao === "Depósito") {
        saldo += valor;
    } else if (tipoTransacao === "Transferência" || tipoTransacao === "Pagamento de Boleto") {
        saldo -= valor;
    } else {
        alert("Tipo de transação inválido!");
        return; 
    }

    elementoSaldo.textContent = saldo.toLocaleString("pt-BR", {
        style: "currency",
        currency: "BRL"
    });

    const novaTransacao = {
        tipoTransacao: tipoTransacao,
        valor: valor,
        data: data
    }

    console.log(novaTransacao);
    elementoFormulario.reset();
});