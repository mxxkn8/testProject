package test1;

public class sample {
	
	int add(int x, int y) {
		pri(1);
		return x+y;
	}
	
	int sub(int x, int y) {
		pri(2);

		return x-y;
	}
	
	int mul(int x, int y) {
		pri(3);

		return x*y;
	}
	
	float div(int x, int y) {
		if(y==0) {
			return 0;
		}
		float res = (float)x/(float)y;
		pri(4);
		return res;
	}
	
	void pri(int x) {
		if(x==1) {
			System.out.print("Add Function");
		}
		else if(x==2) {
			System.out.print("Subtract Function");
		}
		else if(x==3) {
			System.out.print("Multiply Function");
		}
		else if(x==4) {
			System.out.print("Divide Function");
		}
	}
	
	int funx(int x, int y, char c) {
		float r;
		int res;
		switch(c)
		{
		   // case statements
		   // values must be of same type of expression
		   case '+' :
		      // Statements
			   res = add(x,y);
		      break; // break is optional
		   
		   case '-' :
		      // Statements
			   res = sub(x,y);
		      break; // break is optional
		      
		   case '*' :
			      // Statements
			   res = mul(x,y);
			      break;
			
		   case '/' :
			      // Statements
			   r = div(x,y);
			   return r;
			      break;
		
		}
		return res;
			
	}
	
	public static void main(String[] args) {
		System.out.println("Hi");
		// TODO Auto-generated method stub

	}

}
