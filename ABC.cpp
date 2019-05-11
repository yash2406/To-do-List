#include <bits/stdc++.h>
using namespace std;
//Program for sieve of erathothenes
bool prime[100005];
int main()
{
    int i,j;
    for(i=2;i<=100000;i++)
    {
        if(!prime[i])
        {
            for(j=2*i;j<=100000;j+=i){
                prime[j]=1;
            }
        }
    }
}
