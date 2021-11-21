Feature: Automatizacion para Skill Hacking Banistmo
  Yo como tester automatizador
  Necesito automatizar la visualizacion de un archivo PDF en el sitio web de Banistmo
  Para demostrar habilidades en automatizacion de pruebas

  Scenario: Generar archivo PDF
    Given "Usuario" ingresa al sitio web de Banistmo
    When Ingresa a la seccion de documentos del apartado de cuenta de ahorro comercial
    Then Visualiza el archivo PDF nombrado como "Contrato Unico de Producto y Servicios Bancarios"