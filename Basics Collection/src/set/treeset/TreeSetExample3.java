/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.treeset;

 
import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author root
 */
public class TreeSetExample3 {
    
    
    public TreeSetExample3(){
    
        
//         TreeSet<TreeSetExample3Customer> tree = new TreeSet<TreeSetExample3Customer>();
//         
//         tree.add(new TreeSetExample3Customer("Sahdy",22));
//         tree.add(new TreeSetExample3Customer("Bassem",19));
//         tree.add(new TreeSetExample3Customer("Ahmed",25));
//         
//         // Execption becous of comperable
//         System.out.println(tree);
//         
//         
         
         // add comperables in TreeSetExample3
         //  (new AgeAscComp());
         
        TreeSet<TreeSetExample3Customer> treeComp = new TreeSet<TreeSetExample3Customer>(new AgeAscComp());
         
         treeComp.add(new TreeSetExample3Customer("Sahdy",22));
         treeComp.add(new TreeSetExample3Customer("Bassem",19));
         treeComp.add(new TreeSetExample3Customer("Ahmed",25));
         
         // Execption becous of comperable
         System.out.println(treeComp);
         
    }
    
    public static void main(String[] args) {
        
      new TreeSetExample3();
    }
   

    

  
     class AgeAscComp implements Comparator<TreeSetExample3Customer>{

        @Override
        public int compare(TreeSetExample3Customer o1, TreeSetExample3Customer o2) {

            return o1.getAge() - o2.getAge();
        }

    }
      
     class AgeDescComp implements Comparator<TreeSetExample3Customer>{

        @Override
        public int compare(TreeSetExample3Customer o1, TreeSetExample3Customer o2) {

            return o2.getAge() - o1.getAge();
        }
        
    }
          
     class NameAscComp implements Comparator<TreeSetExample3Customer>{

        @Override
        public int compare(TreeSetExample3Customer o1, TreeSetExample3Customer o2) {

            return o1.getName().compareTo(o2.getName());
        }

    }

     class NameDescComp implements Comparator<TreeSetExample3Customer>{

        @Override
        public int compare(TreeSetExample3Customer o1, TreeSetExample3Customer o2) {

            return o2.getName().compareTo(o1.getName());
        }

    }

     
}
