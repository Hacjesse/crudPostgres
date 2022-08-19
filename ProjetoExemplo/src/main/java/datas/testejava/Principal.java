package datas.testejava;


/**
 *
 * @author Jose Barros
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        ContaDAO banco = new ContaDAO();
        ContaCorrente conta = new ContaCorrente(100, "Joao", 200, 300);
        banco.adicionarConta(conta);
        ContaCorrente contaCorrente = new ContaCorrente(200, "André", 100, 50);
        banco.adicionarConta(contaCorrente);
        System.out.println(banco.listarContas());
        banco.deposito(100, 1000);
        System.out.println(banco.getContaPeloCodigo(100));
        
        System.out.println("Saldo: " + banco.getSaldo(100));
        
        banco.saque(200, 50);

        banco.deletarConta(100);
        banco.deletarConta(200);
        System.out.println(banco.listarContas());

    }
}
