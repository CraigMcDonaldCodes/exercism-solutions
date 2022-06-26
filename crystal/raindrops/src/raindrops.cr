class Raindrops

    def self.convert(value : Number) : String

        answer = ""
        
        if value % 3 == 0
            answer += "Pling"
        end

        if value % 5 == 0
            answer += "Plang"
        end

        if value % 7 == 0
            answer += "Plong"
        end

        if answer == ""
            answer = value.to_s
        end

        answer
    end
end