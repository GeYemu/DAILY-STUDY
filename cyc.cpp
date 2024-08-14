#include<bits/stdc++.h>
using namespace std;
int n,m;
const int INF=1e9;
bool isvalid(vector<vector<int>>&adj,vector<int>path,int &cost){
    if(path.size()-2!=n)return false;
    set<int>s(path.begin()+1,path.end()-1);
    if(s.size()!=n)return false;
    cost=0;
    for(int i=0;i+1<n+2;i++){
        int u=path[i],v=path[i+1];
        if(adj[u][v]==INF)return false;
        cost+=adj[u][v];
    }
    return true;
}
int main()
{
    cin>>n>>m;
    vector<vector<int> > adj(n+1,vector<int>(n+1,INF));
    for(int i=0;i<m;i++){
        int u,v,w;
        cin>>u>>v>>w;
        adj[u][v]=adj[v][u]=min(adj[u][v],w);
    }
    int k;
    cin>>k;
    int ans=INF,cnt=0,ans_id=-1;
    for(int id=0;id<k;id++){
        int n;
        cin>>n;
        vector<int>path(n+2);
        path[0]=path.back()=0;
        for(int i=1;i<=n;i++)cin>>path[i];
        int cost;
        if(isvalid(adj,path,cost)){
            cnt++;
            if(cost<ans){
                ans=cost;
                ans_id=id;
            }
        }
    }
    cout<<cnt<<"\n";
    cout<<ans_id+1<<" "<<ans<<"\n";
}
