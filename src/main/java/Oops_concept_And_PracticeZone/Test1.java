package Oops_concept_And_PracticeZone;

class A {
    // Encapsulationn

    private String name;
    public void setName (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}



public class Test1 {
    static void main(String[] args) {
        A a = new A();
        a.setName("sameer");
        String data = a.getName();
        System.out.println(data);
    }

}
