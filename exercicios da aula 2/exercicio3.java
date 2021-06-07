import java.util.*; 


public class exercicio3 {
    public static void main(String[] args) {  

        Scanner sc = new Scanner(System.in); 

        System.out.println("Informe o primeiro numero: ");  
        int n1 = sc.nextInt();  

        System.out.println("Informe o segundo numero: ");  
        int n2 = sc.nextInt();  

        System.out.println("Informe o terceiro numero: ");  
        int n3 = sc.nextInt();  

        if (n1 > n2 && n2 > n3){
            int res1 = n1 + n2;
            System.out.println("a soma dos maiores valores sera igual a " + res1);
        } else if (n3 > n1 && n1 > n2){
            int res2 = n3 + n1;
            System.out.println("a soma dos maiores valores sera igual a " + res2);
        }else{
            int res3 = n2 + n3;
            System.out.println("a soma dos maiores valores sera igual a " + res3);
        }   



  }
}