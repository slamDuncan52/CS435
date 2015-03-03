import Test.QuickCheck
-- 3.1
ex0r1 :: Bool -> Bool -> Bool

ex0r1 x y = (x && not y) || (not x && y)

-- 3.3
ex0r2 :: Bool -> Bool -> Bool

ex0r2 True True = False
ex0r2 True False = True
ex0r2 False True = True
ex0r2 False False = False

-- 3.4
myAnd :: Bool -> Bool -> Bool
myOr :: Bool -> Bool -> Bool

myAnd True True = True
myAnd x y = False

myOr False False = False
myOr x y = True

-- 3.5
nAnd1 :: Bool -> Bool -> Bool
--Definition 1
nAnd1 False x = True
nAnd1 True x = not x

--Definition 2
nAnd2 :: Bool -> Bool -> Bool
nAnd2 x y = not(x && y)

-- 3.6
--Def 1 on True True

-- nAnd1 False x = True (drops down)
-- nAnd1 True x = not x (sees True, goes in)
-- nAnd1 = not True (evaluates x for True)
-- nAnd1 = False (done)

--Def 1 on True False

--nAnd1 False x = True (drops down)
--nAnd1 True x = not x (sees True, goes in)
--nAnd1 = not False (evaluates x for False)
--nAnd1 = True (done)

--Def 2 on True True

--nAnd2 x y = not(x && y) (sees x, goes in)
--nAnd2 True True = not(True && True) (plugs in x and y)
--nAnd2 = not(True) (evaluates True && True as True
--nAnd2 = False (done)

--Def 2 on True False

--nAnd2 x y = not(x && y) (sees x, goes in)
--nAnd2 True False = not(True && False) (plugs in x and y)
--nAnd2 = not(False) (evaluates True && False as False
--nAnd2 = True (done)

-- 3.7
prop_ex0r1 :: Bool -> Bool -> Bool
prop_ex0r1 x y = (ex0r1 x y) == ((x || y) && not(x && y))

prop_ex0r2 :: Bool -> Bool -> Bool
prop_ex0r2 x y = (ex0r2 x y) == ((x || y) && not(x && y))

prop_myAnd :: Bool -> Bool -> Bool
prop_myAnd x y = (x && y) == (myAnd x y)

prop_myOr :: Bool -> Bool -> Bool
prop_myOr x y = (x || y) == (myOr x y)

prop_nAnd1 :: Bool -> Bool -> Bool
prop_nAnd1 x y = (nAnd1 x y) == (not(x && y))

prop_nAnd2 :: Bool -> Bool -> Bool
prop_nAnd2 x y = (nAnd2 x y) == (not(x && y))

-- 3.8
--The Function returns true if the numbers are not all the same
--if they are all equal, it returns false
-- 3.9
threeDifferent :: Integer -> Integer -> Integer -> Bool
threeDifferent m n p = ((m /= n) && (m /= p) && (n /= p))
-- On 'threeDifferent 3 4 3' we get False, because (m == p)

-- 3.11
--threeEqual (2+3) 5 (11 `div` 2)

--threeEqual 5 5 5 = (5==5) && (5==5) (evaluates arithmatic, plugs in)
--threeEqual = True && True (evaluates each 5==5 as True)
--threeEqual = True (done)

--mystery (2+4) 5 (11 `div` 2)

--mystery 6 5 5 = not ((6==5) && (5==5)) (evaluates arithmatic, plugs in)
--mystery = not(False && True) (evaluates 6==5 as False, 5==5 as True)
--mystery = not False (evaluates False == True as False)
--mystery = True (done)

--threeDifferent (2+4) 5 (11 `div` 2)

--threeDifferent 6 5 5 = ((6 \= 5) && (6 \= 5) && (5 \= 5)) (evaluates arithmatic, plugs in)
--threeDifferent = (True && True && False) (evaluates 6 \= 5 as True, 5 \= 5 as False)
--threeDifferent = False (done)

--fourEqual (2+3) 5 (11 `div` 2) (21 `mod` 11)

--fourEqual 5 5 5 10 = (threeEqual 5 5 5) && (5 == 10) (evaluates arithmatic, plugs in)
--fourEqual = True && False (evaluates threeEqual gets true, 5 == 10 as False)
--fourEqual = False (done)

-- 3.13

--max (3-2) (3*8)
--max 1 24
--1 >= 24 (?)
--False
--24

--maxThree (4+5) (2*6) (100 `div` 7)
--maxThree 9 12 14
--9 >= 12 && 9 >= 14 (?)
--False && False
-- 12 >= 14 (?)
-- False
-- 14

-- 3.14
myMin :: Int -> Int -> Int
myMin x y  
  | x <= y      = x 
  | otherwise   = y
myMinThree :: Int -> Int -> Int -> Int
myMinThree x y z 
  | x <= y && x <= z  = x
  | y <= z            = y
  | otherwise         = z
-- 3.15
prop_myMin :: Int -> Int -> Bool
prop_myMin x y = (myMin x y) == (min x y)

prop_myMinThree :: Int -> Int -> Int -> Bool
prop_myMinThree x y z = (myMinThree x y z) == min(min x y) (min y z)

--prop_maxThree :: Int -> Int -> Int -> Int -> Bool
--prop_maxThree x y z = (maxThree x y z) == max((max x y) (max y z))

-- 3.16
lowerToUpper :: Char -> Char
lowerToUpper ch
  | (ch >= 'a' && ch <= 'z') = toEnum (fromEnum ch + (fromEnum 'A' - fromEnum 'a'))
  | otherwise = ch

-- 3.18
onThreeLines :: String -> String -> String -> String
onThreeLines s1 s2 s3 = (s1++"\n"++s2++"\n"++s3++"\n")
-- 3.22
numberNDroot :: Float -> Float -> Float -> Integer
numberNDroot a b c
  | (b^2) - 4.0*a*c > 0 = 2
  | (b^2) - 4.0*a*c == 0 = 1
  | otherwise = 0
-- 3.23
numberRoots :: Float -> Float -> Float -> Integer
numberRoots a b c
  | (a /= 0) = numberNDroot a b c
  | (b /= 0) = 1
  | (b==0 && c/=0) = 0
  | otherwise = 3

-- 3.24
smallerRoot, largerRoot :: Float -> Float -> Float -> Float
smallerRoot a b c
  | (numberRoots a b c == 0 || numberRoots a b c == 3) = 0.0
  | otherwise = ((-1*b) - sqrt((b^2)-4*a*c)) / (2.0 * a)

largerRoot a b c
  | (numberRoots a b c == 0 || numberRoots a b c == 3) = 0.0
  | otherwise = ((-1*b) + sqrt((b^2)-4*a*c)) /  (2.0 * a)
-- 3.25
--I would verify that smallerRoot <= largerRoot and vice versa
--I would also plug the returned answer back into the original equation
--and check that it is less than, say, .0000000001

-- 3.27
-- Well it actually compiles
