package DAO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Model.Persona;

public class PersonaOutputStream {

	private String RA = System.getProperty("user.home") + "/Desktop/datos.txt";
	private FileOutputStream FOS;
	private ObjectOutputStream OOS;

	public void AbrirArch() {
		try {
			FOS = new FileOutputStream(RA);
			OOS = new ObjectOutputStream(FOS);
		} catch (IOException e) {

		}
	}

	public void Escribir(Persona persona) {
		try {
			if (OOS != null) {
				OOS.writeObject(persona);
			}
		} catch (IOException e) {

		}
	}

	public void Cerrar() {
		try {
			if (OOS != null) {
				OOS.close();
			}
		} catch (IOException e) {
		}
	}
}
