            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OO0Ii1 {
                public ArrayList I00000oIO = new ArrayList(32);

                public void I00000oIO(List list) {
/* 5 */             if (list.isEmpty()) {
/* 7 */                 return;
                    }
/* 8 */             ArrayList arrayList = this.I00000oIO;
/* 10 */            if (arrayList == null) {
/* 14 */                arrayList = new ArrayList();
/* 17 */                this.I00000oIO = arrayList;
                    }
/* 19 */            boolean zIsEmpty = arrayList.isEmpty();
/* 23 */            ArrayList arrayList2 = this.I00000oIO;
/* 25 */            if (zIsEmpty) {
/* 27 */                arrayList2.addAll(list);
/* 30 */                return;
                    }
/* 36 */            int size = arrayList2.size() - 1;
/* 43 */            OlIIOI0o olIIOI0o = (OlIIOI0o) this.I00000oIO.get(size);
/* 50 */            OlIIOI0o olIIOI0o2 = (OlIIOI0o) list.get(0);
/* 52 */            int i = olIIOI0o.I00000oIO;
/* 56 */            if (i == olIIOI0o2.I00000oIO) {
/* 58 */                int i2 = olIIOI0o.I00000oOI;
/* 60 */                int i3 = olIIOI0o.I0000Il00O;
/* 66 */                if (i2 + i3 == olIIOI0o2.I00000oOI) {
/* 77 */                    this.I00000oIO.set(size, OlIIOI0o.I00000oIO(i, i2, i3 + olIIOI0o2.I0000Il00O));
/* 90 */                    this.I00000oIO.addAll(list.subList(1, list.size()));
/* 93 */                    return;
                        }
                    }
/* 96 */            this.I00000oIO.addAll(list);
                }

                public void I00000oOI(List list) {
/* 1 */             Iterator it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 21 */                I00000oIO(((OIIl1OIol) it.next()).I0000O());
                    }
                }

                public void I0000Il00O() {
/* 5 */             this.I00000oIO.add(OO0IooOI.I0000Il00O);
                }

                public void I0000O(float f, float f2, float f3, float f4, float f5, float f6) {
/* 14 */            this.I00000oIO.add(new OO0O0iIOOOo(f, f2, f3, f4, f5, f6));
                }

                public void I0000oI00(float f, float f2, float f3, float f4, float f5, float f6) {
/* 14 */            this.I00000oIO.add(new OO0Oi1loOoi0(f, f2, f3, f4, f5, f6));
                }

                public void I0001Ioi1lo(float f) {
/* 8 */             this.I00000oIO.add(new OO0O1O(f));
                }

                public void I000II(float f) {
/* 8 */             this.I00000oIO.add(new OO0OlIi1I(f));
                }

                public void I000O01llI0(float f, float f2) {
/* 8 */             this.I00000oIO.add(new OO0OIioIIl(f, f2));
                }

                public void I000OOo1O(float f, float f2) {
/* 8 */             this.I00000oIO.add(new OO0Oo0lIiIl(f, f2));
                }

                public void I000OiO(float f, float f2) {
/* 8 */             this.I00000oIO.add(new OO0OIl1l10O(f, f2));
                }

                public void I000iOII(float f, float f2) {
/* 8 */             this.I00000oIO.add(new OO0OoO(f, f2));
                }

                public void I000l1(float f, float f2, float f3, float f4) {
/* 8 */             this.I00000oIO.add(new OO0OOOi1o10O(f, f2, f3, f4));
                }

                public void I000lI(float f, float f2, float f3, float f4) {
/* 8 */             this.I00000oIO.add(new OO0i1i(f, f2, f3, f4));
                }

                public void I000o00OoI0I(float f) {
/* 8 */             this.I00000oIO.add(new OO0iIl(f));
                }

                public void I000oI1ioi(float f) {
/* 8 */             this.I00000oIO.add(new OO0iIOIioOI(f));
                }
            }
