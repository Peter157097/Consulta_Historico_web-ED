package controller;

import model.PilhaString;

public class HistoricoController {

    // Validar e inserir
    public void inserirEndereco(PilhaString p, String url) throws Exception {

        if (!url.matches("http://www\\..+\\..+")) {
            throw new Exception("URL inválida! Deve começar com http://www.");
        }

        p.push(url);
    }

    // Remover último
    public String removerUltimo(PilhaString p) throws Exception {

        if (p.isEmpty()) {
            throw new Exception("Histórico vazio!");
        }

        return p.pop();
    }

    // Consultar topo
    public String consultarUltimo(PilhaString p) throws Exception {

        if (p.isEmpty()) {
            throw new Exception("Histórico vazio!");
        }

        String topo = p.pop();
        p.push(topo);

        return topo;
    }
}
