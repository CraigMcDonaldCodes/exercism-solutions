const map = new Map();
map.set("AUG", "Methionine");
map.set("UUU", "Phenylalanine");
map.set("UUC", "Phenylalanine");
map.set("UUA", "Leucine");
map.set("UUG", "Leucine");
map.set("UCU", "Serine");
map.set("UCC", "Serine");
map.set("UCA", "Serine");
map.set("UCG", "Serine");
map.set("UAU", "Tyrosine");
map.set("UAC", "Tyrosine");
map.set("UGU", "Cysteine");
map.set("UGC", "Cysteine");
map.set("UGG", "Tryptophan");
map.set("UAA", "STOP");
map.set("UAG", "STOP");
map.set("UGA", "STOP");


export const translate = (rna) => {

    let rnaParts = rna.math(/[A-Z]{3}/g);
    let proteins = [];

    for (const part of rnaParts) {

      if (map.has(part)) {
        proteins.push(part);
      } else {
        throw new Error('Invalid codon');
      }
    }

    return proteins;
};
