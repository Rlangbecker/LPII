import java.time.LocalDate;

public class PessoaJuridica extends Pessoa{

    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private LocalDate dataCriacao;


    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, LocalDate dataCriacao,Endereco endereco) {
        super(endereco);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String getNomeCompleto(){
        return razaoSocial + " " + nomeFantasia;
    }

    @Override
    public String getDocumento(){
        return cnpj;
    }




}
