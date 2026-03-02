# Homework 3: RPG Battle Engine — Singleton + Adapter

## Архитектура (UML)

### 1. Class Diagram (Architecture)
Данная диаграмма отображает структуру системы, где `BattleEngine` (Singleton) выступает координатором, а адаптеры (`Adapter` pattern) позволяют использовать разные API героев и врагов через единый интерфейс `Combatant`.
![Class Diagram](Diagram/ClassDiagram.jpg)

### 2. Sequence Diagram (Combat Flow)
Диаграмма показывает динамику взаимодействия объектов: как `BattleEngine` вызывает методы у адаптеров, обеспечивая пошаговый бой.
![Sequence Diagram](Diagram/SequenceDiagram.jpg)

## Описание реализации
* **Singleton**: Обеспечивает наличие только одного экземпляра движка боя в памяти.
* **Adapter**: Позволяет системе `BattleEngine` работать с объектами `Hero` (из HW1) и `Enemy` (из HW2) без изменения их исходного кода.

* ## Demo Output
Пример работы боевого движка (BattleEngine):

```text
Warrior attacking
Basic Enemy hit 
Warrior attacking
Basic Enemy hit 
Warrior attacking
Basic Enemy hit 
Warrior attacking
pobedil Warrior
*##

## Как запустить
```bash
# Compile
javac -d out $(find src -name "*.java")

# Run
java -cp out com.narxoz.rpg.Main
