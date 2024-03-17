public class Person {
    
    private String name;
    private int age;
    private boolean isGraduate;
    private boolean wantsLoan;

    public Person(String name,int age,boolean isGraduate,boolean wantsLoan){
        this.name = name;
        this.age=age;
        this.isGraduate=isGraduate;
        this.wantsLoan=wantsLoan;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isGraduate() {
        return isGraduate;
    }
    public boolean wantsLoan(){
        return wantsLoan;
    }
}
