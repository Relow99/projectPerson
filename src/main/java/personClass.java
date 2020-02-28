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

    public String hello()
    {
        String message=" ";
        String punctuation=" ";

        for(int i=0;i<interest.length;i++)
        {
            if (i>0 && i<interest.length-1)
            {
                punctuation +=", ";
            }
            if(i==interest.length-1)
            {
                punctuation+=" and ";
            }
            punctuation+=interest[i];
        }
        message="hello,my name is "+this.name+ " I am "+this.gender+" who is "+this.age+" years old"+", I love";
        return message+punctuation+".";
    }


}
