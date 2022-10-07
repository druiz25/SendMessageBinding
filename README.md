# Proyecto: SendMessageBinding
Autor: Daniel Ruiz Villodres
Minimum SDK: API 21 Android 5.0 (Lollipop)

Se busca enviar un mensaje y usuario de una activity a otra mientras se practican conceptos como el view y data binding, la creación de documentación, traducciones, cambio de iconos como se puede observar en la siguiente imagen. <br /> <br />
[![Icono](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjPr8yryDPsDZdmh5xwqdXLtZ0P_SfE7DvnhT1L74seGtITZc30OQfRrvAFH3qS-Csir8kgTILLTJpOF0rnT4bYfl1NmpKjSgrGR1S6Maypqk0oX8jfZfc-EuFlFAij8vWonI_0-0QZhj7mSGGg4Pn0Y4aXLg8tOs2m9DgYtUySLPCTzBMhPRHujgPvkQ/s1600/3.PNG "Icono")](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjPr8yryDPsDZdmh5xwqdXLtZ0P_SfE7DvnhT1L74seGtITZc30OQfRrvAFH3qS-Csir8kgTILLTJpOF0rnT4bYfl1NmpKjSgrGR1S6Maypqk0oX8jfZfc-EuFlFAij8vWonI_0-0QZhj7mSGGg4Pn0Y4aXLg8tOs2m9DgYtUySLPCTzBMhPRHujgPvkQ/s1600/3.PNG "Icono") <br /> <br />
# Clases<br />
	Clase Message:  Clase modelo que contiene el dato del usuario y el mensaje que se envia, esta clase implementa las interfaces Serializable y Parceable.
	Clase User: Clase modelo que contiene el nombre y email del usuario que se logea en la aplicación, esta clase implementa las interfaces Serializable y Parceable.
	Clase SendMessageApplication: Clase que estara activa durante todo el ciclo de vida de la aplicación y contiene las variables globales de esta en este caso una instancia de la clase usuario que se logeara por defecto en la aplicación, esta clase hereda de la clase Application.

# Activitys
## SendMessageActivity:
Contiene dos editText y un button, en el primer editText se introducira el usuario aunque en este caso se autoCompleta con el usuario de SendMessageApplication aunque se puede borrar y sustituir, en el segundo editText se pondria el mensaje que se desea enviar y por ultimo esta el button que sirve para enviar un bundle con objeto de la clase Message que contiene el usuario y mensaje de los editText aparte cuenta con un menu desplegable en la parte superior derecha que permite acceder al About Us <br /> <br />
[![SendMessageActivity](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEib794qWd8FUdzZViwuJJo5FueEg-7iYNmiozY9WELhpLbvEZ7IC_9Ciw_loXwrXnHcATweKe7dEU9Pj-oXIuwvoIlJViMEBOhCeGp-a3ahjPAXCRaj50SW410YAPDY_aLieTbUBYg9W4v5so3latMI80hkCjuCvOYYJO8_QUM-uTMlLgavwH6UB5hctg/s320/1.PNG "SendMessageActivity")](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEib794qWd8FUdzZViwuJJo5FueEg-7iYNmiozY9WELhpLbvEZ7IC_9Ciw_loXwrXnHcATweKe7dEU9Pj-oXIuwvoIlJViMEBOhCeGp-a3ahjPAXCRaj50SW410YAPDY_aLieTbUBYg9W4v5so3latMI80hkCjuCvOYYJO8_QUM-uTMlLgavwH6UB5hctg/s320/1.PNG "SendMessageActivity") <br />

## ViewMessageActivity
Contiene cuatro textView, un imageView, el primero enseña el usuario, el segundo el mensaje estos valores son obtenidos atraves de un mensaje que llega dentro de un bundle los otros dos aun no tienen proposito y el imageView es por fines decorativos <br /> <br />
[![ViewMessageActivity](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiimgohIQItajPStmRGachEgtzokXrzjnD4lGSL0feU95jPWP_CiT8DFBsgQto1yEBUxI4PeBAUx2Z7tL7aCnz64wh2DHHySjLKMujkuZDYaGVeTTzmXfF-C0--bDXvJBve_3lM6xoaikMPg98U5YSU2m60RlEW7522y-l36oW3lpBt2LlQgJ5Eg_QpTA/s320/2.PNG "ViewMessageActivity")](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiimgohIQItajPStmRGachEgtzokXrzjnD4lGSL0feU95jPWP_CiT8DFBsgQto1yEBUxI4PeBAUx2Z7tL7aCnz64wh2DHHySjLKMujkuZDYaGVeTTzmXfF-C0--bDXvJBve_3lM6xoaikMPg98U5YSU2m60RlEW7522y-l36oW3lpBt2LlQgJ5Eg_QpTA/s320/2.PNG "ViewMessageActivity") <br />
## AboutUsActivity
En esta activity se implementa el repositorio MaterialAbout de jrvansuita lo que nos permite crear una pagina aboutUs con un alto nivel de detalle contando con enlaces a github,facebook y google play aparte de foto y fondo de perfil <br/> <br/>
[![AboutUs](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhd4W3yJWDTsc4TSSjvoyE6XgueBrNDsFXpUnyIsx60JQkJHSWl56Wv85F3pN6lEouk9Zjsohg1oJ57-OXuR2QenqpPW7YRzDaHktrnDZ7m5dQp-4laZ-1ngjJRz9PB9B0QDUmQjevUd6jqP_90j2dlbGHxo5PSStfcWl4jXuPJlNrHUmBYvDkdXhvLkg/s320/aboutUs.PNG "AboutUs")](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhd4W3yJWDTsc4TSSjvoyE6XgueBrNDsFXpUnyIsx60JQkJHSWl56Wv85F3pN6lEouk9Zjsohg1oJ57-OXuR2QenqpPW7YRzDaHktrnDZ7m5dQp-4laZ-1ngjJRz9PB9B0QDUmQjevUd6jqP_90j2dlbGHxo5PSStfcWl4jXuPJlNrHUmBYvDkdXhvLkg/s320/aboutUs.PNG "AboutUs")
