void main() {

    String[] convidados = new String[5];
    for(int i = 0; i < convidados.length; i++) {
        convidados[i] = IO.readln("Digite o nome do "+ (i + 1) + "° Convidado: ");
    }

    IO.println("=====================\n" +
            "Lista de convidados: \n" +
            "=====================\n");

    for(int i = 0; i < convidados.length; i++) {

        IO.println(convidados[i]);
    }

    IO.println("Existem " + convidados.length +" convidados.");

}
