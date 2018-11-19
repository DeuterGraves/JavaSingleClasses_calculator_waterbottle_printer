import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 1000);
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
//    change this to returning a boolean. then it can be used as part of the print method - if returns true, reduce toner and pages
    @Test
    public void confirmPrinterCanPrint(){
        assertEquals(true, printer.confirmPrint(5, 5));
    }

    @Test
    public void confirmPrinterCannotPrint(){
        Printer lowPaper = new Printer(20, 20);
        assertEquals(false, lowPaper.confirmPrint(5, 5));
    }

    //    Prints - decreases paper by pages * copies
    @Test
    public void printerUsesPaper(){
        assertEquals(75, printer.decreasePaper(5, 5));
    }

//    Prints - decreases paper by pages * copies
    @Test
    public void printerPrints(){
        printer.print(5,5);
        int pagesRemaining = printer.getPages();
        assertEquals(75, pagesRemaining);
    }

    @Test
    public void printerDoesntPrint(){
        Printer lowPaperPrinter = new Printer(45, 45);
        lowPaperPrinter.print(5, 10);
        int pagesRemaining = lowPaperPrinter.getPages();
        assertEquals(45, pagesRemaining);
    }

    @Test
    public void tonerUsedOnPrint(){
        printer.print(5,5);
        int tonerRemaining = printer.getToner();
        assertEquals(975, tonerRemaining);
    }

//    toner not used when no printing happens
    @Test
    public void noTonerUsedWhenNoPrint(){
        Printer lowPaperPrinter = new Printer(45, 145);
        lowPaperPrinter.print(5,10);
        int tonerRemaining = lowPaperPrinter.getToner();
        assertEquals(145, tonerRemaining);

    }
    //    Create a method to refill the printer paper.

   @Test
    public void refillPrinter(){
        Printer lowPaper = new Printer(45, 45);
        assertEquals(100, printer.refillPaper());
    }


    //    Add a toner volume property to the class.

    @Test
    public void printerHasToner(){
    assertEquals(1000, printer.getToner());
    }


    @Test
    public void decreaseToner(){
        assertEquals(975, printer.decreaseToner(5, 5));
    }

    @Test
    public void canRefillToner(){
        assertEquals(1000, printer.refillToner());
    }




    //    Modify the printer so that it reduces the toner by 1 for each page printed.








}
