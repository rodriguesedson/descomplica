import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) {
    ArvoreBinaria arv = new ArvoreBinaria();

    for(int i = 0; i < 6; i++) {
      arv.inserirNo(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));
    }

    arv.exibirNo();

    System.exit(0);
  }
}
