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

--paraDireita :: Int -> String -> String
--paraDireita n str = addEspacos n ++ 


-- how to execute
-- ghci nameofthefile.hs
-- function a b


-- prox aula: tuplas

-- intP :: (Int, Int)
-- intP = (33, 43)

-- (True, 'x') :: (Bool, Char)
-- (34, 2, 'b') :: (Int, Int, Char)

addPair :: (Int, Int) -> Int
addPair (x, y) = x + y

shift :: ((Int, Int), Int) -> (Int, (Int, Int))
shift ((x, y), z) = (x,(y,z))

type Name = String
type Age = Int
type Phone = Int
type Person = (Name, Age, Phone)

name :: Person -> Name
name (n, a, p) = n