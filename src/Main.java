public class Main {
    public static void main(String[] args) {
        //Given two Strings determine if they are Anagrams -> Are built of the same characters:

        String str1 = "listen";
        String str2 = "silent";

        for (int i = 0; i < str1.length();i++){
            str2 = str2.replaceFirst("" + str1.charAt(i) ,"");

        }
        System.out.println(str2.isEmpty()? "Anagram" : "Not Anagram");

}
}