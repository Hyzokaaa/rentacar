/*
 * Created by JFormDesigner on Fri May 12 14:37:45 CDT 2023
 */

package cu.edu.cujae.structdb.gui;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author carlosd.inc
 */
public class HomeWindow extends JFrame {
    public HomeWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Carlos Daniel Robaina Rivero
        menuBar = new JMenuBar();
        menuAdmin = new JMenu();
        menuUser = new JMenu();
        mItemCreateUser = new JMenuItem();
        mItemDeleteUser = new JMenuItem();
        menuRol = new JMenu();
        mItemCreateRol = new JMenuItem();
        mItemDeleteRol = new JMenuItem();
        menuManage = new JMenu();
        menuContract = new JMenu();
        mItemCreateContract = new JMenuItem();
        mItemCloseContract = new JMenuItem();
        mItemDeleteContract = new JMenuItem();
        mItemCreatePayMethod = new JMenuItem();
        mItemDeletePayMehtod = new JMenuItem();
        menuTourist = new JMenu();
        mItemCreateTourist = new JMenuItem();
        mItemDeleteTourist = new JMenuItem();
        mItemCreateCountry = new JMenuItem();
        mItemDeleteCounty = new JMenuItem();
        menuCar = new JMenu();
        mItemCreateCar = new JMenuItem();
        mItemDeleteCar = new JMenuItem();
        mItemCreateBrand = new JMenuItem();
        mItemDeleteBrand = new JMenuItem();
        mItemCreateModel = new JMenuItem();
        mItemDeleteModel = new JMenuItem();
        mItemCreateSituation = new JMenuItem();
        mItemDeleteSituation = new JMenuItem();
        menuDriver = new JMenu();
        mItemCreateDriver = new JMenuItem();
        mItemDeleteDriver = new JMenuItem();
        mItemCreateCategory = new JMenuItem();
        mItemDeleteCategoy = new JMenuItem();
        menuSee = new JMenu();
        mItemGetContracts = new JMenuItem();
        mItemGetCars = new JMenuItem();
        mItemGetDrivers = new JMenuItem();
        mItemGetTourists = new JMenuItem();
        menuReports = new JMenu();
        mItemRport1 = new JMenuItem();
        mItemReport2 = new JMenuItem();
        mItemReport3 = new JMenuItem();
        mItemReport4 = new JMenuItem();
        mItemReport5 = new JMenuItem();
        mItemReport6 = new JMenuItem();
        mItemReport7 = new JMenuItem();
        mItemReport8 = new JMenuItem();
        mItemReport9 = new JMenuItem();
        menuHelp = new JMenu();
        mItemDocs = new JMenuItem();
        mItemAbout = new JMenuItem();

