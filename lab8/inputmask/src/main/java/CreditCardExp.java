/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler {

	private IKeyEventHandler nextHandler;
	private String date = "";
	private IDecorator wrapped = null;

	public void setNext(IKeyEventHandler next) {
		this.nextHandler = next;
	}

	public void wrapDecorator(IDecorator w) {
		this.wrapped = w;
	}

	public String display() {
		if (date.equals(""))
			return "[MM/YY]" + "  ";
		else
			return "[" + wrapped.setFormatting(date) + "]" + "  ";
	}

	public void key(String ch, int cnt) {
		if (cnt >= 17 && cnt <= 20) {
			ch = ch.trim();
			if (!ch.equals("x") && !ch.equals("X")) {
				date += ch;
			} else if (date.length() > 0) {
				date = date.substring(0, date.length() - 1);
			}
		}

		else if (nextHandler != null)
			nextHandler.key(ch, cnt);
	}

	public void addSubComponent(IDisplayComponent c) {
		return; // do nothing
	}

}