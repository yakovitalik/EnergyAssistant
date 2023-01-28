package ru.yakovitalik.energyassist;

import javax.swing.JFrame;

/*
 * Стартует главное окно программы
 */

public class MainWindowStart
{
    public static void main(String[] args)
    {
        MainWindow mainWindow = new MainWindow("EnergyAssistant 1.2");
        mainWindow.setVisible(true);								// делает окно видимым
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// определяет что делает кнопка выхода
        mainWindow.setSize(350, 250);					// задает размеры окна
        mainWindow.setResizable(false);								// запрещает изменять размеры окна
        mainWindow.setLocationRelativeTo(null);						// размещает окно в центре экрана
    }
}
