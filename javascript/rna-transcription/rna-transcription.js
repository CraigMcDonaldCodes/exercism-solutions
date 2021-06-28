export const toRna = (dna) => {

  let rna = "";

  for (const c of dna) {

    switch (c) {
      case 'G':
        rna += 'C';
        break;
      case 'C':
        rna += 'G';
        break;
      case 'T':
        rna += 'A';
        break;
      case 'A':
        rna += 'U';
        break;
    }
  }

  return rna;
};
