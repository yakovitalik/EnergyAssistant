package assistant;

import javax.swing.JFrame;

/*
 * Стартует фрейм с расчетом полной мощности
 */

public class CalcStart2
{
    public static void start()
    {
        Calculation2 calc2 = new Calculation2("Расчет полной мощности");
        calc2.setVisible(true);									// делает окно видимым
        calc2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	// определяет что делает кнопка выхода
        calc2.setSize(360, 200);								// задает размеры окна
        calc2.setResizable(false);								// запрещает изменять размеры окна
        calc2.setLocationRelativeTo(null);						// размещает окно в центре экрана
    }
}
