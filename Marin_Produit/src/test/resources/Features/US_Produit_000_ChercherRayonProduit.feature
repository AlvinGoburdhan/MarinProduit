Feature: US_Produit_000_ Chercher le rayon d'un produit
  En tant que Vendeur
  Je veux savoir le rayon de chaque produit
  Afin de pouvoir verfier le stock

  Scenario Outline: le produit est affecte a un rayon
    Given un <produit> de <rayon>
    When le Vendeur en fait la demande
    Then <rayon> est retournee

    Examples: 
      | produit  | rayon     |
      | "patate" | "Legumes" |

  Scenario Outline: le produit n'est pas affecte a un rayon
    Given un <produit> de <rayon>
    When le Vendeur en fait la demande
    Then un <messageErreur> est retournee

    Examples: 
      | produit  | rayon | messageErreur  |
      | "Iphone" | ""    | "Pas de rayon" |
