import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
	
	//private static 
	private static int i=0,j=0;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int N = 0;
        int Q = 0;
        int lastAns =0;
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
            
            lastAns= findLastAns(seqList,q,x,y,lastAns);
            if(lastAns>0){
            	System.out.println(lastAns);
            }
        }
        
        
    }
    
	public static int findLastAns(List<int[]> seqList, int q, int x, int y, int lastAns){
    	
    	System.out.println("lastAns--->"+lastAns);
        int quotient = (x ^ lastAns)%2;
        System.out.println("quotient--->"+quotient);
        
        if(quotient==0){
            int arr[] = seqList.get(quotient);
            System.out.println("I am here with q--->"+q+"----");
            if(q==2){
            	System.out.println("y--->"+y+"----");
                lastAns = arr[y];
                return lastAns;
            }else {
                
            arr[i] = y;
            System.out.println("--->"+arr[i]);
            i++;
            
            }
            
        }else if (quotient==1) {
             int arr[] = seqList.get(quotient);
            if(q==2){
                
                lastAns = arr[y];
                System.out.println(lastAns);
                return lastAns;
            }else{
               
            //int size = arr.length;
            arr[j] = y;
            j++;
            }
            
            
        }
        
       // int arr[] = seqList.get(0);
        
        return 0;
        
        
        
    }	

}
