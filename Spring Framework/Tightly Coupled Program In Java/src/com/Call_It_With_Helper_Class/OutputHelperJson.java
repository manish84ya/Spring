package com.Call_It_With_Helper_Class;

import com.TightlyCoupled.IOutputGenerator;
import com.TightlyCoupled.JsonOutputGenerator;

public class OutputHelperJson {
	IOutputGenerator obj;
public OutputHelperJson()
{
obj=new JsonOutputGenerator();	
}
public void generateOutput(){
	obj.generateOutput();
}



}
