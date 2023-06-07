primes :: Int -> Bool
primes 1 = False
primes x = primes_aux x (x-1)

primes_aux :: Int -> Int -> Bool
primes_aux a 1 = True
primes_aux a b | a `mod` b == 0 = False
               | otherwise = primes_aux a (b-1)

addEspacos :: Int -> String
addEspacos 0 = ""
addEspacos n = " " ++ addEspacos(n-1)

paraDireita :: Int -> String -> String
paraDireita n str = addEspacos n ++ 

imprimeTabela




-- how to execute
-- ghci nameofthefile.hs
-- function a b