
public class DataMatrix implements BarcodeIO
{
   public static final char BLACK_CHAR = '*';
   public static final char WHITE_CHAR = ' ';
   private BarcodeImage image = null;
   private String text = null;
   private int actualWidth = 0;
   private int actualHeight = 0;
   
   /**
    * Dependencies: Default BarcodeImage constructor, readText()
    * 
    * @author Person 1
    */
   public DataMatrix()
   {
      
   }
   
   /**
    * Dependencies: Scan()
    * 
    * @param image
    * @author Dependent on Scan
    */
   public DataMatrix(BarcodeImage image)
   {
      
   }
   
   /**
    * Dependencies: readText()
    * 
    * @author
    */
   public DataMatrix(String text)
   {
      
   }
   
   /**
    * Dependencies: None
    * 
    * @return
    * @author
    */
   public int getActualWidth()
   {
      return actualWidth; //stub
   }
   
   /**
    * Dependencies: None
    * 
    * @return
    * @author
    */
   public int getActualHeight()
   {
      return actualHeight; //stub
   }
   
   /**
    * Dependencies: None, but testing will be aided by a BarcodeImage that has
    * its spine properly situated in bottom left corner, which can be created 
    * manually or by using clone() on the example strings
    * 
    * @return
    * @author
    */
   private int computeSignalWidth()
   {
      return 0; //stub
   }
   
   /**
    * Dependencies: None, but testing will be aided by a BarcodeImage that has
    * its spine properly situated in bottom left corner, which can be created 
    * manually or by using clone() on the example strings
    * 
    * @author
    */
   private int computeSignalHeight()
   {
      
   }
   
   /**
    * Dependencies: clone(), cleanImage(), computeSignalWidth(), 
    * computeSignalHeight()
    * 
    * @author
    */
   public boolean scan(BarcodeImage bc)
   {
      // TODO Auto-generated method stub
      return false;
   }

   /**
    * Dependencies: None
    * 
    * @author
    */
   public boolean readText(String text)
   {
      // TODO Auto-generated method stub
      return false;
   }

   /**
    * Dependencies: WriteChartoCol()
    * 
    * @author
    */
   public boolean generateImageFromText()
   {
      // TODO Auto-generated method stub
      return false;
   }

   /**
    * Dependencies: readCharFromCol(int col)
    * Also, testing will be aided by a BarcodeImage that has
    * its spine properly situated in bottom left corner, which can be created 
    * manually or by using clone() on the example strings
    * 
    * @author
    */
   public boolean translateImageToText()
   {
      // TODO Auto-generated method stub
      return false;
   }

   /**
    * Dependencies: None
    * 
    * @author
    */
   public void displayTextToConsole()
   {
      // TODO Auto-generated method stub
      
   }

   /**
    * Dependencies: None, but testing will be aided by a BarcodeImage that has
    * its spine properly situated in bottom left corner, which can be created 
    * manually or by using clone() on the example strings
    * 
    * @author
    */
   public void displayImageToConsole()
   {
      // TODO Auto-generated method stub
      
   }
   
   /**
    * Dependencies: moveimageToLowerLeft(), shiftImageDown(), shiftImageLeft()
    * 
    * @author Nathan Huven
    */
   private void cleanImage()
   {
      
   }
   
   /**
    * 
    * @param col
    * @return
    * @author
    */
   private char readCharFromCol(int col)
   {
      return 'f'; //stub
   }
   
   /**
    * 
    * @param col
    * @param code
    * @return
    * @author
    */
   private boolean WriteCharToCol(int col, int code)
   {
      return false; //stub
   }
   
   /**
    * Dependencies: None
    * 
    * @author
    */
   public void displayRawImage()
   {
      
   }
   
   /**
    * Dependencies: None
    * 
    * @author
    */
   private void clearImage()
   {
      
   }

}
