package br.unibave.sistemabancario;


// Conta especial: possui além dos atributos de conta corrente, também um limite (cadastrado pelo usuário). O saque é permitido até o limite contradado (verificar também a transferência).
public class ContaEspecial extends Conta{
    public ContaEspecial(){
        super();
    }
    public ContaEspecial(int numero, int agencia, double saldo){
        super(numero, agencia, saldo);
    }
    @Override
    public void saque(double valor, double limite){
        if((getSaldo()+limite) < valor){
            System.out.println("n da pra saca");
            return;
        }
        setSaldo(getSaldo()-valor);
    }
    @Override
    public void transferencia(double valor, Conta contaTransferencia, double limite){
        if((getSaldo()+limite) < valor){
            System.out.println("n da pra transferi");
            return;
        }
        setSaldo(getSaldo()-valor);
        contaTransferencia.setSaldo(contaTransferencia.getSaldo()+valor);
    }
}
