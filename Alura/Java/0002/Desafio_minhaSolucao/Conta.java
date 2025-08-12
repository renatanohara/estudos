public class Conta {
    Double saldo;
    Cliente cliente;
    TipoConta tipoConta;

    public Conta(Cliente cliente, TipoConta tipoConta) {
        this.cliente = cliente;
        this.tipoConta = tipoConta;
        this.saldo = 0.0;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void depositar(Double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso. Saldo atual: " + this.saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
        
    }

    public void sacar(Double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso. Saldo atual: " + this.saldo);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public void transferir(Double valor, Conta contaDestino) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de " + valor + " para " + contaDestino.getCliente().getNome() + " realizada com sucesso. Saldo atual: " + this.saldo);
        } else {
            System.out.println("Valor de transferência inválido ou saldo insuficiente.");
        }
    }

}
