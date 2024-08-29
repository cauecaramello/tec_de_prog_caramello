import com.google.gson.annotations.SerializedName;

public class Endereco {
    private String cep;
    @SerializedName("logradouro")
    private String rua;
    private String bairro;
    @SerializedName("localidade")
    private String cidade;
    private String uf;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco {" +
                "CEP = '" + cep + '\'' +
                ", RUA = '" + rua + '\'' +
                ", BAIRRO = '" + bairro + '\'' +
                ", CIDADE = '" + cidade + '\'' +
                ", ESTADO = '" + uf + '\'' +
                '}';
    }
}
