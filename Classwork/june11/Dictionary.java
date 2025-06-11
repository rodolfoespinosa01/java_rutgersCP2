public class Dictionary extends Book
{
    private int definitions = 52500;
    
    public void setDefinitions(int numDef)
   {
       definitions = numDef;
   }
   public int getDefinitions()
   {
       return definitions;
   }
   public double computeRatio()
   {
       double rate = (double)definitions/pages;
       return rate;
   }
}
