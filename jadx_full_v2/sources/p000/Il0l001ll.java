            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Il0l001ll extends O0iO10011II implements Function1 {
                public final int I00iOIl;
                public final Il0l0i I00iiI;
                public final long I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Il0l001ll(Il0l0i il0l0i, long j, int i) {
/* 8 */             super(1);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = il0l0i;
/* 5 */             this.I00iiO = j;
                }

                @Override
                public final Object invoke(Object obj) {
                    Function1 function1;
                    Function1 function12;
                    Function1 function13;
                    Function1 function14;
                    int iOrdinal;
/* 1 */             int i = this.I00iOIl;
/* 3 */             long j = this.I00iiO;
/* 5 */             long jI0000O = 0;
/* 10 */            Il0l0i il0l0i = this.I00iiI;
                    switch (i) {
                        case 0:
/* 201 */                   int iOrdinal2 = ((Il0OoI0oO1Ii) obj).ordinal();
/* 205 */                   if (iOrdinal2 == 0) {
/* 244 */                       IO100o1 iO100o1 = il0l0i.I00oIiI10.I00000oIO.I0000Il00O;
/* 246 */                       if (iO100o1 != null && (function1 = iO100o1.I00000oOI) != null) {
/* 262 */                           j = ((IooOl0ol01) function1.invoke(IooOl0ol01.I00000oIO(j))).I00000oIO;
                                }
                            } else if (iOrdinal2 != 1) {
/* 209 */                       if (iOrdinal2 != 2) {
/* 236 */                           I000II.I00000oIO();
/* 7 */                             return null;
                                }
/* 215 */                       IO100o1 iO100o12 = il0l0i.I00oO101o.I00000oIO.I0000Il00O;
/* 217 */                       if (iO100o12 != null && (function12 = iO100o12.I00000oOI) != null) {
/* 233 */                           j = ((IooOl0ol01) function12.invoke(IooOl0ol01.I00000oIO(j))).I00000oIO;
                                }
                            }
/* 264 */                   return IooOl0ol01.I00000oIO(j);
                        case 1:
/* 106 */                   Il0OoI0oO1Ii il0OoI0oO1Ii = (Il0OoI0oO1Ii) obj;
/* 110 */                   if (il0OoI0oO1Ii == Il0OoI0oO1Ii.I00iiO && il0l0i.I00oO101o.I00000oIO.I00000oOI == null) {
/* 122 */                       jI0000O = il0l0i.I00oOio10iI1.I000OiO;
                            } else {
/* 129 */                       Ol0oo1IioO ol0oo1IioO = il0l0i.I00oIiI10.I00000oIO.I00000oOI;
/* 150 */                       long j2 = (ol0oo1IioO == null || (function14 = ol0oo1IioO.I00000oIO) == null) ? 0L : ((IooO0O) function14.invoke(IooOl0ol01.I00000oIO(j))).I00000oIO;
/* 155 */                       Ol0oo1IioO ol0oo1IioO2 = il0l0i.I00oO101o.I00000oIO.I00000oOI;
/* 176 */                       long j3 = (ol0oo1IioO2 == null || (function13 = ol0oo1IioO2.I00000oIO) == null) ? 0L : ((IooO0O) function13.invoke(IooOl0ol01.I00000oIO(j))).I00000oIO;
/* 177 */                       int iOrdinal3 = il0OoI0oO1Ii.ordinal();
/* 181 */                       if (iOrdinal3 == 0) {
/* 193 */                           jI0000O = j2;
                                } else if (iOrdinal3 != 1) {
/* 185 */                           if (iOrdinal3 != 2) {
/* 189 */                               I000II.I00000oIO();
/* 7 */                                 return null;
                                    }
/* 187 */                           jI0000O = j3;
                                }
                            }
/* 194 */                   return IooO0O.I00000oIO(jI0000O);
                        default:
/* 15 */                    Il0OoI0oO1Ii il0OoI0oO1Ii2 = (Il0OoI0oO1Ii) obj;
/* 19 */                    if (il0l0i.I00oliIiO01i != null && il0l0i.I010lI0oi() != null && !O0000Ioio00.I0000O(il0l0i.I00oliIiO01i, il0l0i.I010lI0oi()) && (iOrdinal = il0OoI0oO1Ii2.ordinal()) != 0 && iOrdinal != 1) {
/* 50 */                        if (iOrdinal != 2) {
/* 97 */                            I000II.I00000oIO();
/* 7 */                             return null;
                                }
/* 56 */                        IO100o1 iO100o13 = il0l0i.I00oO101o.I00000oIO.I0000Il00O;
/* 58 */                        if (iO100o13 != null) {
/* 60 */                            Function1 function15 = iO100o13.I00000oOI;
/* 62 */                            long j4 = this.I00iiO;
/* 74 */                            long j5 = ((IooOl0ol01) function15.invoke(IooOl0ol01.I00000oIO(j4))).I00000oIO;
/* 76 */                            I0iolI1I11l1 i0iolI1I11l1I010lI0oi = il0l0i.I010lI0oi();
/* 80 */                            O0iOOoiioO o0iOOoiioO = O0iOOoiioO.I00iOIl;
/* 92 */                            jI0000O = IooO0O.I0000O(i0iolI1I11l1I010lI0oi.I00000oIO(j4, j5, o0iOOoiioO), il0l0i.I00oliIiO01i.I00000oIO(j4, j5, o0iOOoiioO));
                                }
                            }
/* 101 */                   return IooO0O.I00000oIO(jI0000O);
                    }
                }
            }
