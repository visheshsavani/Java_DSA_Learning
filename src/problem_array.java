public class problem_array {
    public static void main(String[] args) {
        int []height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
   static public int maxArea(int[] height) {
        int max=height[0];
        int m_area=0;
        int m_area1=0;
        int u=0;
        for(int i=1;i<height.length;i++){
            if(height[i]==max){
                m_area = ((i+1)-1) * max;
                u=i;
            }
            else if(height[i]>max){
                u=i;
                max = height[i];
            }
        }
        int val = max -1;
        while(val!=0){
            int x = search(height,val);
            if(x!=-1){
                if(x>u) {
                    m_area1 = ((x) - 1) * Math.max(val,max);
                    break;
                }
                else if(x<u && val<max){
                    m_area1 = ((u+1) - 1) * val;
                    break;
                }
                else if(x<u && val>max){
                    m_area1 = ((u+1) - 1) * max;
                    break;
                }

            }
            val = max-1;
        }
        if(m_area >= m_area1) {
            return m_area;
        }
        else{
            return m_area1;
        }
    }
    static int search(int []arr, int target) {
        int []a = new int[arr.length];
        int k=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==target){
                a[k] = j;
                k++;
            }
        }
        if(k!=0){
            return a[k-1];
        }
        return -1;
    }
}
