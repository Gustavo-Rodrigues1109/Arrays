import static java.lang.IO.*;
import java.util.ArrayList;

void main() {

    ArrayList<String> tarefa = new ArrayList<String>();
    String entrada;

    while (true) {
        entrada = readln("Informe a tarefa (ou digite 'fim' para sair): ");
        if (entrada.equals("fim")) {
            break;
        }
        tarefa.add(entrada);
    }

    IO.println("=========================================\n"+
            "Lista de tarefas:\n"+
            "=========================================\n"+
            tarefa);
}