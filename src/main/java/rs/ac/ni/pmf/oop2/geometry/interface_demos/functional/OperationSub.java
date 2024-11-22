package rs.ac.ni.pmf.oop2.geometry.interface_demos.functional;

import lombok.Value;

@Value
public class OperationSub implements Operation
{
	@Override
	public int compute(final int a, final int b)
	{
		return a - b;
	}

}
