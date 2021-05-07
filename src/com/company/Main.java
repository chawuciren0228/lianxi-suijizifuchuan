package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //方法1
        char cs[] = new char[5];
        short start = '0';
        short end = 'z'+1;
        for (int i = 0; i < cs.length; i++) {
            while (true) {
                char c = (char) ((Math.random() * (end - start)) + start);
                System.out.println(c);
                if (Character.isLetter(c) || Character.isDigit(c)) {
                    cs[i] = c;
                    break;
                }
            }
        }
        String result = new String(cs);
        System.out.println(result);

        //方法2
        String pool = "";
        for (short i = '0';i <= '9';i++){
            pool+=(char)i;
        }
        for (short i = 'a';i<='z';i++) {
            pool += (char) i;
        }
        for (short i = 'a';i<='z';i++){
            pool+=(char)i;
        }
        char cs2[] = new char[5];
        for (int i = 0 ; i <cs2.length ; i++){
            int i1 = (int) (Math.random()*pool.length());
            System.out.println(i1);
            cs2[i] = pool.charAt(i1);
        }
        String result1 = new String(cs2);
        System.out.println(result1);
    }
}
