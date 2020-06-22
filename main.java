   /*
   Ustedes deberan tener el package y clase. Ejemplo:

   package nombre;
   public class nombre
   */
   
   public static void main(String[] args) {
        int n1, n2, n3;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog(">> Introduce un numero entero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(">> Introduce otro numero entero: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(">> Introduce otro numero entero: "));
        
        if(n1 > n2 && n1 > n3){
            JOptionPane.showMessageDialog(null, ">> El numero: " + n1 + " es mayor que el numero: " + n2 + " y el numero: " + n3);
        }
        else if (n2 > n1 && n2 > n3){
            JOptionPane.showMessageDialog(null, ">> El numero: " + n2 + " es mayor que el numero: " + n1 + " y el numero: " + n3);
        }
        else if (n3 > n1 && n3 > n2){
            JOptionPane.showMessageDialog(null, ">> El numero: " + n3 + " es mayor que el numero: " + n1 + " y el numero: " + n2);
        }
        else if (n1 == n2 && n1 == n3){
            JOptionPane.showMessageDialog(null, ">> Los tres numeros son iguales");
        }
        else if (n2 == n1 && n2 == n3){
            JOptionPane.showMessageDialog(null, ">> Los tres numeros son iguales");
        }
        else if (n3 == n1 && n3 == n2){
            JOptionPane.showMessageDialog(null, ">> Los tres numeros son iguales");
        }
        else {
            JOptionPane.showMessageDialog(null, ">> ERROR");
        }
    }
}
