            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            
            public final class IlIlo10 implements I11IlOOO {
                public I11IlOOO I00iOIl;
                public OoOi1I011O I00iiI;

                @Override
                public final boolean I001l0I00(Ill0IO ill0IO) {
/* 13 */            if (((Boolean) this.I00iiI.invoke(ill0IO)).booleanValue()) {
/* 17 */                return this.I00iOIl.I001l0I00(ill0IO);
                    }
/* 22 */            return false;
                }

                @Override
                public final I111oOiIiO0 I00IOO(Ill0IO ill0IO) {
/* 13 */            if (((Boolean) this.I00iiI.invoke(ill0IO)).booleanValue()) {
/* 17 */                return this.I00iOIl.I00IOO(ill0IO);
                    }
/* 22 */            return null;
                }

                @Override
                public final boolean isEmpty() {
/* 1 */             I11IlOOO i11IlOOO = this.I00iOIl;
/* 6 */             if ((i11IlOOO instanceof Collection) && ((Collection) i11IlOOO).isEmpty()) {
/* 5 */                 return false;
                    }
/* 18 */            Iterator it = i11IlOOO.iterator();
/* 26 */            while (it.hasNext()) {
/* 34 */                Ill0IO ill0IOI0010o = ((I111oOiIiO0) it.next()).I0010o();
/* 38 */                if (ill0IOI0010o != null && ((Boolean) this.I00iiI.invoke(ill0IOI0010o)).booleanValue()) {
/* 54 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                @Override
                public final Iterator iterator() {
/* 1 */             I11IlOOO i11IlOOO = this.I00iOIl;
/* 5 */             ArrayList arrayList = new ArrayList();
/* 16 */            for (Object obj : i11IlOOO) {
/* 25 */                Ill0IO ill0IOI0010o = ((I111oOiIiO0) obj).I0010o();
/* 29 */                if (ill0IOI0010o != null && ((Boolean) this.I00iiI.invoke(ill0IOI0010o)).booleanValue()) {
/* 45 */                    arrayList.add(obj);
                        }
                    }
/* 49 */            return arrayList.iterator();
                }
            }
