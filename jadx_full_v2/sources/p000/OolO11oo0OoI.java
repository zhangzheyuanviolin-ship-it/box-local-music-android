            package p000;

            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public final class OolO11oo0OoI implements IllOOo00lI {
                public final int I00iOIl;
                public OolO1O I00iiI;

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OolO1O oolO1O = this.I00iiI;
                    switch (i) {
                        case 0:
/* 90 */                    return (IIll0oO) oolO1O.I00000oIO.get();
                        default:
/* 10 */                    LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 33 */                    for (Map.Entry entry : ((Map) oolO1O.I0000O.get()).entrySet()) {
/* 45 */                        IIo1lioOolol iIo1lioOolol = (IIo1lioOolol) entry.getKey();
/* 51 */                        IiIO1ol1i1o0 iiIO1ol1i1o0 = (IiIO1ol1i1o0) entry.getValue();
/* 65 */                        IIo1loI0 iIo1loI0 = (IIo1loI0) oolO1O.I00000oIO().I00iiO.I00iiI.get(iIo1lioOolol);
/* 67 */                        if (iIo1loI0 != null) {
/* 75 */                            linkedHashMap.put(iiIO1ol1i1o0, OlOO0I1.I00000oIO(iIo1loI0.I00000oIO));
                                }
                            }
/* 79 */                    return O1Oii0O0loo.I000iOII(linkedHashMap);
                    }
                }
            }
