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
        ArrayList<ArrayList<Integer>> list=FindContinuousSequence(3);
        System.out.println(list);
    }
}
