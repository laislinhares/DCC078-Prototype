import org.example.Endereco;
import org.example.Loja;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Loja loja = new Loja(123, "Loja 1", new Endereco("Rua a", 10));

        Loja lojaClone = loja.clone();
        lojaClone.setCnpj(456);
        lojaClone.setNome("Loja 2");
        lojaClone.getEndereco().setNumero(20);

        assertEquals("Loja{cnpj=123, nome='Loja 1', endereco=Endereco{logradouro='Rua a', numero=10}}", loja.toString());
        assertEquals("Loja{cnpj=456, nome='Loja 2', endereco=Endereco{logradouro='Rua a', numero=20}}", lojaClone.toString());
    }
}
