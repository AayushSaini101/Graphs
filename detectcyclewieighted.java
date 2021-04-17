import java.util.*;
import java.io.*;
class detectcycleunweighted {
    static boolean dfs(boolean vs[],boolean vs1[],ArrayList<ArrayList<Integer>>adj,int index){
    vs[index]=true;
    vs1[index]=true;
    for(int u:adj.get(index)){
        if(vs[u]==false&&dfs(vs,vs1,adj,u)){
            return true;
        }
        if(vs1[u]==true){
            return true;
        }
    }
    vs1[index]=false;
    return false;
        
        
    }
        
        
        public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
            // code here
            boolean vs[]=new boolean[V+1];
            boolean vs1[]=new boolean[V+1];
            for(int i=0;i<V;++i){
                if(vs[i]==false){
                    //Apply dfs 
                   if(dfs(vs,vs1,adj,i)==true){
                    return true;   
                   }
                }
            }
            return false;
           
        }
    }