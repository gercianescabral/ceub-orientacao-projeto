package Atividades.ContaBancaria;

public class ContaBancaria {

    // Declarando as variáveis na classe da Conta Bancária
    Double dinheiro;
    Double saldo;
    String nome;
    String cpf;


    // Construtor da Conta Bancária (inserindo as variáveis e fazendo o "link" das variáveis 
    // que estão entre parentesis do construtor e nas variáveis que estão declaradas na classe)
    public ContaBancaria(String nome, String cpf){
        this.saldo = 500.00;
        this.nome = nome;
        this.cpf = cpf;
    }

    // Método que adiciona dinheiro na conta
    public void depositar(Double dinheiro){
        System.out.println(saldo+dinheiro);
    }

    // Método que remove dinheiro da conta, considerando saques negativos (usando if/else para definir o que é disponível ou não)
    public void sacar(Double dinheiro){
        if (saldo-dinheiro <= 0){
            System.out.println("Saldo indisponível para saque");
        } else {
            System.out.println(saldo-dinheiro);
        }
    }

    // Método para mostrar as informações da conta
    public void info() {
        System.out.println("\n Nome: "+nome+
                            "\n CPF: "+cpf+
                            "\n Saldo: "+saldo);
    }

}
