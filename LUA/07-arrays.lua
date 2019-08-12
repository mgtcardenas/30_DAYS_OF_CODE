local n = io.stdin:read("*n", "*l")

local arr = {}

for token in string.gmatch(io.stdin:read("*l"), "[^%s]+") do
    table.insert(arr, tonumber(token))
end

for i = #arr, 1, -1 do
    io.write(arr[i], " ")
end

print("")
