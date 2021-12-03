import java.util.ArrayList;
public class PrimeNumbers{
    public static void main(String[] args){
        System.out.println(findPrime(100));
    }
    public static ArrayList<Integer> findPrime(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int p;
        for(int i =2;i<=n;i++){
            ans.add(i);
        }
        for(int i =0;i<ans.size();i++){
            p = ans.get(i);
            for(int j =ans.size()-1;j>i;j--){
                if(ans.get(j)%p==0){
                    ans.remove(j);
                }
            }
            
        }
        return ans;
    }
}