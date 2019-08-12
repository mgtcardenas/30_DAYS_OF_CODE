function splitStr(theString)
  stringTable = {}
  local i = 1
  for str in string.gmatch(theString, "[^%s]+") do
    stringTable[i] = str
    i = i + 1
  end
  return stringTable
end

local phoneBook = {}

local T = io.stdin:read("*n", "*l")
for i = 1,T do
	input = splitStr(io.stdin:read("*l"))
	phoneBook[input[1]] = input[2]
end

query = io.read()
while query do
	if phoneBook[query] ~= nil then
		io.write(query, "=", phoneBook[query], "\n")
	else
		io.write("Not found\n")
	end
    query = io.read()
end

--[[ TABLES DEMO, ALL OF THIS WORKS...
aMultiTable = {}

aMultiTable['sam'] = 69

if aMultiTable['Laura'] == nil then
	print('Laura no está, Laura se fue')
end

print(aMultiTable['sam'])
]]
