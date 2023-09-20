import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JOptionPane;



public class TesteLivroDeNotas {
    public static void main(String[] args) {

        String nome = showInputDialog("Digite o curso 1");
        LivroDeNotas livro1 = new LivroDeNotas(nome);
        
        
        

        //Livro 1
        //String nome = showInputDialog("Digite o curso 1");

        livro1.setNomeDoCurso(nome);
        
        // showMessageDialog
        // (null
        // , livro1.getNomeDoCurso()
        // , "Veja o curso 1"
        // , JOptionPane.OK_OPTION);

    
       
        //Livro 2
        //construtor padrão
        LivroDeNotas livro2 = new LivroDeNotas();

        String nomeDoCurso = showInputDialog
        ("Digite o curso 2");

        //envia informação para o atributo do livro 2
        livro2.setNomeDoCurso(nomeDoCurso);

        // showMessageDialog
        // (null
        // , livro2.getNomeDoCurso()
        // ,"veja o curso 2"
        // , JOptionPane.YES_NO_OPTION);

        livro2.exibeMensagem();

        livro1.exibeMensagem();

    }
}
