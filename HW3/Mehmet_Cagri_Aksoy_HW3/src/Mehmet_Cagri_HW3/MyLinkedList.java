/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mehmet_Cagri_HW3;

/**
 *
 * @author Mehmet Cagri Aksoy
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<AnyType> implements Iterable<AnyType> {

	private int theSize;
	private Node<AnyType> beginMarker;
	private Node<AnyType> endMarker;
	
	public int size(){
		return theSize;
	}
	
	public MyLinkedList(){
		clear();
	}
	
	private static class Node<AnyType>{
		public Node(AnyType d, Node<AnyType> p, Node <AnyType> n){
			data = d;
			prev = p;
			next = n;
		}
			public AnyType data;
			public Node<AnyType> prev;
			public Node<AnyType> next;
	}
	
	public AnyType remove(int idx){
		return remove(getNode(idx));
	}
	private AnyType remove(Node<AnyType> p){
		p.next.prev = p.prev;
		p.prev.next = p.next;
		theSize--;
		return p.data;
		
	}
	
	public boolean add( AnyType x){
		add(size(),x);
		return true;
	}
	
	public void add(int idx, AnyType x){
		addBefore(getNode(idx), x);
	}
	
	public void clear(){
		beginMarker = new Node<AnyType>(null, null, null);
		endMarker = new Node<AnyType>(null, beginMarker, null);
		beginMarker.next = endMarker;
		theSize = 0;
	}
	
	private Node<AnyType> getNode(int idx) {
		Node<AnyType> p = new Node<AnyType>(null,null,null);
		if(idx < 0 || idx > size())
			throw new IndexOutOfBoundsException();
		
		if(idx <= size() / 2){
			p = beginMarker.next;
			for(int i = 0; i < idx; i++)
				p = p.next;
		}
		
		if(idx > size() / 2){
			p = endMarker;
			for(int i = size(); i > idx; i--)
				p = p.prev;
		}
		return p;
	}
	
	public AnyType getNodeData(int idx){ 
		Node<AnyType> p;
		p = getNode(idx);
		return p.data;
	}
	
	private void addBefore(Node<AnyType> p, AnyType x){
		Node<AnyType> newNode = new Node<AnyType>(x,p.prev,p);
		newNode.prev.next = newNode;
		p.prev = newNode;
		theSize++;
	}
	
	
	public java.util.Iterator<AnyType> iterator(){
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator implements Iterator<AnyType>{
		
		private Node<AnyType> current = beginMarker.next;
		private boolean okToRemove = false;
		
		public boolean hasNext(){
			return current != endMarker;
		}
		
		public AnyType next(){
			if(!hasNext())
				throw new NoSuchElementException();
		 AnyType nextItem = current.data;
		 current = current.next;
		 okToRemove = false;
		 return nextItem;
		}
		
		public void remove(){
			if(okToRemove)
				throw new IllegalStateException();
			MyLinkedList.this.remove(current.prev);
			okToRemove = true;
		}
	}
	
}
