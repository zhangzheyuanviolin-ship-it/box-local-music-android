            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
/* 87 */    public final class O0lIOO01I1l extends O0lO10oooOlI {
                public OOoIi0o1 I000o00OoI0I;
                public O0lI0O1OOi1 I000oI1ioi;
                public O1I01I0o I00100l0;
                public I1ooIoloo0 I00100o1O0lo;

                @Override
                public final Collection I0000Il00O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 10 */            if (!iiOOioIIO0.I00000oIO(IiOOioIIO0.I000l1 | IiOOioIIO0.I0000oI00)) {
/* 12 */                return Il01100l.I00iOIl;
                    }
/* 21 */            Iterable iterable = (Iterable) this.I0000O.invoke();
/* 25 */            ArrayList arrayList = new ArrayList();
/* 36 */            for (Object obj : iterable) {
/* 43 */                Ii1Ool1 ii1Ool1 = (Ii1Ool1) obj;
/* 47 */                if ((ii1Ool1 instanceof OI000ilOol) && ((Boolean) function1.invoke(((OI000ilOol) ii1Ool1).getName())).booleanValue()) {
/* 67 */                    arrayList.add(obj);
                        }
                    }
/* 89 */            return arrayList;
                }

                @Override
                public final IOIiO1lIl0l I0000oI00(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 2 */             return I001IIilI0O(oI1Iio0ii1, null);
                }

                @Override
                public final Collection I0001Ioi1lo(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 1 */             return Il01100l.I00iOIl;
                }

                @Override
                public final Set I000O01llI0(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 7 */             if (!iiOOioIIO0.I00000oIO(IiOOioIIO0.I0000oI00)) {
/* 9 */                 return Il01llIol0.I00iOIl;
                    }
/* 18 */            Set set = (Set) this.I00100l0.invoke();
/* 20 */            if (set == null) {
/* 56 */                this.I000o00OoI0I.getClass();
/* 61 */                return new LinkedHashSet();
                    }
/* 26 */            HashSet hashSet = new HashSet();
/* 29 */            Iterator it = set.iterator();
/* 37 */            while (it.hasNext()) {
/* 49 */                hashSet.add(OI1Iio0ii1.I0000oI00((String) it.next()));
                    }
/* 53 */            return hashSet;
                }

                @Override
                public final Set I000OOo1O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 1 */             return Il01llIol0.I00iOIl;
                }

                @Override
                public final Ii1i1O0lI I000iOII() {
/* 1 */             return Ii1i1I0i1I.I00000oIO;
                }

                @Override
                public final Set I000o00OoI0I() {
/* 1 */             return Il01llIol0.I00iOIl;
                }

                @Override
                public final Ii1Ool1 I00100l0() {
/* 1 */             return this.I000oI1ioi;
                }

                public final OI000ilOol I001IIilI0O(OI1Iio0ii1 oI1Iio0ii1, OOo1oliI oOo1oliI) {
/* 1 */             OI1Iio0ii1 oI1Iio0ii12 = OlIIoO0Ol0o1.I00000oIO;
/* 11 */            if (oI1Iio0ii1.I00000oOI().length() <= 0 || oI1Iio0ii1.I00iiI) {
/* 61 */                return null;
                    }
/* 23 */            Set set = (Set) this.I00100l0.invoke();
/* 25 */            if (oOo1oliI == null && set != null && !set.contains(oI1Iio0ii1.I00000oOI())) {
/* 61 */                return null;
                    }
/* 40 */            I1ooIoloo0 i1ooIoloo0 = this.I00100o1O0lo;
/* 44 */            O0lI1IIii o0lI1IIii = new O0lI1IIii();
/* 47 */            o0lI1IIii.I00000oIO = oI1Iio0ii1;
/* 49 */            o0lI1IIii.I00000oOI = oOo1oliI;
/* 51 */            VarHandle.storeStoreFence();
/* 58 */            return (OI000ilOol) i1ooIoloo0.invoke(o0lI1IIii);
                }

                @Override
/* 88 */        public final void I000l1(LinkedHashSet linkedHashSet, OI1Iio0ii1 oI1Iio0ii1) {
                }
            }
