package com.example.studies_servlet;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Database {
    private static List<Corporation> corpList = new ArrayList<>();
    private static Integer sequencialKey = 1;

    static {
        Date corpsDate = new Date();
        Corporation corp = new Corporation("Alura", corpsDate);
        Corporation corp1 = new Corporation("Caelum", corpsDate);
        corp.setId(sequencialKey++);
        corp1.setId(sequencialKey++);
        Database.corpList.add(corp);
        Database.corpList.add(corp1);
    }
    public void insertCorporation(Corporation corp) {
        corp.setId(Database.sequencialKey++);
        corpList.add(corp);
    }

    public List<Corporation> getCorps(){
        return Database.corpList;
    }

    public void removeCorp(Integer id) {
        Iterator<Corporation> it = corpList.iterator();
        while(it.hasNext()) {
            Corporation corp = it.next();
            if (corp.getId() == id) {
                it.remove();
            }
        }
    }

    public Corporation getCorpById(Integer id) {
        for (Corporation corp : corpList) {
            if (corp.getId() == id) {
                return corp;
            }
        }
        return null;
    }
}
