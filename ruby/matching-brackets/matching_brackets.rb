# Brackets implementation
class Brackets
  CLOSING_CHAR = {
    ']' => '[',
    '}' => '{',
    ')' => '('
  }.freeze

  # Determine if some text is matching
  def self.paired?(text)
    stack = []

    text.each_char do |c|
      case c
      when '[', '{', '('
        stack.append(c)
      when ']', '}', ')'
        return false unless !stack.empty? && (stack[-1] == CLOSING_CHAR[c])
        stack.pop
      end
    end

    stack.empty?
  end
end
