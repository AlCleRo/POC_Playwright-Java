# Configuración

1.	Diseñar la batería de pruebas y el código de testing en BDD (Pages, steps, features [gherkin]). 
2.	Archivo Init (Steps): Este archivo contiene el código de inicialización en formato cucumber hooks. Únicamente pero no poco importante, hay que introducir la URL de la página de inicio de la web a testear. Está preparado para testing en Chromium con un contexto web limpio (en caso de cambiar condiciones, habría que modificar esta parte del código)
3.	Archivo PageObjectManager (Steps): Este archivo debe contener todas las pages necesarias para el test. No es más que un archivo de propagación de la clase page creada por Playwright a todas las pages creadas, ahorrando repetición de código. Se llama en el hook @Before del archivo Init.
4.	Configurar un Jenkins, con la definicion de la pipeline en “Script from SCM”, SCM el git y el script path Jenkinsfile. Modificar el Jenkinsfile a conveniencia.
5.	Configurar un canal Slack e introducir la Url del hook en el archivo slackscript.sh, que se puede modificar a conveniencia para cambiar el aspecto y funcionalidades del mensaje.


# Diagrama código

![Diagrama codigo](https://github.com/AlCleRo/POC_Playwright-Java-OSCommerce/assets/107319613/141612f4-61b5-420f-845d-fde8c587bff3)


# Esquema integración/funcionamiento

![Diagrama Playwright-Java-OSCommerce](https://github.com/AlCleRo/POC_Playwright-Java-OSCommerce/assets/107319613/1c8cb23a-f485-4c0e-ad69-dcabd0f6f1b6)
