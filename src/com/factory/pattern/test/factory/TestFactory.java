package com.factory.pattern.test.factory;

import com.factory.pattern.factory.ComputerFactory;
import com.factory.pattern.model.Computer;
import com.factory.pattern.model.ComputerType;

public class TestFactory {

	public static void main(String[] args) {
		Computer officePC = ComputerFactory.getComputer(ComputerType.OFFICE_PC, "OFF-PC-AS-1018-Pro5", 8, 250, 2.4, "NVIDIA XR-7890 HD XR", "NVIDIA 255GH45 Pro-78");
		Computer gamingPC = ComputerFactory.getComputer(ComputerType.GAMING_PC, "G385BC0-11 PRO", 16, 1000, 3.4, "AMD Radeon RX 7600 XT", "A-8 3870 AsRock Taichi 7750X");
		Computer serverPC = ComputerFactory.getComputer(ComputerType.SERVER_PC, "Server-XPD-115-A GP", 12, 500, 2.9, "Integrated Radeon HD 6500", "AsRock A55 Pro-3");
		System.out.println("Factory OfficePC Config::: " + officePC);
		System.out.println("Factory GamingPC Config::: " + gamingPC);
		System.out.println("Factory ServerPC Config::: " + serverPC);
	}
}
