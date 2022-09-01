public abstract class Pessoa {

    private String nomeCompleto;
    private String documento;
    private Endereco endereco;

    public Pessoa(Endereco endereco){
        this.endereco=endereco;
    }

    public  abstract String getNomeCompleto();
    public abstract String getDocumento();

    @Override
    public String toString(){
        return "PESSOA [nomeCompleto=" + getNomeCompleto() + ", documento=" + getDocumento() + "] \n" + "[ Endereço= " + endereco + "]" ;
    }


}
