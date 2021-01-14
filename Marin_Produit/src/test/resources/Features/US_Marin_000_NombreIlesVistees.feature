
Feature: US_Marin_000_Exploration des iles 
  En tant que Chef d'etat-major de la marine
  Je veux connaitre le nombre d'iles visitees par chaque Marin 
  Afin de leur decerner de nouveaux grades

  Scenario Outline: Nombre total d'iles visitees
    Given Je veux ecrire un scenario qui prend en compte <Marin> et les iles <Taiti> et <Elbe>
    When apres une exploration
    Then le <TotalVisites> est calcule automatiquement

    Examples: 
      | Marin    | Taiti | Elbe | TotalVisites|
      | "Robert" |     1 |    1 |           2 |
      | "Jean"   |     0 |    1 |           1 |
 
  Scenario Outline: Augmentation en grade 
    Given Je veux ecrire un scenario qui prend en compte le <Marin>, son <Grade>  et le <TotalVisites>
    When apres un nombre total d'iles visitees superieur a 2
    Then le marin obtient un <NouveauGrade>

    Examples: 
      | Marin    | Grade | TotalVisites | NouveauGrade |
      | "Robert" |     2 |            2 |            3 |          
      | "Jean"   |     3 |            1 |            3 |          
    
      