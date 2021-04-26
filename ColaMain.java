//___Escriba una funcion que reciba como parametros dos colas del mismo tipo, en el caso de ser identicicas las colas, debe devolver true, de lo contrario false
//EJEMPLO (ENTRADA):({1,2,3,4},{1,2,3,4})
//EJEMPLO (SALIDA): true
package cola;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Collection;

public class ColaMain {

public static final Cola c1 = new Cola(1);
public static final Cola c2 = new Cola(2);
private static final Cola c3 = new Cola(3);
private static final Cola c4 = new Cola(4);
private static final Cola n1 = new Cola(1);
private static final Cola n2 = new Cola(2);
private static final Cola n3 = new Cola(3);
private static final Cola n4 = new Cola(4);
//private static final Cola n5 = new Cola(5);

  public static void main(String[] args) {
  Cola COLA  = new Cola();
  Queue<Cola> cola1 = new LinkedList();
  cola1.offer(c1);
  cola1.offer(c2);
  cola1.offer(c3);
  cola1.offer(c4);
  COLA.mostrar("La cola 1",cola1);
  Queue<Cola> cola2 =new LinkedList();
  cola2.offer(n1);
  cola2.offer(n2);
  cola2.offer(n3);
  cola2.offer(n4);
  //cola2.offer(n5);
  COLA.mostrar("La cola 2", cola2);
  COLA.comparar(cola1,cola2);
}
}
