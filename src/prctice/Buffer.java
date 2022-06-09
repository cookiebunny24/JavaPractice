package prctice;

public class Buffer {
    public static void main(String[] args) {
        StringBuffer buf= new StringBuffer("heena");
        StringBuilder bufBuild= new StringBuilder("Suraj");
        System.out.println("buffer value    :"+buf);
        buf.append("life");
        System.out.println("buffer value    :"+buf);
        buf.insert(1,"naina");
        System.out.println("buffer value    :"+buf);
        buf.replace(0,5,"jaaanu");
        System.out.println("buffer value    :"+buf);
        buf.delete(0,6);
        System.out.println("buffer value    :"+buf);
        buf.ensureCapacity(10);
        System.out.println("buffer value    :"+buf.capacity());
        String name = " what do you mean";
        System.out.println(name.contains("heenas"));
        System.out.println("ends with :"+ name.endsWith("mean"));
        String name1="sonoo";
        String sf2=String.format("value is %f",32.334);
        String sf3=String.format("value is %32.12f",32.334);
        System.out.println(sf2);
        System.out.println(sf3);
//        String str1 = String.format("%d", 101);          // Integer value
//        String str2 = String.format("%s", "Amar Singh"); // String value
//        String str3 = String.format("%f", 101.00);       // Float value
//        String str4 = String.format("%x", 101);          // Hexadecimal value
//        String str5 = String.format("%c", 'c');          // Char value
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);
//        System.out.println(str5);


        String str1 = String.format("%d", 101);
        String str2 = String.format("|%10d|", 101);  // Specifying length of integer
        String str3 = String.format("|%-10d|", 101); // Left-justifying within the specified width
        String str4 = String.format("|% d|", 101);
        String str5 = String.format("|%010d|", 101); // Filling with zeroes
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);


        String str11 = new String("hello javatpoint how r u");
        char[] ch = new char[10];
        try{
            str11.getChars(6, 16, ch, 0);
            System.out.println(ch);
        }catch(Exception ex){System.out.println(ex);}


        String s1="this is index of example";
//passing substring
        int index1=s1.indexOf("is");//returns the index of is substring
        int index2=s1.indexOf("index");//returns the index of index substring
        System.out.println(index1+"  "+index2);//2 8

//passing substring with from index
        int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

//passing char value
        int index4=s1.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3

        String joinString1=String.join("-","welcome","to","javatpoint");
        System.out.println(joinString1);


        String date = String.join("/","25","06","2018");
        System.out.print(date);
        String time = String.join(":", "12","10","10");
        System.out.println(" "+time);


        String ss1="Javatpoint";
        String substr = ss1.substring(0); // Starts with 0 and goes to end
        System.out.println(substr);
        String substr2 = ss1.substring(5,10); // Starts from 5 and goes to 10
        System.out.println(substr2);
//        String substr3 = ss1.substring(5,14); // Returns Exception


        String s21 ="  hello java string   ";
        System.out.println(s21.length());
        System.out.println(s21); //Without trim()
        String tr = s21.trim();
        System.out.println(tr.length());
        System.out.println(tr); //With trim()


        int value=30;
        String s31=String.valueOf(value);
        System.out.println(s31+10);//concatenating string with 10
    }

    }