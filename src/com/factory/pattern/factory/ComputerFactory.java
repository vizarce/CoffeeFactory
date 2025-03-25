package com.factory.pattern.factory;

import com.factory.pattern.model.Computer;
import com.factory.pattern.model.ComputerType;
import com.factory.pattern.model.GamingPC;
import com.factory.pattern.model.OfficePC;
import com.factory.pattern.model.ServerPC;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerType computerType, String name, int ramGb, 
									int hddGb, double cpuGHz, 
									String graphicCard, String motherBoard) {
		Computer computer = null;
		switch(computerType) {
			case OFFICE_PC:
				computer = new OfficePC(name, ramGb, hddGb, cpuGHz, graphicCard, motherBoard);
				break;
			case GAMING_PC:
				computer = new GamingPC(name, ramGb, hddGb, cpuGHz, graphicCard, motherBoard);
				break;
			case SERVER_PC:
				computer = new ServerPC(name, ramGb, hddGb, cpuGHz, graphicCard, motherBoard);
				break;
			default:
				computer = null;
				break;
		}
		return computer;
	}
}
