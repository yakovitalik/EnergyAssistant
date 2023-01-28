package ru.yakovitalik.energyassist;

import javax.swing.JFrame;

/*
 * Стартует фрейм с расчетом мощности трансформатора
 */

public class CalcStart1
{
    public static void start()
    {
        Calculation1 calc1 = new Calculation1("Расчет мощности трансформатора");
        calc1.setVisible(true);									// делает окно видимым
        calc1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	// определяет что делает кнопка выхода
        calc1.setSize(420, 230);					// задает размеры окна
        calc1.setResizable(false);								// запрещает изменять размеры окна
        calc1.setLocationRelativeTo(null);						// размещает окно в центре экрана
    }
}
