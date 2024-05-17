/*
Utilize os seus conhecimentos em Orientação a Objetos e Herança para desenvolver objetos que representam diferentes tipos 
de progressões. Por exemplo: Progressão aritmética, geométrica e fibonacci. Os objetos devem ter um meio de obter o próximo
número e reiniciar a progressão.
*/
package HerancaExercicio1;

//Classe principal main para testar as formulas
public class Main {
    public static void main(String[] args) {
        Progressões a = new Progressões();
        Fibonacci f = new Fibonacci();
        Geometrica g =new Geometrica();

        
        a.Progressão(7, 4);
        f.Progressão(7, 4);
        g.Progressão(7, 4);
    }
}
