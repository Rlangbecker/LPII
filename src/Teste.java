import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = criarPessoaFisica();
        System.out.println(pessoa);

        pessoa = criarPessoaJuridica();
        System.out.println(pessoa);



    }

    private static PessoaFisica criarPessoaFisica(){
        return new PessoaFisica("Joao","dos Santos","000.111.222-33", LocalDate.of(2000,1,1),criarEndereco());
    }

    private static PessoaJuridica criarPessoaJuridica(){
        return new PessoaJuridica("Lancheria do Ze LTDA.","Bar do zé","20.545.123/0001-96",LocalDate.of(2005,2,2),criarEndereco());
    }

    private static Endereco criarEndereco(){
        return new Endereco("97300-162","Avenida ","Antonio Trilha","Loja",1883);
    }
}
