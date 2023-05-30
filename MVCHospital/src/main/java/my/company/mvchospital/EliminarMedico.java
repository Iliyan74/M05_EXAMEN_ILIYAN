package my.company.mvchospital;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;



public class EliminarMedico {
    @FXML
    private TextField codigoIdentifiacionField;

    private ConsultasBD consultasBD = new ConsultasBD();

    @FXML

public void eliminarMedico() {
    String codigoIdentifiacion = codigoIdentifiacionField.getText();  

    if (codigoIdentifiacion == null || codigoIdentifiacion.isEmpty()) {
        // El código de identificación está vacío o nulo
        System.out.println("El código de identificación está vacío o nulo. Por favor, ingrese un código válido.");
    } else {
        Medico medico = new Medico(codigoIdentifiacion);
        consultasBD.eliminarMedico(medico);
        clearFields();
    }
}

    private void clearFields() {
        codigoIdentifiacionField.clear();
    }
}

