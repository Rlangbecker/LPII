public class Endereco {

    private String cep;
    private String tipoLOgradouro;
    private String nomeLogradouro;
    private String complemento;
    private Integer numero;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipoLOgradouro() {
        return tipoLOgradouro;
    }

    public void setTipoLOgradouro(String tipoLOgradouro) {
        this.tipoLOgradouro = tipoLOgradouro;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Endereco(String cep, String tipoLOgradouro, String nomeLogradouro, String complemento, Integer numero) {
        this.cep = cep;
        this.tipoLOgradouro = tipoLOgradouro;
        this.nomeLogradouro = nomeLogradouro;
        this.complemento = complemento;
        this.numero = numero;
    }

    @Override
    public String toString(){
        return  tipoLOgradouro.toString() +" "+ nomeLogradouro.toString() + " " + numero.toString() + " / " + complemento.toString();
    }

}
