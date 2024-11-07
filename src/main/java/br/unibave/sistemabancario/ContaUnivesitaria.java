package br.unibave.sistemabancario;
//Conta universitária: saque apenas se tiver saldo (verificar também a transferência)
// e o saldo não pode ultrapassar o valor de 2.000,00 (controlar no depósito e transferênc

public class ContaUnivesitaria extends Conta{
    public ContaUnivesitaria(){
        super();
    }
    public ContaUnivesitaria(int numero, int agencia, double saldo){
        super(numero, agencia, saldo);

    }
    @Override
    public void saque(double valor){
        if(getSaldo() < valor){
            System.out.println("n da pra saca");
            return;
        }
        setSaldo(getSaldo()-valor);
    }
    @Override
    public void transferencia(double valor, Conta contaTransferencia){
        if(getSaldo() < valor && (getSaldo()+valor > 2000)){
            System.out.println("n da pra transferi");
            return;
        }
    }
    public void deposito(double valor){
        if(getSaldo()+valor > 2000){
            System.out.println("n da pra deposita");
            return;
        }
        setSaldo(getSaldo()+valor);
    }



}
