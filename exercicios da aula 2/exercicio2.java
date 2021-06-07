import java.util.*; 


public class exercicio2 {
    public static void main(String[] args) {  

        Scanner sc = new Scanner(System.in); 

        System.out.println("Informe o primeiro numero: ");  
        int n1 = sc.nextInt();  

        System.out.println("Informe o segundo numero diferente do primeiro: ");  
        int n2 = sc.nextInt();  

        System.out.println("Informe o terceiro numero sendo diferente dos numeros ja informados: ");  
        int n3 = sc.nextInt();  

        if (n1 > n2 && n1 > n3){
            System.out.println(n1 + " eh o maior numero");
        } else if (n2 > n1 && n2 > n3){
            System.out.println(n2 + " eh o maior numero");
        }else{
            System.out.println(n3 + " eh o maior numero");
        }   



  }
}