//======================================================================================================================
public class Kindle {
//----------------------------------------------------------------------------------------------------------------------
    private int currentPage, totalPages;

    public Kindle() {
        currentPage = 1;
    }
//----------------------------------------------------------------------------------------------------------------------
    public Kindle(int pagesInput) {
        totalPages = pagesInput;
        currentPage = 1;
    }
//----------------------------------------------------------------------------------------------------------------------
    public int turnPages() {
        if (currentPage + 1 > totalPages) {
            System.out.println("Turning 1 page would take you past the end of the book.");
            currentPage = totalPages;
        }
        else {
            ++currentPage;
        }
        return(currentPage);
    }
//----------------------------------------------------------------------------------------------------------------------
    public int turnPages(int pagesRead) {
        if (totalPages - currentPage < pagesRead) {
            System.out.println("Turning " + pagesRead + " pages would take you past the end of the book.");
            currentPage = totalPages;
            System.out.print("You are now on             : Page " + currentPage + " of " + totalPages);
        }
        else {
            currentPage += pagesRead;
        }
        return(currentPage);
    }
//----------------------------------------------------------------------------------------------------------------------
    public String toString() {
        return("Page " + currentPage + " of " + totalPages);
    }
//----------------------------------------------------------------------------------------------------------------------
}
//======================================================================================================================
