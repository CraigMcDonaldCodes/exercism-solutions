class AssemblyLine

  @@CARS_PER_HOUR = 221

  def initialize(speed)
    @speed = speed
  end

  def production_rate_per_hour

    success_rate = case @speed
    when 5..8
      0.90
    when 9
      0.80
    when 10
      0.77
    else
      1.0
    end

    @@CARS_PER_HOUR * @speed * success_rate
  end

  def working_items_per_minute
    (production_rate_per_hour / 60).to_i
  end
end
