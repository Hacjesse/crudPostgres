package datas.testejava;


/**
 *
 * @author Jose Barros
 */
public class ContaPoupanca extends Conta {

    private float taxaJuros;

    public ContaPoupanca(int codigo, String nomeCliente, double saldo, float taxaJuros) {
        super(codigo, nomeCliente, saldo);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public float saque(float valor) {
        if ((valor > 0) && (valor <= getSaldo())) {
            setSaldo(getSaldo() - valor);
            return valor;
        } else {
            return 0;
        }
    }

    @Override
    public void deposito(float valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " ContaPoupanca{" + "taxaJuros=" + taxaJuros + '}';
    }

}
