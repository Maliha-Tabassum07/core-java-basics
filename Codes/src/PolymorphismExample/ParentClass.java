package PolymorphismExample;

public class ParentClass {
    private void parent(){
        System.out.println("Print from parent");
    }
    protected void protectedParent(){
        System.out.println("Protected from parent");
    }
    public void propertry(){
        System.out.println("Can be shared by parents");
    }
}
