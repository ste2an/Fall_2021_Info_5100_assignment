package midTerm.question1;

public class Fiction extends Book implements iBorrowable{

    private int borrowDay;
    private int returnDay;

    public Fiction() {
    }

    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public boolean isAvailable(int day) {
        if(day > returnDay && day < borrowDay){
            return true;
        }else{
            return false;
        }
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
    public String Description() {
        return "Frankenstein all events are imaginary and not based on real facts";
    }
}
