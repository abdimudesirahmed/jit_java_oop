
package outerclass;


public class Outerclass {
    int height;
    void outerClassMethod(){
        System.out.println("this is outer class method");
    }
    void commonToBoth(){
        System.out.println("common method for both outer and inner class");
        
    }
    class InnerClass{
        void commonToBoth (){
            System.out.println("common method for the nested class");
                    
        }
        
    }
    public void innerClassMethod(){
        System.out.println("inner class method");
        this.commonToBoth();
        Outerclass.this.commonToBoth();
    }

    
    public static void main(String[] args) {
        Outerclass instanceO= new Outerclass();
        instanceO.commonToBoth();
        instanceO.outerClassMethod();
        Outerclass.InnerClass instancei=instanceO.new InnerClass();
        instancei.commonToBoth();
        instancei.innerClassMethod();
        
         
         
    }
    
}
