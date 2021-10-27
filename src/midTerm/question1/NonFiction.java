package midTerm.question1;

public class NonFiction extends Book implements iBorrowable{

    private int borrowDay;
    private int returnDay;

    public NonFiction() {
    }

    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String Description() {
        return "Anne Frank all events are true and based on real facts";
    }

    @Override
    public void setBorrowDate(int day) {
        borrowDay = day;
    }

    @Override
    public void setReturnDate(int day) {
        returnDay = day;
    }

    @Override
    public boolean isAvailable(int day) {
        if(day > returnDay && day < borrowDay){
            return true;
        }else{
            return false;
        }
    }
}
