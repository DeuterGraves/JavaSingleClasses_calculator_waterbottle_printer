public class Printer {
    private int pages;
    private int toner;


    public Printer(int pages, int toner){
        this.pages = pages;
        this.toner = toner;
    }


    public int getPages() {
        return pages;
    }


    public int getToner() {
        return toner;
    }


    public int pagesNeeded(int pages, int copies) {
        return pages * copies;
    }

    public boolean confirmPrint(int pages, int copies) {
        int pagesNeededToPrint = this.pagesNeeded(pages, copies);
        if ((pagesNeededToPrint <= this.pages) && (pagesNeededToPrint <= this.toner)){
            return true;
        }
        return false;
    }

    public int decreasePaper(int pages, int copies){
        int used = this.pagesNeeded(pages, copies);
        return this.pages - used;
    }

    public void print(int pages, int copies) {
        if (confirmPrint(pages, copies)){
            this.toner = this.decreaseToner(pages, copies);
//            write a decrease paper - put  a test in for it.
            this.pages = this.decreasePaper(pages, copies);
        }

    }

    public int refillPaper() {
        int pagesNeededtoFill = 100 - this.pages;
        return this.pages + pagesNeededtoFill;
    }

    public int decreaseToner(int pages, int copies) {
        int tonerNeeded = pages * copies;
        return this.toner - tonerNeeded;
    }

    public int refillToner() {
        int tonerNeeded = 1000 - this.toner;
        return this.toner + tonerNeeded;
    }
}
