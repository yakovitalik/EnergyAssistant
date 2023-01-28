package ru.yakovitalik.energyassist;

import javax.swing.JFrame;

/*
 * Стартует фрейм с расчетом мощности трансформатора
 */

public class AboutStart
{
    public static void start()
    {
        About about = new About("О программе");
        about.setVisible(true);									// делает окно видимым
        about.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	// определяет что делает кнопка выхода
        about.setSize(650, 360);					// задает размеры окна
        about.setResizable(false);								// запрещает изменять размеры окна
        about.setLocationRelativeTo(null);						// размещает окно в центре экрана
    }
}
