package iText;

/**
 * Created by zwxbest on 2018/3/1.
 */
public class BookMark implements Comparable{
    private String title;
    private int num;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    @Override
    public int compareTo(Object o) {
        if(o.getClass().equals(this.getClass()))
        {

        }
        return 0;
    }
}
