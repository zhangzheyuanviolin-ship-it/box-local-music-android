            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Set;
            
            public abstract class IOi0lll110 {
                public static final LinkedHashSet I00000oIO;

                static {
/* 1 */             Set set = OOIil01OI.I00ilI0I1;
/* 13 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(set, 10));
/* 16 */            Iterator it = set.iterator();
/* 24 */            while (it.hasNext()) {
/* 40 */                arrayList.add(OlIlllOI1.I000l1.I00000oIO(((OOIil01OI) it.next()).I00iOIl));
                    }
/* 70 */            ArrayList arrayListI00OI1 = IOOi0Ool1i.I00OI1(IOOi0Ool1i.I00OI1(IOOi0Ool1i.I00OI1(arrayList, OlIllOO11lOl.I0001Ioi1lo.I000OOo1O()), OlIllOO11lOl.I000O01llI0.I000OOo1O()), OlIllOO11lOl.I000OiO.I000OOo1O());
/* 76 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 79 */            Iterator it2 = arrayListI00OI1.iterator();
/* 87 */            while (it2.hasNext()) {
/* 93 */                Ill0IO ill0IO = (Ill0IO) it2.next();
/* 110 */               linkedHashSet.add(new IOIOill(ill0IO.I00000oOI(), ill0IO.I00000oIO.I000II()));
                    }
/* 114 */           I00000oIO = linkedHashSet;
                }
            }
