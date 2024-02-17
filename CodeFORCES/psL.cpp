#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t,n;
    string s;
    cin>>t;
    while(t--)
    {
        int hash[27];
        cin>>n;
        cin>>s;
        int c=0;
        for(int i=0;i<s.size();i++)
        {
            hash[('s[i]'-65)+1]++;
            
        }
        for(int i=0;i<27;i++)
        {
            if(hash[i]==i)
            c++;
        }
      cout<<c<<endl;  
    }
}