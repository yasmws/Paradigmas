module Main where

main = do putStrLn ("answer é igual a " ++ show answer)
          putStrLn ("greater é igual a " ++ show greater)

answer :: Int
answer = 42

greater :: Bool
greater = answer > 72

square :: Int ->Int
square x = x * x

allEqual :: Int -> Int -> Int -> Bool
allEqual n m p = (n == m) && (m == p)

maxi :: Int -> Int -> Int
maxi n m | n >= m    = n
         | otherwise = m

         
