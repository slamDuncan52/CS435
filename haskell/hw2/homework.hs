--1
qsort :: [Int] -> [Int]
qsort [] = []
qsort (x:xs) = qsort[n|n<-xs,n<=x] ++ [x] ++ qsort[n|n<-xs,n>x]

--2
iSort :: [Int] -> [Int]
iSort [] = []
iSort (x:xs) = insert x (iSort xs)

insert :: Int -> [Int] -> [Int]
insert a [] = [a]
insert a (x:xs)
  | a <= x = (a:x:xs)
  | otherwise = x : insert a xs

--3
myZip :: [a] -> [b] -> [(a,b)]
myZip [] b = []
myZip a [] = []
myZip (x:xs) (y:ys) = (x,y):(zip xs ys)

--4
myFoldr1 :: (a -> a -> a) -> [a] -> a
myFoldr1 f [a] = a
myFoldr1 f (x:xs) = f x (myFoldr1 f xs)

--5
--splitWord :: [Char] -> ([Char], [Char])
splitWord a = ((stopAtSpace a), (afterSpace a))

stopAtSpace :: [Char] -> [Char]
stopAtSpace (x:xs)
  | x /= ' ' = x:stopAtSpace(xs)
  | otherwise = []

afterSpace :: [Char] -> [Char]
afterSpace (x:xs)
  | x == ' ' = xs
  | otherwise = afterSpace(xs)
