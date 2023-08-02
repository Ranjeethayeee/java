
class MethodOverloading{  
  int sum(int a,int b){
	  return(a+b);
	  }  
float sum(float a,int b){return (a+b);}  
  
  public static void main(String args[]){  
  MethodOverloading obj=new MethodOverloading();  
  System.out.println(obj.sum(20,0));//now second int literal will be promoted to long  
  System.out.println(obj.sum(10,20));  
  }}