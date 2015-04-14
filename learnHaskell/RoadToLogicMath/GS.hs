module GS where

mnmInt :: (Ord a) => [a] -> a
mnmInt []     = error "empty list"
mnmInt [x]    = x
mnmInt (x:xs) = min x (mnmInt xs)

maxInt :: [Int] -> Int
maxInt []     = error "empty list"
maxInt [x]    = x
maxInt (x:xs) = max x (maxInt xs)

removeInt :: (Eq a) => a -> [a] -> [a]
removeInt m [] = error "empty list"
removeInt m [x] | x == m    = []
                | otherwise = [x]
removeInt m (x:xs) | x == m = xs
                   | otherwise = (x:removeInt m xs)

srtInts :: (Ord a) => [a] -> [a]
srtInts [] = []
srtInts xs = m : (srtInts (removeInt m xs)) where m = mnmInt xs

average :: [Int] -> Float
average [] = error "empty list"
average xs = fromIntegral (sum xs) / fromIntegral (length xs)

count :: String -> Char -> Int
count [x] char | x == char = 1
               | otherwise = 0
count (x:xs) char | x == char = 1 + count xs char
                  | otherwise = count xs char

blowup :: String -> String
blowup []     = ""
blowup (x:xs) = blowup2 1 (x:xs)
blowup2 :: Integer -> String -> String
blowup2 n []     = ""
blowup2 n [x]    = repeatChar n [x]
blowup2 n (x:xs) = repeatChar n [x] ++ blowup2 (n+1) xs
repeatChar :: Integer -> String -> String
repeatChar n [char] | n == 0    = ""
                    | otherwise = [char] ++ repeatChar (n-1) [char]

srtString :: [String] -> [String]
srtString [] = []
srtString (x:xs) = srtInts (x:xs)




