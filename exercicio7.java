import java.util.Scanner;


public class exercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero");
        int n1 = scanner.nextInt();
        
        System.out.print("Digite um numero");
        int n2 = scanner.nextInt();
        
        System.out.print("Digite um numero: ");
        int n3 = scanner.nextInt();
        
        System.out.print("Digite um numero: ");
        int n4 = scanner.nextInt();
        
        System.out.print("Digite um numero: ");
        int n5 = scanner.nextInt();
        
        System.out.print("Digite um numero: ");
        int n6 = scanner.nextInt();
        
        System.out.print("Digite um numero: ");
        int n7 = scanner.nextInt();
        
        System.out.print("Digite um numero: ");
        int n8 = scanner.nextInt();
        
        System.out.print("Digite um numero: ");
        int n9 = scanner.nextInt();
        
        System.out.print("Digite um numero: ");
        int n10 = scanner.nextInt();

        int soma=0;
            if(n1<40) {
	            soma+=n1;
            }if(n2<40) {
                soma+=n2;
            }if(n3<40) {
	            soma+=n3;
            } if(n4<40) {
                soma+=n4;
            }if(n5<40) {
                soma+=n5;
            }if(n6<40) {
	            soma+=n6;
            }if(n7<40) {
	            soma+=n7;
            }if(n8<40) {
	            soma+=n8;
            }if(n9<40) {
                soma+=n9;
            }if(n10<40) {
                soma+=n10;
            }

	System.out.println("A soma dos numeros menores que 40 resulta em: : "+ soma);
}
   
}