import java.util.Scanner;

public class SparseArray {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan =new Scanner(System.in);
         int N = scan.nextInt();
        String [] s1=new String[N];
        for(int i=0;i<N;i++){
            s1[i] = scan.next();
        }
        int Q = scan.nextInt();
        String [] s2=new String[Q];
        
        for(int i=0;i<Q;i++){
            int count =0;
            String sample = scan.next();
            for(int j=0;j<N;j++){
            	System.out.println(s1[j]+"--->"+sample);
                if(s1[j].equals(sample)){
                    count++;
                }
            }
            System.out.println(count);
        }
        
       
        
    }
}
