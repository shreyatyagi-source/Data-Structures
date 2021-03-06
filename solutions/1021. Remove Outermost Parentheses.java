class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Boolean[] pos=new Boolean[s.length()];
        Stack<Character> st=new Stack<Character>();
      for(int i=0;i<s.length();i++)
      {
          if(s.charAt(i)=='(')
          {
              if(st.size()==0)
                  pos[i]=true;
               st.push('(');
              sb.append('(');
          }
          else if(s.charAt(i)==')')
          {
              st.pop();
              sb.append(')');
              if(st.isEmpty())
                pos[i]=true;
          }
      }
        String snew=new String();
        for(int i=0;i<sb.length();i++)
        {
          if(pos[i]==null)
              snew=snew+s.charAt(i);
        }
        return snew;
    }
}
