# Втора лабораториска вежба по Софтверско инженерство


## Анастасија Јосифовска, бр. на индекс 193077


### Control Flow Graph
<img src="graph_flow_diagram">


### Цикломатска комплексност
Цикломатската комплесност на овој код е 8, истата ја добив преку тоа што има 23 предикатни јазли и 29 ребра, па 29 - 23 = 6, од каде 6 + 2 = 8.


### Тест случаи според критериумот Every statement

10:22:31

10:30:72

27:10:25

20:69:15

-1:00:10

24:59:59

24:00:00

### Тест случаи според критериумот Every path

      1,2 > 3.1 > 3.2 > 4,5,6 > 7 > 12 > 13 > 15 > 16 > 17 > 24 > 3.3 > 3.2 > 25 > 26  // 10:22:31
      
      1,2 > 3.1 > 3.2 > 4,5,6 > 7 > 12 > 13 > 15 > 16 > 18,19 > 26  // 10:30:72
    
      1,2 > 3.1 > 3.2 > 4,5,6 > 7 > 8 > 10 > 11 > 26 // 27:10:25
      
      1,2 > 3.1 > 3.2 > 4,5,6 > 7 > 12 > 13 > 15 > 16 > 18,19 > 26  // 20:69:15
      
      1,2 > 3.1 > 3.2 > 4,5,6 > 7 > 8 > 9 > 26  // -1:00:10

      1,2 > 3.1 > 3.2 > 4,5,6 > 7 > 12 > 20 > 21 > 22,23 > 26  // 24:59:59

      1,2 > 3.1 > 3.2 > 4,5,6 > 7 > 12 > 20 > 21 > 24 > 3.3 > 3.2 > 25 > 26  // 24:00:00

### Објаснување на напишаните unit tests
За Every Statement: се проверуваат и изминуваат сите statements. Некои се со exceptions и се решаваат со try-catch. Останатите се со assertEquals.
За Every Path: се изминуваат сите Paths, од кои 2 се со Equals а останатите се со exceptions.