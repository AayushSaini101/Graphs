import java.util.*;
public class detectcycleunweighted {
static boolean detectcycle(List<ArrayList<Integer>>L,boolean vs[],int index,int  parent){
     vs[index]=true;
     for(int a:L.get(index)){
         int vertex=a;
         if(vs[vertex]==false){
             vs[vertex]=true;
             detectcycle(L, vs, vertex, index);
         }
         if(vertex!=parent){
             return true;
         }

     }
     return false;
}
    public static void main(String[] args) {
        List<ArrayList<Integer>>L=new ArrayList<>();
        int n=4;
        for(int i=0;i<4;++i){
            L.add(new ArrayList<Integer>());
        }
       L.get(0).add(1);
       L.get(1).add(0);
       L.get(1).add(2);
       L.get(2).add(1);
       //Cycle formation in the graph
       L.get(2).add(3);
       L.get(3).add(2);
       L.get(1).add(3);
       L.get(3).add(1);
       
       boolean vs[]=new  boolean[n];

       System.out.print(detectcycle(L,vs,0,0));


    }
}