package form;

import model.Academy;
import model.Department;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainForm {
    private Academy academy;
    private JPanel mainPanel;
    private JTree treeFaculties;
    private JButton addDepartmentButton;
    private JButton exitButton;
    private JScrollPane scrlView;
    private List<DefaultMutableTreeNode> treeNodes;

    public MainForm(JFrame parent) {
        academy = new Academy();

        exitButton.addActionListener(e -> {
            parent.dispose();
        });

        addDepartmentButton.addActionListener(e -> {
            // [Dept, Fac]
            String[] inputs = new String[2];

            AddDeptModal dialog = new AddDeptModal();
            dialog.pack();
            dialog.setStorage(inputs);
            dialog.setVisible(true);

            System.out.println(Arrays.toString(inputs));
            boolean flag = academy.agreeUpon(inputs[1], inputs[0]);

            if(!flag) {
                JOptionPane.showOptionDialog(parent,
                        "Error! The department already exists or invalid faculty.",
                        "Error!",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.ERROR_MESSAGE,
                        null, new String[]{"OK"}, 0
                );

                return;
            }

            int voteCount = 0;
            int totalMemberCount = academy.getTotalMemberCountOf(inputs[1]);
            String memCntStr = "0";

            VoteModal vDialog = new VoteModal(inputs[0], totalMemberCount);
            vDialog.pack();
            vDialog.setVisible(true);
            memCntStr = vDialog.getCount();

            try {
                voteCount = Integer.parseInt(memCntStr);
            } catch(Exception ignored) {}

            Department dept = new Department();
            dept.setName(inputs[0]);

            flag = academy.addDepartment(inputs[1], dept, voteCount);

            if(!flag) {
                JOptionPane.showOptionDialog(parent,
                        "Error! Minimum requirements for votes didn't meet or something unexpected just happened.",
                        "Error!",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.ERROR_MESSAGE,
                        null, new String[]{"OK"}, 0
                );

                return;
            }

            JOptionPane.showOptionDialog(parent,
                    "Successfully added new department",
                    "Success!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, new String[]{"OK"}, 0
            );

            int index = Academy.indexOfFaculty(inputs[1]);

            treeNodes.get(index).add(new DefaultMutableTreeNode(inputs[0]));
            treeFaculties.updateUI();
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

        treeNodes = new ArrayList<>();
        DefaultMutableTreeNode dmtn = new DefaultMutableTreeNode("Faculties");
        for (String fac:
             Academy.FAC_NAMES) {
            treeNodes.add(new DefaultMutableTreeNode(fac));
            dmtn.add(treeNodes.get(treeNodes.size() - 1));
        }
        treeFaculties = new JTree(dmtn);

    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
