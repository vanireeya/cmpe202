/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler {

	private IKeyEventHandler nextHandler;
	private String number = "";
	private IDecorator wrapped = null;

	public void wrapDecorator(IDecorator w) {
		this.wrapped = w;
	}

	public void setNext(IKeyEventHandler next) {
		this.nextHandler = next;
	}

	public String display() {
		if (number.equals(""))
			return "[4444 4444 4444 4444]" + "  ";
		else
			return "[" + wrapped.setFormatting(number) + "]" + "  ";
	}

	public void key(String ch, int cnt) {
		if (cnt <= 16) {
			ch = ch.trim();
			if (!ch.equals("x") && !ch.equals("X")) {
				number += ch;
			} else if (number.length() > 0) {
				number = number.substring(0, number.length() - 1);
			}
		} else if (nextHandler != null) {
			nextHandler.key(ch, cnt);
		}
	}

	public void addSubComponent(IDisplayComponent c) {
		return; // do nothing
	}

}