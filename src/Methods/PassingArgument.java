package Methods;

public class PassingArgument {
    public static void greet(String name,int age,int Class,String grade) {
        System.out.println("Good Morning "+name+" Your age is "+age+". You are in class "+Class+". Your garde is "+grade);
    }
    public static void main(String[] args) {
greet("Abhay.",13,8,"A.");
greet("Anshika.",18,9,"A.");
greet("Akanksha.",19,10,"A.");
greet("Shiva.",17,9,"A.");


    }
}
