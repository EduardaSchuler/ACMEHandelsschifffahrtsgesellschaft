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
    private JTextField FieldID;
    private Aplicacao aplicacao;
    private GerenciadorPortos gerenciadorPortos;

    public FormPortoGUI(Aplicacao aplicacao) {
        gerenciadorPortos = new GerenciadorPortos();
        this.aplicacao = aplicacao;
        BotaoEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int id;
                    String nome, pais;
                    id = Integer.parseInt(FieldID.getText());
                    nome = FieldNome.getText();
                    pais = FieldPais.getText();
                    Porto porto = new Porto(id, nome, pais);
                    gerenciadorPortos.addPorto(porto);
                    System.out.println(gerenciadorPortos.getPortos().getNome());
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


