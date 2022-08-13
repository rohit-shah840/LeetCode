class Solution {
    public String multiply(String num1, String num2) {
        int a=num1.length();
        int b=num2.length();
        int arr[] =new int [a+b];
        for(int i=a-1;i>=0;i--){
            for(int j=b-1;j>=0;j--){
                int mul =(num1.charAt(i)-'0' )* (num2.charAt(j)-'0');
                int sum= arr[i+j+1]+mul;
                arr[i+j]+=sum/10;
                arr[i+j+1]=sum%10;
            }
        }
        
        StringBuilder s= new StringBuilder();
        for(int v : arr){
            if(s.length()!=0 || v!=0){
                s.append(v);
            }
        }
        return s.length()==0?"0":s.toString();
    }
}