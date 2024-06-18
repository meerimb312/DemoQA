package com.demoqa.pages;

import lombok.*;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
public class DemoQAPages {

    protected TextBoxPage textBoxPage = new TextBoxPage();
    protected AlertPage alertPage = new AlertPage();
    protected ButtonsPage buttonsPage = new ButtonsPage();
    protected MenuPage menuPage = new MenuPage();
    protected ProgressBarPage progressBarPage = new ProgressBarPage();
    protected PracticeFormPage practiceFormPage = new PracticeFormPage();
    protected WebTablePage webTablePage = new WebTablePage();

}
