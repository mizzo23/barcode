package barcodepackage;

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
    * @author James Meaden
    */
   public DataMatrix()
   {
      image = new BarcodeImage();
      text = "";
      actualWidth = 0;
      actualHeight = 0;
   }
   
   /**
    * Dependencies: Scan()
    * 
    * @param image Dependent on Scan
    * @author James Meaden
    */
   public DataMatrix(BarcodeImage image)
   {
      this.image = image; //set Class variable image to argument value image
      scan(this.image);
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
    * @return int
    * @author James Meaden
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
    * @author Josiah Sanchez
    */
   private int computeSignalWidth()
   {
      int signalWidth = 0;
      
      //iterate through bottom row of array
      for (int x = 0; x < actualWidth; x++)
      {
         /*
          * need to get the pixel on the bottom row of the array
          * (assuming that it is already situated at bottom of array)
          * if true, we add to the signal width. We use the final row in the
          * array, because it is our closed limitation line, consisting only of
          * true values (located in last row). Hence the constant actualHeight.
          * 
          * getPixel(int row, int col)
          */
         if (image.getPixel(actualHeight, x))
         {
            signalWidth++;
         }
      }
      
      return signalWidth; //stub
   }
   
   /**
    * Dependencies: None, but testing will be aided by a BarcodeImage that has
    * its spine properly situated in bottom left corner, which can be created 
    * manually or by using clone() on the example strings
    * 
    * @author Josiah Sanchez
    */
   private int computeSignalHeight()
   {
      int signalHeight = 0;
      
      for (int x = 0; x < actualHeight; x++)
      {
         /*
          * If the pixel in the first position of each row is true,
          * we can then add to the height of the signal. We only need to 
          * check the closed limitation lines for this method, hence the 
          * constant 0 in image.getPixel(x, 0)
          * coming from the method getPixel(int row, int col).
          */
         if (image.getPixel(x, 0))
            signalHeight++;
      }
      
      return signalHeight;
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
    * @author Josiah Sanchez
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
    * @author James Meaden
    */
   public void displayImageToConsole()
   {
      int borderWidth = image.MAX_WIDTH + 2; //add 2 for the side bars
      int borderHeight = image.MAX_HEIGHT + 2;//add 2 for the top bars
            
      //Print top border
      for (int x = 0; x < borderWidth ; x++)
      {
         System.out.print("-");
      }
      //Outer loop controls what row is being printed
      for (int y = 0; y < borderHeight; y++)
      {
         System.out.print("|");//print leading left bar border
         
         //Inner loop will print the values of the image for the row
         for (int z = 0; z < borderWidth; z++)
         {
            System.out.print(image.getPixel(y, z));
         }
         
         System.out.print("|");//print trailing right bar
      }
      //Print bottom border
      for (int w = 0; w < borderWidth ; w++)
      {
         System.out.print("-");
      }  
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
