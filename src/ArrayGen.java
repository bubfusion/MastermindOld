
public class ArrayGen {

    public static int[] genArrary(){
        boolean isTaken = false;
        int[] generatedArray = new int[4];

        for(int i = 0; i < 4;){
            int tempNum = (int)(Math.random() * 7);
            for(int j = 0; j < 4; j++){
                if(generatedArray[j] == tempNum)
                {
                    isTaken = true;
                }
            }
            if(isTaken == false){
                generatedArray[i] = tempNum;
                i++;
            }
            else{
                isTaken = false;
            }
        }
        return generatedArray;
    }
}
