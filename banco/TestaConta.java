package banco;
import java.util.Scanner;

public class TestaConta {

        public static void main(String[] args) {
        	
        	int x, agencia, conta;
        	String CPF, nome;
        	
        	conta = 1;
        	
        	ContaPoupança cp1 = new ContaPoupança(1984, 007, 2000, "8008135-3", "fuyuki");
        	
        	Scanner ler = new Scanner(System.in);
        	System.out.println("digite 1 se deseja fazer uma conta corrente e 2 se for uma poupança");
        	x = ler.nextInt();
        	
        	if (x == 1) {
        		System.out.println("digite a agencia (apenas inteiros)");
            	agencia = ler.nextInt();
            	System.out.println("digite o cpf");
            	CPF = ler.nextLine();
            	System.out.println("digite seu nome");
            	nome = ler.nextLine();
            	
            	ContaCorrente cc = new ContaCorrente(agencia, conta, 2000, CPF, nome);
            	conta++;
            	
            	System.out.println("deseja mudar o saldo? (1 = s 2 = n)");
            	x = ler.nextInt();
            	
            	if(x == 1) {
            		System.out.println("digite 1 se deseja depositar e 2 para transferir");
            		x = ler.nextInt();
            		if(x == 1) {
            			double m;
            			System.out.println("digite quanto deseja depositar");
                    	m = ler.nextDouble();
                        cc.deposita(m);
            		} else {
            			double m;
            			String nc;
            			System.out.println("digite quanto deseja transferir");
                    	m = ler.nextDouble();
                    	System.out.println("qual o numero da conta que deseja depositar?");
                    	nc = ler.nextLine();
                    	cc. transfere(m, cp1);
            		}
            	}
               
        		
        	}else {
        		
        		System.out.println("digite a agencia (apenas inteiros)");
            	agencia = ler.nextInt();
            	System.out.println("digite o cpf");
            	CPF = ler.nextLine();
            	System.out.println("digite seu nome");
            	nome = ler.nextLine();
            	
            	ContaPoupança cp = new ContaPoupança(agencia, conta, 2000, CPF, nome);
            	conta++;
            	
            	System.out.println("deseja mudar o saldo? (1 = s 2 = n)");
            	x = ler.nextInt();
            	
            	if(x == 1) {
            		System.out.println("digite 1 se deseja depositar e 2 para transferir");
            		x = ler.nextInt();
            		if(x == 1) {
            			double m;
            			System.out.println("digite quanto deseja depositar");
                    	m = ler.nextDouble();
                        cp.deposita(m);
            		} else {
            			double m;
            			String nc;
            			System.out.println("digite quanto deseja transferir");
                    	m = ler.nextDouble();
                    	System.out.println("qual o numero da conta que deseja depositar?");
                    	nc = ler.nextLine();
                    	cp. transfere(m, cp1);
            		}
            	}
        	}
        }
}
