module TesteJavaFX {
	
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	
	opens negocios to javafx.base;
	
}
