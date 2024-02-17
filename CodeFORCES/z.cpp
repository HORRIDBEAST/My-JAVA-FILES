#include<bits/stdc++.h>
using namespace std;

int main(){
int t=0;
cin>>t;
while(t--){
int n=0,cnt=0,ans=0;
cin>>n;
vector<vector<int>>al(n+1);
for(int i=1;i<n;i++){
int a,b;
cin>>a>>b;
al[a].push_back(b);
al[b].push_back(a);
}
for(int i=1;i<=n;i++){
if(al[i].size()==1)cnt++;
}
ans+=(cnt+1)/2;
cout<<ans<<endl;
}
}