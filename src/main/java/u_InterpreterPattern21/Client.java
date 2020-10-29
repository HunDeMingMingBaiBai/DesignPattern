package u_InterpreterPattern21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 抽象解释器
 *  终结符表达式
 *  非终结符表达式
 *
 * 尽量不要在重要的模块中使用解释器模式
 * 否则维护会是一个很大的问题
 * 采用shell JRuby Groovy等脚本语言来代替解释器模式
 *
 * 或者开源的 Expression4J MESP
 *
 */
public class Client {

    public static void main (String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getValue(expStr);
        Calculator cal = new Calculator(expStr);
        System.out.println(cal.run(var));
    }

    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式：");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(ch)) {
                    System.out.println("请输入" + ch + "的值：");
                    String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }

}
