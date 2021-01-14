Feature: US_Exploration_000_Chercher un produit dans des iles
  En tant que Vendeur
  Je veux connaitre le nom des iles qui disposent d'un produit, son prix et les marins qui ont visité cette ile    
  Afin d'importer ce produit de l'ile qui offre le meilleur prix

  Scenario Outline: le produit est disponible dans des iles
    Given que jai les produits suivants dans les iles
    # | produit| Ile  | Marins | prix|
      | Patate | ile1 | Robert | 1.0 |
      | Tomate | ile2 | Jack   | 1.7 |
    When le Vendeur cherche "Patate"
    Then <iles>, <marins>, <prix> sont retournes

    Examples: 
      | iles   | marins   | prix  |
      | "ile1" | "Robert" | "1.0" |
