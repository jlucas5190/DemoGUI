/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test.demogui

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage


import groovy.transform.CompileStatic
/**
 *
 * @author joshu
 */
@CompileStatic
 class DemoGUI extends Application {

    /**
     * @param args the command line arguments
     */
    static void main(String[] args) {
        launch(args);
    }

    @Override
    void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/scenes/FXMLDocument.fxml"));
            Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }



}