public class personClass {

    public String name;
     public int age;
     public String gender;
     public  String interest[];

    public personClass(String name, int age, String gender,String[] interest) {
        this.name = name;
        this.age = age;
        this.gender= gender;
        this.interest= interest;

    }

    public String  hello()
    {
        return "hello,my name is "+this.name+" I am "+this.gender+" who is "+this.age+" years old, I love "+this.interest[0]+" and "+this.interest[1];

    }



}
