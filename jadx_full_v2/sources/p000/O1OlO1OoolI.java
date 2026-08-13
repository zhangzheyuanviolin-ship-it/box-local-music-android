            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.regex.Matcher;
            
            public final class O1OlO1OoolI extends I00ooIo0 {
                public final int I00iOIl;
                public Object I00iiI;

                public O1OlO1OoolI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final int I00000oOI() {
                    switch (this.I00iOIl) {
                        case 0:
/* 41 */                    return ((O1OlOOioiI) this.I00iiI).I00000oIO.groupCount() + 1;
                        case 1:
/* 28 */                    return ((OO0lO0o) this.I00iiI).I00iiI;
                        case 2:
/* 21 */                    return ((OO0lili) this.I00iiI).I00iiI;
                        default:
/* 12 */                    return ((OO0oi0) this.I00iiI).I00iiO.I0000Il00O();
                    }
                }

                public O1OlIIi1OII1 I0000O(int i) {
/* 5 */             Matcher matcher = ((O1OlOOioiI) this.I00iiI).I00000oIO;
/* 15 */            IooO11l iooO11lI000O01llI0 = lIiioliIlo.I000O01llI0(matcher.start(i), matcher.end(i));
/* 21 */            if (iooO11lI000O01llI0.I00iOIl < 0) {
/* 40 */                return null;
                    }
/* 25 */            String strGroup = matcher.group(i);
/* 29 */            O1OlIIi1OII1 o1OlIIi1OII1 = new O1OlIIi1OII1();
/* 32 */            o1OlIIi1OII1.I00000oIO = strGroup;
/* 34 */            o1OlIIi1OII1.I00000oOI = iooO11lI000O01llI0;
/* 36 */            VarHandle.storeStoreFence();
/* 39 */            return o1OlIIi1OII1;
                }

                @Override
                public final boolean contains(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 39 */                    if (obj == null ? true : obj instanceof O1OlIIi1OII1) {
/* 45 */                        return super.contains((O1OlIIi1OII1) obj);
                            }
/* 41 */                    return false;
                        case 1:
/* 28 */                    return ((OO0lO0o) this.I00iiI).containsValue(obj);
                        case 2:
/* 19 */                    return ((OO0lili) this.I00iiI).containsValue(obj);
                        default:
/* 10 */                    return ((OO0oi0) this.I00iiI).containsValue(obj);
                    }
                }

                @Override
                public boolean isEmpty() {
                    switch (this.I00iOIl) {
                        case 0:
/* 11 */                    return false;
                        default:
/* 6 */                     return super.isEmpty();
                    }
                }

                @Override
                public final Iterator iterator() {
/* 5 */             int i = 0;
/* 6 */             int i2 = 2;
                    switch (this.I00iOIl) {
                        case 0:
/* 90 */                    I1Iolliil0i i1Iolliil0iI001IO000 = IOOi0Ool1i.I001IO000(IOOi1I.I0001Ioi1lo(this));
/* 98 */                    O0l0IlolloIO o0l0IlolloIO = new O0l0IlolloIO(12);
/* 101 */                   o0l0IlolloIO.I00iiI = this;
/* 103 */                   VarHandle.storeStoreFence();
/* 111 */                   return new OoI10o0iO11O(i1Iolliil0iI001IO000, o0l0IlolloIO).iterator();
                        case 1:
/* 66 */                    OoIi1O0 ooIi1O0 = ((OO0lO0o) this.I00iiI).I00iOIl;
/* 68 */                    OoIiOIo0i010[] ooIiOIo0i010Arr = new OoIiOIo0i010[8];
/* 70 */                    while (i < 8) {
/* 77 */                        ooIiOIo0i010Arr[i] = new OoIiiio011l(2);
/* 79 */                        i++;
                            }
/* 82 */                    return new OO0oIl11I01(ooIi1O0, ooIiOIo0i010Arr);
                        case 2:
/* 40 */                    OoIiIlIo ooIiIlIo = ((OO0lili) this.I00iiI).I00iOIl;
/* 42 */                    OoIiOIo0i010[] ooIiOIo0i010Arr2 = new OoIiOIo0i010[8];
/* 44 */                    while (i < 8) {
/* 51 */                        ooIiOIo0i010Arr2[i] = new OoIiio1(2);
/* 53 */                        i++;
                            }
/* 56 */                    return new OO0oIolO(ooIiIlIo, ooIiOIo0i010Arr2);
                        default:
/* 14 */                    OO0oi0 oO0oi0 = (OO0oi0) this.I00iiI;
/* 16 */                    OO0oiO oO0oiO = new OO0oiO(i2);
/* 28 */                    oO0oiO.I00iiI = new OO0oo0lO(oO0oi0.I00iOIl, oO0oi0.I00iiO);
/* 30 */                    VarHandle.storeStoreFence();
/* 33 */                    return oO0oiO;
                    }
                }
            }
