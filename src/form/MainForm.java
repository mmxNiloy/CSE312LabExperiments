package form;

import frame.AdmitCardFrame;
import model.*;
import my_exception.*;

import javax.swing.*;

public class MainForm {
    private JPanel mainPanel;
    private JButton getFormButton;
    private JButton submitFormButton;
    private JButton exitButton;
    private JButton viewAdmitCardButton;
    private ExamFormModal formModal;
    private Office office;
    private Registrar registrar;
    private Accounts accounts;
    private JFrame parent;

    public MainForm(JFrame parent) {
        this.parent = parent;
        office = new Office();
        registrar = new Registrar();
        accounts = new Accounts();

        exitButton.addActionListener(e -> {
            parent.dispose();
        });

        getFormButton.addActionListener(e -> {
            formModal = office.getNewForm();
            formModal.pack();
            formModal.setVisible(true);
        });

        submitFormButton.addActionListener(e -> {
            onSubmit();
        });

        viewAdmitCardButton.addActionListener(e -> {
            if(office.getAdmitCard() == null) {
                JOptionPane.showOptionDialog(
                        parent, "Your admit card is not ready yet. Try submitting a form.",
                        "Info!", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE, null,
                        new String[]{"OK"}, 0
                );

                return;
            }

            AdmitCardFrame admitCardFrame = new AdmitCardFrame();
            admitCardFrame.setAdmitCard(office.getAdmitCard());
            admitCardFrame.setVisible(true);
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void onSubmit() {
        try {
            office.validate();
        } catch(MalformedFormException | LowAttendanceException e) {
            JOptionPane.showOptionDialog(
                    parent, e.getMessage(),
                    "Error!", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE, null,
                    new String[]{"Close"}, 0
            );

            return;
        }

        registrar.setForm(office.getForm());

        try {
            registrar.validate();
        } catch(ExamFailureException e) {
            JOptionPane.showOptionDialog(
                    parent, e.getMessage(),
                    "Error!", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE, null,
                    new String[]{"Close"}, 0
            );

            return;
        }

        accounts.setForm(registrar.getForm());

        try {
            accounts.validate();
        } catch (DebtException e) {
            JOptionPane.showOptionDialog(
                    parent, e.getMessage(),
                    "Error!", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE, null,
                    new String[]{"Close"}, 0
            );

            return;
        }

        int fees = accounts.getFees();
        TransactionModal modal = new TransactionModal(fees);
        modal.pack();
        modal.setVisible(true);

        int provided = modal.getProvided();

        if(provided < 0) {
            JOptionPane.showOptionDialog(
                    parent, "Transaction cancelled! Submit form again to pay your fees.",
                    "Info!", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null,
                    new String[]{"OK"}, 0
            );

            return;
        }

        Bank b = new Bank(fees, provided);

        try {
            b.validate();
        } catch (InsufficientFundException e) {
            JOptionPane.showOptionDialog(
                    parent, e.getMessage(),
                    "Error!", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE, null,
                    new String[]{"Close"}, 0
            );

            return;
        }

        ExamController ec = new ExamController();
        ec.setForm(accounts.getForm());
        ec.generateAdmitCard();

        office.setAdmitCard(ec.getAdmitCard());

        JOptionPane.showOptionDialog(
                parent, "Success! Your admit card is now ready. Get yur admit card from the menu.",
                "Success!", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null,
                new String[]{"OK"}, 0
        );
    }
}
