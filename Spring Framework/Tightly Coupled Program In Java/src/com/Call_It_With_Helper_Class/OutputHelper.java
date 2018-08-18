package com.Call_It_With_Helper_Class;

import com.TightlyCoupled.CsvOutputGenerator;
import com.TightlyCoupled.IOutputGenerator;

public class OutputHelper {
IOutputGenerator obj;
public OutputHelper()
{
	obj=new CsvOutputGenerator();
}
public void generateOutput(){
	obj.generateOutput();
}

}
