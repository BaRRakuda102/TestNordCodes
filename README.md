## Автоматизированное тестирование сайта NORD.CODES
____
### :large_blue_circle: Содержание
:wrench: Покрытый функционал

:wrench: Технологический стек

:wrench: Запуск тестов из терминала

:wrench: Удаленный запуск тестов

:wrench: Сборка в Jenkins

:wrench: Отчет о результатах тестирования в Allure Report

:wrench: Уведомления в Telegram с использованием бота

:wrench: Пример запуска теста в Selenoid
____
### Функционал
#### UI
:white_check_mark: Проверка открытия ссылки

:white_check_mark: Открытие страницы Контакты

:white_check_mark: Заполнение формы

:white_check_mark: Проверка наличия вакансий

:white_check_mark: Проверка информации о компании
____    
### Технологический стек

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="https://starchenkov.pro/qa-guru/img/skills/Intelij_IDEA.svg">
<img width="6%" title="Java" src="https://starchenkov.pro/qa-guru/img/skills/Java.svg">
<img width="6%" title="Selenide" src="https://starchenkov.pro/qa-guru/img/skills/Selenide.svg">
<img width="6%" title="Selenoid" src="https://starchenkov.pro/qa-guru/img/skills/Selenoid.svg">
<img width="6%" title="Allure Report" src="https://starchenkov.pro/qa-guru/img/skills/Allure_Report.svg">
<img width="6%" title="Gradle" src="https://starchenkov.pro/qa-guru/img/skills/Gradle.svg">
<img width="6%" title="JUnit5" src="https://starchenkov.pro/qa-guru/img/skills/JUnit5.svg">
<img width="6%" title="Jenkins" src="https://starchenkov.pro/qa-guru/img/skills/Jenkins.svg">
</p>

____
### Запуск тестов из терминала
#### Локальный запуск тестов

```
gradle clean test
```

#### Удаленный запуск тестов
```
clean
test
-Dbrowser=${BROWSER}
-Dsize=${SIZE}
```
____

### :o: Главная страница сборки в Jenkins
____
![](src/test/resources/img/1.png)
### :o: Отчет о результатах тестирования в Allure Report
____
#### :white_check_mark: Главная страница Allure-отчета
![](src/test/resources/img/2.png)
____
#### :white_check_mark: Страница с тестами
![](src/test/resources/img/3.png)
____
### :o: Уведомления в Telegram с использованием бота 
____
После завершения сборки бот, созданный в `Telegram`, автоматически обрабатывает и отправляет сообщение с отчетом.
![](src/test/resources/img/4.png)
____
### :o: Пример запуска теста в Selenoid
____
К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
![](src/test/resources/img/5.mp4)