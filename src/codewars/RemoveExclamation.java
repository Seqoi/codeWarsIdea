package codewars;

public class RemoveExclamation {
    public static String remove(String s, int n){
        char[] str;
        str = s.toCharArray();
        char c1 = '!';
        while (n>0){
          for (int i = 0; i< str.length; i++){
              if (c1 == str[i]){
                  str = ArrayUtils.removeElement(str, i+1);
              }
              continue;
          }
          n = n - 1;
        }
        return s;
    }
}
