package august1022.codewars;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class SimpleAssemblerInterpreter {
    public static Map<String, Integer> interpret(String[] program){
        //iterate through program
        //if matches move add x with value y
        //if matches inc call inc
        //if matches dec call dec
        //if matches jnz && if x != 0, change i += y
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < program.length; i++) {
            String[] programSignature = program[i].split("\\s");
            switch(programSignature[0]) {
                case "mov":
                    mov(map, programSignature[1], programSignature[2]);
                    break;
                case "inc":
                    inc(map, programSignature[1]);
                    break;
                case "dec":
                    dec(map, programSignature[1]);
                    break;
                case "jnz":
                    i += jnz(map, programSignature[1], programSignature[2]);
                    break;
            }
        }

        return map;
    }

    //programs
    public static void mov(Map<String, Integer> map, String register, String contentStr) {
        if (map.containsKey(contentStr)) {
            map.put(register, map.get(contentStr));
        }
        else {
            map.put(register, Integer.parseInt(contentStr));
        }
    }

    public static void inc(Map<String, Integer> map, String register) {
        map.put(register, map.get(register) + 1);
    }

    public static void dec(Map<String, Integer> map, String register) {
        map.put(register, map.get(register) - 1);
    }

    public static int jnz(Map<String, Integer> map, String register, String jumpStr) {
        if (map.get(register) != null && !map.get(register).equals(0)) {
            return Integer.parseInt(jumpStr) - 1;
        }
        return 0;
    }
}
