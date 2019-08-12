local n = io.read("*n")
maxConsecutives = 0
counter = 0

while n > 0 do
	rest = n % 2

	if rest == 1 then
		counter = counter + 1
	else
		if counter > maxConsecutives then
			maxConsecutives = counter
		end
		counter = 0
	end

	n = (n-rest)/2
end

if counter > maxConsecutives then
	maxConsecutives = counter
end

io.write(maxConsecutives)
