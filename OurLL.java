package calisma;

public class OurLL {
	Node head;
	Node tail;
	
	
	public OurLL(){
		head=null;
		tail=null;
	}
	
	public void Display() {
		int nodeCount =0;
		Node cursor = head;
		while(cursor!=null) {
			nodeCount++;
			System.out.print(cursor.data+" ");
			cursor=cursor.next;
		}
		System.out.println("Node count is: "+nodeCount);
	}
	
	public boolean isEmpty() {
		if(head!=null&&tail!=null) return true;
		else return false;
	}
	public void insertfirst(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			//list not empty
			
			newNode.next=head;
			head=newNode;
		}
		else {
			// List empty
			
		head=newNode;
		tail=newNode;
		
		}
	}
	public void deletehead() {
		if(isEmpty()) {
			if(head==tail) {
				head=null;
				tail=null;
			} 
			else {
				Node newHead = head.next;
				head.next=null;
				head = newHead;
			}
		}
	}
	
	public void deletelast() {
		if(isEmpty()) {
			if(head==tail) {
				head=null;
				tail=null;
			} 
			else {
				Node cursor = head;
				while(cursor.next != tail) {
					cursor = cursor.next;
				}
				cursor.next=null;
				tail= cursor;
			}
		}
	}
	
	public void deletedata(int data) {
		if(isEmpty()) {
			if(head == tail) {
				if(head.data==data) {
					head = null;
					tail = null;
				}
			} else {
				if(head.data==data) {
					Node newHead = head.next;
					head.next=null;
					head=newHead;
				}
				else {
					Node cursor1 = null;
					Node cursor2 = head;
					while(cursor2 != null && cursor2.data != data) {
						cursor1 = cursor2;
						cursor2=cursor2.next;
						
					}
					if(cursor2 != null) {
						if(cursor2 == tail) {
							tail=cursor1;
							cursor1.next=null;
						}
						else {
							Node cursor3 = cursor2.next;
							cursor2.next=null;
							cursor1.next=cursor3;
						}
					}
				}
			}
			
		}
	}
//	public void boubleshort(){
//		if(!isEmpty()) {
//			System.out.println("EMPTY");
//		}
//		else if(head==tail) {
//			System.out.println("Listede tek eleman var");
//		} else {
//			
//		}
//	}
//	public boolean isbigger(Node first,Node second) {
//		if(first.data>= second.data) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	
	public void deleteAllSameData(int data) {
		if(isEmpty()) {
			if(head == tail) {
				if(head.data==data) {
					head = null;
					tail = null;
				}
			} 
				else {
					Node cursor1 = null;
					Node cursor2 = head;
					while(cursor2 != null) {
						if(cursor2.data==data) {
							if(head==cursor2) {
								head=cursor2.next;
								cursor2.next=null;
								cursor2=head;
							}
							else {
								if(cursor2 == tail) {
									tail=cursor1;
									cursor1.next=null;
									cursor2=null;
								}else {
									Node cursor3 = cursor2.next;
									cursor2.next=null;
									cursor1.next=cursor3;
									cursor2=cursor3;
								}
								
							}
						}
						else {
							cursor1 = cursor2;
							cursor2=cursor2.next;
						}
					}
			}
			
		}
	}
	public void deleteindex(int index) {
		if(isEmpty()&& index >= 0) {
			if(head == tail) {
				head= null;
				tail = null;
			}
			else {
				if(index == 0) {
					deletehead();
				}
				else {
					Node cursor1 = null;
					Node cursor2 = head;
					int temp=0;
					while(cursor2!=null && temp<index) {
						cursor1 = cursor2;
						cursor2 = cursor2.next;
						temp++;
					}
					if(cursor2 != null) {
						if(cursor2 == tail) {
							//sondan silme
							tail = cursor1;
							cursor1.next=null;
						}else {
							//ortadan silme
							Node cursor3 = cursor2.next;
							cursor2.next=null;
							cursor1.next = cursor3;
						}
					}
				}
			}
		}
	}
	
	public void insertIndex(int data, int index) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			if(index ==0) {
				//basa ekle
				insertfirst(data);
			}
			else {
				//ortaya ekle
				Node cursor1 = null;
				Node cursor2 = head;
				int oldindex=0;
				while(cursor2!=null && oldindex < index-1) {
					cursor1=cursor2;
					cursor2=cursor2.next;
					oldindex++;
				}
				if(cursor2==null) insertLast(data);
				else {
					newNode.next=cursor2;
					cursor1.next= newNode;
				}
			}
		}
		else {
			head=newNode;
			tail=newNode;
			
		}
	}
	public void insertLast(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			//list not empty
			tail.next=newNode;
			tail = newNode;
		}
		else {
			//list empty
			head=newNode;
			tail=newNode;
		}
	}

}
