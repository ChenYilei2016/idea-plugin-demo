package com.example.ideaplugindemo.dlg;

import com.example.ideaplugindemo.tils.ContentUtil;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.JBColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * 毒鸡汤dlg
 */
public class DJTDlg extends DialogWrapper {

    private JLabel label;

    public DJTDlg() {
        super(true);
        init();
        setTitle("毒鸡汤title");
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        JPanel jPanel = new JPanel(new BorderLayout());
        label = new JLabel("还没有鸡汤");
        label.setBackground(JBColor.BLUE);

        //设置首先大小
        label.setPreferredSize(new Dimension(100,100));

        jPanel.add(label,BorderLayout.CENTER);
        return jPanel;
    }

    @Override
    protected void init() {
        super.init();
    }


    @Override
    protected JComponent createSouthPanel() {
        JButton jButton = new JButton("干!");
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = ContentUtil.getContent();
                label.setText(content);
            }
        });
        JComponent southPanel = super.createSouthPanel();

        southPanel.add(jButton);
        return southPanel;
    }
}
