            package p000;

            import java.util.ArrayList;
            import java.util.EnumSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public abstract class O00l1O0i01lO {
                public static final Map I00000oIO = O1Oii0O0loo.I0000O(new OIoi0IIoi("PACKAGE", EnumSet.noneOf(O0iIiI011O10.class)), new OIoi0IIoi("TYPE", EnumSet.of(O0iIiI011O10.I00o0iI0io1, O0iIiI011O10.I00oo1iO0ll)), new OIoi0IIoi("ANNOTATION_TYPE", EnumSet.of(O0iIiI011O10.I00o0l1o1o0)), new OIoi0IIoi("TYPE_PARAMETER", EnumSet.of(O0iIiI011O10.I00o101lO)), new OIoi0IIoi("FIELD", EnumSet.of(O0iIiI011O10.I00oII)), new OIoi0IIoi("LOCAL_VARIABLE", EnumSet.of(O0iIiI011O10.I00oIiI10)), new OIoi0IIoi("PARAMETER", EnumSet.of(O0iIiI011O10.I00oO101o)), new OIoi0IIoi("CONSTRUCTOR", EnumSet.of(O0iIiI011O10.I00oOio10iI1)), new OIoi0IIoi("METHOD", EnumSet.of(O0iIiI011O10.I00ol1, O0iIiI011O10.I00olI, O0iIiI011O10.I00oli)), new OIoi0IIoi("TYPE_USE", EnumSet.of(O0iIiI011O10.I00oliIiO01i)));
                public static final Map I00000oOI = O1Oii0O0loo.I0000O(new OIoi0IIoi("RUNTIME", O0iIOIi.I00iOIl), new OIoi0IIoi("CLASS", O0iIOIi.I00iiI), new OIoi0IIoi("SOURCE", O0iIOIi.I00iiO));

                public static I1IoIo1O0 I00000oIO(List list) {
/* 5 */             ArrayList arrayList = new ArrayList();
/* 16 */            for (Object obj : list) {
/* 24 */                if (obj instanceof OOoII1) {
/* 26 */                    arrayList.add(obj);
                        }
                    }
/* 32 */            ArrayList arrayList2 = new ArrayList();
/* 35 */            Iterator it = arrayList.iterator();
/* 43 */            while (it.hasNext()) {
/* 71 */                Iterable iterable = (EnumSet) I00000oIO.get(OI1Iio0ii1.I0000oI00(((OOoII1) it.next()).I00000oOI.name()).I00000oOI());
/* 73 */                if (iterable == null) {
/* 76 */                    iterable = Il01llIol0.I00iOIl;
                        }
/* 80 */                IOOii0O10Io0.I00100l0(arrayList2, iterable);
                    }
/* 92 */            ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(arrayList2, 10));
/* 95 */            Iterator it2 = arrayList2.iterator();
/* 103 */           while (it2.hasNext()) {
/* 109 */               O0iIiI011O10 o0iIiI011O10 = (O0iIiI011O10) it2.next();
/* 113 */               Ill0IO ill0IO = OlIllOO11lOl.I001IIilI0O;
/* 141 */               arrayList3.add(new Il0o0Oii0I(new IOIOill(ill0IO.I00000oOI(), ill0IO.I00000oIO.I000II()), OI1Iio0ii1.I0000oI00(o0iIiI011O10.name())));
                    }
/* 149 */           return new I1IoIo1O0(arrayList3, IiOi0I1.I00l0OO0IO);
                }
            }
