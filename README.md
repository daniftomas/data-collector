# data-collector
Industrial data collector for Android. This app was used by workers to collect data from a production line.
This app was part of my master's final's project report.
Built on Android Studio from ground.


Main functionalities:
- saves data from each active user till the register is done (variables: user name, product, task, data, init hour, final hour, pause time);
- register is done only if the variables are valid: user must insert valid quantity of production (optional data inserted: quantity of anomalies, causes of anomalies and observations);
- saves valid data to the product's XML file. If the product's XML file doesn't exist yet, create one.
