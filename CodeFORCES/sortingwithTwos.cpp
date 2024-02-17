#include<bits/stdc++.h>
#include<string.h>
#include<math.h>
#include<algorithm>
using namespace std;

void solve(){
    int n,first;
    cin>>n>>first;
    int temp,flag=0;
    for(int i=1;i<n;i++){
        cin>>temp;
        if(first>temp){
            if(((i-1)&(i))!=0) flag = 1;
        }
        first = temp;
    }
    if(flag) cout<<"NO"<<endl;
    else cout<<"YES"<<endl;
}
int main(){

    ios_base::sync_with_stdio(false);
    cin.tie(0);

    int t;cin>>t;
    while(t--){
        solve();
    }
}