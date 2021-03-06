//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.appzone.sciencealerts.hibernate.dao;

import com.appzone.sciencealerts.hibernate.model.ScienceAlerts;
import java.util.List;

public interface ScienceAlertsDao {
    void save(ScienceAlerts var1);

    void update(ScienceAlerts var1);

    void delete(ScienceAlerts var1);

    boolean checkIsScienceAlertExists(String var1);

    ScienceAlerts findScienceAlertById(Long var1);

    ScienceAlerts getRandomScienceAlert();

    List<ScienceAlerts> findScienceAlertByName(String var1, String var2);

    ScienceAlerts getAdminScienceAlert(Long var1);

    List<ScienceAlerts> getDailyScienceAlert();
}
