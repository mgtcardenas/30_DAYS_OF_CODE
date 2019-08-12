local n = io.stdin:read("*n", "*l")


for i = 1, 10 do
	io.stdout:write(n, " x ", i, " = ", i*n, "\n")
end
