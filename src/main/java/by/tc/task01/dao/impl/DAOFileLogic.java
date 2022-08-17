package by.tc.task01.dao.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public class DAOFileLogic {
	
	public String[] splitterStr(String str) {
		str = str.replace(" : ", ", ");
		String[] arrstr = str.split(", ");
		
		return arrstr;
	}
/////////////////////////////////////////////////////////////
	public Appliance initSpeakers(String[] arr) {
		
		Speakers sp = new Speakers();
		
		String value;
		int val;
		double val2;
		String[] tempVal;
		
		value = arr[0];
		sp.setName(value);
		
		value = arr[1];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		sp.setPowerConsumption(val);
		
		value = arr[2];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		sp.setNumberOfSpeakers(val);
		
		value = arr[3];
		tempVal = value.split("=");
		value = tempVal[1];
		sp.setFrequencyRange(value);
		
		value = arr[4];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		sp.setCordLength(val);
		
		return sp;
	}
/////////////////////////////////////////////////////////////
	
	public Appliance initTabletPC(String[] arr) {
		
		TabletPC tp = new TabletPC();
		
		String value;
		int val;
		double val2;
		String[] tempVal;
		
		value = arr[0];
		tp.setName(value);
		
		value = arr[1];
		tempVal = value.split("=");
		value = tempVal[1];
		val2 = Double.parseDouble(value);
		tp.setBatteryCapacity(val2);
		
		value = arr[2];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		tp.setDisplayInches(val);
		
		value = arr[3];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		tp.setMemoryRom(val);
		
		value = arr[4];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		tp.setFlashMemoryCapacity(val);
		
		value = arr[5];
		tempVal = value.split("=");
		value = tempVal[1];
		tp.setColor(value);
		
		return tp;
	}
////////////////////////////////////////////////////////////

	public Appliance initVacuumCleaner(String[] arr) {
		
		VacuumCleaner vc = new VacuumCleaner();
		
		String value;
		int val;
		double val2;
		String[] tempVal;
		
		value = arr[0];
		vc.setName(value);
		
		value = arr[1];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		vc.setPowerConsumtion(val);
		
		value = arr[2];
		tempVal = value.split("=");
		value = tempVal[1];
		vc.setFilterType(value);
		
		value = arr[3];
		tempVal = value.split("=");
		value = tempVal[1];
		vc.setBagType(value);
		
		value = arr[4];
		tempVal = value.split("=");
		value = tempVal[1];
		vc.setWandType(value);
		
		value = arr[5];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		vc.setMotorSpeedRegulation(val);
		
		value = arr[6];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		vc.setCleaningWidth(val);
		
		return vc;
	}
///////////////////////////////////////////////////////////////
	public Appliance initOven(String[] arr) {
		
		Oven ov = new Oven();
		
		String value;
		int val;
		double val2;

		value = arr[0];
		ov.setName(value);

		value = arr[1];
		String[] tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		ov.setPowerConsumption(val);

		value = arr[2];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		ov.setWeight(val);

		value = arr[3];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		ov.setCapacity(val);

		value = arr[4];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		ov.setDepth(val);

		value = arr[5];
		tempVal = value.split("=");
		value = tempVal[1];
		val2 = Double.parseDouble(value);
		ov.setHeight(val2);

		value = arr[6];
		tempVal = value.split("=");
		value = tempVal[1];
		val2 = Double.parseDouble(value);
		ov.setWidth(val2);

		return ov;
	}
///////////////////////////////////////////////////////////////////
	public Appliance initLaptop(String[] arr) {
		
		Laptop lp = new Laptop();
		
		String value;
		int val;
		double val2;
		
		value = arr[0];
		lp.setName(value);
		
		value = arr[1];
		String[] tempVal = value.split("=");
		value = tempVal[1];
		val2 = Double.parseDouble(value);
		lp.setBatteryCapacity(val2);
		
		value = arr[2];
		tempVal = value.split("=");
		value = tempVal[1];
		lp.setOs(value);
		
		value = arr[3];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		lp.setMemoryRom(val);
		
		value = arr[4];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		lp.setSystemMemory(val);
		
		value = arr[5];
		tempVal = value.split("=");
		value = tempVal[1];
		val2 = Double.parseDouble(value);
		lp.setCpu(val2);
		
		value = arr[6];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		lp.setDisplayInches(val);
		
		return lp;
	}
////////////////////////////////////////////////////////////
	public Appliance initRefrigerator(String[] arr) {
		
		Refrigerator re = new  Refrigerator();
		
		String value;
		int val;
		double val2;
		String[] tempVal;
		
		value = arr[0];
		re.setName(value);
		//System.out.println(value);
		
		value = arr[1];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		re.setPowerConsumtion(val);
		
		value = arr[2];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		re.setWeight(val);
		
		value = arr[3];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		re.setFreezerCapacity(val);
		
		value = arr[4];
		tempVal = value.split("=");
		value = tempVal[1];
		val2 = Double.parseDouble(value);
		re.setOverallCapacity(val2);
		
		value = arr[5];
		tempVal = value.split("=");
		value = tempVal[1];
		val2 = Double.parseDouble(value);
		re.setHeight(val2);
		
		value = arr[6];
		tempVal = value.split("=");
		value = tempVal[1];
		val2 = Double.parseDouble(value);
		re.setWidth(val2);
		
		return re;
	}
	
}
