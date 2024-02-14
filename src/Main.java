import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<String> words = new ArrayList<String>();
    public static void main(String[] args) {

        words.addAll(Arrays.asList("Soccer", "Basketball", "Football", "Cricket", "Rugby", "Wrestling", "Gymnastics", "Track", "Cross Country", "Boxing"));
        boolean done = true;
        while(done){
            String temp = (InputHelper.getRegExString(scan,"Would you like to Add an item [A], Delete an item [D], Print the list [P], Quit [Q]", "[AaDdPpQq]"));
            if (temp.equalsIgnoreCase("A")){
                addMethod();
            } else if (temp.equalsIgnoreCase("D")){
                deleteMethod();
            } else if(temp.equalsIgnoreCase("P")){
                printMethod();
            } else{
                quitMethod();
            }
        }
    }
    public static void  addMethod(){
        System.out.println("What item would you like to add to the list?");
        words.add(scan.nextLine());
    }
    public static void  deleteMethod(){
        words.remove(InputHelper.getRangedInt(scan,"What Item spot would you like to remove (List starts at 0)", 1,words.size()-1));
    }
    public static void  printMethod(){
        for(int i = 0; i < words.size(); i++){
            System.out.print(i + " - " + words.get(i) + ", ");
        }
        System.out.println();
    }

    public static void  quitMethod(){
        if(InputHelper.getRegExString(scan,"Are you sure you want to quit? [Y/N]", "[YyNn]").equalsIgnoreCase("Y")){
            System.exit(0);
        }
    }
}