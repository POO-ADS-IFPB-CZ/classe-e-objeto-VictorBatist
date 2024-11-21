package Questao13;

public class ContaBancariaSimplificada {
    private String nomeUsuario;
    private int numeroConta;
    private double saldoConta;

    public ContaBancariaSimplificada(String nomeUsuario, int numeroConta, double saldoConta){
        this.nomeUsuario = nomeUsuario;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    public  ContaBancariaSimplificada(){
        saldoConta = 0.00;
    }

    //deposita um valor na conta
    public void deposita (double valor){
        saldoConta = saldoConta + valor;
    }

    //saca um valor

    public boolean retira ( double valor){
        if(valor<=saldoConta){
            saldoConta = saldoConta - valor;
            return true;
        }
        else{
            System.out.println("ERRO: você não possui saldo suficiente!");
            return false;
        }
    }

    public void mostrarDados(){
        System.out.println("Usuario: " + nomeUsuario);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo atual: " + saldoConta);
    }

    public String getNomeUsuario() {return nomeUsuario;}
    public int getNumeroConta() {return numeroConta;}
    public double getSaldoConta() {return saldoConta;}

    public void setSaldoConta (double saldoConta) {this.saldoConta =saldoConta;}

}
