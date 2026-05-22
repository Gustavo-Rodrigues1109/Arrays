import static java.lang.IO.*;

void main() {

    ArrayList<Float> temp = new ArrayList<Float>();
    String trtemp;
   while(true) {
       trtemp = readln("Digite a(s) temperatura(s) em celsius: ");
       if (trtemp.equals("sair")){
           break;
       }
       temp.add(Float.valueOf(trtemp));
   }

  for(int i = 0; i < temp.size(); i++) {
      println("Temperatura em Celsius: " + temp.get(i));
      temp.set(i, temp.get(i) * 9/5 + 32);
      println("Temperatura em Fahrenheit: " + temp.get(i));
  }

}