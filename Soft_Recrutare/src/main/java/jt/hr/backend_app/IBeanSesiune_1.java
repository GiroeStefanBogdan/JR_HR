/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jt.hr.backend_app;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ionut
 */
@Remote
public interface IBeanSesiune {
    List<String> getRecords();
    public int getCount();
}
