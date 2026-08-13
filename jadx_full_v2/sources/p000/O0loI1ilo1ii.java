            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class O0loI1ilo1ii implements Function1 {
                public final int I00iOIl;
                public O0loIO11Ilo I00iiI;

                public O0loI1ilo1ii(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O0loIO11Ilo o0loIO11Ilo = this.I00iiI;
                    switch (i) {
                        case 0:
/* 89 */                    O0liilOIOii o0liilOIOii = (O0liilOIOii) o0loIO11Ilo.I00o0iI0io1.invoke();
/* 91 */                    int iI00000oIO = o0liilOIOii.I00000oIO();
/* 95 */                    int i2 = 0;
                            while (true) {
/* 96 */                        if (i2 >= iI00000oIO) {
/* 112 */                           i2 = -1;
                                } else if (!o0liilOIOii.I00000oOI(i2).equals(obj)) {
/* 109 */                           i2++;
                                }
                            }
/* 113 */                   return Integer.valueOf(i2);
                        default:
/* 10 */                    int iIntValue = ((Integer) obj).intValue();
/* 20 */                    O0liilOIOii o0liilOIOii2 = (O0liilOIOii) o0loIO11Ilo.I00o0iI0io1.invoke();
/* 22 */                    if (iIntValue < 0 || iIntValue >= o0liilOIOii2.I00000oIO()) {
/* 62 */                        Ioll0IliO1l.I00000oIO("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + o0liilOIOii2.I00000oIO() + ")");
                            }
/* 77 */                    iOi1II01i0.I0000O(o0loIO11Ilo.I00ooiO1I(), null, null, new I1oO0ooi001(o0loIO11Ilo, iIntValue, null, 5), 3);
/* 80 */                    return Boolean.TRUE;
                    }
                }
            }
