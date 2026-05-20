public class Logica {
    
    // Método estático simple para hacer la operación matemática
    public static double calcular(double num1, double num2, String operador) throws Exception {
        switch (operador) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": 
                if (num2 == 0) throw new Exception("División por cero");
                return num1 / num2;
            default: return num2;
        }
    }
}