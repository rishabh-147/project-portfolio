package com.rishabh.main.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rishabh.main.domain.Contact;
@Repository
public interface ContactRepoInterface {
	public List<Contact> getAllContact(int userId);
}
