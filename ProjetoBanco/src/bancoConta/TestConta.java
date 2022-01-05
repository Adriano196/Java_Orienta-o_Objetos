package bancoConta;

public class TestConta {

	public static void main(String[] args) {

		Conta contaCorrete = new Conta();
		Conta contaPoupança = new Conta();
		Conta contaInvestimento = new Conta();

		contaCorrete.numero = 112233;
		contaCorrete.saldo = 20.5;
		contaCorrete.cliente.nome = "Lorenzo";
		contaCorrete.cliente.idade = 33;
        contaCorrete.pix = 12345678;
		contaCorrete.cliente.vip = "Cliente vip";
        
		contaPoupança.numero = 223344;
		contaPoupança.saldo = 30;
		contaPoupança.cliente.nome = "Afonso";
		contaPoupança.cliente.idade = 30;
        contaPoupança.pix = 78945612;
        contaPoupança.cliente.vip = "Cliente vip";
        
		contaInvestimento.numero = 334455;
		contaInvestimento.saldo = 40;
		contaInvestimento.cliente.nome = "Roberto";
		contaInvestimento.cliente.idade = 35;
        contaInvestimento.pix = 45612378;
        contaInvestimento.cliente.vip = "Cliente vip";
        
		System.out.println("Cliente " + contaCorrete.cliente.nome);
		System.out.println("Conta Corrente " + contaCorrete.numero);
		System.out.println("Saldo em Conta " + contaCorrete.saldo);
		System.out.println("Pix " + contaCorrete.pix);
		System.out.println("Idade " + contaCorrete.cliente.idade);
		System.out.println(contaCorrete.cliente.vip);
		System.out.println();
		System.out.println("Cliente " + contaPoupança.cliente.nome);
		System.out.println("Conta Corrente " + contaPoupança.numero);
		System.out.println("Saldo em Conta " + contaPoupança.saldo);
		System.out.println("Pix " + contaPoupança.pix);
		System.out.println("Idade " + contaPoupança.cliente.idade);
		System.out.println(contaPoupança.cliente.vip);
		System.out.println();
		System.out.println("Cliente " + contaInvestimento.cliente.nome);
		System.out.println("Conta Corrente " + contaInvestimento.numero);
		System.out.println("Saldo em Conta " + contaInvestimento.saldo);
		System.out.println("Pix " + contaInvestimento.pix);
		System.out.println("Idade " + contaInvestimento.cliente.idade);
		System.out.println(contaInvestimento.cliente.vip);

	}

}
