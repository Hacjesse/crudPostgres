package datas.testejava;


/**
 *
 * @author Jose Barros
 */
public class ContaCorrente extends Conta {

    private float limite;

    public ContaCorrente(){
        super();
    }
            
    public ContaCorrente(int codigo, String nomeCliente, double saldo, float limite) {
        super(codigo, nomeCliente, saldo);
        this.limite = limite;
    }

    @Override
    public float saque(float valor) {
        if ((valor > 0) && (valor <= getSaldo() + limite)) {
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
        return super.toString() + " ContaCorrente{" + "limite=" + limite + '}';
    } 
    
    public float getLimite(){
        return limite;
    }
    
    public void setLimite(float limite){
        this.limite = limite;
    }

}
