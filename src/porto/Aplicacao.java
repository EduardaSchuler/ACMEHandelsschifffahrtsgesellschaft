package porto;

import javax.swing.*;

public class Aplicacao extends JFrame {
    private FormPortoGUI formPortoGUI;

    public Aplicacao(){
        super();
        formPortoGUI = new FormPortoGUI(this);
        this.setContentPane(formPortoGUI.getPainel());
        this.setTitle("Cadastro de Portos");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setSize(800,200);
        this.setVisible(true);
    }
}
