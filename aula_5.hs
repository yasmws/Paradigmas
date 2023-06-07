-- listas
-- todos os elem são do mesmo tipo
-- colchetes

type String = [Char]
--estruturas de dados recursivas

-- a ordem dos elem eh relevante

--duplicaçao de elem tbm importa

-- (:) eh um construtor polimorfico
(:) :: Int -> [Int] -> [Int]
(:) :: Bool -> [Bool] -> [Bool]
(:) :: t -> [t] -> [t]

-- funções usando listas? 
-- caso base  - lista vazia
-- caso recursivo - lista tem cabeça e cauda




