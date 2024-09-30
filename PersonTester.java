class Person {
    private int age;
    private String name;

    public Person(int _age){
        this.age = _age;
    }

    public Person(int _age, String _name){
        this.age = _age;
        this.name = _name;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public void celebrateBirthday(){
        ++this.age;
    }

    public void changeName(String newName){
        this.name = newName;
    }
}


class PersonTester{
    public static void main(String args[]){
        Person blazerod = new Person(34, "Blaze");
        System.out.println("Name Before: " + blazerod.getName());
        System.out.println("Age Before: " + blazerod.getAge());
        blazerod.celebrateBirthday();
        blazerod.changeName("Ender Pearl");
        System.out.println("Name After : " + blazerod.getName());
        System.out.println("Age After: " + blazerod.getAge());
    }
}
