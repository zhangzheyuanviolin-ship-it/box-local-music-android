            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class lOOOl0OIioo0 {
                public static final O0iIl1 I00000oIO(ArrayList arrayList, List list, O0i1lI0o1io o0i1lI0o1io) {
/* 4 */             OlIo1o0I0iIo olIo1o0I0iIo = new OlIo1o0I0iIo(0);
/* 7 */             olIo1o0I0iIo.I0000O = arrayList;
/* 9 */             VarHandle.storeStoreFence();
/* 25 */            O0iIl1 o0iIl1I000O01llI0 = new OoOilII0(olIo1o0I0iIo).I000O01llI0((O0iIl1) IOOi0Ool1i.I001lllioOl(list), Ooo0Ioii0o0.I00ilI0I1);
                    return o0iIl1I000O01llI0 == null ? o0i1lI0o1io.I000oI1ioi() : o0iIl1I000O01llI0;
                }

                public static final O0iIl1 I00000oOI(OoOOiO ooOOiO) {
/* 1 */             Ii1Ool1 ii1Ool1I000lI = ooOOiO.I000lI();
/* 9 */             if (ii1Ool1I000lI instanceof IOIii00) {
/* 17 */                List listI000II = ((IOIii00) ii1Ool1I000lI).I000OOo1O().I000II();
/* 29 */                ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI000II, 10));
/* 32 */                Iterator it = listI000II.iterator();
/* 40 */                while (it.hasNext()) {
/* 52 */                    arrayList.add(((OoOOiO) it.next()).I000OOo1O());
                        }
/* 64 */                return I00000oIO(arrayList, ooOOiO.getUpperBounds(), IiOiOOIo.I0000oI00(ooOOiO));
                    }
/* 71 */            if (!(ii1Ool1I000lI instanceof Illlil)) {
/* 129 */               I000II.I000iOII("Unsupported descriptor type to build star projection type based on type parameters of it");
/* 132 */               return null;
                    }
/* 75 */            List typeParameters = ((Illlil) ii1Ool1I000lI).getTypeParameters();
/* 87 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(typeParameters, 10));
/* 90 */            Iterator it2 = typeParameters.iterator();
/* 98 */            while (it2.hasNext()) {
/* 110 */               arrayList2.add(((OoOOiO) it2.next()).I000OOo1O());
                    }
/* 122 */           return I00000oIO(arrayList2, ooOOiO.getUpperBounds(), IiOiOOIo.I0000oI00(ooOOiO));
                }
            }
