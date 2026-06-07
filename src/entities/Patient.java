package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient {
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private int protocolNumber;
	private String name;
	private int age;
	private String medicalSpecialty;
	private LocalDate consultationDate;

	public Patient(int protocolNumber, String name, int age, String medicalSpecialty) {
		this.protocolNumber = protocolNumber;
		this.name = name;
		this.age = age;
		this.medicalSpecialty = medicalSpecialty;
		this.consultationDate = LocalDate.now();
	}

	public Patient(int protocolNumber, String name, int age, String medicalSpecialty, String consultationDate) {
		this.protocolNumber = protocolNumber;
		this.name = name;
		this.age = age;
		this.medicalSpecialty = medicalSpecialty;
		this.consultationDate = LocalDate.parse(consultationDate, formatter);
	}

	public int getProtocolNumber() {
		return protocolNumber;
	}

	public void setProtocolNumber(int protocolNumber) {
		this.protocolNumber = protocolNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMedicalSpecialty() {
		return medicalSpecialty;
	}

	public void setMedicalSpecialty(String medicalSpecialty) {
		this.medicalSpecialty = medicalSpecialty;
	}

	public LocalDate getConsultationDate() {
		return consultationDate;
	}

	public void setConsultationDate(LocalDate consultationDate) {
		this.consultationDate = consultationDate;
	}

	public static DateTimeFormatter getFormatter() {
		return formatter;
	}

	@Override
	public String toString() {
		return "[ Prontuário: " + protocolNumber + " | Nome: " + name + " | Idade: " + age + " | Especialidade: "
				+ medicalSpecialty + " | Data: " + consultationDate.format(formatter) + " ]";
	}
	
	

}
