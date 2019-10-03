public class Cost {
    public static void main(String[] args){
        int[] cost={10,5,2,200,5,1};
        for(int i=0;i<=cost.length;i++){
           // System.out.println(cost[i]);
            if(cost[i]<cost.length-1||cost[i]<cost.length-2){
                System.out.println(cost[i]);
            }
        }
    }
}
