n = io.read("*number", "*l")
a = {}
for a_i = 1, n do
	a[a_i] = io.read("*n")
end -- for

-- Write Your Code Here

totalSwaps = 0
tmp = 0
for i = 1, n do
    -- Track number of elements swapped during a single array traversal
    numberOfSwaps = 0
    for j = 1, (n-1) do
        -- Swap adjacent elements if they are in decreasing order
        if a[j] > a[j + 1] then
            -- swapping...
            tmp = a[j]
            a[j] = a[j + 1]
            a[j + 1] = tmp

            numberOfSwaps = numberOfSwaps + 1
            totalSwaps = totalSwaps + 1
        end -- if
    end -- for j

    -- If no elements were swapped during a traversal, array is sorted
    if numberOfSwaps == 0 then
        break
    end -- if
end -- for i

io.write("Array is sorted in " , totalSwaps , " swaps.\n");
io.write("First Element: " , a[1], "\n");
io.write("Last Element: " , a[#a], "\n");
