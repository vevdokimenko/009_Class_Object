### Создать классы:
1) Основной класс `Device` (`manufacturer(String)`, `price(float)`, `serialNumber(String)`);
2) Сабкалсс `Monitor` (`resolutionX(int)`, `resolutionY(int)`) and `EthernetAdapter` (`speed (int)`, `mac (String)`);
   Добавить методы доступа. Конструктор.
3) В обоих классах переопределить метод toString, что бы вывод был следующим:
   `Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
   Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024`
4) Переопределить методы `equals` & `hashCode` в каждом классе.
   Создать класс `Main`, в котором создать объекты классов и продемонстрировать переопределенные
   методы