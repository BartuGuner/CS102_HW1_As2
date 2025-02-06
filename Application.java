public class Application{
    public int list[] = new int[100];//hjgjhgjhgjhgdaahsdsfsdf
    public static void main(String[] args) 
    {
        
        
        
        
    }
    

    public static int FindMax(int list[]){
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if(list[i] > max){
                max = list[i];
            }
        }
        return max; 
    }

    public static int FindMin(int list[]){
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if(list[i] < min){
                min = list[i];
            }
        }
        return min; 
    }

    public static int AverageOfArray(int list[]){

        int average = 0;
        for(int i =0;i<list.length;i++)
        {
            average += list[i];
        }

        return average; 
    }

    public static int[] DifferOfArray(int list[]){

        int differ[] = new int[list.length];
        int average = AverageOfArray(list);

        for (int i = 0; i < differ.length; i++) {
            differ[i] = list[i] - average;
        }


        return differ; 
    }

    public static int SumOfOddIndexs(int list[]){
        
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if(i % 2 != 0){
                sum += list[i];
            }
        }
        return sum;

    }

    public static int SumOfEvenIndexs(int list[]){

        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            if(i % 2 == 0){
                sum += list[i];
            }
        }
        return sum;


    }

}
    