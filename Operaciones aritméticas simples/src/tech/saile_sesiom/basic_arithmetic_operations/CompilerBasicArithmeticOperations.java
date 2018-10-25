package tech.saile_sesiom.basic_arithmetic_operations;

/**
 * Compilador de expresiones aritméticas simples
 * 
 * Expre: Expresión
 * Num:   Número
 * Oper:  Operación
 *
 * Expre -> Num     | – Expre
 * Oper  -> + Expre | – Expre | * Expre | / Expre
 * Num   -> 0X | 1X | 2X | 3X | 4X | 5X | 6X | 7X | 8X | 9X
 * X     -> Ɛ  | Oper
 *
 *
 * @author Saile Sesiom
 */
public class CompilerBasicArithmeticOperations {
    private boolean sentinel;

    public CompilerBasicArithmeticOperations() {
    }
    
    /**
     * Invoca a la primera regla de control de expresiones aritméticas simples.
     *
     * @param lexema: cadena de caracteres a evaluar.
     * @return cadena de caracteres con la validación de la expresión.
     */
    public String isValid(String lexema){
        sentinel = false;
        reglaExpre(0, lexema.length(), lexema.toCharArray());
        if(lexema.isEmpty()){
            return lexema + "\" \" = Invalid";
        }
        else if(sentinel){
            return lexema + " = Valid";
        }
        else{
            return lexema + " = Invalid";
        }
    }
    
    /**
     * Método recursivo de la regla Expre:
     * [ Expre -> Num | – Expre ]
     * 
     * Es el comienzo para la validación de las expresiones aritméticas.
     *
     * @param i: comienzo o consecutivo de la iteración.
     * @param n: se utiliza para evaluar o marcar las posiciones finales.
     * @param lexema: arreglo que contiene el lexema en caracteres.
     *                       [l, e, x, e, m, a]
     */
    private void reglaExpre(int i, int n, char[] lexema) {
        if (i < n) {
            switch (lexema[i]) {                
                case '-':
                    reglaExpre(i + 1, n, lexema);
                    break;
                default:
                    reglaNum(i, n, lexema);
                    break;
            }
        }
        else {
            sentinel = false;
            //mensaje = "Invalid";
        }
    }
    
    /**
     * Método recursivo de la regla Oper:
     * [ Oper  -> + Expre | – Expre | * Expre | / Expre ]
     * Valida si el comienzo de la expresión es un operando.
     *
     * @param i: comienzo o consecutivo de la iteración.
     * @param n: se utiliza para evaluar o marcar las posiciones finales.
     * @param lexema: arreglo que contiene el lexema en caracteres.
     *                       [l, e, x, e, m, a]
     */
    private void reglaOper(int i, int n, char[] lexema) {
        if (i < n) {
            switch (lexema[i]) {
                case '+':
                    reglaExpre(i + 1, n, lexema);
                    break;
                case '-':
                    reglaExpre(i + 1, n, lexema);
                    break;
                case '*':
                    reglaExpre(i + 1, n, lexema);
                    break;
                case '/':
                    reglaExpre(i + 1, n, lexema);
                    break;
                default:
                    sentinel = false;
                    //mensaje = "Invalid";
                    break;
            }
        }
        else {
            sentinel = false;
            //mensaje = "Invalid";
        }
    }
    
    /**
     * Método recursivo de la regla Num:
     * [ Num -> 0X | 1X | 2X | 3X | 4X | 5X | 6X | 7X | 8X | 9X ]
     * 
     * Es el comienzo para la validación de números del 0 al 9.
     *
     * @param i: comienzo o consecutivo de la iteración.
     * @param n: se utiliza para evaluar o marcar las posiciones finales.
     * @param lexema: arreglo que contiene el lexema en caracteres.
     *                       [l, e, x, e, m, a]
     */
    private void reglaNum(int i, int n, char[] lexema) {
        if (i < n) {
            switch (lexema[i]) {
                case '0':
                    reglaX(i + 1, n, lexema);
                    break;
                case '1':
                    reglaX(i + 1, n, lexema);
                    break;
                case '2':
                    reglaX(i + 1, n, lexema);
                    break;
                case '3':
                    reglaX(i + 1, n, lexema);
                    break;
                case '4':
                    reglaX(i + 1, n, lexema);
                    break;
                case '5':
                    reglaX(i + 1, n, lexema);
                    break;
                case '6':
                    reglaX(i + 1, n, lexema);
                    break;
                case '7':
                    reglaX(i + 1, n, lexema);
                    break;
                case '8':
                    reglaX(i + 1, n, lexema);
                    break;
                case '9':
                    reglaX(i + 1, n, lexema);
                    break;
                default:
                    sentinel = false;
                    //mensaje = "Invalid";
                    break;
            }
        }
        else {
            sentinel = false;
            //mensaje = "Invalid";
        }
    }
    
    /**
     * Método recursivo de la regla X:
     * [ X -> Ɛ | Oper ]
     *
     * @param i: comienzo o consecutivo de la iteración.
     * @param n: se utiliza para evaluar o marcar las posiciones finales.
     * @param lexema: arreglo que contiene el lexema en caracteres.
     *                       [l, e, x, e, m, a]
     */
    private void reglaX(int i, int n, char[] lexema) {
        if (i < n) {
            reglaOper(i, n, lexema);
        }
        else {
            sentinel = true;
            //mensaje = "Valid";
        }
    }
}
