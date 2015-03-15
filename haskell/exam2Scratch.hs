myCube :: Int -> Int
myCube a = a*a*a

testQ2 :: Int -> Int -> Int -> Bool
testQ2 u v w  = not ((u == v) && (v == w))

testQ3 :: Int -> String -> String
testQ3 n s
  | n < 0 = tQ4 'b' s
  | n == 0 = tQ4 'c' s
  | otherwise = tQ4 'd' s

tQ4 :: Char -> String -> String
tQ4 c [] = []
tQ4 c (x:xs)
 | x == 'a' = c:(tQ4 c xs)
 | otherwise = x:(tQ4 c xs)

intFix :: [Int] -> [Int]
intFix a = [2*n+3|n<-a,2*n+3 >=0, 2*n+3 < 100]

myLength :: [Int] -> Int
myLength a = sum (map (\x->1) a)

squareSum :: Int -> Int
squareSum a = sum (map (^2) [1..a])

allEvens :: [Int] -> Bool
allEvens a = foldr1 (&&) (map (\x -> (x `mod` 2) == 0) a)

addStarting :: Int -> [Integer] -> [Integer] -> Integer
addStarting n xs ys
  | n <= 0 = 0
  | otherwise = head xs + head ys + addStarting (n-1) (tail xs) (tail ys)

doubleIncr :: Int -> Int
doubleIncr n = (*2) ((+1) n)
