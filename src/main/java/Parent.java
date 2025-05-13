import java.util.Arrays;

class Parent extends Person{

    private Parent spouse = null;
    private Child[] children = new Child[0];


    public Parent(String name, int age, Parent spouse){
        super(name, age);
        this.spouse = spouse;
    }

    public Parent(String name, int age){
        super(name, age);
    }

    public Parent getSpouse(){
        return this.spouse;
    }

    public Child[] getChildren(){
        return this.children;
    }
    
    public void setSpouse(Parent spouse){
        this.spouse = spouse;
    }

    public void setChildren(Child[] children){
        this.children = children;
    }

    public void addChild(Child child){
        Child[] newChildren = Arrays.copyOf(this.children, this.children.length + 1);
        newChildren[newChildren.length - 1] = child;
        this.children = newChildren;
    }

}