public class AddNum { 
  public static int MultSumsOfNum(int n, int i) { 
    int finalInt = n * i; 
    if( i == 0 || n == 0) { 
      return finalInt;
    } else {
      return MultSumsOfNum(n-1, i-1) + finalInt; 
    }
  } 
  public static void main(String[] args) { 
    System.out.println(MultSumsOfNum(3, 2)); 
  }
}