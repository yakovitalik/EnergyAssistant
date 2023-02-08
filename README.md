# EnergyAssistant

This program makes calculations of the parameters of the electrical network. 
***********************************
<img src=https://github.com/yakovitalik/EnergyAssistant/blob/main/demo1.gif>

***********************************
About the program
***********************************
This is a program with a GUI interface for calculating the parameters of electrical networks.
The program is written in Java(1.8), built on Maven.
When creating EnergyAssistant, standard swing / awt GUI libraries were used.

The program is cross-platform, running on Windows, Linux, MacOs.

********************************
How to get this program
********************************
The Release section contains program files in .exe and .jar formats.
You can download these files from there.
To run on Windows use the .exe file, for Linux and MacOs use the .jar file.

********************************
How to use the program
********************************
In the main window, the type of calculation is selected by clicking on the corresponding button
a new window opens with entering parameters and obtaining the results of the corresponding calculation.

The program contains several calculation modules:

Module 1.	
Selection of transformer power according to active power and load factor (cos f).
This module helps to choose the power of the transformer, which must be installed by the consumer,
based on the value of its consumed (or declared) active power (kW) and load type (cos f).

Module 2. 
Total power calculation.
Calculates apparent power (kVA) based on input active (kW) and reactive (kVar) powers.

Module 3.
Calculation of current and power factor.
For calculation it is necessary to enter active (kW), reactive power (kVar) and voltage (kV).
Next, the program calculates the power factor (cos f) and current (A).

Module 4.
Calculation of the load value of the transformer 6-10 / 0.4 kV.
The module determines the transformer load factor based on the entered values
currents by phases on the low voltage side of the transformer.

Module 5.
Calculation of reactive power.
Determines the value of reactive power (kvar) according to the entered value of active power (kW)
and power factor (cos f).

************************************


