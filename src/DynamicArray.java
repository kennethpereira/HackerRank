import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
	
	private static int lastAns =0;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int N = 0;
        int Q = 0;
        
        List<int[]> seqList=new ArrayList<int[]>();

        
        Scanner  scan = new Scanner(System.in);
        
        //input values
        N = scan.nextInt();
        Q = scan.nextInt();
        
        for(int i=0;i<N;i++){
            int a []=new int[Q];
            seqList.add(a);
        }
        
        for(int i=0;i<Q;i++){
            int q = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            //System.out.print("----"+q+' '+x+' '+y);
            findLastAns(seqList,q,x,y,lastAns);
        }
        
        
    }
    
    public static void findLastAns(List<int[]> seqList,int q,int x,int y,int lastAns){
        
        int quotient = (x ^ lastAns)%2;
        //System.out.println("quotient--->"+quotient);
        int i=0,j=0;
        if(quotient==0){
            int arr[] = seqList.get(quotient);
            
            if(q==2){
                lastAns = arr[y];
                System.out.println(lastAns);
            }else {
                
            arr[i] = y;
            i++;
            }
            
        }else if (quotient==1) {
             int arr[] = seqList.get(quotient);
            if(q==2){
                
                lastAns = arr[y];
                System.out.println(lastAns);
            }else{
               
            //int size = arr.length;
            arr[j] = y;
            j++;
            }
            
            
        }
        
        
        
    }	

}
