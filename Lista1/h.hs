main = do
    sa <- getLine
    let a = read sa :: [Int]
    sb <- getLine
    let b = read sb :: [Int]
    let result = mul2 a b
    print result

mul2 :: [Int] -> [Int] -> [Int]
mul2 [] [] = []
mul2 [] (x:xs) = (0 : (mul2 [] xs))
mul2 (x:xs) [] = (0 : (mul2 xs []))
mul2 (a:as) (b:bs) = (loop a b) : (mul2 as bs)   

loop :: Int -> Int -> Int
loop a b = a * b 