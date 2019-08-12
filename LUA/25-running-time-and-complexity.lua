t = io.read("*n", "*l")
n = 0
mySqrt = 0
failed	= false

while (t > 0) do
	n = io.read("*n", "*l")

	if n == 1 then
		io.write("Not prime\n")
	elseif n == 2 then
		io.write("Prime\n")
	elseif (n % 2) == 0 then
		io.write("Not prime\n")
	else
		mySqrt = math.ceil(math.sqrt(n));
		for i = 3, mySqrt, 2 do
			if n % i == 0 then
				failed = true
				break
			end -- if
		end -- for i

		if failed then
			print("Not prime")
		else
			print("Prime")
		end -- if

		failed = false;
	end -- if

	t = t - 1
end -- while
