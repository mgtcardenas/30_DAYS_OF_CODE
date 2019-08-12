local N = io.stdin:read("*n", "*l")

if N % 2 ~= 0 then
    io.stdout:write("Weird")
elseif N >= 2 and N <= 5 then
	io.stdout:write("Not Weird")
elseif N >= 6 and N <= 20 then
	io.stdout:write("Weird")
else
	io.stdout:write("Not Weird")
end
