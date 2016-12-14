# JDIProject

Тесты: 

*Login (LoginTest) https://jdi-framework.github.io/tests/index.htm  используется dataprovider и Form<br />
*Plate Test. Тестируется страница https://jdi-framework.github.io/tests/page2.htm  <br />
Используется dataprovider и Form<br />
*Pagination Test
*Тесты элементов на странице Different Elements https://jdi-framework.github.io/tests/page8.htm
*<br />
*<br />


Тест Login считается пройденным, если при корректных данных происходит вход в систему, а при некорректных - <br />
не происходит.<br />

Тест PlateTest считается пройденным, если в окне  результатов отображаются  правильные названия выбранных <br /> 
элементов и верный результат вычисления <br />

Тесты Pagination считается пройденным, если:<br />
1. при нажатии на выбранную кнопку selectPage(index) открывются страницы, соответствующие цифре на кнопке,<br />
2. при нажатии на кнопку last должна открываться последняя страница, first - первая, next- следующая
3. при нажатии на последнюю кнопку, кнопки next и last становятся неактивными<br />
4. при нажатии на первую кнопка кнопку, кнопки previous и first становятся неактивными<br />

Тесты DifferentElementsTest  считаются пройденными, если: 
1. при тестировании checkboxes  на странице Different Elements совпадают нажатые (выбранные) кнопки и кнопки  <br />
в состоянии selected<br />
2. при тестировании  radiobuttons на странице Different Elements совпадают нажатые (выбранные) кнопки и кнопки  <br />
   в состоянии selected<br />
3. при тестировании  кнопок на странице Different Elements совпадают названия  кнопок и информация  <br />
  в log window<br />
4. при тестировании dropdown совпадает выбранная в меню опция и текст в поле dropdown (JavaScript) 
 
