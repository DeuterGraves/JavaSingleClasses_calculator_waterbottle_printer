public class Printer {
    private int pages;


    public Printer(int pages){
        this.pages = pages;
    }


    public int getPages() {
        return pages;
    }

    public int pagesNeeded(int pages, int copies) {
        return pages * copies;
    }

    public String confirmPrint(int pages, int copies) {
        int pagesNeededToPrint = this.pagesNeeded(pages, copies);
        if (pagesNeededToPrint <= this.pages){
            return "printing";
        }
        return "not enough paper";
    }

    public int print(int pages, int copies) {
        int pagesNeededtoPrint = this.pagesNeeded(pages, copies);
        if (pagesNeededtoPrint <= this.pages) {
            return this.pages - pagesNeededtoPrint;
        }
        return this.pages;
    }
}
