package porto;

import java.util.ArrayList;

public class GerenciadorPortos {
    ArrayList<Porto> portos;

    public GerenciadorPortos() {
        portos = new ArrayList<>();
    }

    public Porto getPortos() {
        for (int i = 0; i < portos.size(); i++) {
            return portos.get(i);
        }
        return null;
    }

    public void addPorto(Porto porto){
        portos.add(porto);
    }
}
