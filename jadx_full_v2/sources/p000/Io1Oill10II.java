            package p000;

            import java.util.ArrayList;
            
/* 17 */    public final class Io1Oill10II extends I00io1l {
                public final int I00000oIO = 1;
                public II0oOIlio0 I00000oOI;
                public Object I0000Il00O;

                public Io1Oill10II(int i, OlII11110Iol olII11110Iol) {
/* 9 */             Io1OOOi1Iolo io1OOOi1Iolo = new Io1OOOi1Iolo();
/* 12 */            this.I00000oOI = io1OOOi1Iolo;
/* 14 */            io1OOOi1Iolo.I000II = i;
/* 16 */            this.I0000Il00O = olII11110Iol;
                }

                @Override
                public void I00000oIO(OlII0Io1 olII0Io1) {
                    switch (this.I00000oIO) {
                        case 1:
/* 13 */                    ((ArrayList) this.I0000Il00O).add(olII0Io1.I00000oIO);
                            break;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[LOOP:2: B:20:0x003b->B:22:0x003f, LOOP_END] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I0000oI00() {
                    int i;
                    int i2;
                    switch (this.I00000oIO) {
                        case 1:
/* 9 */                     ArrayList arrayList = (ArrayList) this.I0000Il00O;
/* 11 */                    int size = arrayList.size();
/* 50 */                    do {
                                size--;
/* 18 */                        if (size >= 0) {
/* 24 */                            CharSequence charSequence = (CharSequence) arrayList.get(size);
/* 26 */                            int length = charSequence.length();
/* 30 */                            i2 = 0;
                                    while (true) {
/* 32 */                                if (i2 < length) {
/* 34 */                                    char cCharAt = charSequence.charAt(i2);
/* 40 */                                    if (cCharAt != ' ') {
                                                switch (cCharAt) {
                                                }
                                            }
/* 46 */                                    i2++;
                                        } else {
/* 49 */                                    i2 = -1;
                                        }
                                    }
                                }
/* 57 */                        StringBuilder sb = new StringBuilder();
/* 62 */                        for (i = 0; i < size + 1; i++) {
/* 70 */                            sb.append((CharSequence) arrayList.get(i));
/* 75 */                            sb.append('\n');
                                }
/* 89 */                        ((Iol0O1Oo) this.I00000oOI).I000II = sb.toString();
                                break;
/* 50 */                    } while (i2 == -1);
/* 57 */                    StringBuilder sb2 = new StringBuilder();
/* 62 */                    while (i < size + 1) {
                            }
/* 89 */                    ((Iol0O1Oo) this.I00000oOI).I000II = sb2.toString();
                            break;
                    }
                }

                @Override
                public final II0oOIlio0 I0001Ioi1lo() {
                    switch (this.I00000oIO) {
                        case 0:
/* 13 */                    return (Io1OOOi1Iolo) this.I00000oOI;
                        default:
/* 8 */                     return (Iol0O1Oo) this.I00000oOI;
                    }
                }

                @Override
                public void I000O01llI0(IollOIOOI00 iollOIOOI00) {
                    switch (this.I00000oIO) {
                        case 0:
/* 15 */                    iollOIOOI00.I0000oI00((OlII11110Iol) this.I0000Il00O, (Io1OOOi1Iolo) this.I00000oOI);
                            break;
                    }
                }

                @Override
                public final II0oOO1 I000OOo1O(IiiliIioo0oi iiiliIioo0oi) {
                    switch (this.I00000oIO) {
                        case 0:
/* 3 */                     return null;
                        default:
/* 10 */                    if (iiiliIioo0oi.I000O01llI0 >= 4) {
/* 19 */                        return new II0oOO1(-1, iiiliIioo0oi.I0000O + 4, false);
                            }
/* 25 */                    if (iiiliIioo0oi.I000OOo1O) {
/* 29 */                        return II0oOO1.I00000oIO(iiiliIioo0oi.I0001Ioi1lo);
                            }
/* 3 */                     return null;
                    }
                }

/* 18 */        public Io1Oill10II() {
                }
            }
