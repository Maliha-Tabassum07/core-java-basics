package PolymorphismExample;


public class ChildClass extends ParentClass{

    public void propertry(){
        System.out.println("The child is changing the property");
    }
    public static void main(String[] args) {
        ChildClass child=new ChildClass();
        ParentClass parent=new ParentClass();
        ParentClass parentChild=new ChildClass();
        child.propertry();
        parent.propertry();
        parentChild.propertry();
        parent.protectedParent();
        child.protectedParent();
        parentChild.protectedParent();
    }
}
