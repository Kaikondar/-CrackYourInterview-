class Solution {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter,(a,b)->a[0]-b[0]);
        Stack<int[]>st=new Stack<>();
        for(int i=0;i<inter.length;i++){
            int[]curr=inter[i];
            if(!st.isEmpty()){
                int[]prev=st.peek();
                if(prev[1]>=curr[0]){
                    st.pop();
                    st.push(new int[]{prev[0],Math.max(prev[1],curr[1])});
                }else{
                    st.push(curr);
                }
            }else{
                st.push(curr);
            }
        }
        int in=0;
        int[][]ans=new int[st.size()][2];
        while(!st.isEmpty()){
            ans[in++]=st.pop();
        }
        return ans;
    }
}
