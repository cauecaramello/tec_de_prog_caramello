import com.google.gson.annotations.SerializedName;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Arquivos {

    @SerializedName("datetime")
    private String datetime;
    private String horario;
    private String data;

    public void datetimeParaString(){
        this.datetime = this.datetime.substring(0, 19);
        LocalDateTime dataHora = LocalDateTime.parse(this.datetime);
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("HH:mm");
        this.horario = dataHora.format(formatacao);
        formatacao = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.data = dataHora.format(formatacao);
    }
    public String getHorario() {
        datetimeParaString();
        return horario;
    }

    public String getData() {
        datetimeParaString();
        return data;
    }

    public void escreverArquivo(Endereco endereco){

        try{
            FileWriter escrita = new FileWriter("Consultas.txt", true);
            escrita.write("CEP: "+endereco.getCep()+" Acessado ás "+this.getHorario()+ " Na data: "+ this.getData()+"\n");
            escrita.close();
            System.out.println("Salvo com sucesso! ");
        } catch (IOException e){
            System.out.println("Ocorreu um erro ao salvar a Consulta");
            e.printStackTrace();
        }
    }
    public void lerArquivo(){
        try {
            FileReader leitura = new FileReader("Consultas.txt");
            BufferedReader bufferedReader = new BufferedReader(leitura);
            String linha;
            while ((linha = bufferedReader.readLine()) != null){
                System.out.println(linha);
            }
            bufferedReader.close();
            leitura.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
