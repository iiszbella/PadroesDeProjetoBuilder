import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class FuncionarioBuilderTest {

    @Test
    public void testCadastroValido() {
        Funcionario funcionario = new FuncionarioBuilder()
                .setMatricula(101)
                .setNome("Isabella")
                .setDataNascimento(new Date())
                .setNomeMae("Maria")
                .setNomePai("João")
                .setCpf("123.456.789-00")
                .setRg("MG-12.345.678")
                .setEnderecoLogradouro("Rua das Flores")
                .setEnderecoNumero(100)
                .setEnderecoComplemento("Apto 202")
                .setEnderecoBairro("Centro")
                .setEnderecoCidade("Juiz de Fora")
                .setEnderecoUF("MG")
                .setCep("36000-000")
                .setEmail("isabella@email.com")
                .setCelular("(32) 99999-9999")
                .setCargo("Analista de Sistemas")
                .setSalario(5500.00)
                .build();

        System.out.println("Funcionário cadastrado com sucesso:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("CPF: " + funcionario.getCpf());
        assertEquals("Isabella", funcionario.getNome());
        assertEquals("Analista de Sistemas", funcionario.getCargo());
    }

    @Test
    public void testMatriculaInvalida() {
        FuncionarioBuilder builder = new FuncionarioBuilder()
                .setMatricula(0)
                .setNome("Carlos")
                .setCpf("987.654.321-00");

        Exception exception = assertThrows(IllegalArgumentException.class, builder::build);
        System.out.println("Erro esperado (matrícula inválida): " + exception.getMessage());
        assertEquals("Matrícula inválida", exception.getMessage());
    }

    @Test
    public void testNomeInvalido() {
        FuncionarioBuilder builder = new FuncionarioBuilder()
                .setMatricula(102)
                .setNome("")
                .setCpf("111.222.333-44");

        Exception exception = assertThrows(IllegalArgumentException.class, builder::build);
        System.out.println("Erro esperado (nome inválido): " + exception.getMessage());
        assertEquals("Nome inválido", exception.getMessage());
    }

    @Test
    public void testCpfInvalido() {
        FuncionarioBuilder builder = new FuncionarioBuilder()
                .setMatricula(103)
                .setNome("Marina")
                .setCpf("");

        Exception exception = assertThrows(IllegalArgumentException.class, builder::build);
        System.out.println("Erro esperado (CPF inválido): " + exception.getMessage());
        assertEquals("CPF inválido", exception.getMessage());
    }
}

