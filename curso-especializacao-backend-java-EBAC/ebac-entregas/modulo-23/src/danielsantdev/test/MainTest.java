package danielsantdev.test;

import danielsantdev.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    public void testFiltrarMulheres(){
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Daniel", "M"));
        pessoas.add(new Pessoa("Marcia", "F"));
        pessoas.add(new Pessoa("Marcos", "M"));
        pessoas.add(new Pessoa("Marilio", "M"));
        pessoas.add(new Pessoa("Maria", "F"));
        pessoas.add(new Pessoa("Fernanda", "F"));
        pessoas.add(new Pessoa("Carla", "F"));

        List<Pessoa> mulheres = Main.filtrarMulheres(pessoas);

        assertEquals(4, mulheres.size());
        assertEquals("Marcia", mulheres.get(0).getNome());
        assertEquals("F", mulheres.get(0).getSexo());
        assertEquals("Maria", mulheres.get(1).getNome());
        assertEquals("F", mulheres.get(1).getSexo());
        assertEquals("Fernanda", mulheres.get(2).getNome());
        assertEquals("F", mulheres.get(2).getSexo());
        assertEquals("Carla", mulheres.get(3).getNome());
        assertEquals("F", mulheres.get(3).getSexo());
    }
}