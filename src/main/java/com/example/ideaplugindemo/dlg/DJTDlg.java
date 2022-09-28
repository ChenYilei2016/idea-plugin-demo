package com.example.ideaplugindemo.dlg;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * 毒鸡汤dlg
 */
public class DJTDlg extends DialogWrapper {

    protected DJTDlg() {
        super(true);
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        return null;
    }

    @Override
    protected void init() {
        super.init();
    }


    @Override
    protected JComponent createSouthPanel() {
        return super.createSouthPanel();
    }
}
