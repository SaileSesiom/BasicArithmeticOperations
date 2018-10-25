package tech.saile_sesiom.basic_arithmetic_operations;

/**
 *
 * @author Saile Sesiom
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CompilerBasicArithmeticOperations compiler = new CompilerBasicArithmeticOperations();

        System.out.println(compiler.isValid("---4"));
        System.out.println(compiler.isValid("3+7"));
        System.out.println(compiler.isValid("9--7"));
        System.out.println(compiler.isValid("1/5*2-8+6"));       
        System.out.println(compiler.isValid("0"));
        System.out.println(compiler.isValid("+1"));
        System.out.println(compiler.isValid("*2"));
        System.out.println(compiler.isValid("/3"));
        System.out.println(compiler.isValid("4+"));
        System.out.println(compiler.isValid("5-"));
        System.out.println(compiler.isValid("6*"));
        System.out.println(compiler.isValid("7/"));
    }
}
