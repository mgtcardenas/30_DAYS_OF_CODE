local aAndB = 0
local t = io.stdin:read("*n", "*l")

for titr = 1, t do
    local nk = {}
    for token in string.gmatch(io.stdin:read("*l"), "[^%s]+") do
        table.insert(nk, token)
    end

    local n = tonumber(nk[1]:match("^%s*(.-)%s*$"))

    local k = tonumber(nk[2]:match("^%s*(.-)%s*$"))

    for  a = 1, (n - 1) do
        for b = (a + 1), n do
            if (a & b) < k and aAndB < (a & b) then
                aAndB = a & b;
            end -- if
        end -- for b
    end -- for a

    print(aAndB)
    aAndB = 0;
end -- for t
