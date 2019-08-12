-- Complete the factorial function below.
function factorial(n)
	-- Similar to Ternary Operator
	return n > 1 and (n * factorial(n-1)) or 1

	-- LESS COOL ALTERNATIVE
	-- if(n > 1) then return (n * factorial(n-1)) else return 1 end
end

local fptr = io.open(os.getenv("OUTPUT_PATH"), "w")

local n = io.stdin:read("*n", "*l")

local result = factorial(n)

fptr:write(result, "\n")

fptr:close()
