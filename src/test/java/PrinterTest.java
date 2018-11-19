import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }

    //    Create a Printer class that has a property for number of sheets of paper left.
    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPages());
    }

    //    Add a method to print that takes in a number of pages to be printed and number of copies to print.

    @Test
    public void calculatesPagesNeeded(){
        assertEquals(25, printer.pagesNeeded(5, 5));
    }

    //    The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.

//    Method - returns string 'can print' /can't print - tests if can print and calls print
    @Test
    public void confirmPrinterCanPrint(){
        assertEquals("printing", printer.confirmPrint(5, 5));
    }

    @Test
    public void confirmPrinterCannotPrint(){
        Printer lowPaper = new Printer(20);
        assertEquals("not enough paper", lowPaper.confirmPrint(5, 5));
    }


//    Prints - decreases paper by pages * copies
    @Test
    public void printerPrints(){
        assertEquals(75, printer.print(5, 5));
    }

    @Test
    public void printerDoesntPrint(){
        Printer lowPaper = new Printer(45);
        assertEquals(45, lowPaper.print(5, 10));
    }


    //    Create a method to refill the printer paper.

   @Test
    public void refillPrinter(){
        Printer lowPaper = new Printer(45);
        assertEquals(100, printer.refill());
    }

/*
    //    Add a toner volume property to the class.

    @Test
    public void printerHasToner(){
    assertEquals(100, printer.getToner());
    }

        @Test
    public void decreaseToner(){
        assertEquals(75, printer.print(5, 5));
    }


     */

    //    Modify the printer so that it reduces the toner by 1 for each page printed.








}
