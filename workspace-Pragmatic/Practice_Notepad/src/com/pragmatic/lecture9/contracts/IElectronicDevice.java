package com.pragmatic.lecture9.contracts;

public interface IElectronicDevice extends INotepad{
	void start();
	void stop();
	boolean isStarted();
}
