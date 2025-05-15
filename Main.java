import service.CurrencyConverterService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverterService converterService = new CurrencyConverterService();

        int opcao;

        do {
            System.out.println("======= CONVERSOR DE MOEDAS =======");
            System.out.println("1) Dólar para Real → \"100.00 na cotação de Dólar está a: R$XXX.XX\"");
            System.out.println("2) Real para Dólar → \"100.00 na cotação de Real está a: US$XXX.XX\"");
            System.out.println("3) Euro para Real → \"100.00 na cotação de Euro está a: R$XXX.XX\"");
            System.out.println("4) Real para Euro → \"100.00 na cotação de Real está a: €XXX.XX\"");
            System.out.println("5) Iene para Real → \"100.00 na cotação de Iene Japonês está a: R$XXX.XX\"");
            System.out.println("6) Real para Iene → \"100.00 na cotação de Real está a: ¥XXX.XX\"");
            System.out.println("7) Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao == 7) {
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.print("Digite o valor para converter: ");
            double valor = scanner.nextDouble();

            double resultado = 0;
            String from = "";
            String to = "";

            switch (opcao) {
                case 1:
                    from = "USD";
                    to = "BRL";
                    resultado = converterService.convert(from, to, valor);
                    if (resultado > 0)
                        System.out.printf("US$ %.2f na cotação do Dólar está a: R$ %.2f%n", valor, resultado);
                    break;

                case 2:
                    from = "BRL";
                    to = "USD";
                    resultado = converterService.convert(from, to, valor);
                    if (resultado > 0)
                        System.out.printf("R$ %.2f na cotação do Real está a: US$ %.2f%n", valor, resultado);
                    break;

                case 3:
                    from = "EUR";
                    to = "BRL";
                    resultado = converterService.convert(from, to, valor);
                    if (resultado > 0)
                        System.out.printf("€ %.2f na cotação do Euro está a: R$ %.2f%n", valor, resultado);
                    break;

                case 4:
                    from = "BRL";
                    to = "EUR";
                    resultado = converterService.convert(from, to, valor);
                    if (resultado > 0)
                        System.out.printf("R$ %.2f na cotação do Real está a: € %.2f%n", valor, resultado);
                    break;

                case 5:
                    from = "JPY";
                    to = "BRL";
                    resultado = converterService.convert(from, to, valor);
                    if (resultado > 0)
                        System.out.printf("¥ %.2f na cotação do Iene Japonês está a: R$ %.2f%n", valor, resultado);
                    break;

                case 6:
                    from = "BRL";
                    to = "JPY";
                    resultado = converterService.convert(from, to, valor);
                    if (resultado > 0)
                        System.out.printf("R$ %.2f na cotação do Real está a: ¥ %.2f%n", valor, resultado);
                    break;

                default:
                    System.out.println("[ALERT] Opção inválida!");
            }

            System.out.println();

        } while (true);

        scanner.close();
    }

    private static String getNomeMoeda(String codigo) {
        if ("USD".equals(codigo)) return "Dólar";
        if ("EUR".equals(codigo)) return "Euro";
        if ("JPY".equals(codigo)) return "Iene Japonês";
        if ("BRL".equals(codigo)) return "Real";
        return codigo;
    }

    private static String getSimboloMoeda(String codigo) {
        if ("USD".equals(codigo)) return "US$";
        if ("EUR".equals(codigo)) return "€";
        if ("JPY".equals(codigo)) return "¥";
        if ("BRL".equals(codigo)) return "R$";
        return codigo;
    }
}
