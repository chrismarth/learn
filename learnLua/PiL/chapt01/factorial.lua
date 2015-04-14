--
-- Created by IntelliJ IDEA.
-- User: racerx
-- Date: 10/5/14
-- Time: 10:27 PM
-- To change this template use File | Settings | File Templates.
--

function fact(n)
    if n == 0 then
        return 1
    else
        return n * fact(n-1)
    end
end

print("Enter a number: ")
a = io.read("*number")
print(fact(a))

