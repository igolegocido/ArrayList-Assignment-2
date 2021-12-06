import java.util.ArrayList;
public class PrimeNumbers{
    public static void main(String[] args){
        // System.out.println(findPrime(100));
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =1;i<10;i++){
            a.add(i);
        }
        ArrayList<Integer> b= new ArrayList<>();
        for(int i =9;i>4;i--){
            b.add(i);
        }
        
        System.out.println(add(b,a));
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
    public static void printSum(int n){
        ArrayList<Integer> nums = findPrime(n);
        for(int a :nums){
            if(nums.contains(n-a)){
                System.out.println(a+", "+ (n-a));
                break;
            }
        }
    }
    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b){
        int carry = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(a.size()>=b.size()){
            for(int i =1;i<=b.size();i++){
                ans.add(0,(b.get(b.size()-i)+a.get(a.size()-i)+carry)%10);
                if(b.get(b.size()-i)+a.get(a.size()-i)+carry>=10){
                    carry = 1;
                }else{
                    carry = 0;
                }
            }
            for(int i =1;i<=a.size()-b.size();i++){
                if(i==1&&carry == 1){
                    ans.add(0,(a.get(a.size()-i-b.size())+carry%10));
                }else{
                    ans.add(0,a.get(a.size()-i-b.size()));
                }
            }
            return ans;
             
        }else{
            return add(b,a);
        }
        
    }
}