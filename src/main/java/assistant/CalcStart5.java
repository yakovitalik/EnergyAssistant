package assistant;

import javax.swing.JFrame;

/*
 * Стартует фрейм с расчетом реактивной мощности
 */

public class CalcStart5
{
    public static void start()
    {
        Calculation5 calc5 = new Calculation5("Расчет полной мощности");
        calc5.setVisible(true);									// делает окно видимым
        calc5.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	// определяет что делает кнопка выхода
        calc5.setSize(395, 200);					// задает размеры окна
        calc5.setResizable(false);								// запрещает изменять размеры окна
        calc5.setLocationRelativeTo(null);						// размещает окно в центре экрана
    }
}
