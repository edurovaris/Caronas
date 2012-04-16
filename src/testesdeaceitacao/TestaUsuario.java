package testesdeaceitacao;

import java.io.File;
import java.util.ArrayList;

import java.util.List;

import easyaccept.EasyAcceptFacade;
import fachadas.UsuarioFacade;

public class TestaUsuario {

	public static void main(String[] args) throws Exception {

		List<String> files = new ArrayList<String>();

		// Put the us1.txt file into the "test scripts" list

		files.add("scripts" + File.separator + "us1.txt");
		files.add("scripts" + File.separator + "us2.txt");

		// Instantiate the Monopoly Game façade

		UsuarioFacade uf = new UsuarioFacade();

		// Instantiate EasyAccept façade

		EasyAcceptFacade eaFacade = new EasyAcceptFacade(uf,files);

		// Execute the tests

		eaFacade.executeTests();

		// Print the tests execution results

		System.out.println(eaFacade.getCompleteResults());

	}

}