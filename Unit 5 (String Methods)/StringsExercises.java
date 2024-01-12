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

    public String convertDate2(String datestr){
        int slash = datestr.indexOf("/");
        int slash1 = datestr.lastIndexOf("/");
        return datestr.substring(slash+1,slash1)+"-"+datestr.substring(0, slash)+"-"+datestr.substring(slash1+1);
    }

    public boolean startsWith(String s, String prefix){
        if(s.indexOf(prefix) == 0) return true;
        return false;
    }

    public boolean endsWith(String s, String Suffix){
        if(s.length()<Suffix.length()) return false;
        return Suffix.equals(s.substring(s.length()-Suffix.length()));
    }

    public String removeTag(String s, String tag){
        int firstTag = s.indexOf("<"+tag+">");
        int secTag = s.indexOf("</"+tag+">");
        if (firstTag == -1||secTag==-1) return s;
        if (firstTag >= secTag) return s;
        return s.substring(firstTag+tag.length()+2, secTag);
    }
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
        System.out.println("\nnegative");
        System.out.println(se.negative("0010111001"));
        System.out.println(se.negative("11111111"));
        System.out.println("\nconvertDate2");
        System.out.println("04/20/2014 becomes " + se.convertDate("04/20/2014"));
        System.out.println("04/20/2014 becomes " + se.convertDate2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + se.convertDate2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + se.convertDate2("04/2/2014"));
        System.out.println("4/2/2014 becomes " + se.convertDate2("4/2/2014"));
        System.out.println("\nstartsWith");
        System.out.println(se.startsWith("architecture", "arch"));
        System.out.println(se.startsWith("architecture", "a"));
        System.out.println(se.startsWith("arch", "architecture"));
        System.out.println(se.startsWith("architecture", "rch"));
        System.out.println(se.startsWith("architecture", "architecture"));
        System.out.println("\nendsWith");
        System.out.println(se.endsWith("astronomy", "nomy"));
        System.out.println(se.endsWith("astronomy", "y"));
        System.out.println(se.endsWith("astronomy", "nom"));
        System.out.println(se.endsWith("nomy", "astronomy"));
        System.out.println(se.endsWith("astronomy", "astronomy"));
        System.out.println("\nremoveTag");
        System.out.println(se.removeTag("<b>Hello World</b>", "b"));
        System.out.println(se.removeTag("<b>Hello World</b>", "head"));
        System.out.println(se.removeTag("Hello World</b>", "b"));
        System.out.println(se.removeTag("<b>Hello World", "b"));
        System.out.println(se.removeTag("</img>Hello World<img>", "img"));
        System.out.println(se.removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(se.removeTag("<title>Hello World</title> Happy Birthday",
        "title"));
        System.out.println(se.removeTag("Happy <b>Hello World</b> Birthday", "b"));
    }
}