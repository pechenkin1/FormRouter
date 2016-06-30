package local.myworktech.formrouter;

import local.myworktech.formrouter.service.Context;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Context::startApplication);
    }
}
