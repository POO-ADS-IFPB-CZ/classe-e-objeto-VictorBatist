import Questao13.ContaBancariaSimplificada;
import Questao13.MovimentacaoBancaria;

public class Main {
    public static void main(String[] args) {
       /**
        ---------------  TESTE DA FUNÇAO DESPOSITA E RETIRA -------------
        ContaBancariaSimplificada saldo = new ContaBancariaSimplificada();
        saldo.deposita(100.00);
        saldo.retira(50.00);
        System.out.println("Saldo atual: " + saldo.getSaldoConta());
        -----------------------------------------------------------------
        */

       ContaBancariaSimplificada contaOrigem = new ContaBancariaSimplificada("Joao Victor",1111,100.00);
       ContaBancariaSimplificada contaDestino = new ContaBancariaSimplificada("Paulo de Freitas",2222,200.00);

       System.out.println("--------- Banco do Povo ---------\n");
       System.out.println("COMPROVANTE DE DEPÓSITO EM DINHEIRO");
       System.out.println("Beneficiario:" + contaOrigem.getNomeUsuario() + "\nNumero da conta:" + contaOrigem.getNumeroConta());
       System.out.println("Valor: R$ 200,00\n");
       contaOrigem.deposita(200.00);

       System.out.println("Antes da Transferencia:");

       contaOrigem.mostrarDados();
       System.out.println("\n");
       contaDestino.mostrarDados();

       System.out.println("\nJoao está transferindo 400 para Mari");
       boolean tranferencia = MovimentacaoBancaria.transfere(contaOrigem,contaDestino,400.00);

       if (tranferencia){
           System.out.println("TUDO CERTO: transferencia realizada com sucesso!\n");
       }

       System.out.println("Valores atuais:");
       contaOrigem.mostrarDados();
       System.out.println("\n");
       contaDestino.mostrarDados();
    }
}