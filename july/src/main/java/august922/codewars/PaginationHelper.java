package august922.codewars;

import java.util.*;

/*
PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        helper.pageCount(); //should == 2
        helper.itemCount(); //should == 6
        helper.pageItemCount(0); //should == 4
        helper.pageItemCount(1); // last page - should == 2
        helper.pageItemCount(2); // should == -1 since the page is invalid

// pageIndex takes an item index and returns the page that it belongs on
        helper.pageIndex(5); //should == 1 (zero based index)
        helper.pageIndex(2); //should == 0
        helper.pageIndex(20); //should == -1
        helper.pageIndex(-10); //should == -1
*/

public class PaginationHelper<I> {

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    private List<I> items = new ArrayList<>();
    private int numberOfPages;
    private SortedMap<Integer, List<I>> pages = new TreeMap<>();
    private int itemsPerPage;


    public PaginationHelper(List<I> collection, int itemsPerPage) {
        items.addAll(collection);
        this.itemsPerPage = itemsPerPage;
        numberOfPages = (int) Math.ceil((double) items.size() / itemsPerPage);

        for (int i = 0, j = 0; i < numberOfPages; i++, j += itemsPerPage) {
            if (i == numberOfPages - 1) {
                pages.put(i, items.subList(j, items.size()));
            }
            else {
                pages.put(i, items.subList(j, j + itemsPerPage));
            }
        }
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return items.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return numberOfPages;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (isPageIndex(pageIndex)) {
            return pages.get(pageIndex).size();
        }
        else {
            return -1;
        }
    }

    private boolean isPageIndex(int index) {
        return (index >= 0 && index < numberOfPages);
    }
    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (isItemIndex(itemIndex)) {
            return (int) Math.floor((double) itemIndex / itemsPerPage);
        }
        else {
            return -1;
        }
    }

    private boolean isItemIndex(int index) {
        return (index >= 0 && index < items.size());
    }
}