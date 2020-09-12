package programs;
class CountTheWords
{
    public static void main(String[] args)
    {
        String str="Naga Ganjala is a good boy"; 
        String[] words = str.trim().split(" "); 
        System.out.println("-------OUTPUT---------");
        System.out.println("Number of words in the string = "+words.length);
    }
}