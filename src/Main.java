import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nome = "Lucas Alves";
        String tipoConta = "Conta corrente";
        double saldo = 2500.00;
        int opcao = 0;

        System.out.println("************************************");
        System.out.println();
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: R$" + saldo);
        System.out.println("************************************");

        String menu = """
                ************* -- BANCO L.A -- ***************
                
                ----------------   Menu    ------------------
                
                Digite a opção desejada:
                
                1 - Consultar saldo
                2 - Sacar saldo
                3 - Depositar saldo
                4 - Sair
                
                ______________________________________________
                """;



        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){

            System.out.println(menu);
            opcao =  leitura.nextInt();

            if (opcao == 1){

                System.out.println("O saldo Atualizado é:" + saldo);

            } else if (opcao == 2){

                System.out.println("Digite o saldo que deseja sacar:");

                double valor = leitura.nextDouble();

                if(valor > saldo){
                    System.out.println("Não há saldo suficiente");
                }else{
                    saldo -= valor;
                    System.out.println("Novo saldo" + saldo);
                    }

                } else if (opcao == 3) {

                System.out.println("Digite o valor que você deseja depositar: ");
                double valor = leitura.nextDouble();

                saldo += valor;
                System.out.println("Novo saldo" + saldo);


            } else if (opcao != 4) {

                System.out.println("opção inválida!");

            }

        }


        }




    }

