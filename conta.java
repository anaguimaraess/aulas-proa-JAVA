    class ContaBancaria{
    String nome;
    int num;
    String agencia;
    double saldo;
    String data;

    public ContaBancaria(String nome, int num, String agencia, double saldo, String data){
  
        this.nome = nome;
        this.num = num;
        this.agencia = agencia;
        this.saldo = saldo;
        this.data = data;
    }

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getNum() {
    return num;
}

    public void deposito(double depositar){
        saldo = saldo + depositar;
        System.out.println("valor depositado! \nsaldo atual: " + saldo);
        return;
    }

    public void redimentoMensal(){
        if(saldo > 0){
            double calc = (1.002  * saldo);
            saldo = calc;
            System.out.println("\nrendimento calculado. saldo atual: " + saldo);
            return;
        }
    System.out.print("\nsem saldo na conta.");
    }

    public void sacar(double saque){
        if(saque > saldo){
            System.out.print("\nnao ha saldo suficiente na conta.");
            return;
        }
        if(saque > 0) {
            saldo = saldo - saque;

            System.out.println("\nsaque efetuado com sucesso!\n seu saldo eh de " + saldo);
            return;
        }

    System.out.print("\nnao foi possivel sacar nenhum valor.");
    }



    public class Main{
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("ana guimaraes" , 123, "banco", 20, "quarta feira");

        conta.deposito(2);

        conta.sacar(3);

        conta.redimentoMensal();
        }
    }
}   

// Me autoavaliaria com 8, pois apesar de estar certo, precisei de amigos e seguir o exemplo do professor p/ fazer.