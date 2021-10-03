public class HOMEWORK {

	public static void zth() {
		for (int i=1;i<101 ;i++ ) {
			System.out.println(i);
		}

	}//zth vege

	public static void fb(int x){
		if(x%3==0 && x%5==0){
			System.out.println("FizzBuzz");
		}
		else if (x%3==0){
			System.out.println("Fizz");

		}
		else if (x%5==0){
			System.out.println("Buzz");

		}
		else{
			System.out.println("nope");
		}
	}//fb vege

    public static void isprime(int n){
    int num = n;
    boolean divide = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        divide = true;
        break;
      }
    }

    if (divide!=true)
      System.out.println(num + " egy prímszám.");
    else
      System.out.println(num + " nem egy prímszám.");
  }//isprime vege

    public static void Fibonacci(int a) {

    	int n1=0,n2=1,n3=0;
    	System.out.println(n1);
    	System.out.println(n2);

    	for (int i=0;i<a+1 ; i++) {
    		n3=n1+n2;
    		System.out.println(n3);
    		n1=n2;
    		n2=n3;
    		
    	}


    }//Fibonacci vege

    public static void gdc(int an ,int bn){
    	int a=an;
        int b=bn;
    	int c=1;

    	while(true){
    		if(a%b==0){
    			System.out.println(c);
    			break;	
    		}
    		else{
    			c=a%b;
    			a=b;
    			b=c;
    		}


    	}
    }//gdc vege

    public static void ispalindrome(String p){
    	int first=0;
    	String check= p;
    	String nonspace=check.replaceAll(" ", "");
    	String lowcase= nonspace.toLowerCase();
    	int last=nonspace.length()-1;
    	boolean ispal= true;
    	
        while (first<last){
    		if(lowcase.charAt(first)!=lowcase.charAt(last)){
    			System.out.println(check + ": nem palindrom");
    			ispal = false;
    			break;
    		}
    		first++;
    		last--;

        }
        if (ispal == true)
        	System.out.println(check + ": palindrom");

    }//ispalindrome vege

    public static void asubstring(String s){
    	String word = s;

    		if (s.indexOf("a")!= -1){
    		System.out.println(s.substring(s.indexOf("a"),s.indexOf("a")+4));
    		}
    		else{
    			System.out.println("");
    		}

   }//asubstring vege

    public static void stringfind(String w){
    	String word= w;
    	for (int i=0 ;i<word.length() ;i++ ) {
    		if (word.charAt(i)== 'a'){
    			System.out.println("a found");
    		}
    		else if (word.charAt(i)== 'b') {
    			System.out.println("b found");

    		}
    		else if (word.charAt(i)== 'c') {
    			System.out.println("c found");

    		}
    		else {
    			System.out.println(word.charAt(i));
    		}
    		
    	}

    } //stringfind vege

    public static void largest(int[] v){
    	int a = v[0];

    	for (int i=0;i<v.length ;i++ ){
    		if(a<v[i]){
    			a=v[i];

    		}


    	}
    	System.out.println("Legnagyobb szám= " + a);
    }//largest vege

    public static void reversed(int a){
    	int rev= a;
    	StringBuilder sb = new StringBuilder(); 
    	sb.append(rev);



    	System.out.println(sb.reverse());
    }//reversed vege

    public static void statement(int an,int bn, char on){
    	int a= an;
    	int b= bn;
    	char o= on;

    	switch (o){
    		case '+': 
    			System.out.println(a+b);
    			break;
    		case '-': 
    			System.out.println(a-b);
    			break;
    		case '*':
    			System.out.println(a*b);
    		case '/':
    			System.out.println(a/b);
    	}

    }//statement vége

    public static void replacer(String word){
    	StringBuilder w2 = new StringBuilder(); 
    	w2.append(word);
    	for (int i=1;i< w2.length(); i=i+2) {
    			w2.setCharAt(i,'x');
    		}
    	for (int i=4;i< w2.length(); i=i+5){
    			w2.setCharAt(i,'X');
    		}
    		
    	
    	System.out.println(w2);
    }//replacer vege

    public static void main(String[] args) {
        

        zth();    //1.feladat:1-től 100-ig számokat kiíró metódus
        System.out.println("----");
        
        fb(4);    //2.feladat:fizzbuzz feladat.
        for (int i=1;i<101 ;i++ ) {fb(i); };
        System.out.println("----");
        
        isprime(29); //3.feladat:prímszám feladat
        System.out.println("----");
        
        Fibonacci(10); //4.Fibonacci feladat
        System.out.println("----");
        
        gdc(161,119); //5.Legnagyobb közös osztó
        System.out.println("----");
        
        ispalindrome("Indul a görög aludni");//6.palindrom feladat
        ispalindrome("palindrome");
        ispalindrome("racecar");
        System.out.println("----");
        
        String an = "american";   //7.substring feladat
        asubstring(an);
        asubstring("ending");

        System.out.println("----");

        stringfind("analogue"); //8.feladat

        System.out.println("----");
        int[] values = {2,4,7,1,9,4}; //9.feladat :largest number
        largest(values);

        System.out.println("----");
        reversed(1234);//10.feladat

        System.out.println("----");
        statement(2,2,'+'); //11.feladat

        System.out.println("----");
        replacer("testmessage"); //12.feladat


        

    }
}


