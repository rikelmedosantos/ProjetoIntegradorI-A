@echo off
chcp 65001 > nul
cd /d "%~dp0"

where javac > nul 2>&1
if errorlevel 1 (
    echo Java nao foi encontrado. Feche e abra o terminal novamente.
    pause
    exit /b 1
)

if not exist "out" mkdir "out"

echo Compilando o Espelho Consultor...
javac -encoding UTF-8 -d "out" "src\ChatbotEspelho.java"

if errorlevel 1 (
    echo.
    echo Nao foi possivel compilar o programa.
    pause
    exit /b 1
)

echo.
java -cp "out" ChatbotEspelho

echo.
pause
