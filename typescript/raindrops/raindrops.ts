export default class RainDrops {

    convert(value: number): string {

        let answer = "";

        if (value % 3 == 0) { answer += "Pling"; }
        if (value % 5 == 0) { answer += "Plang"; }
        if (value % 7 == 0) { answer += "Plong"; }

        return answer.length == 0
            ? "" + value
            : answer;
    }
}
