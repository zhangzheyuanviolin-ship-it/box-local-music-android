            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Il0l01IIlI extends O0iO10011II implements Function1 {
                public final int I00iOIl;
                public final Il0l0i I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Il0l01IIlI(Il0l0i il0l0i, int i) {
/* 6 */             super(1);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = il0l0i;
                }

                @Override
                public final Object invoke(Object obj) {
                    IlIoO1ilo1 ilIoO1ilo1;
                    IlIoO1ilo1 ilIoO1ilo12;
/* 1 */             int i = this.I00iOIl;
/* 3 */             Il0l0i il0l0i = this.I00iiI;
                    switch (i) {
                        case 0:
/* 61 */                    OoI1O01lI ooI1O01lI = (OoI1O01lI) obj;
/* 63 */                    Il0OoI0oO1Ii il0OoI0oO1Ii = Il0OoI0oO1Ii.I00iOIl;
/* 65 */                    Il0OoI0oO1Ii il0OoI0oO1Ii2 = Il0OoI0oO1Ii.I00iiI;
/* 71 */                    Object obj2 = null;
/* 72 */                    if (ooI1O01lI.I0000O(il0OoI0oO1Ii, il0OoI0oO1Ii2)) {
/* 78 */                        IO100o1 iO100o1 = il0l0i.I00oIiI10.I00000oIO.I0000Il00O;
/* 80 */                        if (iO100o1 != null) {
/* 82 */                            obj2 = iO100o1.I0000Il00O;
                                }
                            } else if (ooI1O01lI.I0000O(il0OoI0oO1Ii2, Il0OoI0oO1Ii.I00iiO)) {
/* 97 */                        IO100o1 iO100o12 = il0l0i.I00oO101o.I00000oIO.I0000Il00O;
/* 99 */                        if (iO100o12 != null) {
/* 101 */                           obj2 = iO100o12.I0000Il00O;
                                }
                            } else {
/* 104 */                       obj2 = Il0iiiII11.I0000oI00;
                            }
                            return obj2 == null ? Il0iiiII11.I0000oI00 : obj2;
                        default:
/* 8 */                     OoI1O01lI ooI1O01lI2 = (OoI1O01lI) obj;
/* 10 */                    Il0OoI0oO1Ii il0OoI0oO1Ii3 = Il0OoI0oO1Ii.I00iOIl;
/* 12 */                    Il0OoI0oO1Ii il0OoI0oO1Ii4 = Il0OoI0oO1Ii.I00iiI;
/* 18 */                    if (ooI1O01lI2.I0000O(il0OoI0oO1Ii3, il0OoI0oO1Ii4)) {
/* 24 */                        Ol0oo1IioO ol0oo1IioO = il0l0i.I00oIiI10.I00000oIO.I00000oOI;
                                return (ol0oo1IioO == null || (ilIoO1ilo12 = ol0oo1IioO.I00000oOI) == null) ? Il0iiiII11.I0000O : ilIoO1ilo12;
                            }
/* 41 */                    if (!ooI1O01lI2.I0000O(il0OoI0oO1Ii4, Il0OoI0oO1Ii.I00iiO)) {
/* 58 */                        return Il0iiiII11.I0000O;
                            }
/* 47 */                    Ol0oo1IioO ol0oo1IioO2 = il0l0i.I00oO101o.I00000oIO.I00000oOI;
                            return (ol0oo1IioO2 == null || (ilIoO1ilo1 = ol0oo1IioO2.I00000oOI) == null) ? Il0iiiII11.I0000O : ilIoO1ilo1;
                    }
                }
            }
