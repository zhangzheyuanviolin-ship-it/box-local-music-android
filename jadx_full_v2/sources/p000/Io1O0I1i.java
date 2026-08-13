            package p000;

            import java.util.List;
            
            public final class Io1O0I1i extends I01O1lIi {
                public final int I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Io1O0I1i(int i) {
/* 4 */             super(6);
/* 1 */             this.I00iiI = i;
                }

                @Override
                public void I010101Oo1lO(String str) {
                    switch (this.I00iiI) {
                        case 0:
/* 7 */                     List list = IoIoIollo0O.I00000oIO;
/* 9 */                     int i = 0;
/* 10 */                    int i2 = 0;
/* 15 */                    while (i < str.length()) {
/* 17 */                        char cCharAt = str.charAt(i);
/* 21 */                        int i3 = i2 + 1;
/* 29 */                        if (O0000Ioio00.I0000oI00(cCharAt, 32) <= 0 || OlOoOIi0o.I00100l0("\"(),/:;<=>?@[\\]{}", cCharAt)) {
/* 49 */                            StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Header name '", str, "' contains illegal character '");
/* 57 */                            sbI001IIilI0O.append(str.charAt(i2));
/* 62 */                            sbI001IIilI0O.append("' (code ");
/* 80 */                            throw new IoOoiol010lI(Oi010OO0.I001i1lo1io(sbI001IIilI0O, str.charAt(i2) & 255, ')'));
                                }
/* 39 */                        i++;
/* 41 */                        i2 = i3;
                            }
/* 81 */                    return;
                        default:
/* 6 */                     return;
                    }
                }

                @Override
                public void I010I0(String str) {
                    switch (this.I00iiI) {
                        case 0:
/* 7 */                     List list = IoIoIollo0O.I00000oIO;
/* 9 */                     int i = 0;
/* 10 */                    int i2 = 0;
/* 15 */                    while (i < str.length()) {
/* 17 */                        char cCharAt = str.charAt(i);
/* 21 */                        int i3 = i2 + 1;
/* 29 */                        if (O0000Ioio00.I0000oI00(cCharAt, 32) < 0 && cCharAt != '\t') {
/* 42 */                            StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Header value '", str, "' contains illegal character '");
/* 50 */                            sbI001IIilI0O.append(str.charAt(i2));
/* 55 */                            sbI001IIilI0O.append("' (code ");
/* 73 */                            throw new IoOoiol010lI(Oi010OO0.I001i1lo1io(sbI001IIilI0O, str.charAt(i2) & 255, ')'));
                                }
/* 74 */                        i++;
/* 76 */                        i2 = i3;
                            }
/* 78 */                    return;
                        default:
/* 6 */                     return;
                    }
                }
            }
