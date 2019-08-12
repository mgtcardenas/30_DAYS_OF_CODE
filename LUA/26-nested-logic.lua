actualDay = io.read("*n")
actualMonth = io.read("*n")
actualYear = io.read("*n")
expectedDay = io.read("*n")
expectedMonth = io.read("*n")
expectedYear = io.read("*n")
fine = 0;

if actualDay > expectedDay and actualMonth == expectedMonth and actualYear == expectedYear then
    fine = 15 * (actualDay - expectedDay)
end -- if

if actualMonth > expectedMonth and actualYear == expectedYear then
    fine = 500 * (actualMonth - expectedMonth)
end -- if

if actualYear > expectedYear then
    fine = 10000
end -- if

print(fine);
