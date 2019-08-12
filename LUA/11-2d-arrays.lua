max = -math.huge;

local arr = {}

for i = 1, 6 do
    arr[i] = {}

    for token in string.gmatch(io.stdin:read("*l"), "[^%s]+") do
        table.insert(arr[i], tonumber(token:match("(.-)%s*$")))
    end
end

for i = 1, 4 do
    for j = 1, 4 do
        a = arr[i][j];
        b = arr[i][j + 1];
        c = arr[i][j + 2];
        d = arr[i + 1][j + 1];
        e = arr[i + 2][j];
        f = arr[i + 2][j + 1];
        g = arr[i + 2][j + 2];

        tmp = a + b + c + d + e + f + g;

        if tmp > max then
            max = tmp
        end
    end
end

print(max)
