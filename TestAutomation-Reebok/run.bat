set projectpath=D:\eclipse\workspace\TestAutomation-Reebok
cd %projectpath%
set classpath=%projectpath%\bin;%projectpath%\lib\*
java org.testng.TestNG %projectpath%\testng.xml
pause