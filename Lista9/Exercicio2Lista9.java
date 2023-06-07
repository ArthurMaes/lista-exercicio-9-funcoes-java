import java.io.FileWriter;
import java.io.PrintWriter;

public class Exercicio2Lista9{
    public static void main(String[] args) {
        try{
            FileWriter arq = new
            FileWriter("C:\\Users\\Arthur\\Desktop\\itens_supermercado.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.write("=========SuperMercado=========");
            gravarArq.write("\nCaixa de Ovos\nPreço: R$10,80");
            gravarArq.write("\n=====================");
            gravarArq.write("\nPacote de Arroz\nPreço: R$9,00");
            gravarArq.write("\n=====================");
            gravarArq.write("\nBiscoito\nPreço: R$2,90");
            gravarArq.write("\n=====================");
            gravarArq.write("\nSuco\nPreço: R$0,99");
            gravarArq.write("\n=====================");
            gravarArq.write("\nPacote de Feijão\nPreço: R$7,90");
            gravarArq.write("\n=====================");
            gravarArq.write("\nNescau\nPreço: R$5,70");
            gravarArq.write("\n=====================");
            gravarArq.write("\nGuaraná 3L.\nPreço: 7,90");
            gravarArq.write("\n=====================");
            gravarArq.write("\nCoca-Cola 3L.\nPreço: R$12,99");
            gravarArq.write("\n=====================");
            gravarArq.write("\nDetergente\nPreço: R$2,99");
            gravarArq.write("\n=====================");
            gravarArq.write("\nCreme de Leite\nPreço: R$1,99");
            arq.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}