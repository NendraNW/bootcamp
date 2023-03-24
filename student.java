public class student {
    int id;
    String name;

    //Default Constructot *Does not take any parameters. 
    student(){
        id = 1;
        name = "Tashi Namgyel";
        System.out.println("Default Constructor\n"+id+"\n"+name);
    }
    
    //Parameterised Constructor *Takes parameters.
    student(int idInput, String nameInput){
        id = idInput;
        name = nameInput;
        System.out.println("Parameterised Constructor\n"+id+"\n"+name);
    }

public static void main(String[] args) {
    //Creating a default object
    student tashi = new student();

    //Creating a Parameterised object
    student nendra = new student(2, "Nendra Namgyel Wangchuk");
}
}