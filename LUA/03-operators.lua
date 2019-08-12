-- Complete the solve function below.
function solve(meal_cost, tip_percent, tax_percent)
	local tip = meal_cost * tip_percent / 100
	local tax = meal_cost * tax_percent / 100
	local total_cost = meal_cost + tip + tax
	io.stdout:write(round(total_cost))
end

function round(n)
    return n % 1 >= 0.5 and math.ceil(n) or math.floor(n)
end

local meal_cost = io.stdin:read("*n", "*l")

local tip_percent = io.stdin:read("*n", "*l")

local tax_percent = io.stdin:read("*n", "*l")

solve(meal_cost, tip_percent, tax_percent)
