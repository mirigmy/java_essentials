package src1.tareas;

public	class BookStorage {
	  public static void main(String [] args) {


	    Books[] myBooks = new Books[3];
	    int x = 0;
	    myBooks[0] = new Books();
	    myBooks[1] = new Books();
	    myBooks[2] = new Books();
	    myBooks[0].title = "The Lord of the Ring";
	    myBooks[1].title = "Harry Potter";
	    myBooks[2].title = "The Count of Monte Cristo";
	    myBooks[0].author = "Tolkien";
	    myBooks[1].author = "JR Rowling";
	    myBooks[2].author = "Alexander Dumas";


	    while (x < 3) {
	      System.out.print(myBooks[x].title);
	      System.out.print(" by ");
	      System.out.println(myBooks[x].author);
	      x = x + 1;
	    }
	  }
	}