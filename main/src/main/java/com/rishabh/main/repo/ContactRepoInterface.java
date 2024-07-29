package com.rishabh.main.repo;

import java.util.List;

import com.rishabh.main.domain.Contact;

public interface ContactRepoInterface {
	public List<Contact> getAllContact(int userId);
}
