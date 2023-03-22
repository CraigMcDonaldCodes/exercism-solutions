# BirdCount implementation
class BirdCount
  @@last_week = [0, 2, 5, 3, 7, 8, 4]

  def self.last_week
    @@last_week
  end

  def initialize(birds_per_day)
    @this_week = birds_per_day.clone
  end

  def yesterday
    @this_week[-2]
  end

  def total
    @this_week.sum
  end

  def busy_days
    @this_week.select { |i| i >= 5 }.size
  end

  def day_without_birds?
    @this_week.include?(0)
  end
end
