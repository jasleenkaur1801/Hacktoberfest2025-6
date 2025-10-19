class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int cnt1=0,cnt2=0,ele1=0,ele2=0;
        for(int ele:nums){
            if(ele==ele1)cnt1++;
            else if(ele==ele2)cnt2++;
            else if(cnt1==0){
                ele1=ele;
                cnt1=1;
            }else if(cnt2==0){
                ele2=ele;
                cnt2=1;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        int count1=0,count2=0;
        for(int ele:nums){
            if(ele==ele1)count1++;
            if(ele==ele2)count2++;
        }
        List<Integer> res=new ArrayList<>();
        if(count1>n/3)res.add(ele1);
        if(count2>n/3 && ele1!=ele2)res.add(ele2);
        return res;
    }
}
