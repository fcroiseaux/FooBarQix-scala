# FooBarQuix : sélection à Code Story pour Devoxx France 2012

L'idée est de réaliser l'application avec un algorithme qui permet de n'avoir qu'une ligne dans la boucle et qui ne nécessite aucun test, pas de if. Il est aussi possible de passer le nombre d'itérations en paramètres (ici 100) et de remplacer d'autres nombres (ex 4 par Aze) si les mêmes règles sont respectées.

* *FooBarQix1.scala* est la version minimaliste, sans commentaires et sans factorisation des calculs ni de rien du tout d'ailleurs. Une seule ligne de code dans la boucle.
* *FooBarQix2.scala* est une version plus lisible et commentée du même algorithme.
* *FooBarQix3.java* est une version java avec le même objectif.


Pour exécuter, installer sbt en suivant les instructions situées à https://github.com/harrah/xsbt/wiki/Getting-Started-Setup

* Mettre à jour l'envronnement : sbt update
* Exécuter les tests : sbt test
* Exécuter les programmes : sbt run puis choisir la version à exécuter

