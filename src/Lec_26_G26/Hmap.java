package Lec_26_G26;

public class Hmap<K,V> {
	class Node<K,V>{
		K key;
		V val;
		Node next;
		Node(K key,V val){
			this.key=key;
			this.val=val;
		}
		Node(){
			
		}
	}
	Node [] arr;
	int size;
	Hmap(){
		this.arr=new Node[4];
	}
	Hmap(int n) {
		this.arr=new Node[n];
	}
	
//	put
	public void put(K key,V val) {
		int bn=hashfun(key);
		Node temp=arr[bn];
		while(temp!=null) {
			if(temp.key.equals(key)) {
				temp.val=val;
				return;
			}
			temp=temp.next;
		}
		Node nn=new Node(key,val);
		nn.next=arr[bn];
		arr[bn]=nn;
		size++;
	}
	private int hashfun(K key) {
		int bn=key.hashCode();
		bn%=arr.length;
		if(bn<0) {
			bn+=arr.length;
		}
		return bn;
	}
	
//	get
	public V get(K key) {
		int bn=hashfun(key);
		Node temp=arr[bn];
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return (V)(temp.val);
			}
			temp=temp.next;
		}
		return null;
	}
//	containsKey
	public boolean containsKey(K key) {
		int bn=hashfun(key);
		Node temp=arr[bn];
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
//	remove
	public V remove(K key) {
		
	}
	
	
}
