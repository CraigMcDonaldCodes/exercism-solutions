class LogLineParser

  def initialize(line)
    @line = line
  end

  def message
    start = @line.index(' ') + 1
    @line[start..-1].strip
  end

  def log_level

    case @line
    when /info/i
      'info'
    when /error/i
      'error'
    when /warning/i
      'warning'
    else
      'UNKNOWN'
    end
  end

  def reformat
    "#{message} (#{log_level})"
  end
end
