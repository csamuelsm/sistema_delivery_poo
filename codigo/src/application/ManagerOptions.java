package application;

import java.io.IOException;
import Exceptions.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ManagerOptions {
	
    @FXML
    private Button orderButton;

    @FXML
    private Button updateButton;
    
    @FXML
    private Button exitButton;
    
    @FXML
    private Button menuButton;
    
    @FXML
    private Button seeMenuButton;
    
    @FXML
    private Button openCloseButton;
    
    @FXML
    void initialize() {
    	FachadaHolder holder = FachadaHolder.getInstance();
    	try {
	    	if (holder.fachada.getRestaurante(holder.getGerenteLogado().getCPF()).aberto) {
	    		openCloseButton.setText("Fechar restaurante");
	    	} else {
	    		openCloseButton.setText("Abrir restaurante");
	    	}
    	} catch (UsuarioNaoEncontradoException e) {
    		openCloseButton.setText("ERRO");
    	}
    }
    
    
    @FXML
    void openCloseRestaurant(ActionEvent event) {
    	FachadaHolder holder = FachadaHolder.getInstance();
    	if (openCloseButton.getText().toString().equals("Abrir restaurante")) {
    		holder.fachada.abrirRestaurante(holder.getGerenteLogado());
    		openCloseButton.setText("Fechar restaurante");
    	} else {
    		holder.fachada.fecharRestaurante(holder.getGerenteLogado());
    		openCloseButton.setText("Abrir restaurante");
    	}
    }
    
    @FXML
    void seeMenu(ActionEvent event) {
    	Main m = new Main();
        m.changeScene("viewMenuManager.fxml");
    }
    
    @FXML
    void updateMenu(ActionEvent event) {
    	Main m = new Main();
        m.changeScene("updateMenu.fxml");
    }

    @FXML
    void approveOrder(ActionEvent event) {
    	Main m = new Main();
        m.changeScene("aproveOrder.fxml");
    }


    @FXML
    void updateData(ActionEvent event) {
    	Main m = new Main();
        m.changeScene("updateDataManager.fxml");
    }
    
    @FXML
    void exitToLogIn(ActionEvent event) {
    	Main m = new Main();
        m.changeScene("logInManager.fxml");
    }
}
