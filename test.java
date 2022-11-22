package calisma;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OurLL ourLL = new OurLL();
		ourLL.deletehead();
		ourLL.Display();
		System.out.println(" insertfirst");
		ourLL.insertfirst(2);
		ourLL.Display();
		System.out.println("deletehead ");
		ourLL.deletehead();
		ourLL.Display();
		System.out.println(" insertfirst");
		ourLL.insertfirst(4);
		ourLL.insertfirst(6);
		ourLL.Display();
		System.out.println(" insertLast");
		ourLL.insertLast(22);
		ourLL.Display();
		System.out.println(" insert Index ");
		ourLL.insertIndex(-1,0);
		ourLL.Display();
		System.out.println(" insert Index ");
		ourLL.insertIndex(555,33);
		ourLL.Display();
		System.out.println(" insert Index");
		ourLL.insertIndex(7,5);
		ourLL.Display();
		System.out.println("delete head ");
		ourLL.deletehead();
		ourLL.Display();
		System.out.println("delete last");
		ourLL.deletelast();
		ourLL.Display();
		System.out.println("delete index 2");
		ourLL.deleteindex(2);
		ourLL.Display();
		System.out.println("delete number 6");
		ourLL.deletedata(22);
		ourLL.Display();
		ourLL.insertfirst(22);
		ourLL.insertfirst(22);
		ourLL.insertLast(22);
		ourLL.insertIndex(22,5);
		ourLL.Display();
		ourLL.deleteAllSameData(22);
		ourLL.Display();
	}

}
