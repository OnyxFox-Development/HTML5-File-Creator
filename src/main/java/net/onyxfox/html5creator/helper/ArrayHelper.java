package net.onyxfox.html5creator.helper;

import java.util.ArrayList;

public class ArrayHelper
{
	private ArrayList array;

	public ArrayHelper ( String... values )
	{
		for ( int i = 0; i < values.length; i++ )
		{
			this.array = new ArrayList< String >();
			this.array.add( i, values[ i ] );
		}
	}

	public boolean contains ( Object value )
	{
		for ( Object item : array )
		{
			if ( item.equals( value ) )
			{
				return true;
			}
		}
		return false;
	}

	public Object[] toArray ()
	{
		return this.array.toArray();
	}
}
