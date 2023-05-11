package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;


import Controller.ControllerTipologiaSexo;
import Controller.MiDefaultTableCellRenderer;
import model.Tipologiasexo;

import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.awt.GridBagConstraints;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private Controller.MiTableModel tableModel = null;
	private JTextField jId;
	private JTextField jNombre;
	private JTextField jApellido1;
	private JTextField jApellido2;
	private JTextField jDni;
	private JTextField jDireccion;
	private JTextField jEmail;
	private JTextField jTelefono;
	private JTable tableVista;
	private JComboBox<Tipologiasexo> jcbSexo; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.getContentPane().setLayout(new BorderLayout());
		setContentPane(contentPane);
//		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.columnWidths = new int[]{0, 0};
//		gbl_contentPane.rowHeights = new int[]{0, 0};
//		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
//		contentPane.setLayout(gbl_contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.fill = GridBagConstraints.HORIZONTAL;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 0;
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		jId = new JTextField();
		GridBagConstraints gbc_jId = new GridBagConstraints();
		gbc_jId.insets = new Insets(0, 0, 5, 0);
		gbc_jId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jId.gridx = 2;
		gbc_jId.gridy = 0;
		panel.add(jId, gbc_jId);
		jId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jNombre = new JTextField();
		GridBagConstraints gbc_jNombre = new GridBagConstraints();
		gbc_jNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jNombre.gridx = 2;
		gbc_jNombre.gridy = 1;
		panel.add(jNombre, gbc_jNombre);
		jNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido 1:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 2;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jApellido1 = new JTextField();
		jApellido1.setColumns(10);
		GridBagConstraints gbc_jApellido1 = new GridBagConstraints();
		gbc_jApellido1.insets = new Insets(0, 0, 5, 0);
		gbc_jApellido1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jApellido1.gridx = 2;
		gbc_jApellido1.gridy = 2;
		panel.add(jApellido1, gbc_jApellido1);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido 2:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jApellido2 = new JTextField();
		jApellido2.setColumns(10);
		GridBagConstraints gbc_jApellido2 = new GridBagConstraints();
		gbc_jApellido2.insets = new Insets(0, 0, 5, 0);
		gbc_jApellido2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jApellido2.gridx = 2;
		gbc_jApellido2.gridy = 3;
		panel.add(jApellido2, gbc_jApellido2);
		
		JLabel lblNewLabel_5 = new JLabel("DNI:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 4;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jDni = new JTextField();
		jDni.setColumns(10);
		GridBagConstraints gbc_jDni = new GridBagConstraints();
		gbc_jDni.insets = new Insets(0, 0, 5, 0);
		gbc_jDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_jDni.gridx = 2;
		gbc_jDni.gridy = 4;
		panel.add(jDni, gbc_jDni);
		
		JLabel lblNewLabel_4 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 5;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Dirección:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 6;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		jDireccion = new JTextField();
		jDireccion.setColumns(10);
		GridBagConstraints gbc_jDireccion = new GridBagConstraints();
		gbc_jDireccion.insets = new Insets(0, 0, 5, 0);
		gbc_jDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jDireccion.gridx = 2;
		gbc_jDireccion.gridy = 6;
		panel.add(jDireccion, gbc_jDireccion);
		
		JLabel lblNewLabel_7 = new JLabel("Email:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 7;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		jEmail = new JTextField();
		jEmail.setColumns(10);
		GridBagConstraints gbc_jEmail = new GridBagConstraints();
		gbc_jEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jEmail.gridx = 2;
		gbc_jEmail.gridy = 7;
		panel.add(jEmail, gbc_jEmail);
		
		JLabel lblNewLabel_8 = new JLabel("Teléfono:");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 8;
		panel.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		jTelefono = new JTextField();
		jTelefono.setColumns(10);
		GridBagConstraints gbc_jTelefono = new GridBagConstraints();
		gbc_jTelefono.insets = new Insets(0, 0, 5, 0);
		gbc_jTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTelefono.gridx = 2;
		gbc_jTelefono.gridy = 8;
		panel.add(jTelefono, gbc_jTelefono);
		
		JLabel lblNewLabel_9 = new JLabel("Sexo:");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_9.gridx = 1;
		gbc_lblNewLabel_9.gridy = 9;
		panel.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		jcbSexo = new JComboBox<Tipologiasexo>();
		GridBagConstraints gbc_jcbSexo = new GridBagConstraints();
		gbc_jcbSexo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbSexo.gridx = 2;
		gbc_jcbSexo.gridy = 9;
		panel.add(jcbSexo, gbc_jcbSexo);
		
        tableModel = new Controller.MiTableModel();
        table = new JTable(tableModel);

        table.setDefaultRenderer(Object.class, new MiDefaultTableCellRenderer());
        table.setDefaultRenderer(Integer.class, new MiDefaultTableCellRenderer());

        Controller.MiTableHeaderCellRenderer tableHeaderCellRenderer = new Controller.MiTableHeaderCellRenderer();
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setHeaderRenderer(tableHeaderCellRenderer);
        }
        
		// Detecci�n del clic sobre una fila
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				jId.setText(Integer.toString(((Integer) tableModel.getValueAt(table.getSelectedRow(), 0)).intValue()));
				jNombre.setText((String) tableModel.getValueAt(table.getSelectedRow(), 1));
				jApellido1.setText((String) tableModel.getValueAt(table.getSelectedRow(), 2));
				jApellido2.setText((String) tableModel.getValueAt(table.getSelectedRow(), 3));
				jDni.setText((String) tableModel.getValueAt(table.getSelectedRow(), 4));
				jDireccion.setText((String) tableModel.getValueAt(table.getSelectedRow(), 5));
				jEmail.setText((String) tableModel.getValueAt(table.getSelectedRow(), 6));
				jTelefono.setText((String) tableModel.getValueAt(table.getSelectedRow(), 7));
				Tipologiasexo sexoSeleccionado = (Tipologiasexo) tableModel.getValueAt(table.getSelectedRow(), 8);
				jcbSexo.setSelectedIndex(sexoSeleccionado.getId()-1);
			}
		});
		
		table.setMinimumSize(new Dimension(100,200));
		JScrollPane scrollPane = new JScrollPane(table);
		splitPane.setLeftComponent(scrollPane);
		



		cargarCombo();	
	}
	
	private JTable creaTabla() {

        tableModel = new Controller.MiTableModel();
        table = new JTable(tableModel);

        table.setDefaultRenderer(Object.class, new MiDefaultTableCellRenderer());
        table.setDefaultRenderer(Integer.class, new MiDefaultTableCellRenderer());

        Controller.MiTableHeaderCellRenderer tableHeaderCellRenderer = new Controller.MiTableHeaderCellRenderer();
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setHeaderRenderer(tableHeaderCellRenderer);
        }
        
		// Detecci�n del clic sobre una fila
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				jId.setText(Integer.toString(((Integer) tableModel.getValueAt(table.getSelectedRow(), 0)).intValue()));
				jNombre.setText((String) tableModel.getValueAt(table.getSelectedRow(), 1));
				jApellido1.setText((String) tableModel.getValueAt(table.getSelectedRow(), 2));
				jApellido2.setText((String) tableModel.getValueAt(table.getSelectedRow(), 3));
				jDni.setText((String) tableModel.getValueAt(table.getSelectedRow(), 4));
				jDireccion.setText((String) tableModel.getValueAt(table.getSelectedRow(), 5));
				jEmail.setText((String) tableModel.getValueAt(table.getSelectedRow(), 6));
				jTelefono.setText((String) tableModel.getValueAt(table.getSelectedRow(), 7));
				jcbSexo.setSelectedItem(tableModel.getValueAt(table.getSelectedRow(), 8));
			}
		});

        return table;
    }
	
	
	private void cargarCombo() {
		
		List<Tipologiasexo> lista = ControllerTipologiaSexo.findAll();

		for (Tipologiasexo p : lista) {
			this.jcbSexo.addItem(p);
		}
		
	}


}
