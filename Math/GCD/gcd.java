
/*
Greatest Common Divisor

Given 2 non negative integers m and n, find gcd(m, n)

GCD of 2 integers m and n is defined as the greatest integer g such that g is a divisor of both m and n.
Both m and n fit in a 32 bit signed integer.

Example

m : 6
n : 9

GCD(m, n) : 3 
*/

public class Solution {
	public int gcd(int a, int b) {
	    
	    if(a<b)
	        return gcd(b,a);
	    else if(b==0)
	        return a;
	    else
	        return gcd(a%b,b);
	    
	}
}
