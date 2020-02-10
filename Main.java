import java.util.Scanner;
import java.nio.file.Paths;
import java.io.*;
import oldherd.lang.nihongodata.NiHonGoData;
import oldherd.lang.words.nihongo.NiHonGo;

public class Main {
    static final int maxChoice = 1;
    static String fileToString(String fileName) throws IOException {
        Scanner in = new Scanner(Paths.get(fileName), "UTF-8");
        String resString = new String();
        while(in.hasNextLine())
            resString = resString + in.nextLine() + '\n';
        return resString;
    }
    
    public static void runNiHonGo(Scanner inputStream) throws IOException {
        System.out.print(fileToString("./mainOut/nihongo/out/fileLoadTips.in"));
        Scanner in = inputStream;
        NiHonGoData dataIn = new NiHonGoData();
        boolean flg = false;
        while(in.hasNext()) {
            flg = true;
            dataIn.load(in.next());
        }
        if(!flg) {
            dataIn.load();
        }
        System.out.print(fileToString("./mainOut/nihongo/out/mainLoop.in"));
    }

    public static void main(String[] args) throws IOException {
        String greeting = fileToString("./mainOut/greetingWords.in");
        System.out.print(greeting);
        String choiceTip = fileToString("./mainOut/choiceTips.in");
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print(choiceTip);
            if(!in.hasNextInt()) {
                System.out.print(fileToString("./mainOut/noCorrectInput.in"));
            } 
            int choiceNumber = in.nextInt();
            if(choiceNumber < 0 || choiceNumber > maxChoice) {
                 System.out.print(fileToString("./mainOut/noCorrectInput.in"));
            } else {
                if(choiceNumber == 0) {
                    break;
                } else if(choiceNumber == 1) {
                    System.out.print(choiceTip);
                }else if(choiceNumber == 2) {
                    runNiHonGo(in);
                }
            }
        }
    }
}
