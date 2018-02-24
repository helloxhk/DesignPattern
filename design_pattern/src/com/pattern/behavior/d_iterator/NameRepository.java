package com.pattern.behavior.d_iterator;

/**
 * 名字集合
 * @author xhk
 * @date 2018年2月24日
 */
public class NameRepository implements Container{
	
	private String[] names = {"tom","jerry","jack","mary"};
	
	@Override
	public Iterator iterator() {
		return new Itr();
	}
	
	private class Itr implements Iterator {

		private int index;
		
		@Override
		public boolean hasNext() {
			if(index < names.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(index < names.length){
				return names[index++];
			}
			return null;
		}
		
	}

}
