package com.yali.day18;

public class Recap {
	interface GenericMap{
		int size();
	}
	interface Map extends GenericMap{

	}

	abstract class AbstractGenericMap implements Map {

	}

	abstract class AbstractMap extends AbstractGenericMap {
		
	}

	class HashMap extends AbstractMap {

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

	}
}

