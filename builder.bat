goto start

-------------------------------
Этот пакетный файл предназначен для сборки java проекта в exe-файл с запакованной jre
-------------------------------

:start

jpackage ^
--name self-contained-app ^
--type exe ^
--app-version "1.2.34" ^
--copyright "© 2021 Daltransugol" ^
--description "Simulation model of Vanino bulker terminal" ^
--vendor "Dilibrium®" ^
--dest "self-contained-app-exe" ^
--input "self-contained-app-jar" ^
--main-jar "self-contained-app.jar" ^
--icon "self-contained-app-jar\app-icon.ico" ^
--temp "self-contained-app-temp" ^
--win-shortcut

pause
