import java.util.Scanner;
import java.io.IOException;
import oldherd.lang.nihongo.data.NiHonGoData;
import oldherd.lang.words.nihongo.NiHonGo;
import oldherd.inter.in.fileManager;

public class Main {
    static final int maxChoice = 2;

    static void runNiHonGo(Scanner inputStream) throws IOException {
        System.out.print(fileManager.fileToString("./oldherd/lang/nihongo/out/fileLoadTips.in"));
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
        System.out.print(fileManager.fileToString("./oldherd/lang/nihongo/out/mainLoop.in"));
    }

    public static void main(String[] args) throws IOException {
        String greeting = fileManager.fileToString("./mainOut/greetingWords.in");
        System.out.print(greeting);
        String choiceTip = fileManager.fileToString("./mainOut/Options.in");
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print(choiceTip);
            if(!in.hasNextInt()) {
                System.out.print(fileManager.fileToString("./mainOut/noCorrectInput.in"));
            } 
            int choiceNumber = in.nextInt();
            if(choiceNumber < 0 || choiceNumber > maxChoice) {
                 System.out.print(fileManager.fileToString("./mainOut/noCorrectInput.in"));
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
