# Respuestas de Reflexión - Laboratorio Singleton

1. ¿Cuál es el resultado de (config1 == config2) después de aplicar Singleton?
El resultado es 'true', lo que confirma que ambas variables apuntan exactamente a la misma dirección de memoria y comparten la única instancia global existente.

2. ¿Por qué el campo instance debe ser static?
Porque pertenece a la clase en sí y no a una instancia específica del objeto. Debe existir de forma global y estar disponible antes de crear instancias para poder ser devuelto por el método estático getInstance().

3. ¿Qué ventaja tiene garantizar que exista una única instancia de configuración?
Garantiza coherencia y consistencia en toda la aplicación (todos los módulos leen y modifican los mismos ajustes) y evita el desperdicio de recursos de memoria al no duplicar objetos innecesarios.

4. ¿Cuál es la principal desventaja de la inicialización ansiosa (eager initialization)?
La instancia se crea de inmediato cuando la máquina virtual de Java (JVM) carga la clase en memoria, sin importar si la aplicación realmente la va a necesitar en ese momento, lo que puede desperdiciar recursos de arranque.

5. ¿Qué problema puede aparecer si el Singleton guarda estado global y la aplicación crece mucho?
Dificulta el rastreo de cambios en el estado, complica las pruebas unitarias debido al alto acoplamiento y puede provocar problemas de concurrencia si múltiples hilos intentan modificar el objeto al mismo tiempo sin la sincronización adecuada.