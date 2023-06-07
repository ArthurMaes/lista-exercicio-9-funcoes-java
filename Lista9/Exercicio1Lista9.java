import java.io.FileWriter;
import java.io.PrintWriter;

public class Exercicio1Lista9 {
    public static void main(String[] args) {
        try{
            FileWriter arq = new
            FileWriter("C:\\Users\\Arthur\\Desktop\\alunos_universidade.txt");
            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.write("======Nota dos Alunos======");
            gravarArq.write("\nMaria\nnota:70");
            gravarArq.write("\n================");
            gravarArq.write("\nPedro\nnota:90");
            gravarArq.write("\n================");
            gravarArq.write("\nJoao\nnota:65");
            gravarArq.write("\n================");
            gravarArq.write("\nLara\nnota:75");
            gravarArq.write("\n================");
            gravarArq.write("\nGustavo\nnota:100");
            arq.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}