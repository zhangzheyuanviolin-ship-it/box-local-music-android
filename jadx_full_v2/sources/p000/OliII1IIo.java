            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public final class OliII1IIo extends O1iio0 {
                public OI0010oo1o I00000oOI;
                public Ill0IO I0000Il00O;

                @Override
                public final Collection I0000Il00O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 1 */             OI0010oo1o oI0010oo1o = this.I00000oOI;
/* 3 */             Ill0IO ill0IO = this.I0000Il00O;
/* 11 */            if (!iiOOioIIO0.I00000oIO(IiOOioIIO0.I000O01llI0) || (ill0IO.I00000oIO.I0000Il00O() && iiOOioIIO0.I00000oIO.contains(IiOOOo0o1lo.I00000oIO))) {
/* 32 */                return Il01100l.I00iOIl;
                    }
/* 35 */            Collection collectionI000O01llI0 = oI0010oo1o.I000O01llI0(ill0IO, function1);
/* 45 */            ArrayList arrayList = new ArrayList(collectionI000O01llI0.size());
/* 48 */            Iterator it = collectionI000O01llI0.iterator();
/* 56 */            while (it.hasNext()) {
/* 66 */                OI1Iio0ii1 oI1Iio0ii1I000II = ((Ill0IO) it.next()).I00000oIO.I000II();
/* 80 */                if (((Boolean) function1.invoke(oI1Iio0ii1I000II)).booleanValue()) {
/* 84 */                    O0o0oOii o0o0oOii = null;
/* 85 */                    if (!oI1Iio0ii1I000II.I00iiI) {
/* 92 */                        O0o0oOii o0o0oOiiI00i0ilIl0i = oI0010oo1o.I00i0ilIl0i(ill0IO.I00000oIO(oI1Iio0ii1I000II));
/* 96 */                        O1I0II11i o1I0II11i = o0o0oOiiI00i0ilIl0i.I00ilO0;
/* 101 */                       O0O00I1Ili o0O00I1Ili = O0o0oOii.I00ioIO[1];
/* 113 */                       if (!((Boolean) o1I0II11i.invoke()).booleanValue()) {
/* 116 */                           o0o0oOii = o0o0oOiiI00i0ilIl0i;
                                }
                            }
/* 117 */                   iiIiiol0.I00000oIO(arrayList, o0o0oOii);
                        }
                    }
/* 551 */           return arrayList;
                }

                @Override
                public final Set I0000O() {
/* 1 */             return Il01llIol0.I00iOIl;
                }

                public final String toString() {
/* 23 */            return "subpackages of " + this.I0000Il00O + " from " + this.I00000oOI;
                }
            }
