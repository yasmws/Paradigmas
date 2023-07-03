--Calculadora

-- how to execute
-- ghci nameofthefile.hs
-- function a b

type Comando = String
type Valor = Int
type Total = Int

name :: (Comando, Valor) -> Comando
name (Comando, Valor) = Comando

value :: (Comando, Valor) -> Valor
value (Comando, Valor) = Valor

executa :: [(Comando, Valor)] -> Int
executa (a : as) | name (a) == 'Soma' = (value a) + executa as 
                 | name (a) == 'Multiplica' = (value a) * executa as 
                 | name (a) == 'Divide' = (value a) | executa as 
                 | name (a) == 'Subtrai' = (value a) - executa as 

main = do
    a <- getLine
    let result = executa (read a)
    print result

