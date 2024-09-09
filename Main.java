public class Main {
    public static void main(String[] args) {
        Pessoa pessoaAbacaxi;
        pessoaAbacaxi = new Pessoa();

        pessoaAbacaxi.setNome("Abacaxi");
        pessoaAbacaxi.setIdade(20);
        pessoaAbacaxi.setAltura(1.78f);

        System.out.println("Nome: " + pessoaAbacaxi.getNome());
        System.out.println("Idade: " + pessoaAbacaxi.getIdade());
        System.out.println("Altura: " + pessoaAbacaxi.getAltura());

        Pessoa p1 = new Pessoa("Fernando", 50, "branco", "masculino", 1.88f, 94.0f);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Altura: " + p1.getAltura());
        
        p1.falar();
        p1.falar("Olá, tudo bem?");
        p1.andar();
        p1.parar();
        p1.andar();
        p1.parar();

    }
}