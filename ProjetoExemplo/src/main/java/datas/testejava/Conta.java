package datas.testejava;


/**
 *
 * @author Jose Barros
 */
public abstract class Conta {

    private int codigo;
    private String nomeCliente;
    private double saldo;

    public Conta(){
        
    }
    
    public Conta(int codigo, String nomeCliente, double saldo) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "codigo=" + codigo + ", nomeCliente=" + nomeCliente + ", saldo=" + saldo + '}';
    }    

    public abstract float saque(float valor);

    public abstract void deposito(float valor);
}
