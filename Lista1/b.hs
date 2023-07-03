--A. Soma seletiva
import Data.Char

main = do
  a <- getLine
  let result = sumNumbers a
  print result

sumNumbers :: String -> Int
sumNumbers "" = 0
sumNumbers c = (sumCada (digits c))

sumCada :: String -> Int
sumCada "" = 0
sumCada (c : cs) = (digitToInt c) + (sumCada cs)

digits :: String -> String
digits [] = []
digits (ch : chs)
  | (isDigit ch) = ch : (digits chs)
  | otherwise = digits chs
