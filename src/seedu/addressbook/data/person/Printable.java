package seedu.addressbook.data.person;

public interface Printable {

    /**
     * Returns a printable strings of object.
     */
    String getPrintableString();

    /**
     * Returns a concatenated version of the printable strings of each object.
     * @Param printables, a bunch of printables that are ready for display
     */
    default String getPrintableString(Printable... printables){
        String result = "";
        for (Printable p: printables) {
            result += p.getPrintableString() + ", ";
        }
        return result.substring(0, result.length()-1);
    }

}
