class LongestPalindrome {
    int start=0;
    int ML=0;
    public  String longestPalindrome(String s) {
        int l=s.length();
        if(l<2){
            return s;
        }
        char a[]=s.toCharArray();
        for(int i=0;i<l;i++){
            findpali(a,i,i+1); //for even palindrome
            findpali(a,i,i); //for odd palindrome
        }
        return s.substring(start,start+ML);
    }
    private void findpali(char a[],int j , int k){
        while(j>=0 && k<a.length && a[j]==a[k]){
            j--;
            k++;
        }
        if(ML<k-j-1){
            ML=k-j-1;
            start=j+1;
        }
    }
    }