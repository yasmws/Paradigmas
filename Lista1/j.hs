import Data.Char

main = do
  a <- getLine
  b <- getLine
  let result = decEnigma a (read b)
  print result

type Dados = [(Char, Char)]

decEnigma :: String -> Dados -> String
decEnigma [] _ = []
decEnigma (x:xs) a = [loop x a] ++ decEnigma xs a


loop :: Char -> Dados -> Char
loop x (a:as) | (x == fst a) = snd a
              | otherwise = loop x as