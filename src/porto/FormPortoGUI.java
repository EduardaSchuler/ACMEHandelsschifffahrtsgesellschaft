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
                    if(!gerenciadorPortos.verificaExistenciaID(id)){
                        id = Integer.parseInt(null);
                    }
                    nome = FieldNome.getText();
                    pais = FieldPais.getText();
                    Porto porto = new Porto(id, nome, pais);
                    gerenciadorPortos.addPorto(porto);
                    JOptionPane.showMessageDialog(PainelPorto, "Porto '"+porto.getNome()+"' cadastrado com sucesso", "Operação realizada", JOptionPane.INFORMATION_MESSAGE);
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(PainelPorto, "Já existe um porto com este ID","ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public JPanel getPainel() {
        return PainelPorto;
    }

}


