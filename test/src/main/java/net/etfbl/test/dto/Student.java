package net.etfbl.test.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	private int id;
	private String ime;
	private String prezime;
	private String indeks;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public String getIndeks() {
		return indeks;
	}
	
	public void setIndeks(String indeks) {
		this.indeks = indeks;
	}
	
	public Student(int id, String ime, String prezime, String indeks) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.indeks = indeks;
	}
	
	public Student() {}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((indeks == null) ? 0 : indeks.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (indeks == null) {
			if (other.indeks != null)
				return false;
		} else if (!indeks.equals(other.indeks))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", indeks=" + indeks + "]";
	}
	
	
	

}
