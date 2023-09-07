package com.nissan.interfaces;

import java.util.ArrayList;

import com.nissan.model.bookData;

public interface books {
	public boolean add(ArrayList<bookData> lib,bookData bookdata );
	public boolean getDetails(ArrayList<bookData> lib);
	public void listBooks(ArrayList<bookData> lib);
}
