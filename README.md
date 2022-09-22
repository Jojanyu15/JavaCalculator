This is a java calculator with a pipeline webhook in Jenkins.

# Git

1. De inicio se crea el proyecto en git junto con el branch de feature

![image](https://user-images.githubusercontent.com/33767841/191781363-ae1ab672-01ae-4711-8dd5-359e69432ae7.png)

2. Añadimos una lógica básica de calculadora en la rama principal

![image](https://user-images.githubusercontent.com/33767841/191783448-632a2720-2018-4ab9-ad6a-42cc6c811769.png)

3. Regresamos al branch feature y añadimos el soporte de big integer a la calculadora

![image](https://user-images.githubusercontent.com/33767841/191783640-1d671ccc-ad0e-4550-a8be-81283f66fd90.png)

4. Añadimos el logging intermedio para visualizar los resultados de las operaciones

![image](https://user-images.githubusercontent.com/33767841/191783840-66cc90c5-10c8-4173-8ea9-af4503baf858.png)

5. Desde esa misma rama realizamos un git rebase para dirigir los commits de la rama actual al main y finalmente realizamos un checkout al Main

![image](https://user-images.githubusercontent.com/33767841/191784371-62225202-8660-4d8b-91cb-204969c980ba.png)

6. Realizamos un git log para verificar el codigo del cambio necesitado el cual corresponde a el soporte de big integer, una vez teniendo el identificador de ese commit realizamos un cherry pick y enviamos los cambios al repositorio.

![image](https://user-images.githubusercontent.com/33767841/191784724-0c326e5c-2670-490d-a018-c8dcdf642017.png)
