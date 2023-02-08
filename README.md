# EnergyAssistant

This program makes calculations of the parameters of the electrical network. 
***********************************
<img src=https://github.com/yakovitalik/EnergyAssistant/blob/main/demo1.gif>

***********************************
В главном окне выбирается вид расчета, нажатием на соответствующую кнопку 
открывается новое окно с вводом параметров и получением результатов соответствующего расчета. 

Содержит несколько расчетных модулей:

Модуль 1. Выбор мощности трансформатора по активной мощности и коэффициенту нагрузки (cos ф).
	Данный модуль помогает выбрать мощность траснформатора, который неободимо установить
	потребителю, исходя из величины его потребляемой(или заявленной) активной мощности(кВт) и 
	типа нагрузки(cos ф). 

Модуль 2. Расчет полной мощности. 
	Выполняет расчет полной мощности(кВА) на основании значений введенной активной (кВт) и 
	реактивной(кВар) мощностей.

Модуль 3. Расчет тока и коэфициента мощности. 
	Для расчета необходимо ввести активную(кВт), реактивную мощность(кВар) и напряжение(кВ). 
	Далее программа расчитает коэффициент мощности(cos Ф) и ток(А).

Модуль 4. Расчет величины загрузки трансформатора 6-10/0,4кВ. 
	Модуль определяет коэффициент загрузки трансформатора на основании введенных 
	значений токов по фазам по стороне нижнего напряжения трансформатора. 

Модуль 5. Расчет реактивной мощности. 
	Определяет величину реактивной мощности(кВар) по введенному значению активной мощности(кВт) 
	и коэффициента мощности(cos ф).


Модуль 6.(В разработке). Выбор сечения провода(кабеля).
	Определяет требуемое минимальное сечение, исходя из введенных параметров мощности или тока. 


********************************
Общая информация о программе
********************************
Программа написана на языке Java(1.8). Сборка на Maven. 
Для создания GUI использованы только стандартные библиотеки Swing/AWT.
Программа является кросплатформенной, работающей на ОС Windows, Linux, MacOs.
Полностью собрана в .exe файл для windows и jar file для остальных ОС.

Автор: Виталий Яковлев. 
email: yakovitalik@mail.ru
********************************
