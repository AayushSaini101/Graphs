import java.util.*;
class Solution {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int degree[]=new int[V];
        for(int i=0;i<V;++i){
            for(int j:adj.get(i)){
                degree[j]++;
            }
        }
        //Push all the element into the queuq
        Queue<Integer>Q=new LinkedList<>();
        for(int i=0;i<degree.length;++i){
            if(degree[i]==0){
                Q.add(i);
            }
        }
        int tee[]=new int[V];
        int index=0;
       ArrayList<Integer>A=new ArrayList<>();
        while(Q.size()!=0){
            int pop=Q.poll();
            tee[index++]=pop;
            for(int aa:adj.get(pop)){
                  degree[aa]--;
                if(degree[aa]==0){
                    Q.add(aa);
                }
                
            }
            
        }
        return tee;
      
        
    }}