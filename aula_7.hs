
vendas :: Int -> Int
vendas 0 = 50
vendas 1 = 100 
vendas 2 = 150 
vendas 3 = 200
vendas 4 = 100
vendas 5 = 0

isCrescent :: (Int -> Int) -> Int -> Bool
isCrescent f 0 = True 
isCrescent f limite | f limite >= f (limite - 1) = isCrescent f (limite-1)
                    | otherwise = False

-- isCrescent funcao limite = 

quadrado :: Int -> Int
quadrado a = a * a

sqrList :: [Int] -> [Int]
sqrList lista = map quadrado lista
    where quadrado a = a * a

sumSquare  [Int] -> Int
sumSquare lista = foldr (+) 0 (sqrList lista)

filterGTZero [Int] -> Int
filterGTZerolista = filter gtZero lista
    where gtZero x = (x > 0)





