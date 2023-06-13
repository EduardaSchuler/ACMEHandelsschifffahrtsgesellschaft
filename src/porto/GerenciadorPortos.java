package porto;

import java.util.ArrayList;

public class GerenciadorPortos {
    ArrayList<Porto> portos;

    public GerenciadorPortos() {
        portos = new ArrayList<>();
    }

    public ArrayList<Porto> getPortos() {
            return portos;
    }

    public void addPorto(Porto porto){
        portos.add(porto);
    }

    public boolean verificaExistenciaID(int id){
        for (int i = 0; i < portos.size(); i++) {
            if (portos.get(i).getId() == id){
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
