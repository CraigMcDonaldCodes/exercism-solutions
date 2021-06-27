export class ResistorColor {

  static readonly AllColors: string[] = [
    'black',
    'brown',
    'red',
    'orange',
    'yellow',
    'green',
    'blue',
    'violet',
    'grey',
    'white',
  ]

  private colors: string[]

  constructor(colors: string[]) {
    if (colors.length < 2) { throw new Error('At least two colors need to be present') }
    this.colors = colors
  }

  value = (): number => {
    return ResistorColor.AllColors.indexOf(this.colors[0]) * 10 + ResistorColor.AllColors.indexOf(this.colors[1])
  }
}
