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