package porto;

import java.util.Random;

public class Porto {
    private int id;
    private String nome;
    private String pais;
    private Random random;
    private GerenciadorPortos gerenciadorPortos;

    public Porto(String nome, String pais) {
        random = new Random();
        id = random.nextInt(1000);
        for (int i = 0; i < gerenciadorPortos.portos.size(); i++) {
            if(gerenciadorPortos.getPortos().getId() == id){
                id = random.nextInt(1000);
            }
        }
        this.nome = nome;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }
}
