package cola;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Cola {

private int n1;
private boolean bandera = false;

public Cola(int c1){
  this.n1 = c1;
}
public Cola(){  
}
public boolean getBandera(){
  return bandera;
}
public void setBandera(boolean flag){
  this.bandera = flag;
}
public void setN1(int numero1){
  this.n1 = numero1;
}
public int getN1(){
  return n1;
}
public String toString(){
  return String.format("%s",this.n1);
}
public boolean equals(Cola a){
  if(a.getN1()==n1){
    return true;
  }
  else{
    return false;
  }
}
public void mostrar(String presentacion,Collection miCola){
  System.out.println("Mostrando"+presentacion);
  for(Object o:miCola){
    System.out.println(o);
  }
}
public void comparar(Queue<Cola> miCola1,Queue<Cola> miCola2){
  Queue<Cola> Aux1 = new LinkedList();
  Aux1.addAll(miCola1);
  Queue<Cola> Aux2 = new LinkedList();
  Aux2.addAll(miCola2);
  Cola bandera = new Cola();
  Cola tamaño1 = new Cola(miCola1.size());
  Cola tamaño2 = new Cola(miCola2.size());
    while(miCola1.size()>0 && miCola2.size()>0 && tamaño1.equals(tamaño2)){
    if(miCola1.peek().equals(miCola2.peek())){
    miCola1.poll();
    miCola2.poll();
    bandera.setBandera(true);
    }
    else{
      bandera.setBandera(false);
      miCola1.removeAll(miCola1);
      miCola2.removeAll(miCola2);
     }
    }
    
    System.out.println("¿las colas son identicas?\n"+bandera.getBandera());
}
}
