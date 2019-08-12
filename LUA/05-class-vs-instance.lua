local Person = { };
Person.__index = Person

function Person.new (initialAge)
   local self = setmetatable({ },Person);
   -- Add some more code to run some checks on initialAge

   if initialAge < 0 then
        print("Age is not valid, setting age to 0.")
        self.age = 0
    else
        self.age = initialAge
   end

   return self;
end

function Person:amIOld()
    -- Do some computations in here and print out the correct statement to the console
    if self.age < 13 then
        print("You are young.")
    elseif self.age >= 13 and self.age < 18 then
        print("You are a teenager.")
    else
        print("You are old.")
    end
end

function Person:yearPasses ()
   -- Increment the age
   self.age = self. age + 1
end

local read = io.read;
local T = read'*n';
for i = 1,T do
   local age = read'*n';
   local p = Person.new(age);
   p:amIOld();
   for j = 1,3 do
      p:yearPasses();
   end
   p:amIOld();
   print"";
end
