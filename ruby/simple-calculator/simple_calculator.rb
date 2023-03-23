# SimpleCalculator implementation
class SimpleCalculator
  class UnsupportedOperation < StandardError
  end

  ALLOWED_OPERATIONS = ['+', '/', '*'].freeze

  def self.calculate(x, y, operation)
    raise UnsupportedOperation unless ALLOWED_OPERATIONS.include?(operation)
    raise ArgumentError unless x.is_a?(Numeric)
    raise ArgumentError unless y.is_a?(Numeric)

    answer = nil

    case operation
    when '+'
      answer = x + y
    when '/'
      return 'Division by zero is not allowed.' if y.zero?

      answer = x / y
    when '*'
      answer = x * y
    end

    "#{x} #{operation} #{y} = #{answer}"
  end
end
