getmetatable('').__index = function(str,i) return string.sub(str,i,i) end

function printEven(str)
	for i = 1,#str,2 do
	   io.write(str[i])
	end
end

function printOdd(str)
	for i = 2,#str,2 do
	   io.write(str[i])
	end
end

local T = io.read()
for i = 1,T do
   local myString = io.read()
	printEven(myString)
	io.write(" ")
	printOdd(myString)
	print('')
end
