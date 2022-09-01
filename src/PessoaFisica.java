import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PessoaFisica extends Pessoa{

    private static final Integer MAIORIDADE = 18;
    private String nome;
    private String sobrenome;
    private String cpf;
    private LocalDate dataNascimento;

    public PessoaFisica(String nome, String sobrenome, String cpf, LocalDate dataNascimento,Endereco endereco) {
        //super chama na hierarquia, uma classe acima (pai)
        super(endereco);
        //this chama a variavel criada no private, onde iguala a varivel dos parametros
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public boolean isMaiorIdade(){
        long idade=ChronoUnit.YEARS.between(dataNascimento,LocalDate.now());

        return idade >= MAIORIDADE;
    }

    @Override
    public String getNomeCompleto(){
        return nome + " " + sobrenome;
    }

    @Override
    public String getDocumento(){
        return cpf;
    }

}
