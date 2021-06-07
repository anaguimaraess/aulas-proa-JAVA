import java.util.*; 


public class exercicio4 {
    public static void main(String[] args) {  

        Scanner sc = new Scanner(System.in); 

        System.out.println("Informe o primeiro numero real: ");  
        double n1 = sc.nextInt();  

        System.out.println("Informe o segundo numero real: ");  
        double n2 = sc.nextInt();  
 
        System.out.println("Digite 1 para realizar divisao, 2 para multiplicacao, 3 para soma e 4 subtracao. Escolha uma das opcoes:");
        int res = sc.nextInt(); 

        if (res == 1){
            double res1 = n1 / n2;
            System.out.println("a  divisao de seus valores sera igual a " + res1);
        } else if (res == 2){
            double res2 = n1 * n2;
            System.out.println("a multiplicacao de seus valores sera igual a " + res2);
        }else if (res == 3){
            double res3 = n1 + n2;
            System.out.println("a soma  de seus valores sera igual a " + res3);
        }else{
            double res4 =  n1 - n2;
            System.out.println("a subtracao de seus valores sera igual a " + res4);
        }



  }
}