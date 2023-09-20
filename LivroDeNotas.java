public class LivroDeNotas {
     private String nomeDoCurso;

     //construtor com parâmetros
     //recebe um parâmetros ao inicializar 
     public LivroDeNotas (String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
     }

     //construtor padrão
     //sem parâmetro
     public LivroDeNotas () {

     }

     //métodos de acesso = getters
     //para enviar informação
     public String getNomeDoCurso (){
        return this.nomeDoCurso;
     }

     //métodos modificadores = setters
     //para receber informação 
     public void setNomeDoCurso(String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
     }

    public  void exibeMensagem() {
        System.out.println
        (" Bem-vindo ao livro de notas do curso " 
        + nomeDoCurso);
    }
}