Feature: US_Exploration_001_Trier les resultats de la recherche
  En tant que Vendeur
  Je veux trier les resultats de la recherche des produits dans les iles
  Afin de prendre mes decisions le plus rapidement possible

  Scenario Outline: Trier par prix
    Given que jai les resultats suivants de la recherche d'un produit sur des iles
    # |nomIle|     Marins       | grade | prix|
      | ile1 | Robert,Jack,Paul | 1,3,2 | 1.7 |
      | ile2 | Robert,Paul      |   1,2 | 1.0 |
    When le Vendeur tri par prix de produit
    Then le resultat trie par prix est le suivant
    # |nomIle|     Marins       | grade | prix|
      | ile2 | Robert,Paul      |   1,2 | 1.0 |
      | ile1 | Robert,Jack,Paul | 1,3,2 | 1.7 |

  Scenario Outline: Trier par nom de l'ile
    Given que jai les resultats suivants de la recherche d'un produit sur des iles
    # |nomIle|     Marins       | grade | prix|
      | ile2 | Robert,Paul      |   1,2 | 1.0 |
      | ile1 | Robert,Jack,Paul | 1,3,2 | 1.7 |
    When le Vendeur tri par prix nom d'ile
    Then le resultat trie par nom d'ile est le suivant
    # |nomIle|     Marins       | grade | prix|
      | ile1 | Robert,Jack,Paul | 1,3,2 | 1.7 |
      | ile2 | Robert,Paul      |   1,2 | 1.0 |

  Scenario Outline: Trier par nom de marin
    Given que jai les resultats suivants de la recherche d'un produit sur des iles
    # |nomIle|     Marins       | grade | prix|
      | ile1 | Robert,Jack,Paul | 3,1,2 | 1.7 |
      | ile2 | Robert,Paul      |   2,1 | 1.0 |
    When le Vendeur tri par nom de marin
    Then le resultat trie par nom de marin est le suivant
    # |nomIle|     Marins       | grade | prix|
      | ile1 | Jack,Paul,Robert | 1,2,3 | 1.7 |
      | ile2 | Paul,Robert      |   1,2 | 1.0 |

  Scenario Outline: Trier par grade de marin
    Given que jai les resultats suivants de la recherche d'un produit sur des iles
    # |nomIle|     Marins       | grade | prix|
      | ile1 | Robert,Jack,Paul | 1,3,2 | 1.7 |
      | ile2 | Robert,Paul      |   1,2 | 1.0 |
    When le Vendeur tri par grade de marin
    Then le resultat trie par grade de marin est le suivant
    # |nomIle|     Marins       | grade | prix|
      | ile1 | Jack,Paul,Robert | 3,2,1 | 1.7 |
      | ile2 | Paul,Robert      |   2,1 | 1.0 |
