class Luhn
    def self.valid?(value : String) : Bool

        value = value.gsub(" ", "")

        if value.size < 2
            return false
        end

        sum = 0
        mustDouble = false

        value.reverse.each_char do |ch|

            if !ch.ascii_number?
                return false
            end

            v = ch.to_i

            if mustDouble

                v *= 2

                if v > 9
                    v -= 9
                end

                mustDouble = false
            else
                mustDouble = true
            end

            sum += v
        end

        sum % 10 == 0

    end
end