        //======== this ========
        setTitle("Rent a Car");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]",
            // rows
            "[]"));

        //======== menuBar ========
        {

            //======== menuAdmin ========
            {
                menuAdmin.setText("Administrar");

                //======== menuUser ========
                {
                    menuUser.setText("Administrar Usuarios");

                    //---- mItemCreateUser ----
                    mItemCreateUser.setText("Crear Usuario");
                    menuUser.add(mItemCreateUser);

                    //---- mItemDeleteUser ----
                    mItemDeleteUser.setText("Eliminar Usuario");
                    menuUser.add(mItemDeleteUser);
                }
                menuAdmin.add(menuUser);

                //======== menuRol ========
                {
                    menuRol.setText("Administrar Roles");

                    //---- mItemCreateRol ----
                    mItemCreateRol.setText("Crear Rol");
                    menuRol.add(mItemCreateRol);

                    //---- mItemDeleteRol ----
                    mItemDeleteRol.setText("Eliminar Rol");
                    menuRol.add(mItemDeleteRol);
                }
                menuAdmin.add(menuRol);
            }
            menuBar.add(menuAdmin);

            //======== menuManage ========
            {
                menuManage.setText("Gesti\u00f3n");

                //======== menuContract ========
                {
                    menuContract.setText("Gestionar Contratos");

                    //---- mItemCreateContract ----
                    mItemCreateContract.setText("Abrir Contrato");
                    menuContract.add(mItemCreateContract);

                    //---- mItemCloseContract ----
                    mItemCloseContract.setText("Cerrar Contrato");
                    menuContract.add(mItemCloseContract);

                    //---- mItemDeleteContract ----
                    mItemDeleteContract.setText("Eliminar Contrato");
                    menuContract.add(mItemDeleteContract);
                    menuContract.addSeparator();

                    //---- mItemCreatePayMethod ----
                    mItemCreatePayMethod.setText("Crear M\u00e9todo de Pago");
                    menuContract.add(mItemCreatePayMethod);

                    //---- mItemDeletePayMehtod ----
                    mItemDeletePayMehtod.setText("Eliminar M\u00e9todo de Pago");
                    menuContract.add(mItemDeletePayMehtod);
                }
                menuManage.add(menuContract);

                //======== menuTourist ========
                {
                    menuTourist.setText("Gestionar Turistas");

                    //---- mItemCreateTourist ----
                    mItemCreateTourist.setText("Registrar Cliente");
                    menuTourist.add(mItemCreateTourist);

                    //---- mItemDeleteTourist ----
                    mItemDeleteTourist.setText("Eliminar Cliente");
                    menuTourist.add(mItemDeleteTourist);
                    menuTourist.addSeparator();

                    //---- mItemCreateCountry ----
                    mItemCreateCountry.setText("Registrar Pa\u00eds");
                    menuTourist.add(mItemCreateCountry);

                    //---- mItemDeleteCounty ----
                    mItemDeleteCounty.setText("Eliminar Pa\u00eds");
                    menuTourist.add(mItemDeleteCounty);
                }
                menuManage.add(menuTourist);

                //======== menuCar ========
                {
                    menuCar.setText("Getionar Autos");

                    //---- mItemCreateCar ----
                    mItemCreateCar.setText("Registrar Auto");
                    menuCar.add(mItemCreateCar);

                    //---- mItemDeleteCar ----
                    mItemDeleteCar.setText("Dar Baja a un Auto");
                    menuCar.add(mItemDeleteCar);
                    menuCar.addSeparator();

                    //---- mItemCreateBrand ----
                    mItemCreateBrand.setText("Registrar Marca");
                    menuCar.add(mItemCreateBrand);

                    //---- mItemDeleteBrand ----
                    mItemDeleteBrand.setText("Eliminar Marca");
                    menuCar.add(mItemDeleteBrand);
                    menuCar.addSeparator();

                    //---- mItemCreateModel ----
                    mItemCreateModel.setText("Registrar Modelo");
                    menuCar.add(mItemCreateModel);

                    //---- mItemDeleteModel ----
                    mItemDeleteModel.setText("Eliminar Modelo");
                    menuCar.add(mItemDeleteModel);
                    menuCar.addSeparator();

                    //---- mItemCreateSituation ----
                    mItemCreateSituation.setText("Crear Situaci\u00f3n de los Autos");
                    menuCar.add(mItemCreateSituation);

                    //---- mItemDeleteSituation ----
                    mItemDeleteSituation.setText("Eliminar Situaci\u00f3n de los Autos");
                    menuCar.add(mItemDeleteSituation);
                }
                menuManage.add(menuCar);

                //======== menuDriver ========
                {
                    menuDriver.setText("Gestionar Choferes");

                    //---- mItemCreateDriver ----
                    mItemCreateDriver.setText("Contratar Chofer");
                    menuDriver.add(mItemCreateDriver);

                    //---- mItemDeleteDriver ----
                    mItemDeleteDriver.setText("Despedir Chofer");
                    menuDriver.add(mItemDeleteDriver);
                    menuDriver.addSeparator();

                    //---- mItemCreateCategory ----
                    mItemCreateCategory.setText("Crear Categor\u00eda de Licencia");
                    menuDriver.add(mItemCreateCategory);

                    //---- mItemDeleteCategoy ----
                    mItemDeleteCategoy.setText("Eliminar Categor\u00eda de Licencia");
                    menuDriver.add(mItemDeleteCategoy);
                }
                menuManage.add(menuDriver);
            }
            menuBar.add(menuManage);

            //======== menuSee ========
            {
                menuSee.setText("Ver");

                //---- mItemGetContracts ----
                mItemGetContracts.setText("Contratos");
                menuSee.add(mItemGetContracts);

                //---- mItemGetCars ----
                mItemGetCars.setText("Autos");
                menuSee.add(mItemGetCars);

                //---- mItemGetDrivers ----
                mItemGetDrivers.setText("Choferes");
                menuSee.add(mItemGetDrivers);

                //---- mItemGetTourists ----
                mItemGetTourists.setText("Turistas");
                menuSee.add(mItemGetTourists);
            }
            menuBar.add(menuSee);

            //======== menuReports ========
            {
                menuReports.setText("Reportes");

                //---- mItemRport1 ----
                mItemRport1.setText("Listado de Turistas");
                menuReports.add(mItemRport1);

                //---- mItemReport2 ----
                mItemReport2.setText("Listado de Autos");
                menuReports.add(mItemReport2);

                //---- mItemReport3 ----
                mItemReport3.setText("Listado de Contratos");
                menuReports.add(mItemReport3);

                //---- mItemReport4 ----
                mItemReport4.setText("Listado de Choferes");
                menuReports.add(mItemReport4);

                //---- mItemReport5 ----
                mItemReport5.setText("Situacion de los Autos");
                menuReports.add(mItemReport5);

                //---- mItemReport6 ----
                mItemReport6.setText("Turistas Incumplidores");
                menuReports.add(mItemReport6);

                //---- mItemReport7 ----
                mItemReport7.setText("Contratos por Autos");
                menuReports.add(mItemReport7);

                //---- mItemReport8 ----
                mItemReport8.setText("Contratos por Pa\u00edses");
                menuReports.add(mItemReport8);

                //---- mItemReport9 ----
                mItemReport9.setText("Ingresos Anuales");
                menuReports.add(mItemReport9);
            }
            menuBar.add(menuReports);

            //======== menuHelp ========
            {
                menuHelp.setText("Ayuda");

                //---- mItemDocs ----
                mItemDocs.setText("Documentaci\u00f3n");
                menuHelp.add(mItemDocs);

                //---- mItemAbout ----
                mItemAbout.setText("Sobre Rentacar");
                menuHelp.add(mItemAbout);
            }
            menuBar.add(menuHelp);
        }
        setJMenuBar(menuBar);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Carlos Daniel Robaina Rivero
    private JMenuBar menuBar;
    private JMenu menuAdmin;
    private JMenu menuUser;
    private JMenuItem mItemCreateUser;
    private JMenuItem mItemDeleteUser;
    private JMenu menuRol;
    private JMenuItem mItemCreateRol;
    private JMenuItem mItemDeleteRol;
    private JMenu menuManage;
    private JMenu menuContract;
    private JMenuItem mItemCreateContract;
    private JMenuItem mItemCloseContract;
    private JMenuItem mItemDeleteContract;
    private JMenuItem mItemCreatePayMethod;
    private JMenuItem mItemDeletePayMehtod;
    private JMenu menuTourist;
    private JMenuItem mItemCreateTourist;
    private JMenuItem mItemDeleteTourist;
    private JMenuItem mItemCreateCountry;
    private JMenuItem mItemDeleteCounty;
    private JMenu menuCar;
    private JMenuItem mItemCreateCar;
    private JMenuItem mItemDeleteCar;
    private JMenuItem mItemCreateBrand;
    private JMenuItem mItemDeleteBrand;
    private JMenuItem mItemCreateModel;
    private JMenuItem mItemDeleteModel;
    private JMenuItem mItemCreateSituation;
    private JMenuItem mItemDeleteSituation;
    private JMenu menuDriver;
    private JMenuItem mItemCreateDriver;
    private JMenuItem mItemDeleteDriver;
    private JMenuItem mItemCreateCategory;
    private JMenuItem mItemDeleteCategoy;
    private JMenu menuSee;
    private JMenuItem mItemGetContracts;
    private JMenuItem mItemGetCars;
    private JMenuItem mItemGetDrivers;
    private JMenuItem mItemGetTourists;
    private JMenu menuReports;
    private JMenuItem mItemRport1;
    private JMenuItem mItemReport2;
    private JMenuItem mItemReport3;
    private JMenuItem mItemReport4;
    private JMenuItem mItemReport5;
    private JMenuItem mItemReport6;
    private JMenuItem mItemReport7;
    private JMenuItem mItemReport8;
    private JMenuItem mItemReport9;
    private JMenu menuHelp;
    private JMenuItem mItemDocs;
    private JMenuItem mItemAbout;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}