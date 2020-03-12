import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        if(sum<=0){
            return new ArrayList<>();
        }
        ArrayList<Integer> smList=new ArrayList<>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int result=0;
        for(int i=1;i<sum;i++){
            for(int j=i;j<sum;j++){
                result+=j;
                smList.add(j);
                if(result==sum){
                    list.add(smList);
                    break;
                }else if(result>sum){
                    break;
                }
            }
            smList=new ArrayList<>();
            result=0;
        }
        return list;
    }

    public static void main(String[] args) {
        //ArrayList<ArrayList<Integer>> list=FindContinuousSequence(3);
        int[] array={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> list=FindNumbersWithSum(array,10);
        System.out.println(list);
    }
    public  static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (array == null || array.length < 2) {
            return list;
        }
        int i=0,j=array.length-1;
        while(i<j){
            if(array[i]+array[j]==sum){
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }else if(array[i]+array[j]>sum){
                j--;
            }else{
                i++;
            }

        }
        return list;
    }
}
