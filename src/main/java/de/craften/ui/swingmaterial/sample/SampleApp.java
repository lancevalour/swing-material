package de.craften.ui.swingmaterial.sample;

import de.craften.ui.swingmaterial.*;
import de.craften.ui.swingmaterial.fonts.MaterialIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Created by Yicheng Zhang on 6/28/2017.
 * <p>
 */
public class SampleApp extends JFrame {

    private MaterialPanel panel;
    private MaterialTextField textField;
    private MaterialButton button;
    private MaterialIconButton iconButton;
    private MaterialComboBox comboBox;
    private MaterialFormattedTextField formattedTextField;
    private MaterialPasswordField passwordField;
    private MaterialProgressSpinner progressSpinner;


    public void run() {
        initComponents();
        setComponentControl();
        this.setVisible(true);
    }

    private void initComponents() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints layoutConstraints = new GridBagConstraints();

        panel = new MaterialPanel();
        panel.setPreferredSize(new Dimension(140, 200));
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 0;
        layoutConstraints.weighty = 1;

        this.add(panel, layoutConstraints);

        textField = new MaterialTextField();
        textField.setPreferredSize(new Dimension(200, 80));
        textField.setText("This is a TextField");
        layoutConstraints.gridy = 1;
        this.add(textField, layoutConstraints);

        button = new MaterialButton();
        button.setPreferredSize(new Dimension(100, 80));
        button.setBackground(MaterialColor.BLUE_500);
        button.setText("Button");
        layoutConstraints.gridy = 2;
        this.add(button, layoutConstraints);

        iconButton = new MaterialIconButton();
        iconButton.setPreferredSize(new Dimension(100, 50));
        iconButton.setBackground(MaterialColor.RED_500);
        layoutConstraints.gridy = 3;
        this.add(iconButton, layoutConstraints);

        comboBox = new MaterialComboBox();
        comboBox.setPreferredSize(new Dimension(50, 50));
        comboBox.setAccent(MaterialColor.TEAL_500);
        layoutConstraints.gridy = 4;
        this.add(comboBox, layoutConstraints);

        formattedTextField = new MaterialFormattedTextField();
        formattedTextField.setPreferredSize(new Dimension(200, 70));
        formattedTextField.setLabel("Label");
        formattedTextField.setText("This is a FormattedTextField");
        layoutConstraints.gridy = 5;
        this.add(formattedTextField, layoutConstraints);

        passwordField = new MaterialPasswordField();
        passwordField.setPreferredSize(new Dimension(200, 70));
        passwordField.setText("Password");
        passwordField.setHint("Hint");
        layoutConstraints.gridy = 6;
        this.add(passwordField, layoutConstraints);

        progressSpinner = new MaterialProgressSpinner();
        progressSpinner.setPreferredSize(new Dimension(50, 50));
        progressSpinner.setForeground(MaterialColor.AMBER_50);
        layoutConstraints.gridy = 7;
        this.add(progressSpinner, layoutConstraints);


        this.setPreferredSize(new Dimension(800, 600));
        this.setResizable(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void setComponentControl() {

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SampleApp().run();
            }
        });
    }


}
