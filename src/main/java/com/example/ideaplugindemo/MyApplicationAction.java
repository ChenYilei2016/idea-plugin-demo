package com.example.ideaplugindemo;

import com.example.ideaplugindemo.dlg.DJTDlg;
import com.intellij.openapi.components.ApplicationComponent;

/**
 * @author chenyilei
 * @date 2022/09/28 09:59
 */
public class MyApplicationAction implements ApplicationComponent {

    @Override
    public void initComponent() {
        ApplicationComponent.super.initComponent();
        DJTDlg djtDlg = new DJTDlg();
        djtDlg.show();
    }

    @Override
    public void disposeComponent() {
        ApplicationComponent.super.disposeComponent();
    }
}
