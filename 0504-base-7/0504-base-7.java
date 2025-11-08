class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return new String("0");
        boolean flag =num<0;
        num = Math.abs(num);

        StringBuilder str = new StringBuilder();

        while(num>0){
            str.append(num%7);
            num/=7;
        }

        if(flag) str.append('-');

        return str.reverse().toString();
    }
}