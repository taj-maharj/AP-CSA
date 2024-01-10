public class StringsExercises{
    public String scroll(String s){
        return s.substring(1)+s.charAt(0);
    }

    public String convertName(String s){
        String first = (s.substring(s.indexOf(",")+1)).trim();
        String last = (s.substring(0, s.indexOf(","))).trim();
        return first+" "+last;
    }

    public String negative(String s){
        s = s.replace("1", "3");
        s = s.replace("0", "1");
        return s.replace("3", "0");
    }

    public String convertDate(String datestr){
        int slash = datestr.indexOf("/");
        int slash1 = datestr.lastIndexOf("/");
        return datestr.substring(slash+1,slash1)+"-"+datestr.substring(0, slash)+"-"+datestr.substring(slash1+1);
    }

    // public String convertDate2(String datestr){

    // }
    public static void main(String[] args) {
        StringsExercises se = new StringsExercises();
        System.out.println("Scrolls");
        System.out.println(se.scroll("Hello World"));
        System.out.println(se.scroll("happy"));
        System.out.println(se.scroll("h"));
        System.out.println("\nconvertName");
        System.out.println(se.convertName(" Reubenstein, Lori Renee "));
        System.out.println(se.convertName("Biden,Joe"));
        System.out.println(se.convertName("the Clown, Bozo"));
        System.out.println("negative\n");
        System.out.println(se.negative("0010111001"));
        System.out.println(se.negative("11111111"));
        System.out.println("04/20/2014 becomes " + se.convertDate("04/20/2014"));
        // System.out.println("04/20/2014 becomes" + convertDate2("04/20/2014"));
        // System.out.println("4/20/2014 becomes" + convertDate2("4/20/2014"));
        // System.out.println("04/2/2014 becomes" + convertDate2("04/2/2014"));
        // System.out.println("4/2/2014 becomes" + convertDate2("4/2/2014"));
        // System.out.println("\nstartsWith");
        // System.out.println(startsWith("architecture", "arch"));
        // System.out.println(startsWith("architecture", "a"));
        // System.out.println(startsWith("arch", "architecture"));
        // System.out.println(startsWith("architecture", "rch"));
        // System.out.println(startsWith("architecture", "architecture"));
        // System.out.println("\nendsWith");
        // System.out.println(endsWith("astronomy", "nomy"));
        // System.out.println(endsWith("astronomy", "y"));
        // System.out.println(endsWith("astronomy", "nom"));
        // System.out.println(endsWith("nomy", "astronomy"));
        // System.out.println(endsWith("astronomy", "astronomy"));
        // System.out.println("\nremoveTag");
        // System.out.println(removeTag("<b>Hello World</b>", "b"));
        // System.out.println(removeTag("<b>Hello World</b>", "head"));
        // System.out.println(removeTag("Hello World</b>", "b"));
        // System.out.println(removeTag("<b>Hello World", "b"));
        // System.out.println(removeTag("</img>Hello World<img>", "img"));
        // System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        // System.out.println(removeTag("<title>Hello World</title> Happy Birthday",
        // "title"));
        // System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
    }
}