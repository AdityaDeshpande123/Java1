package OOPS;

public class pac {
	
    public int factorial(int n)
    {
    	int p=1;
    	for(int i=1;i<=n;i++)
    		p*=i;
    	return p;
    }
    public int Combination(int n,int r)
    {
    	int ans = factorial(n)/(factorial(n-r)*factorial(r));
    	return ans;
    }
    public int Permutation(int n,int r)
    {
    	int ans = factorial(n)/factorial(n-r);
    	return ans;
    }
    
    
}
