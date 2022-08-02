package vista;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class vista extends javax.swing.JFrame {

    private ImageIcon imagen;
    private ImageIcon imagen1;
    private JLabel etiqueta1;
    private ImageIcon imagen2;
    private ImageIcon imagen2_1;
    private JLabel etiqueta;
    private ImageIcon imagen3;
    private ImageIcon imagen3_1;
    private JLabel    etiqueta3;
    private ImageIcon imagen4;
    private ImageIcon imagen4_1;
    private JLabel    etiqueta4;
    private ImageIcon imagen5;
    private ImageIcon imagen5_1;
    private JLabel    etiqueta5;
    private ImageIcon imagen6;
    private ImageIcon imagen6_1;
    private JLabel    etiqueta6;
    private ImageIcon imagen7;
    private ImageIcon imagen7_1;
    private JLabel    etiqueta7;
    
    public vista() {
        initComponents();
        fondo();
    }
    
    public void fondo(){
    etiqueta1= new JLabel();
    etiqueta1.setBounds(0,0,800,560); 
    imagen1= new ImageIcon("src/imagenes/imagen6.gif");
    imagen= new ImageIcon(imagen1.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_FAST));
    etiqueta1.setIcon(imagen);
    panel.add(etiqueta1);
    
    imagen2= new ImageIcon("src/imagenes/imagen5.gif");
    etiqueta= new JLabel();
    
    etiqueta.setBounds(166,0,500,350);
    imagen2_1= new ImageIcon(imagen2.getImage().getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_FAST));
    etiqueta.setIcon(imagen2);
    pan1.add(etiqueta);
    
    imagen3= new ImageIcon("src/imagenes/imagen4.gif");
    etiqueta3= new JLabel();
    etiqueta3.setBounds(0,0,800,333);
    imagen3_1= new ImageIcon(imagen3.getImage().getScaledInstance(etiqueta3.getWidth(), etiqueta3.getHeight(), Image.SCALE_FAST));
    etiqueta3.setIcon(imagen3_1);
    pan2.add(etiqueta3);
    
    imagen4= new ImageIcon("src/imagenes/imagen3.gif");
    etiqueta4= new JLabel();
    etiqueta4.setBounds(0,0,800,333);
    imagen4_1= new ImageIcon(imagen4.getImage().getScaledInstance(etiqueta4.getWidth(), etiqueta4.getHeight(),Image.SCALE_FAST));
    etiqueta4.setIcon(imagen4_1);
    pan3.add(etiqueta4);
    
    imagen5= new ImageIcon("src/imagenes/imagen2.gif");
    etiqueta5= new JLabel();
    etiqueta5.setBounds(0,0,800,333);
    imagen5_1= new ImageIcon(imagen5.getImage().getScaledInstance(etiqueta5.getWidth(), etiqueta5.getHeight(),Image.SCALE_FAST));
    etiqueta5.setIcon(imagen5_1);
    pan6.add(etiqueta5);
    
    imagen6= new ImageIcon("src/imagenes/imagen8.gif");
    etiqueta6= new JLabel();
    etiqueta6.setBounds(0,0,800,333);
    imagen6_1= new ImageIcon(imagen6.getImage().getScaledInstance(etiqueta6.getWidth(), etiqueta6.getHeight(), Image.SCALE_FAST));
    etiqueta6.setIcon(imagen6_1);
    pan4.add(etiqueta6);
    
    imagen7= new ImageIcon("src/imagenes/imagen7.gif");
    etiqueta7= new JLabel();
    etiqueta7.setBounds(0,0,800,333);
    imagen7_1= new ImageIcon(imagen7.getImage().getScaledInstance(etiqueta7.getWidth(), etiqueta7.getHeight(), Image.SCALE_FAST));
    etiqueta7.setIcon(imagen7_1);
    pan5.add(etiqueta7);
    
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pan1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUbicarId = new javax.swing.JTextField();
        txtUbicarN = new javax.swing.JTextField();
        txtUbicaIndica = new javax.swing.JTextField();
        txtUbicaRes = new javax.swing.JTextField();
        pan2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCuentaId = new javax.swing.JTextField();
        txtCuentaDocu = new javax.swing.JTextField();
        txtCuentaNom = new javax.swing.JTextField();
        txtCuentaApe = new javax.swing.JTextField();
        txtCuentaEmail = new javax.swing.JTextField();
        pan3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtprovedorId = new javax.swing.JTextField();
        txtProvedorNi = new javax.swing.JTextField();
        txtProvedorRS = new javax.swing.JTextField();
        txtProvedorDi = new javax.swing.JTextField();
        txtProvedorTe = new javax.swing.JTextField();
        txtProvedorEm = new javax.swing.JTextField();
        txtProvedorSW = new javax.swing.JTextField();
        pan4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtEquipoId = new javax.swing.JTextField();
        txtEquipoSe = new javax.swing.JTextField();
        txtEquipoTipo = new javax.swing.JTextField();
        txtEquipoMa = new javax.swing.JTextField();
        txtEquipoMo = new javax.swing.JTextField();
        txtEquipoGar = new javax.swing.JTextField();
        txtEquipoClo = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtEquipoUs = new javax.swing.JTextField();
        txtEquipoIdCue = new javax.swing.JTextField();
        txtEquipoIdPro = new javax.swing.JTextField();
        txtEquipoIdUbi = new javax.swing.JTextField();
        bEquipoIN = new javax.swing.JButton();
        txtEquipoDate = new com.toedter.calendar.JDateChooser();
        bEquipoBus = new javax.swing.JButton();
        bEquipoMo = new javax.swing.JButton();
        bEquipoEli = new javax.swing.JButton();
        pan5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_1 = new javax.swing.JTable();
        bTabla = new javax.swing.JButton();
        pan6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtSoftwareId = new javax.swing.JTextField();
        txtSoftwareNom = new javax.swing.JTextField();
        txtSoftwareVer = new javax.swing.JTextField();
        txtSoftwareDes = new javax.swing.JTextField();
        bSoftwareIn = new javax.swing.JButton();
        bSoftwareBus = new javax.swing.JButton();
        bSoftwareMo = new javax.swing.JButton();
        bSoftwareEli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RETO 5");
        setBounds(new java.awt.Rectangle(110, 50, 0, 0));

        panel.setPreferredSize(new java.awt.Dimension(800, 560));

        jTabbedPane1.setBackground(new java.awt.Color(102, 255, 204));
        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 255));
        jTabbedPane1.setToolTipText("");

        pan1.setBackground(new java.awt.Color(26, 34, 49));
        pan1.setToolTipText("");

        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Id");

        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Nombre");

        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Indicaciones");

        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Responsable");

        txtUbicarId.setMinimumSize(new java.awt.Dimension(66, 22));
        txtUbicarId.setPreferredSize(new java.awt.Dimension(66, 22));

        txtUbicarN.setMinimumSize(new java.awt.Dimension(66, 22));
        txtUbicarN.setPreferredSize(new java.awt.Dimension(66, 22));

        txtUbicaIndica.setMinimumSize(new java.awt.Dimension(66, 22));
        txtUbicaIndica.setPreferredSize(new java.awt.Dimension(66, 22));

        txtUbicaRes.setMinimumSize(new java.awt.Dimension(66, 22));
        txtUbicaRes.setPreferredSize(new java.awt.Dimension(66, 22));

        javax.swing.GroupLayout pan1Layout = new javax.swing.GroupLayout(pan1);
        pan1.setLayout(pan1Layout);
        pan1Layout.setHorizontalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(69, 69, 69)
                        .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUbicarN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pan1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(67, 67, 67)
                                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pan1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(44, 44, 44)
                                        .addComponent(txtUbicaRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtUbicaIndica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(txtUbicarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        pan1Layout.setVerticalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUbicarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUbicarN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUbicaIndica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtUbicaRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jTabbedPane1.addTab("Ubicacion", pan1);

        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Id");

        jLabel6.setForeground(new java.awt.Color(51, 204, 255));
        jLabel6.setText("Documento");

        jLabel7.setForeground(new java.awt.Color(51, 204, 255));
        jLabel7.setText("Nombres");

        jLabel8.setForeground(new java.awt.Color(51, 204, 255));
        jLabel8.setText("Apellidos");

        jLabel9.setForeground(new java.awt.Color(51, 204, 255));
        jLabel9.setText("Email");

        txtCuentaId.setPreferredSize(new java.awt.Dimension(66, 22));

        txtCuentaDocu.setPreferredSize(new java.awt.Dimension(66, 22));

        txtCuentaNom.setPreferredSize(new java.awt.Dimension(66, 22));

        txtCuentaApe.setPreferredSize(new java.awt.Dimension(66, 22));

        txtCuentaEmail.setPreferredSize(new java.awt.Dimension(66, 22));

        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
        pan2.setLayout(pan2Layout);
        pan2Layout.setHorizontalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(59, 59, 59)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCuentaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pan2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(75, 75, 75)
                        .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCuentaDocu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pan2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(54, 54, 54)
                                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtCuentaNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pan2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(85, 85, 85)
                                        .addComponent(txtCuentaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCuentaApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        pan2Layout.setVerticalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCuentaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCuentaDocu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCuentaNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtCuentaApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCuentaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(49, 49, 49))
        );

        jTabbedPane1.addTab("Cuentadante", pan2);

        jLabel10.setForeground(new java.awt.Color(255, 153, 255));
        jLabel10.setText("Id");

        jLabel11.setForeground(new java.awt.Color(255, 153, 255));
        jLabel11.setText("Nit");

        jLabel12.setForeground(new java.awt.Color(204, 0, 204));
        jLabel12.setText("Razon Social ");

        jLabel13.setForeground(new java.awt.Color(255, 0, 255));
        jLabel13.setText("Direccion");

        jLabel14.setForeground(new java.awt.Color(255, 153, 204));
        jLabel14.setText("Telefono");

        jLabel15.setForeground(new java.awt.Color(255, 153, 204));
        jLabel15.setText("Email");

        jLabel16.setBackground(new java.awt.Color(153, 0, 153));
        jLabel16.setForeground(new java.awt.Color(255, 153, 204));
        jLabel16.setText("Sitio Web");

        txtprovedorId.setPreferredSize(new java.awt.Dimension(66, 22));

        javax.swing.GroupLayout pan3Layout = new javax.swing.GroupLayout(pan3);
        pan3.setLayout(pan3Layout);
        pan3Layout.setHorizontalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan3Layout.createSequentialGroup()
                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pan3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(56, 56, 56)
                                .addComponent(txtProvedorSW, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pan3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtprovedorId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pan3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(54, 54, 54)
                                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtProvedorNi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pan3Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(51, 51, 51)
                                                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtProvedorRS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(pan3Layout.createSequentialGroup()
                                                        .addComponent(jLabel13)
                                                        .addGap(67, 67, 67)
                                                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtProvedorDi, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(pan3Layout.createSequentialGroup()
                                                                .addComponent(jLabel14)
                                                                .addGap(92, 92, 92)
                                                                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jLabel15)
                                                                    .addComponent(txtProvedorTe, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))))))))
                        .addContainerGap(167, Short.MAX_VALUE))
                    .addGroup(pan3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtProvedorEm, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        pan3Layout.setVerticalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtprovedorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txtProvedorNi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan3Layout.createSequentialGroup()
                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtProvedorRS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(txtProvedorDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pan3Layout.createSequentialGroup()
                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(txtProvedorTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProvedorEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel16))
                    .addComponent(txtProvedorSW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("Proveedor", pan3);

        jLabel21.setForeground(new java.awt.Color(153, 153, 0));
        jLabel21.setText("Id");

        jLabel22.setForeground(new java.awt.Color(153, 153, 0));
        jLabel22.setText("Serial");

        jLabel23.setForeground(new java.awt.Color(153, 153, 0));
        jLabel23.setText("Tipo");

        jLabel24.setForeground(new java.awt.Color(153, 153, 0));
        jLabel24.setText("Marca");

        jLabel25.setForeground(new java.awt.Color(153, 153, 0));
        jLabel25.setText("Modelo");

        jLabel26.setForeground(new java.awt.Color(153, 153, 0));
        jLabel26.setText("Fecha Compra");

        jLabel27.setForeground(new java.awt.Color(153, 153, 0));
        jLabel27.setText("Meses Garantia");

        jLabel28.setForeground(new java.awt.Color(153, 153, 0));
        jLabel28.setText("Clon");

        jLabel29.setForeground(new java.awt.Color(153, 153, 0));
        jLabel29.setText("Uso");

        txtEquipoId.setPreferredSize(new java.awt.Dimension(66, 22));

        txtEquipoSe.setPreferredSize(new java.awt.Dimension(66, 22));

        txtEquipoTipo.setPreferredSize(new java.awt.Dimension(66, 22));

        txtEquipoMa.setPreferredSize(new java.awt.Dimension(66, 22));

        txtEquipoMo.setPreferredSize(new java.awt.Dimension(66, 22));

        txtEquipoGar.setPreferredSize(new java.awt.Dimension(66, 22));

        txtEquipoClo.setPreferredSize(new java.awt.Dimension(66, 22));

        jLabel30.setForeground(new java.awt.Color(153, 153, 0));
        jLabel30.setText("Id Cuentadante");

        jLabel31.setForeground(new java.awt.Color(153, 153, 0));
        jLabel31.setText("Id Proveedor");

        jLabel32.setForeground(new java.awt.Color(153, 153, 0));
        jLabel32.setText("Id Ubicacion");

        txtEquipoUs.setPreferredSize(new java.awt.Dimension(66, 22));

        txtEquipoIdCue.setPreferredSize(new java.awt.Dimension(66, 22));

        txtEquipoIdPro.setPreferredSize(new java.awt.Dimension(66, 22));

        txtEquipoIdUbi.setPreferredSize(new java.awt.Dimension(66, 22));

        bEquipoIN.setBackground(new java.awt.Color(255, 255, 102));
        bEquipoIN.setForeground(new java.awt.Color(51, 51, 0));
        bEquipoIN.setText("INSERT");

        txtEquipoDate.setBackground(new java.awt.Color(255, 255, 51));
        txtEquipoDate.setForeground(new java.awt.Color(51, 255, 255));
        txtEquipoDate.setDateFormatString("yyyy-MM-dd");

        bEquipoBus.setBackground(new java.awt.Color(204, 204, 0));
        bEquipoBus.setForeground(new java.awt.Color(51, 51, 0));
        bEquipoBus.setText("SEARCH");

        bEquipoMo.setBackground(new java.awt.Color(255, 153, 0));
        bEquipoMo.setForeground(new java.awt.Color(51, 51, 0));
        bEquipoMo.setText("UPDATE");

        bEquipoEli.setBackground(new java.awt.Color(255, 51, 51));
        bEquipoEli.setForeground(new java.awt.Color(51, 0, 0));
        bEquipoEli.setText("DELETE");

        javax.swing.GroupLayout pan4Layout = new javax.swing.GroupLayout(pan4);
        pan4.setLayout(pan4Layout);
        pan4Layout.setHorizontalGroup(
            pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan4Layout.createSequentialGroup()
                        .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(74, 74, 74)
                        .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pan4Layout.createSequentialGroup()
                                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEquipoClo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEquipoGar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEquipoDate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pan4Layout.createSequentialGroup()
                                .addComponent(txtEquipoMo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pan4Layout.createSequentialGroup()
                        .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pan4Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEquipoMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pan4Layout.createSequentialGroup()
                                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addGap(126, 126, 126)
                                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEquipoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEquipoSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEquipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(86, 86, 86)
                        .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addGap(23, 23, 23)
                        .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pan4Layout.createSequentialGroup()
                                .addComponent(txtEquipoUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                                .addComponent(bEquipoIN)
                                .addGap(1, 1, 1))
                            .addGroup(pan4Layout.createSequentialGroup()
                                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEquipoIdUbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEquipoIdCue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan4Layout.createSequentialGroup()
                                .addComponent(txtEquipoIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bEquipoMo)
                                    .addComponent(bEquipoBus)
                                    .addComponent(bEquipoEli))))
                        .addGap(46, 46, 46))))
        );
        pan4Layout.setVerticalGroup(
            pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(txtEquipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(txtEquipoUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bEquipoIN)))
                .addGap(18, 18, 18)
                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtEquipoSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(txtEquipoIdCue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtEquipoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)))
                    .addGroup(pan4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEquipoIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bEquipoBus))))
                .addGap(18, 18, 18)
                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtEquipoMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(txtEquipoIdUbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtEquipoMo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pan4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(bEquipoMo)))
                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(txtEquipoDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pan4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(bEquipoEli)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtEquipoGar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtEquipoClo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Equipo", pan4);

        tabla_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Tipo", "Marca", "Modelo", "F.Compra", "Garantia", "Clon", "Uso", "Id_cue", "Id_pr", "Id_ub"
            }
        ));
        jScrollPane1.setViewportView(tabla_1);

        bTabla.setBackground(new java.awt.Color(102, 102, 255));
        bTabla.setForeground(new java.awt.Color(0, 0, 153));
        bTabla.setText("LOOK");

        javax.swing.GroupLayout pan5Layout = new javax.swing.GroupLayout(pan5);
        pan5.setLayout(pan5Layout);
        pan5Layout.setHorizontalGroup(
            pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bTabla)
                .addGap(28, 28, 28))
        );
        pan5Layout.setVerticalGroup(
            pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bTabla)
                .addGap(0, 171, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("FichaT", pan5);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 153, 255));
        jLabel17.setText("Id");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 153, 255));
        jLabel18.setText("Nombre");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 153, 255));
        jLabel19.setText("Version");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 153, 255));
        jLabel20.setText("Descripcion");

        bSoftwareIn.setBackground(new java.awt.Color(204, 102, 255));
        bSoftwareIn.setForeground(new java.awt.Color(0, 153, 153));
        bSoftwareIn.setText("INSERT");

        bSoftwareBus.setBackground(new java.awt.Color(204, 102, 255));
        bSoftwareBus.setForeground(new java.awt.Color(0, 153, 153));
        bSoftwareBus.setText("SEARCH");

        bSoftwareMo.setBackground(new java.awt.Color(204, 102, 255));
        bSoftwareMo.setForeground(new java.awt.Color(0, 153, 153));
        bSoftwareMo.setText("UPDATE");

        bSoftwareEli.setBackground(new java.awt.Color(204, 102, 255));
        bSoftwareEli.setForeground(new java.awt.Color(0, 153, 153));
        bSoftwareEli.setText("DELETE");

        javax.swing.GroupLayout pan6Layout = new javax.swing.GroupLayout(pan6);
        pan6.setLayout(pan6Layout);
        pan6Layout.setHorizontalGroup(
            pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20))
                .addGap(78, 78, 78)
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSoftwareDes, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(txtSoftwareNom)
                    .addComponent(txtSoftwareVer)
                    .addComponent(txtSoftwareId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSoftwareIn)
                    .addComponent(bSoftwareBus)
                    .addComponent(bSoftwareMo)
                    .addComponent(bSoftwareEli))
                .addGap(35, 35, 35))
        );
        pan6Layout.setVerticalGroup(
            pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtSoftwareId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSoftwareIn))
                .addGap(57, 57, 57)
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSoftwareNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bSoftwareBus)))
                .addGap(58, 58, 58)
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSoftwareVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bSoftwareMo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSoftwareDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bSoftwareEli)))
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Sofware", pan6);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(26, 26, 26))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bEquipoBus;
    public javax.swing.JButton bEquipoEli;
    public javax.swing.JButton bEquipoIN;
    public javax.swing.JButton bEquipoMo;
    public javax.swing.JButton bSoftwareBus;
    public javax.swing.JButton bSoftwareEli;
    public javax.swing.JButton bSoftwareIn;
    public javax.swing.JButton bSoftwareMo;
    public javax.swing.JButton bTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pan1;
    private javax.swing.JPanel pan2;
    private javax.swing.JPanel pan3;
    private javax.swing.JPanel pan4;
    private javax.swing.JPanel pan5;
    private javax.swing.JPanel pan6;
    public javax.swing.JPanel panel;
    public javax.swing.JTable tabla_1;
    public javax.swing.JTextField txtCuentaApe;
    public javax.swing.JTextField txtCuentaDocu;
    public javax.swing.JTextField txtCuentaEmail;
    public javax.swing.JTextField txtCuentaId;
    public javax.swing.JTextField txtCuentaNom;
    public javax.swing.JTextField txtEquipoClo;
    public com.toedter.calendar.JDateChooser txtEquipoDate;
    public javax.swing.JTextField txtEquipoGar;
    public javax.swing.JTextField txtEquipoId;
    public javax.swing.JTextField txtEquipoIdCue;
    public javax.swing.JTextField txtEquipoIdPro;
    public javax.swing.JTextField txtEquipoIdUbi;
    public javax.swing.JTextField txtEquipoMa;
    public javax.swing.JTextField txtEquipoMo;
    public javax.swing.JTextField txtEquipoSe;
    public javax.swing.JTextField txtEquipoTipo;
    public javax.swing.JTextField txtEquipoUs;
    public javax.swing.JTextField txtProvedorDi;
    public javax.swing.JTextField txtProvedorEm;
    public javax.swing.JTextField txtProvedorNi;
    public javax.swing.JTextField txtProvedorRS;
    public javax.swing.JTextField txtProvedorSW;
    public javax.swing.JTextField txtProvedorTe;
    public javax.swing.JTextField txtSoftwareDes;
    public javax.swing.JTextField txtSoftwareId;
    public javax.swing.JTextField txtSoftwareNom;
    public javax.swing.JTextField txtSoftwareVer;
    public javax.swing.JTextField txtUbicaIndica;
    public javax.swing.JTextField txtUbicaRes;
    public javax.swing.JTextField txtUbicarId;
    public javax.swing.JTextField txtUbicarN;
    public javax.swing.JTextField txtprovedorId;
    // End of variables declaration//GEN-END:variables
}
