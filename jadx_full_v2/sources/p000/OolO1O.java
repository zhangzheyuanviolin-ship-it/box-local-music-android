            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Map;
            
            public final class OolO1O {
                public Ool11Ol0lo1 I00000oIO;
                public IIo0ll0o I00000oOI;
                public Io101ll1ol I0000Il00O;
                public Ool11Ol0lo1 I0000O;
                public OllO00oiil I0000oI00;
                public OllO00oiil I0001Ioi1lo;

                public final IIll0oO I00000oIO() {
/* 7 */             return (IIll0oO) this.I0000oI00.getValue();
                }

                public final LinkedHashSet I00000oOI(Collection collection) {
/* 3 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 8 */             Iterator it = collection.iterator();
/* 16 */            while (it.hasNext()) {
/* 36 */                OlOO0I1 olOO0I1 = (OlOO0I1) ((Map) this.I0001Ioi1lo.getValue()).get((IiIO1ol1i1o0) it.next());
/* 38 */                if (olOO0I1 != null) {
/* 46 */                    linkedHashSet.add(OlOO0I1.I00000oIO(olOO0I1.I00000oIO));
                        }
                    }
/* 77 */            return linkedHashSet;
                }
            }
