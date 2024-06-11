import java.util.*;
class Memory{
    Scanner sc = new Scanner(System.in);
    int bs,mm,cm;
    int bsarr[]=new int[100];
    int mmarr[]=new int[100];
    int cmarr[]=new int[100];
    public Memory()
    {
        System.out.println("Enter block size:");
        bs = sc.nextInt();
        System.out.println("Enter main memory size:");
        mm = sc.nextInt();
        System.out.println("Enter cache memory size:");
        cm = sc.nextInt();
        mem_map();
    }
    void mem_map()
    {
        int no_of_blocks = mm/bs;
        int no_of_lines = cm/bs;
        int bi=get_power(no_of_blocks);
        int ci=get_power(no_of_lines);
        String main_mem[]= new String[no_of_blocks];
        String cache_mem[]= new String[no_of_lines];
        System.out.println("Displaying Main memory");
        for(int i=0; i<no_of_blocks;i++)
        {
            String display =new String();
            display=Integer.toBinaryString(i);
            display=prec_zero(display,bi);
            main_mem[i]=display;
            System.out.println(display);
        }
        System.out.println("Displaying Cache memory");
        for(int i=0; i<no_of_lines;i++)
        {
            String display =new String();
            display=Integer.toBinaryString(i);
            display=prec_zero(display,ci);
            cache_mem[i]=display;
            System.out.println(display);
        }
        String block_no = new String();
        System.out.println("Enter the block no to be mapped in binary:");
        sc.nextLine();
        block_no = sc.nextLine();
        String lsb= new String();
        int j=bi-1;
        for(int i=ci-1 ; i>=0 ; i--)
        {
            char c = block_no.charAt(j);
            lsb=c+lsb;
            j--;
        }
        System.out.print("Block no "+block_no+" will be mapped to line no: ");
        System.out.println(lsb);
        String tag = new String();
        int k=bi-ci-1;
        for(int i=k ; i>=0 ; i--)
        {
            char c = block_no.charAt(i);
            tag=c+tag;
        }
        System.out.print("Tag bit of "+block_no+" is: ");
        System.out.println(tag);
    }
    int get_power(int n)
    {
        int ans=0;
        while(n!=0)
        {
            n=n/2;
            ans++;
        }
        return ans-1;
    }
    String prec_zero(String str, int bi){
        int len = str.length();
        for(int i=0; i<bi-len ;i++)
        {
            str="0"+str;
        }
        return str;
    }
}
class Main {
    public static void main(String[] args) {
        Memory m = new Memory();
    }
}