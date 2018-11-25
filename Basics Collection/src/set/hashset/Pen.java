/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.hashset;

/**
 *
 * @author root
 */
public class Pen {

private String name;
private double value;

public Pen(String name , double value){

    this.name=name;
    this.value=value;
}
        
@Override
public String toString(){

    return "["+name+" : "+value+"]";
    // return  String.format("Name IS %s and Value Is %s",name,value );
}


@Override
public boolean equals(Object o){

    if(o == null) return false;
    if(o==this) return true;
    if(!(o instanceof Pen)) return false;
    
    Pen oo=(Pen) o;
    
    if(this.name.equals(oo.name)  && this.value == oo.value ){ 
            return true;
        }else {
          return false;
    }
}


@Override
public int hashCode(){

    Double d=new Double(value);
  
    return d.hashCode() + name.hashCode();   
}


}
