            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class OlO1010i1l implements Iterator, O0IlIoi {
                public final Ol1o1llOII I00iOIl;
                public final Iterator I00iiI;
                public int I00iiO;
                public Map.Entry I00iio;
                public Map.Entry I00ilI0I1;
                public final int I00ilO0;

                public OlO1010i1l(Ol1o1llOII ol1o1llOII, Iterator it, int i) {
/* 1 */             this.I00ilO0 = i;
/* 6 */             this.I00iOIl = ol1o1llOII;
/* 8 */             this.I00iiI = it;
/* 16 */            this.I00iiO = ol1o1llOII.I0000Il00O().I0000O;
/* 18 */            I00000oIO();
                }

                public final void I00000oIO() {
/* 3 */             this.I00iio = this.I00ilI0I1;
/* 5 */             Iterator it = this.I00iiI;
/* 21 */            this.I00ilI0I1 = it.hasNext() ? (Map.Entry) it.next() : null;
                }

                @Override
                public final boolean hasNext() {
                    return this.I00ilI0I1 != null;
                }

                @Override
                public final Object next() {
                    switch (this.I00ilO0) {
                        case 0:
/* 39 */                    I00000oIO();
/* 42 */                    Map.Entry entry = this.I00iio;
/* 44 */                    if (entry == null) {
/* 72 */                        IOOlIIilOl0.I000iOII();
                                break;
                            } else {
/* 49 */                        IO0iioo1 iO0iioo1 = new IO0iioo1(1);
/* 52 */                        iO0iioo1.I00iio = this;
/* 58 */                        iO0iioo1.I00iiI = entry.getKey();
/* 66 */                        iO0iioo1.I00iiO = this.I00iio.getValue();
/* 68 */                        VarHandle.storeStoreFence();
                                break;
                            }
                        case 1:
/* 23 */                    Map.Entry entry2 = this.I00ilI0I1;
/* 25 */                    if (entry2 == null) {
/* 35 */                        IOOlIIilOl0.I000iOII();
                                break;
                            } else {
/* 27 */                        I00000oIO();
                                break;
                            }
                        default:
/* 7 */                     Map.Entry entry3 = this.I00ilI0I1;
/* 9 */                     if (entry3 == null) {
/* 19 */                        IOOlIIilOl0.I000iOII();
                                break;
                            } else {
/* 11 */                        I00000oIO();
                                break;
                            }
                    }
/* 3 */             return null;
                }

                @Override
                public final void remove() {
/* 1 */             Ol1o1llOII ol1o1llOII = this.I00iOIl;
/* 11 */            if (ol1o1llOII.I0000Il00O().I0000O != this.I00iiO) {
/* 40 */                I000II.I001IIilI0O();
/* 113 */               return;
                    }
/* 13 */            Map.Entry entry = this.I00iio;
/* 15 */            if (entry == null) {
/* 36 */                IOOlIIilOl0.I000iOII();
/* 39 */                return;
                    }
/* 21 */            ol1o1llOII.remove(entry.getKey());
/* 25 */            this.I00iio = null;
/* 33 */            this.I00iiO = ol1o1llOII.I0000Il00O().I0000O;
                }
            }
