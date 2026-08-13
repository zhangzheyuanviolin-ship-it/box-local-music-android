            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public abstract class l00IlO1iolO {
                public static final Ooioo0o1l0 I00000oIO(ArrayList arrayList) {
                    Ol0O0iI0l0O ol0O0iI0l0O;
/* 1 */             int size = arrayList.size();
/* 6 */             if (size == 0) {
/* 158 */               I000II.I001IO000("Expected some types");
/* 5 */                 return null;
                    }
/* 9 */             if (size == 1) {
/* 153 */               return (Ooioo0o1l0) IOOi0Ool1i.I00OOll1(arrayList);
                    }
/* 19 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 22 */            Iterator it = arrayList.iterator();
/* 27 */            boolean z = false;
/* 28 */            boolean z2 = false;
/* 33 */            while (it.hasNext()) {
/* 39 */                Ooioo0o1l0 ooioo0o1l0 = (Ooioo0o1l0) it.next();
/* 52 */                z = z || l0loOi1ol11o.I00000oIO(ooioo0o1l0);
/* 55 */                if (ooioo0o1l0 instanceof Ol0O0iI0l0O) {
/* 57 */                    ol0O0iI0l0O = (Ol0O0iI0l0O) ooioo0o1l0;
                        } else {
/* 62 */                    if (!(ooioo0o1l0 instanceof IlOIOIi00io)) {
/* 73 */                        I000II.I00000oIO();
/* 5 */                         return null;
                            }
/* 66 */                    ol0O0iI0l0O = ((IlOIOIi00io) ooioo0o1l0).I00iiI;
/* 68 */                    z2 = true;
                        }
/* 69 */                arrayList2.add(ol0O0iI0l0O);
                    }
/* 77 */            if (z) {
/* 89 */                return Il0ooiloI.I00000oOI(Il0ooO1IO.I00olI, arrayList.toString());
                    }
/* 94 */            OoOO1o0 ooOO1o0 = OoOO1o0.I00000oIO;
/* 96 */            if (!z2) {
/* 98 */                return ooOO1o0.I00000oOI(arrayList2);
                    }
/* 109 */           ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 112 */           Iterator it2 = arrayList.iterator();
/* 120 */           while (it2.hasNext()) {
/* 132 */               arrayList3.add(ilOiIOII1.I00000oOI((Ooioo0o1l0) it2.next()));
                    }
/* 144 */           return l0loOIIo0iOo.I00000oIO(ooOO1o0.I00000oOI(arrayList2), ooOO1o0.I00000oOI(arrayList3));
                }
            }
