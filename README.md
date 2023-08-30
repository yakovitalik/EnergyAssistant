# EnergyAssistant

Эта программа производит расчеты параметров электрической сети 
(English translation at the bottom of the page).
***********************************
<img src=https://github.com/yakovitalik/EnergyAssistant/blob/main/demo1.gif>

***********************************
## О программе
***********************************
Это программа с графическим интерфейсом для расчета параметров электрических сетей.
Программа написана на Java(1.8), построена на Maven.
При создании EnergyAssistant использовались стандартные GUI-библиотеки swing/awt.

Программа кроссплатформенная, работает на Windows, Linux, MacOs.

********************************
## Как получить эту программу
********************************
Раздел Release содержит файлы программы в форматах .exe и .jar.
Вы можете скачать эти файлы оттуда.
Для запуска в Windows используйте файл .exe, для Linux и MacO — файл .jar.

********************************
## Как пользоваться программой
********************************
В главном окне тип расчета выбирается нажатием на соответствующую кнопку
откроется новое окно с вводом параметров и получением результатов соответствующего расчета.

Программа содержит несколько расчетных модулей:

### Модуль 1.	
Выбор мощности трансформатора в зависимости от активной мощности и коэффициента нагрузки (cos f).
Этот модуль помогает выбрать мощность трансформатора, который должен установить потребитель.
исходя из значения его потребляемой (или заявленной) активной мощности (кВт) и типа нагрузки (cos f).

### Модуль 2. 
Расчет общей мощности.
Вычисляет полную мощность (кВА) на основе входной активной (кВт) и реактивной (кВар) мощностей.

### Модуль 3.
Расчет тока и коэффициента мощности.
Для расчета необходимо ввести активную (кВт), реактивную мощность (кВар) и напряжение (кВ).
Далее программа вычисляет коэффициент мощности (cos f) и ток (А).

### Модуль 4.
Расчет величины нагрузки трансформатора 6-10/0,4 кВ.
Модуль определяет коэффициент нагрузки трансформатора на основе введенных значений.
токи по фазам на стороне низкого напряжения трансформатора.

### Модуль 5.
Расчет реактивной мощности.
Определяет значение реактивной мощности (квар) в соответствии с введенным значением активной мощности (кВт).
и коэффициент мощности (cos f).

***********************************
***********************************

# EnergyAssistant

This program makes calculations of the parameters of the electrical network. 
***********************************
<img src=https://github.com/yakovitalik/EnergyAssistant/blob/main/demo1.gif>

***********************************
## About the program
***********************************
This is a program with a GUI interface for calculating the parameters of electrical networks.
The program is written in Java(1.8), built on Maven.
When creating EnergyAssistant, standard swing / awt GUI libraries were used.

The program is cross-platform, running on Windows, Linux, MacOs.

********************************
## How to get this program
********************************
The Release section contains program files in .exe and .jar formats.
You can download these files from there.
To run on Windows use the .exe file, for Linux and MacOs use the .jar file.

********************************
## How to use the program
********************************
In the main window, the type of calculation is selected by clicking on the corresponding button
a new window opens with entering parameters and obtaining the results of the corresponding calculation.

The program contains several calculation modules:

### Module 1.	
Selection of transformer power according to active power and load factor (cos f).
This module helps to choose the power of the transformer, which must be installed by the consumer,
based on the value of its consumed (or declared) active power (kW) and load type (cos f).

### Module 2. 
Total power calculation.
Calculates apparent power (kVA) based on input active (kW) and reactive (kVar) powers.

### Module 3.
Calculation of current and power factor.
For calculation it is necessary to enter active (kW), reactive power (kVar) and voltage (kV).
Next, the program calculates the power factor (cos f) and current (A).

### Module 4.
Calculation of the load value of the transformer 6-10 / 0.4 kV.
The module determines the transformer load factor based on the entered values
currents by phases on the low voltage side of the transformer.

### Module 5.
Calculation of reactive power.
Determines the value of reactive power (kvar) according to the entered value of active power (kW)
and power factor (cos f).

************************************


