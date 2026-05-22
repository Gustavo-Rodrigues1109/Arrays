import static java.lang.IO.*;
import java.util.ArrayList;

void main() {
    ArrayList<String> compras = new ArrayList<String>();
    int opcao = Integer.parseInt(readln("Escolha uma opção" + "\n1 - Adicionar a lista" + "\n2 - Pesquisar item" + "\n3 - Remover item" + "\n4 - Alterar item" + "\n5 - Listar produtos" + "\n6 - Sair" + "\n"));
        while (opcao != 6) {
            String contagem = "";
            while (opcao == 1) {
                while (!contagem.equals("sair")) {
                    contagem = readln("Digite os produtos (Digite sair para voltar)");
                    compras.add(contagem);
                }
                compras.remove("sair");
                break;
            }
            while (opcao == 2) {
                while(!contagem.equals("sair")) {
                    contagem = readln("Digite o nome do produto você deseja localizar: ");
                    if (compras.contains(contagem)) {
                        println("O produto " + contagem + " esta aqui");
                    } else if (!contagem.contains("sair")) {
                        println("Produto não encontrado");
                    }
                }
                break;
            }
            while (opcao == 3) {
                while(!contagem.contains("sair")) {
                    contagem = readln("Digite o nome do produto que você deseja remover: ");
                    if (compras.contains(contagem)) {
                        compras.remove(contagem);
                    } else if (!contagem.contains("sair")) {
                        println("Produto não encontrado");
                    }
                }
                break;
            }
            while (opcao == 4) {
              while(!contagem.contains("sair")){
                  contagem = readln("Digite o nome do produto que você deseja renomear: ");
                  if (compras.contains(contagem)){
                      String repc = readln("Escreva o nome novo do produto: ");
                      int indr = (compras.indexOf(contagem));
                      print("O produto " + contagem);
                      compras.set(indr, repc);
                      println(" foi renomeado para " + compras.get(indr));
                  }
                  else if (!contagem.contains("sair")) {
                  println("Produto não encontrado");
                  }

              }
            break;
            }
            while (opcao == 5) {
                if (compras.isEmpty()){
                    println("lista vazia");
                }
                else{
                    println("A lista de compras tem os seguintes produtos:" + compras);

                }
            break;
            }
            opcao = Integer.parseInt(readln("Escolha uma opção" + "\n1 - Adicionar a lista" + "\n2 - Pesquisar item" + "\n3 - Remover item" + "\n4 - Alterar item" + "\n5 - Listar produtos" + "\n6 - Sair" + "\n"));

        }
    println("Programa encerrado com sucesso!");

    }
