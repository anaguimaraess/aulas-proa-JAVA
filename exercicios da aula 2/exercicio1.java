import java.util.*; 


public class exercicio1 {
    public static void main(String[] args) {  

        Scanner sc = new Scanner(System.in); 

        System.out.println("Informe um numero: ");  
        int n = sc.nextInt();  

        if (n > 0){
            System.out.println(n + "  eh um numero positivo!");
        } else if (n < 0){
            System.out.println(n + " eh um numero negativo");
        }else{
            System.out.println(" voce digitou o zero!");
        }



  }
}