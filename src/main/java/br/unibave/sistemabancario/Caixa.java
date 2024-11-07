package br.unibave.sistemabancario;

public class Caixa {
    public void realizarOperacao(Conta conta, String operacao, double valor) {
        switch (operacao.toLowerCase()) {
            case "deposito":
                conta.deposito(valor);
                break;
            case "saque":
                conta.saque(valor);
                break;
            default:
                System.out.println("Operação inválida. Use 'deposito' ou 'saque'.");
                break;
        }
    }
}
