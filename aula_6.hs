-- compreensoes de listas
--doubleList xs = [2*a|a <- xs]

--doubleIfEven xs = [2*a|a <- xs, isEven a]

--sumPairs :: [(Int, Int)] -> [Int]
--sumPairs lp = [a+b|(a.b) <- lp]

--digits :: String -> String
--digits st = [ch | ch <- st, isDigit ch]

type Pessoa = String
type Livros = String
type BancoDados = [(Pessoa, Livros)]

-- livros emprestados
baseExemplo :: BancoDados
baseExemplo = [("Sergio","O Senhor dos Aneis"),
               ("Andre","Duna"),
               ("Fernando","Jonathan Strange & Mr.  Norrell"),
               ("Fernando","A Game of Thrones"),
               ("Maria Eduarda","Duna")]

-- escrever as funcoes:
-- livros que estao com uma pessoa

livros :: BancoDados -> Pessoa -> [Livros]
livros bd ps = [b | (a,b)<- bd, ps == a] 


-- emprestimos de um livro
emprestimos :: BancoDados -> Livros -> [Pessoa]
emprestimos bd lv = [a| (a,b)<-bd, lv == b]

-- se um livro esta emprestado 
emprestado :: BancoDados -> Livros -> Bool
--emprestado bd lv = not (null [b | (a, b) <- bd, b == lv])

--emprestado [] _ = False -- Caso base: o banco de dados está vazio, o livro não está emprestado
--emprestado ((a, b):xs) lv
--  | lv == b = True -- Encontramos o livro no banco de dados, está emprestado
--  | otherwise = emprestado xs lv -- Continua procurando nos elementos restantes do banco de dados

emprestado bd lv = emprestimos bd lv /= []

-- quantos livros estao com aquela pessoa
--qtdEmprestimos :: BancoDados -> Pessoa -> Int

--emprestar :: BancoDados -> Pessoa -> Livro -> BancoDados


--devolver :: BancoDados -> Pessoa -> Livro -> BancoDados

---------------------

-- uma funcao de alta ordem

applyBinOper:: (t-> t-> t) -> t -> t -> t
applyBinOper f x y = f x y 
-- applyBinOper (++) 22 55 = 77

--funcoes de mapeamento 

double :: [Int] -> [Int]
double [] = []
double (x:xs) = (2*x) : double xs

sqrList :: [Int] -> [Int]
sqrList [] = []
sqrList (a:xs)  = (a*a) : sqrList xs

map_1 :: (t->u) -> [t] -> [u]
map_1 f [] = []
map_1 f (x:xs) = f x : map_1 f xs

doubleList xs = map_1 times2 xs
sqrList xs = map_1 sqr xs

seconds :: [(t,u)] -> [(u)]

-- por que usar funções de alta ordem?
--facilitam modificações
--forma natural de expressar computações assíncronas
--aumentam reuso de definições/código
        - ex. usar a funcao map p ara transformar os elementos de uma lista de diferentes formas









