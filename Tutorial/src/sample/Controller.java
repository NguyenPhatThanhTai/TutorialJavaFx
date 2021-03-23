package sample;

import DAO.dao;
import Model.userModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private TextField txtTaiKhoan;

    @FXML
    private PasswordField txtMatKhau;

    @FXML
    private Button btnDangNhap;

    public void loginController() {
        if (txtMatKhau.getText() != "" && txtTaiKhoan.getText() != ""){
            dao dao = new dao();
            if (dao.checkLogin(new userModel(txtTaiKhoan.getText(), txtMatKhau.getText()))){
                System.out.println("Thành công");
            }
            else {
                System.out.println("Sai mật khẩu");
            }
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
