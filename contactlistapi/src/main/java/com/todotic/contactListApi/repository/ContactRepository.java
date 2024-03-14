package com.todotic.contactListApi.repository;

import com.todotic.contactListApi.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
}
