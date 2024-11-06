package br.unibave.sistemabancario;

import lombok.Getter;
import lombok.Setter;

//- número
//
//- agencia
//
//- saldo
//
//E podem realizar:
//
//- Depósito
//
//- Saque
//
//- Transferência (somente e ntre contas da mesma agência)


//- Depósito
//
//- Saque
//
//- Transferência (somente e ntre contas da mesma agência)
@Getter
@Setter

public class Conta {
    private int numero;
    private int agencia;
    private double saldo;

    public Conta(){

    }
    public Conta(int numero, int agencia, double saldo){
    }

    public void deposito(double valor){
        setSaldo(getSaldo()+valor);
    }
    public void saque(double valor){
        setSaldo(getSaldo()-valor);
    }
    public void transferencia(double valor, Conta contaTransferencia){
        setSaldo(getSaldo()-valor);
        contaTransferencia.setSaldo(contaTransferencia.getSaldo()+valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}