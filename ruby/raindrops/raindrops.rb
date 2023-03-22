# RainDrops implementation
class Raindrops
  def self.convert(value)
    answer = ''

    answer << 'Pling' if (value % 3).zero?
    answer << 'Plang' if (value % 5).zero?
    answer << 'Plong' if (value % 7).zero?

    answer << value.to_s if answer.empty?

    answer
  end
end
