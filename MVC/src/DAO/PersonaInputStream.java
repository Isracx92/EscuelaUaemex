package DAO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import Model.Persona;

public class PersonaInputStream {

	private String RA = System.getProperty("user.home") + "/Desktop/datos.txt";
	private FileInputStream FIS;
	private ObjectInputStream OIS;

	public void AbrirArchivo() throws IOException {
		try {
			FIS = new FileInputStream(RA);
			OIS = new ObjectInputStream(FIS);
		} catch (FileNotFoundException exception) {

		}
	}

	public Persona Leer() throws IOException, ClassNotFoundException {
		Persona persona = null;
		if (OIS != null) {
			try {
				persona = (Persona) OIS.readObject();
			} catch (EOFException e) {

			}
		}
		return persona;
	}

	public void CerrarArchivo() {
		try {
			if (OIS != null) {
				OIS.close();
			}
		} catch (IOException exception) {
		}
	}
}