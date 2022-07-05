class ResistorColor

    @@colors = ["black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"]

    def self.color_code(color)

        if @@colors.includes? color
            @@colors.index color
        else
            -1
        end
    end

    def self.colors()
        @@colors.dup
    end
end
