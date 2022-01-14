package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Contact;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/contact")
@Slf4j
public class ContactController {
	
	ConcurrentHashMap<String, Contact> contacts = new ConcurrentHashMap<>();
	
	@GetMapping
	public List<Contact> getAllContacts() {
		
		ArrayList<Contact> list = new ArrayList<>(contacts.values());
		
		log.info("Contacts list : " + list);
		
		return list;
		
	}

	@GetMapping("/{id}")
	public Contact getContactById(@PathVariable String id) {
		
		Contact contact = contacts.get(id);
		
		log.info("Fetched Contact : " + contact);
		
		return contact;
		
	}
	
	@PostMapping()
	public Contact addContact(@RequestBody Contact contact) {
		
		log.info("Contact added : " + contact);
		
		return contacts.put(contact.getId(), contact);
		
	}
}
