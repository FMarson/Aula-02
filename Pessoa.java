public class Pessoa {
    //Atributos
    private int idade;
    private String nome;
    private String etnia;
    private String genero;
    private float altura;
    private float peso;
    private boolean estaAndando;
    private boolean estaCorrendo;

    //Métodos
    //Construtor default
    public Pessoa(){
        //idade = 0;
        //nome = "";
        //etnia = "";
        //genero = "";
        //altura = 0.0f;
        //peso = 0.0f;
    
        this.setNome("");
        this.setIdade(0);
        this.setEtnia("");
        this.setGenero("");
        this.setPeso(0.0f);
        this.setAltura(0.0f);
        estaAndando = estaCorrendo = false;
        

    }

    //outro construtor com parâmetros
    public Pessoa(String nome, int idade, String etnia, String genero, float altura, float peso){
        this.setNome(nome);
        this.setIdade(idade);
        this.setEtnia(etnia);
        this.setGenero(genero);
        this.setPeso(peso);
        this.setAltura(altura);
        estaAndando = estaCorrendo = false;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if(idade >= 0)
            this.idade = idade;
        else
            this.idade = 0;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }


    public void setEtnia(String etnia){
        this.etnia = etnia;
    }

    public String getEtnia(){
        return this.etnia;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getAltura(){
        return this.altura;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public float getPeso(){
        return this.peso;
    }
    

    //andar, falar, correr

    public void falar(){
        System.out.println("Estou falando!");
    }

    public void falar(String frase){
        System.out.println(frase);
    }

    public void andar(){
        if(!estaAndando){
            System.out.println("Estou andando!");
            estaAndando = true;
        }
        else{
            System.out.println("Ei! Eu já estou andando!");
        }
    }

    public void correr(){
        if(!estaCorrendo){
            System.out.println("Comecei a correr!");
            estaCorrendo = true;
        }
        else{
            System.out.println("Ei! Eu já estou correndo!");
        }
    }

    public void parar(){
        if(!estaAndando && !estaCorrendo)
            System.out.println("Ei! Eu já estou parado!");
        else{
            estaAndando = false;
            estaCorrendo = false;
            System.out.println("Estou parado!");
        }
        
    }

}
