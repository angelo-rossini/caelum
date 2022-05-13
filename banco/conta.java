package banco;

public class conta {
	
	private double saldo;
    private int agencia;
    private int numero;
    private String CPF;
    private String titular;
    private static int total = 0;

    public conta(int agencia, int numero, double saldo2, String cPF2, String titular2) {
        conta.total++;        
        this.agencia = agencia;
        this.numero = numero;
    }

	public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("Não é possível valores negativos");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Não é possível valores negativos");
            return;
        }
        this.agencia = agencia;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void setCPF (String CPF) {
    	this.CPF = CPF;
    }

    public static int getTotal() {
        return conta.total;
    }

}
