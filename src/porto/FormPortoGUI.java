package porto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPortoGUI {
    private JPanel PainelPorto;
    private JLabel PagTitulo;
    private JTextField FieldNome;
    private JTextField FieldPais;
    private JButton BotaoEnviar;
    private Aplicacao aplicacao;
    private GerenciadorPortos gerenciadorPortos;

    public FormPortoGUI(Aplicacao aplicacao) {
        gerenciadorPortos = new GerenciadorPortos();
        this.aplicacao = aplicacao;
        BotaoEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome, pais;
                    nome = FieldNome.getText();
                    pais = FieldPais.getText();
                    Porto porto = new Porto(nome, pais);
                    gerenciadorPortos.addPorto(porto);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
    }

    public JPanel getPainel() {
        return PainelPorto;
    }

}


