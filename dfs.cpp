void dfs(int s,int par)
{
  for(int i=0;i<v[s].size();i++)
  { 
    if(v[s][i]!=par)
    {
      dfs(v[s][i],s);
     }
  }
}
    
