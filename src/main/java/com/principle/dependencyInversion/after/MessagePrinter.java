package com.principle.dependencyInversion.after;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	public void writeMessage(Message msg, Formatter formatter, PrintWriter writer) throws FormatException {
		writer.println(formatter.format(msg)); //formats and writes message
		writer.flush();
	}
}
