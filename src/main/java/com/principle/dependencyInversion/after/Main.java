package com.principle.dependencyInversion.after;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message again");
		Formatter jsonFormatter = new JSONFormatter();
		PrintWriter fileWriter = new PrintWriter(new FileWriter("test_msg.txt"));
		MessagePrinter printer = new MessagePrinter();
		printer.writeMessage(msg, jsonFormatter, fileWriter);
		Formatter textFormatter = new TextFormatter();
		PrintWriter consoleWriter = new PrintWriter(System.out);
		printer.writeMessage(msg, textFormatter, consoleWriter);
	}

}
