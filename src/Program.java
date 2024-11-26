import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teste = (int) (Math.random() * 1000);
        System.out.println("Tente acertar o numero randomico de 0-1000");
        int quantidadeTentativas = 0;
        boolean a = false;
        while (a == false){
            int tentativa = scanner.nextInt();
            if (tentativa == teste){
               a = true;
               quantidadeTentativas += 1;
                System.out.println("Voce acertou!!");
                System.out.println("Numero de tentativas: "+quantidadeTentativas);
            } else if (teste > tentativa) {
                System.out.println("Tente um numero maior;");
                quantidadeTentativas += 1;
            } else if (teste < tentativa) {
                System.out.println("Tente um numero menor;");
                quantidadeTentativas += 1;
            }

        }
    }
}
