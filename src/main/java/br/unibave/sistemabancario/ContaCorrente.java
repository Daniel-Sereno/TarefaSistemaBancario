package br.unibave.sistemabancario;
//- Conta corrente: permite realizar saque apenas se tiver saldo (verificar também a transferência).

public class ContaCorrente extends Conta{

    public ContaCorrente(){
        super();
    }

    public ContaCorrente (int numero, int agencia, double saldo){
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
        if(getSaldo() < valor){
            System.out.println("n da pra transferi");
            return;
        }
        setSaldo(getSaldo()-valor);
        contaTransferencia.setSaldo(contaTransferencia.getSaldo()+valor);
    }


}
