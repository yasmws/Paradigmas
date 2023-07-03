clima :: Estacao -> Temp 
clima Inverno = Frio 
clima _ = Quente 

data Estacao = Inverno | Verao | Outono | Primavera
            deriving (Show, Eq)

data Temp = Frio | Quente
            deriving (Show, Eq)


clima2 :: Estacao -> Temp
clima2 x | x == Inverno = Frio
        | otherwise = Quente

    