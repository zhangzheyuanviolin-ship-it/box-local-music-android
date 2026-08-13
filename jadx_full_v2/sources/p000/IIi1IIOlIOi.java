            package p000;

            import java.util.regex.Pattern;
            
            public final class IIi1IIOlIOi extends O0iO10011II implements IllOOo00lI {
                public final int I00iOIl;
                public final IIi1IIlllIi I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIi1IIOlIOi(IIi1IIlllIi iIi1IIlllIi, int i) {
/* 6 */             super(0);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = iIi1IIlllIi;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IIi1IIlllIi iIi1IIlllIi = this.I00iiI;
                    switch (i) {
                        case 0:
/* 28 */                    return iOiiO0.I00000oIO(iIi1IIlllIi.I0001Ioi1lo);
                        default:
/* 12 */                    String strI00000oOI = iIi1IIlllIi.I0001Ioi1lo.I00000oOI("Content-Type");
/* 17 */                    if (strI00000oOI == null) {
/* 16 */                        return null;
                            }
/* 19 */                    Pattern pattern = O1ii0l1iii.I0000Il00O;
                            try {
/* 21 */                        return l1IiOI.I00000oIO(strI00000oOI);
                            } catch (IllegalArgumentException unused) {
/* 16 */                        return null;
                            }
                    }
                }
            }
