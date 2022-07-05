class Gigasecond
    def self.from(time : Time)
        time + Time::Span.new(seconds: 1_000_000_000)
    end
end