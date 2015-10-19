class Q0201 {
  static int fact(int n){
    return n == 0 ? 1 : n * fact(n - 1);
  }

  public static void main(String[] args){
	System.out.println("10の階乗は " + fact(10));
  }
}                        
