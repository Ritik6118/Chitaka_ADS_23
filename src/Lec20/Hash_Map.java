package Lec20;

public class Hash_Map<K,V> {
	class Node<K,V>{
		K key;
		V val;
		Node next;
		
		Node(){
			
		}
		Node(K key,V val){
			this.key=key;
			this.val=val;
		}
	}
	Node[] arr;
	int size;
	public int hashfun(K key) {
		int n=key.hashCode();
		n%=arr.length;
		if(n<0) {
			n+=arr.length;
		}
		return n;
	}
	public void put(K key,V val) {
		int n=hashfun(key);
		Node temp=arr[n];
		while(temp!=null) {
			if(temp.key.equals(key)) {
				temp.val=val;
				return;
			}
			temp=temp.next;
		}
		Node nn=new Node(key,val);
		nn.next=arr[n];
		arr[n]=nn;
		size++;
		double thf=2.0;
		double lf=(size*1.0)/arr.length;
		if(lf>thf) {
			rehashing();
		}
		
	}
	private void rehashing() {
		// TODO Auto-generated method stub
		Node[] oa=arr;
		Node[] na=new Node[oa.length*2];
		this.arr=na;
		for(Node n:oa) {
			while(n!=null) {
				this.put((K)n.key, (V)n.val);
				n=n.next;
			}
		}
	}
	public boolean containsKey(K key) {
		int n=hashfun(key);
		Node temp=arr[n];
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	public V get(K key) {
		int n=hashfun(key);
		Node temp=arr[n];
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return (V)temp.val;
			}
			temp=temp.next;
		}
		return null;
	}
	public void remove(K key) {
		int n=hashfun(key);
		Node curr=arr[n];
		Node prev=null;
		while(curr!=null) {
			if(curr.key.equals(key)) {
				break;
			}
			prev=curr;
			curr=curr.next;
		}
		if(curr==null) {
			return;
		}
		if(prev==null) {
			arr[n]=curr.next;
			curr.next=null;
		}
		else {
			prev.next=curr.next;
			curr.next=null;
		}
		size--;	
	}
	
	@Override
	public String toString() {
		String s="";
		for(Node n:arr) {
			while(n!=null) {
				s+=n.key+" "+n.val+" /n";
				n=n.next;
			}
		}
		return s;
		
	}
	
	
}
