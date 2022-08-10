package august1022.codewars;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SimpleAssemblerInterpreterTest {

    @Test
    void interpret() {
        String[] program = new String[]{"mov a 10","inc a","dec a","dec a","jnz a -1","inc a"};
        Map<String, Integer> out = new HashMap<>();
        out.put("a", 1);
        assertEquals(out, SimpleAssemblerInterpreter.interpret(program));
    }
}