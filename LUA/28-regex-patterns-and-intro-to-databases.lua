local N = io.stdin:read("*n", "*l")

names = {}

for Nitr = 1, N do
    local firstNameEmailID = {}
    for token in string.gmatch(io.stdin:read("*l"), "[^%@]+") do
        table.insert(firstNameEmailID, token)
    end -- for

    local firstName = firstNameEmailID[1]
    local emailID = firstNameEmailID[2]

    if emailID == "gmail.com" then
        table.insert(names, firstName:match("%w+"))
    end -- if
end -- for

table.sort(names)

for i = 1, #names do
    print(names[i])
end --for
