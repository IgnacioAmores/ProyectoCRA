package componentesGUI;

import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import beans.Empresa;
import beans.Trabajador;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class PrincipalFrame extends JFrame {
    private List<Empresa> datosEmpresas;
    JPanel panelPrincipal;
    JPanel panelDatosEmpresa;
    JPanel panelTrabajador;
    JPanel panelConcepto;
    JLabel labelCodigoCuentaCotizacion;
    JLabel labelAño;
    JLabel labelMes;
    JLabel labelNAF;
    JLabel labelCodigo;
    JLabel labelIncluidoExcluido;
    JLabel labelImporte;
    JTextArea textAreaCodigoCuentaCotizacion;
    JTextArea textAreaAño;
    JTextArea textAreaMes;
    JTextArea textAreaNAF;
    JTextArea textAreaCodigo;
    JTextArea textAreaIncluidoExcluido;
    JTextArea textAreaImporte;
    String[] datosEmpresaLabels = {"Código de cuenta de cotización", "Año", "Mes"};
    String[] trabajadorLabels = {"NAF"};
    String[] conceptoLabels = {"Código", "Incluido/Excluido", "Importe"};



    public PrincipalFrame() {
        this.setTitle("Gestión de nóminas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        crearPaneles();
        
        this.add(panelDatosEmpresa);
        this.add(panelTrabajador);
        this.add(panelConcepto);

        this.setSize(800, 600);
        this.setVisible(true);
    }

    private JPanel crearPanelConLabelYTextArea(String labelText, int textAreaWidth, int textAreaHeight) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JLabel label = new JLabel(labelText);
        JTextArea textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(textAreaWidth, textAreaHeight));

        panel.add(label);
        panel.add(textArea);

        return panel;
    }

    public void crearPaneles() {
        panelDatosEmpresa = crearPanel(datosEmpresaLabels, "Empresa", new Color(100, 149, 237));
        panelTrabajador = crearPanel(trabajadorLabels, "Empleado", new Color(152, 251, 152));
        panelConcepto = crearPanel(conceptoLabels, "Concepto", new Color(255, 105, 97));

        panelDatosEmpresa.setVisible(true);
        panelTrabajador.setVisible(true);
        panelConcepto.setVisible(true);
    }

    private JPanel crearPanel(String[] labels, String titulo, Color color) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        for (String label : labels) {
            panel.add(crearPanelConLabelYTextArea(label, 200, 20));
        }

        TitledBorder title = BorderFactory.createTitledBorder(titulo);
        panel.setBorder(title);
        panel.setBackground(color);
        return panel;
    }
}
