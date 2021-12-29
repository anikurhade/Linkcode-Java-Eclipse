package Node;


public class MyLinkedlist {
	node head;
	  class node {
		int data;
		node next;
		public node(int data) {
			super();
			this.data = data;
			
		}
	  }

public MyLinkedlist create(MyLinkedlist a,int data)
{
	
	node new_node=new node(data);
	new_node.next=null;
	if(a.head==null)
	{
		a.head=new_node;
	}
	else
	{
	node curr=a.head;
	while(curr.next!=null)
	{
	 curr=curr.next;
	}
	curr.next=new_node;
	}
return a;
	
	
}
public void display(MyLinkedlist l)
{
	node curr=l.head;
	while(curr!=null)
	{
		System.out.print("\t"+curr.data);
		curr=curr.next;
	}
}

public MyLinkedlist insertfirst(MyLinkedlist a,int data)
{
	node curr=a.head;
	node first=new node(data);
	first.next=curr;
	a.head=first;
	return a;
}
public MyLinkedlist insertend(MyLinkedlist a,int data)
{
	node curr=a.head;
	while(curr.next!=null)
	{
		curr=curr.next;
		
	}
	node newn=new node(data);
	curr.next=newn;	
   return a;	
}

public MyLinkedlist insertmid(MyLinkedlist a,int data,int pos)
{
	node curr=a.head;
	int count=0;
	node prev=null;
	while(curr.next!=null)
	{
		if(pos>2)
		{	
		if(count==(pos-2))
		{
			break;
		}
		else
		{
		curr=curr.next;
		++count;
		}
		}
		else
		{
			if(count==(pos-1))
			{
				break;
			}
			else
			{
				prev=curr;
			curr=curr.next;
			++count;
			}
		}
	}
	if(curr.next==null)
	{
		System.out.println("Not Inserted");
	}	
	else {	
	node newn=new node(data);
	prev.next=newn;
	newn.next=curr;
	System.out.println("Record Inserted At Middle");
	}
   return a;	
}

public boolean  Deltestart(MyLinkedlist a)
{
	boolean retdel=true;
	node curr=a.head;
	curr=curr.next;
	a.head=curr;
		
			
	return retdel;
}
public boolean  Delteend(MyLinkedlist a)
{
	boolean retdel=true;
	node curr=a.head;
	int nodecont=0;
	int totconunt=getnodecount(a);
	while(curr.next!=null)
	{
		if(nodecont==totconunt-1)
		{
			break;
		}
		else
		{
			curr=curr.next;
			nodecont++;
		}
	}
	curr.next=null;
return retdel;
}
public boolean  Deltemid(MyLinkedlist a,int pos)
{
	boolean retdel=true;
	node curr=a.head;
	node prev=null;
	int nodecont=0;
	if(pos>1)
	{
		Deltestart(a);
		
	}
	else
	{
	while(curr.next!=null)
	{
		if(nodecont==pos-1)
		{
			break;
		}
		else
		{
			prev=curr;
			curr=curr.next;
			nodecont++;
		}
	}
	}
	
	prev.next=curr.next;
	
return retdel;
}


public int getnodecount(MyLinkedlist a)
{
int count=0;
node curr= a.head;
while(curr.next!=null)
{
	count++;
	curr=curr.next;
	}
return count;
}

public int linearsearch(int data)
{
int pos=-1;

return pos;
}



}

