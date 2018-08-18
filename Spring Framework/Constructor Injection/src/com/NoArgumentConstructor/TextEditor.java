package com.NoArgumentConstructor;

public class TextEditor 
{
	SpellChecker spellChecker;
	public TextEditor(SpellChecker spellChecker)
	{
		this.spellChecker=spellChecker;
		System.out.println("Inside Text Editor Constructor");
	}
	public void spellCheck()
	{
		spellChecker.checkSpelling();
	}

}
