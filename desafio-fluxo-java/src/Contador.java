public class Contador {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Por favor, forneça dois números inteiros como parâmetros.");
            return;
        }

        try {
            int parametroUm = Integer.parseInt(args[0]);
            int parametroDois = Integer.parseInt(args[1]);
            
            contar(parametroUm, parametroDois);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, forneça valores numéricos válidos.");
        } catch (ParametrosInvalidosException e) {
          
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
       
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

 
        for (int i = 1; i <= parametroDois - parametroUm; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
