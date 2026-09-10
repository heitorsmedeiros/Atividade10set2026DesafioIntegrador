import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        int idade = Integer.parseInt(scanner.nextLine().trim());
        double salario = Double.parseDouble(scanner.nextLine().trim());
        int tempoEmpresa = Integer.parseInt(scanner.nextLine().trim());
        int quantidadeFilhos = Integer.parseInt(scanner.nextLine().trim());
        String modalidadeTrabalho = scanner.nextLine().trim();
        String utilizaVeiculoProprio = scanner.nextLine().trim();

        boolean direitoValeAlimentacao = salario <= 5000.0;
        boolean direitoAuxilioCreche = quantidadeFilhos > 0;
        boolean elegivelPlanoSaude = tempoEmpresa >= 1;
        boolean direitoAuxilioHomeOffice = modalidadeTrabalho.equalsIgnoreCase("home office");
        boolean direitoAuxilioCombustivel = modalidadeTrabalho.equalsIgnoreCase("presencial")
                && utilizaVeiculoProprio.equalsIgnoreCase("sim");
        boolean participacaoPLR = tempoEmpresa >= 1;
        boolean elegivelBolsaEstudos = tempoEmpresa >= 2 && idade <= 35;

        System.out.println("Colaborador: " + nome);
        System.out.println("Direito ao vale-alimentação: " + formatarDireito(direitoValeAlimentacao));
        System.out.println("Direito ao auxílio-creche: " + formatarDireito(direitoAuxilioCreche));
        System.out.println("Elegibilidade para plano de saúde: " + formatarDireito(elegivelPlanoSaude));
        System.out.println("Direito ao auxílio home office: " + formatarDireito(direitoAuxilioHomeOffice));
        System.out.println("Direito ao auxílio combustível: " + formatarDireito(direitoAuxilioCombustivel));
        System.out.println("Participação na PLR: " + formatarDireito(participacaoPLR));
        System.out.println("Elegibilidade para bolsa de estudos: " + formatarDireito(elegivelBolsaEstudos));

        scanner.close();
    }

    private static String formatarDireito(boolean possuiDireito) {
        return possuiDireito ? "Sim" : "Não";
    }
}
