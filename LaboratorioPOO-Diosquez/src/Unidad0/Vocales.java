public class Vocales
{
    public static void main(String[] args)
    {
        int auxi = 0 ;
        String meme = "Ayer me compré muñecos de la marca ‘ToyCo’ por internet." ;
        for (int i = 0 ; i < meme.length() ; i++)
        {
            if ( meme.charAt(i) == 'a' || meme.charAt(i) == 'e' || meme.charAt(i) == 'i' || meme.charAt(i) == 'o' || meme.charAt(i) == 'u')
            {
                auxi += 1 ;
            }
        }
        System.out.println("Numero total de vocales " +auxi);
    }
}
