package com.sujata.objectio;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4153198418947079760L;
	private int personId;
	private String personName;
	private int personAge;
	
	public Person() {
		
	}

	public Person(int personId, String personName, int personAge) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	@Override
	public String toString() {
		return "Person (personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(personAge, personId, personName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return personAge == other.personAge && personId == other.personId
				&& Objects.equals(personName, other.personName);
	}
	
	
}
