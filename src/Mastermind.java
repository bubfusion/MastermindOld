import java.util.Scanner;

public class Mastermind {
    public static void main(String[] args) throws Exception {
        int[] genArray = ArrayGen.genArrary();
        int[] userArray = new int[4];
        int tempUserValue;
        int hits = 0;
        int blows = 0;
        boolean hasWon = false;
        Scanner userInput = new Scanner(System.in);

        int round = 0;
        System.out.println();
        while(round < 6 && hasWon == false){
            for(int i = 0; i < 4; i++){
                tempUserValue = userInput.nextInt();
                userArray[i] = tempUserValue;
            }

            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    if(userArray[i] == genArray[j] && i == j){
                        blows++;
                    }
                    else if(userArray[i] == genArray[j]){
                        hits++;
                    }
                }
            }
            if(blows == 4){
                System.out.println("You win!");
                hasWon = true;
            }
            else{
                System.out.println("Hits: " + hits);
                System.out.println("Blows: " + blows);
                System.out.println();
            
                blows = 0;
                hits = 0;
                round++;
            }
            if(round == 6){
                for(int i = 0; i < 4; i++){
                    System.out.print(genArray[i] + " ");
                }
            }
        }
    }
}
