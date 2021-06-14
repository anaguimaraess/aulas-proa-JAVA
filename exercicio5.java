import java.util.*;

public interface exercicio5 {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Digite um numero: ");

        int n1 = scanner.nextInt();
        System.out.println(n1 > 0 || !(n1 < 0));

        System.out.print("Digite outro numero: ");

        int n2 = scanner.nextInt();
        System.out.println(n2 > 0 || !(n2 < 0));

    }
    
}