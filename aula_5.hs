-- listas
-- todos os elem são do mesmo tipo
-- colchetes

--type String = [Char]
--estruturas de dados recursivas

-- a ordem dos elem eh relevante

--duplicaçao de elem tbm importa

-- (:) eh um construtor polimorfico
--(:) :: Int -> [Int] -> [Int]
--(:) :: Bool -> [Bool] -> [Bool]
--(:) :: t -> [t] -> [t]

-- [5] eh o mesmo que 5:[]
-- [4,5] eh o mesmo que 4:(5:[])

-- funções usando listas? 
-- caso base  - lista vazia
-- caso recursivo - lista tem cabeça e cauda

sumList :: [Int]-> Int 
--caso base: lista vazia
sumList [] = 0
--caso recursivo: lista tem cabeça e cauda
sumList (a:as) = a + sumList as


--expressao case
--permite casamento de padrões com valores arbitrarios
--não apenas argumentos da funcao
--firstDigit :: String -> Char
--firstDigit st = case (digits st) of 
--                    []     -> '\0'
--                    (a:as) ->  a


(+++) :: [t] -> [t] -> [t]
[] +++ y = y
(+++) (x:xs) y = x : (xs +++ y)


xyz :: [t] -> [t] -> [t]
xyz [] y = y
xyz (x:xs) y = x : (xyz xs y)

reversee :: [t] -> [t]
reversee [] = []
reverse (a:as) = reversee as ++ [a]

myId :: t -> t
myId x = x

double :: [Int] -> [Int]
double [] = []
double (x:xs) = [2*x] ++ double xs

member :: [Int] -> Int -> Bool
member [] elemento = False
member (a:as) elemento | elemento == a = True
                       |  otherwise = member as elemento
--another way of writing it, the following code works even better than using just |
--member (a:as) elemento = (elemento == a) || member as elemento

digits :: String -> String
digits [] = []
digits (ch:chs) | ch >= '0' && ch <= '9'  = ch : digits chs
                | otherwise = digits chs
--import Data.Char
--digits (ch:chs) | isDigit ch = ch : digits chs
--digits (ch:chs) | memberCh ['0'..'9'] ch = ch : digits chs


--sumPairs :: [(Int, Int)] -> [Int]















