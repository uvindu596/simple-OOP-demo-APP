package BankManagement;


import java.io.File;
import javax.swing.filechooser.FileFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class bofFilter extends FileFilter {

    public bofFilter() {
    }

    @Override
    public boolean accept(File f) {
    if(f.isDirectory() || f.getName().toLowerCase().endsWith(".bof"))
    {
    return true;
    }
    else
    {return  false;}
    }

    @Override
    public String getDescription() {
    return "Bank Object File";
    }
    
}
