import static java.lang.IO.*;
import java.util.ArrayList;

void main() {

    ArrayList<Double> preco = new ArrayList<Double>();

    for (int i = 0; i < 5; i++) {
        preco.add(Double.parseDouble(readln("Informe o valor do " + (i + 1) + "° item: ")));
    }

    IO.println("=========================================\n"+
            "O menor preço é "+(Collections.min(preco)+"\n")+
            "=========================================");
    IO.println("O maior preço é "+(Collections.max(preco)));

}