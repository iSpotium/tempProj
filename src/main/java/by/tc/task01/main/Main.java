package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.io.IOException;
import java.util.List;

import by.tc.task01.dao.impl.FileApplianceDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) throws IOException {

		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		FileApplianceDAOImpl daoImpl = new FileApplianceDAOImpl();

		Criteria criteria = new Criteria(Speakers.class.getSimpleName()); //

		criteria.add(Speakers.NUMBER_OF_SPEAKERS.toString(), 2);
		criteria.add(Speakers.POWER_CONSUMPTION.toString(), 20);
		criteria.add(Speakers.FREQUENCY_RANGE.toString(), "2-3.5");
		
		appliances = daoImpl.find(criteria);

		for (Appliance i : appliances) {
			System.out.println(i.toString());
		}

	}

}
