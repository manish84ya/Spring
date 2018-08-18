package com.LooselyCouple;

import lombok.Getter;
import lombok.Setter;

public class OutputHelper {
@Getter
@Setter

IOutputGenerator obj;

public void generateOutput(){
	obj.generateOutput();
}
}
