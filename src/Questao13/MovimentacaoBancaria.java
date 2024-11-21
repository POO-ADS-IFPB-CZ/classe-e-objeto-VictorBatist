package Questao13;

public class MovimentacaoBancaria {
    public static boolean transfere(ContaBancariaSimplificada contaOrigem, ContaBancariaSimplificada contaDestino, double valor){
        if(contaOrigem.retira(valor)){
            contaDestino.deposita(valor);
            return true;
        }else
            return false;
    }
}
