public class App {
    public static void main(String[] args) throws Exception { 
        int foo = 45;
        String bar = "mensagem";
        System.out.println("Imprimindo bar abaixo");

        for (int i = 0; i < 100; i++) {
            System.out.println(i); // breakpoint
        }

        bar = "outra mensagem";
        bar = "mais uma mensagem"; 
        System.out.println(bar);
        Teste.algo("Bolo de cenoura");
    }
}

class Teste{

    public static void algo(String mensagem){
        System.out.println(mensagem);
    }

}
