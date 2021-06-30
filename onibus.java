public class veiculo {

    int onibus;
    String rj;
    String turismo;
    int paradas;
    int capacidade;
    int pessoas;

    public veiculo(int onibus, String rj, String turismo, int paradas, int capacidade, int pessoas) {
        this.onibus = onibus;
        this.rj = rj;
        this.capacidade = capacidade;
        this.pessoas = pessoas;
        this.paradas = paradas;
        this.turismo = turismo;

    }

    public int getParadas() {
        return paradas;
    }


    public void setPessoas(int pessoas) {
        if (this.pessoas <= capacidade) {
            this.pessoas = pessoas;

        }
    }

    public void saida(int pessoas) {
        if (pessoas <= this.pessoas) {
            this.pessoas = pessoas - this.pessoas;
        }
    }

    public String parar(){
       return "O onibus parou";
    }

    public class Exemplo_Class {
    public static void main(String[] args) {
        veiculo onibus1 = new veiculo(1, "Partida", "Pirituba", 1, 50, 50);
        veiculo onibus2 = new veiculo(2, "Partida", " Cataratas do Iguaçu Cataratas do Iguaçu", 2, 50, 40);
        veiculo onibus3 = new veiculo(3, "Partida", "São Matheus", 3, 50, 42);
        
        System.out.println(onibus1.getParadas());
        System.out.println(onibus2.getParadas());
        System.out.println(onibus3.getParadas());

        }
    }
}


//Me autoavaliaria com 9, pois precisei recorrer ajuda de amigos para terminar o exercicio.