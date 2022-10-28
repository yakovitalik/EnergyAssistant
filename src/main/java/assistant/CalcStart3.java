package assistant;

import javax.swing.JFrame;

/*
 * Стартует фрейм с расчетом тока и косинуса по активной и реактивной мощностям
 */

public class CalcStart3
{
    public static void start()
    {
        Calculation3 calc3 = new Calculation3("Расчет косинуса и тока");
        calc3.setVisible(true);									// делает окно видимым
        calc3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);		// определяет что делает кнопка выхода
        calc3.setSize(360, 300);						// задает размеры окна
        calc3.setResizable(false);						// запрещает изменять размеры окна
        calc3.setLocationRelativeTo(null);						// размещает окно в центре экрана
    }
}
