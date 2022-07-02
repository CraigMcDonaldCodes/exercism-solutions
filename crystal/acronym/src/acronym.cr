class Acronym

    def self.abbreviate(phrase)

        tla = ""

        phrase.split(/ |-|_/).each do |item|
            if item.size > 0
                tla += item[0].upcase
            end
        end

        tla
    end
end