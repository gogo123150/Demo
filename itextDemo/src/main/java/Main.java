import iText.BookmarksOperation;
import pdfBox.Catalog;

import java.util.UUID;

/**
 * Created by zwxbest on 2018/3/1.
 */
public class Main {

    private static  BookmarksOperation bookmarks;
    public static void main(String[] args) throws Exception
    {

        //要修改的3个地方
        int offset=14;
        String  path="E:\\PDF\\Java\\Activiti";
        String filename="Activiti实战.pdf";


         path=path+"\\";
         bookmarks=new BookmarksOperation();
//        List<BookMark> bookMarks=BookMarkInput.read("bookmarks.txt",offset);
//        bookmarks.createBookmarks(bookMarks,path+filename,path+filename.replaceAll("\\.pdf","")+ UUID.randomUUID().toString()+".pdf");
         EditBookMarkToXYZ(path,filename);

    }

    public static void EditBookMarkToXYZ(String path,String filename) throws Exception
    {
                bookmarks.editBookmarks(path+filename,path+filename.replaceAll("\\.pdf","")+ UUID.randomUUID().toString()+".pdf");

    }

    //test pdfBox,now no use
    public static void test_pdfbox() throws Exception
    {
        String filename="E:\\PDF\\Node.js\\Node.js高级编程.pdf";
        Catalog catalog=new Catalog();
        catalog.OpenPdf(filename);
        catalog.AdjustCatalog();
    }

}
