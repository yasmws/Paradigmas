clima :: Estacao -> Temp 
clima Inverno = Frio 
clima _ = Quente 

type Nome = String
type Idade = Int

data Estacao = Inverno | Verao | Outono | Primavera
            deriving (Show, Eq)

data Temp = Frio | Quente
            deriving (Show, Eq)

data Pessoas = Pessoa Nome Idade 
            deriving (Show, Eq)

Pessoa "José" 22
Pessoa "Maria" 23

showPessoa :: Pessoas -> String
showPessoa (Pessoa n a) = n ++ "--" ++ show a 

Pessoa :: Nome -> Idade -> Pessoas

clima2 :: Estacao -> Temp
clima2 x | x == Inverno = Frio
        | otherwise = Quente

    