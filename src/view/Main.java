package view;

import controller.HistoricoController;
import model.PilhaString;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        PilhaString historico = new PilhaString();
        HistoricoController hc = new HistoricoController();

        int opcao = 0;

        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(
                        "1 - Inserir endereço\n" +
                                "2 - Remover último\n" +
                                "3 - Consultar último\n" +
                                "9 - Sair"
                ));

                switch (opcao) {

                    case 1:
                        String url = JOptionPane.showInputDialog("Digite a URL:");
                        hc.inserirEndereco(historico, url);
                        break;

                    case 2:
                        String removido = hc.removerUltimo(historico);
                        System.out.println("Removido: " + removido);
                        break;

                    case 3:
                        String ultimo = hc.consultarUltimo(historico);
                        System.out.println("Último acesso: " + ultimo);
                        break;

                    case 9:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida!");

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (opcao != 9);
    }
}