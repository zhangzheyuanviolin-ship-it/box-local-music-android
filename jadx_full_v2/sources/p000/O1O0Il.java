            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class O1O0Il extends O1IoOOii0Ioi {
                public ArrayList I000OOo1O;
                public ArrayList I000OiO;
                public String I000iOII;
                public float I000l1;
                public float I000lI;

                public O1O0Il(String str) {
/* 5 */             super(O1IoiiO0o1.I00olI, "");
/* 13 */            this.I000OOo1O = new ArrayList();
/* 20 */            this.I000OiO = new ArrayList();
/* 22 */            this.I000iOII = str;
                }

                @Override
                public final O1IoOOii0Ioi I0000Il00O() throws O1Ooo1IIioo {
/* 1 */             O1O0Il o1O0IlI00000oIO = I00000oIO();
/* 5 */             I0000O(o1O0IlI00000oIO);
/* 10 */            Iterator it = o1O0IlI00000oIO.I000OiO.iterator();
/* 18 */            while (it.hasNext()) {
/* 24 */                List list = (List) it.next();
/* 26 */                int size = list.size();
/* 31 */                for (int i = 0; i < size; i++) {
/* 43 */                    list.set(i, ((O1IooO) list.get(i)).I0000Il00O());
                        }
                    }
/* 113 */           return o1O0IlI00000oIO;
                }

                @Override
                public final O1O0Il I00000oIO() throws O1Ooo1IIioo {
/* 5 */             O1O0Il o1O0Il = new O1O0Il(this.I000iOII);
/* 8 */             I00000oOI(o1O0Il);
/* 13 */            ArrayList arrayList = new ArrayList();
/* 16 */            o1O0Il.I000OOo1O = arrayList;
/* 26 */            arrayList.addAll(IOOi0Ool1i.I00iio(this.I000OOo1O));
/* 34 */            o1O0Il.I000OiO = new ArrayList();
/* 38 */            Iterator it = this.I000OiO.iterator();
/* 46 */            while (it.hasNext()) {
/* 52 */                List list = (List) it.next();
/* 56 */                ArrayList arrayList2 = new ArrayList();
/* 59 */                int size = list.size();
/* 64 */                for (int i = 0; i < size; i++) {
/* 76 */                    arrayList2.add(((O1IooO) list.get(i)).I00000oOI());
                        }
/* 84 */                o1O0Il.I000OiO.add(arrayList2);
                    }
/* 90 */            o1O0Il.I000l1 = this.I000l1;
/* 94 */            o1O0Il.I000lI = this.I000lI;
/* 113 */           return o1O0Il;
                }

                public final int I000OiO() {
/* 3 */             Iterator it = this.I000OiO.iterator();
/* 7 */             int iMax = 0;
/* 12 */            while (it.hasNext()) {
/* 24 */                iMax = Math.max(iMax, ((List) it.next()).size());
                    }
/* 29 */            return iMax;
                }

                public final void I000iOII(O1IlI1l o1IlI1l, int i) {
/* 7 */             if (this.I000OOo1O.size() <= i) {
/* 15 */                for (int size = this.I000OOo1O.size(); size <= i; size++) {
/* 23 */                    this.I000OOo1O.add(size, O1IlI1l.I00iiI);
                        }
                    }
/* 30 */            this.I000OOo1O.set(i, o1IlI1l);
                }
            }
