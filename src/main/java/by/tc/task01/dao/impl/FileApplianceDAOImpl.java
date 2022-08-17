package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;

public class FileApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {

		Map<String, Object> crits = criteria.getCriteria();
		Set<String> applString = new HashSet();

		File datafile = new File("D:\\WorkSpace\\appliances_db.txt");
		FileReader fr = new FileReader(datafile);
		BufferedReader read = new BufferedReader(fr);

		String temp;
		String line;
		line = read.readLine();

		while (line != null) {
			if ((criteria.getGroupSearchName() == null) || (line.contains(criteria.getGroupSearchName()))) {
				for (Map.Entry<String, Object> ent : crits.entrySet()) {
					temp = ent.getKey() + "=" + ent.getValue();
					if (line.contains(temp)) {
						applString.add(line);
					}
				}

			}
			line = read.readLine();
		}
		read.close();

		/*
		 * System.out.println(); System.out.println("List strings"); for (String i :
		 * applString) { System.out.println(i); } System.out.println();
		 */
		
		List<Appliance> criterialAppliance = new ArrayList();
		DAOFileLogic log = new DAOFileLogic();
		String[] arrtemp;
		for (String el : applString) {
			arrtemp = log.splitterStr(el);
			String objName;
			objName = arrtemp[0];
			switch (objName) {
			case "Oven":
				criterialAppliance.add(log.initOven(arrtemp));
				break;
			case "Laptop":
				criterialAppliance.add(log.initLaptop(arrtemp));
				break;
			case "Refrigerator":
				criterialAppliance.add(log.initRefrigerator(arrtemp));
				break;
			case "VacuumCleaner":
				criterialAppliance.add(log.initVacuumCleaner(arrtemp));
				break;
			case "TabletPC":
				criterialAppliance.add(log.initTabletPC(arrtemp));
				break;
			case "Speakers":
				criterialAppliance.add(log.initSpeakers(arrtemp));
				break;
			}
		}

		return criterialAppliance;
	}
}