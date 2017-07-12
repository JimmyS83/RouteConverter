/*
    This file is part of RouteConverter.

    RouteConverter is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    RouteConverter is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with RouteConverter; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Copyright (C) 2007 Christian Pesch. All Rights Reserved.
*/

package slash.navigation.converter.gui.dialogs;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import slash.navigation.base.NavigationFormat;
import slash.navigation.converter.gui.RouteConverter;
import slash.navigation.gui.SimpleDialog;
import slash.navigation.gui.actions.DialogAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ResourceBundle;

import static java.awt.event.KeyEvent.VK_ESCAPE;
import static java.text.MessageFormat.format;
import static javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
import static javax.swing.KeyStroke.getKeyStroke;
import static slash.common.io.Files.shortenPath;
import static slash.navigation.converter.gui.dialogs.MaximumPositionCountDialog.Result.Cancel;
import static slash.navigation.converter.gui.dialogs.MaximumPositionCountDialog.Result.Ignore;
import static slash.navigation.converter.gui.dialogs.MaximumPositionCountDialog.Result.Reduce;
import static slash.navigation.converter.gui.dialogs.MaximumPositionCountDialog.Result.Split;
import static slash.navigation.gui.helpers.JMenuHelper.setMnemonic;

/**
 * Dialog for saving a file that exceeds the {@link NavigationFormat#getMaximumPositionCount()}
 *
 * @author Christian Pesch
 */
public class MaximumPositionCountDialog extends SimpleDialog {
    private JPanel contentPane;
    private JButton buttonSplit;
    private JButton buttonReduce;
    private JButton buttonIgnore;
    private JButton buttonCancel;
    private JLabel labelDescription;

    private Result result = Cancel;

    public MaximumPositionCountDialog(File file, int positionCount, int fileCount, NavigationFormat format) {
        super(RouteConverter.getInstance().getFrame(), "maximum-position-count");
        setTitle(RouteConverter.getBundle().getString("maximum-position-count-title"));
        setContentPane(contentPane);
        setModal(true);

        labelDescription.setText(format(RouteConverter.getBundle().getString("maximum-position-count-description"),
                shortenPath(file.getPath(), 60), positionCount, format.getName(),
                format.getMaximumPositionCount(), fileCount));

        setMnemonic(buttonSplit, "split-mnemonic");
        buttonSplit.addActionListener(new DialogAction(this) {
            public void run() {
                close(Split);
            }
        });

        setMnemonic(buttonReduce, "reduce-mnemonic");
        buttonReduce.addActionListener(new DialogAction(this) {
            public void run() {
                close(Reduce);
            }
        });

        setMnemonic(buttonIgnore, "ignore-mnemonic");
        buttonIgnore.addActionListener(new DialogAction(this) {
            public void run() {
                close(Ignore);
            }
        });

        setMnemonic(buttonCancel, "cancel-mnemonic");
        buttonCancel.addActionListener(new DialogAction(this) {
            public void run() {
                close(Cancel);
            }
        });

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        getRootPane().setDefaultButton(buttonCancel);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                close(Cancel);
            }
        });

        contentPane.registerKeyboardAction(new DialogAction(this) {
            public void run() {
                close(Cancel);
            }
        }, getKeyStroke(VK_ESCAPE, 0), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(2, 4, new Insets(0, 0, 0, 0), -1, -1));
        contentPane.add(panel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        labelDescription = new JLabel();
        panel1.add(labelDescription, new GridConstraints(0, 0, 1, 4, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(300, -1), null, null, 1, false));
        buttonSplit = new JButton();
        this.$$$loadButtonText$$$(buttonSplit, ResourceBundle.getBundle("slash/navigation/converter/gui/RouteConverter").getString("split"));
        panel1.add(buttonSplit, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonReduce = new JButton();
        this.$$$loadButtonText$$$(buttonReduce, ResourceBundle.getBundle("slash/navigation/converter/gui/RouteConverter").getString("reduce"));
        panel1.add(buttonReduce, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonIgnore = new JButton();
        this.$$$loadButtonText$$$(buttonIgnore, ResourceBundle.getBundle("slash/navigation/converter/gui/RouteConverter").getString("ignore"));
        panel1.add(buttonIgnore, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buttonCancel = new JButton();
        this.$$$loadButtonText$$$(buttonCancel, ResourceBundle.getBundle("slash/navigation/converter/gui/RouteConverter").getString("cancel"));
        panel1.add(buttonCancel, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private void $$$loadButtonText$$$(AbstractButton component, String text) {
        StringBuffer result = new StringBuffer();
        boolean haveMnemonic = false;
        char mnemonic = '\0';
        int mnemonicIndex = -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '&') {
                i++;
                if (i == text.length()) break;
                if (!haveMnemonic && text.charAt(i) != '&') {
                    haveMnemonic = true;
                    mnemonic = text.charAt(i);
                    mnemonicIndex = result.length();
                }
            }
            result.append(text.charAt(i));
        }
        component.setText(result.toString());
        if (haveMnemonic) {
            component.setMnemonic(mnemonic);
            component.setDisplayedMnemonicIndex(mnemonicIndex);
        }
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }

    public enum Result {
        Split, Reduce, Ignore, Cancel
    }

    public Result getResult() {
        return result;
    }

    private void close(Result result) {
        this.result = result;
        dispose();
    }


}
