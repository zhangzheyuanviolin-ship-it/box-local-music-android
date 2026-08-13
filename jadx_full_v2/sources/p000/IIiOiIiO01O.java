            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
/* 20 */    public final class IIiOiIiO01O implements Runnable {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;

                public IIiOiIiO01O(List list, int i, Throwable th) {
/* 2 */             this.I00iOIl = 1;
/* 9 */             lII1OI11o1I.I0000O("initCallbacks cannot be null", list);
/* 17 */            this.I00iiO = new ArrayList(list);
/* 19 */            this.I00iiI = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 61 */                    Oi00IilOloo0 oi00IilOloo0 = (Oi00IilOloo0) this.I00iiO;
/* 63 */                    int i = this.I00iiI;
/* 67 */                    I1I1OO00o1o i1I1OO00o1o = (I1I1OO00o1o) oi00IilOloo0.I00iOIl;
/* 69 */                    if (i1I1OO00o1o != null) {
/* 71 */                        i1I1OO00o1o.I001IO000(i);
                                break;
                            }
                            break;
                        case 1:
/* 18 */                    ArrayList arrayList = (ArrayList) this.I00iiO;
/* 20 */                    int size = arrayList.size();
/* 27 */                    int i2 = 0;
/* 28 */                    if (this.I00iiI == 1) {
/* 44 */                        while (i2 < size) {
/* 52 */                            ((Iioll1) arrayList.get(i2)).I00000oOI();
/* 55 */                            i2++;
                                }
                                break;
                            } else {
/* 30 */                        while (i2 < size) {
/* 38 */                            ((Iioll1) arrayList.get(i2)).I00000oIO();
/* 41 */                            i2++;
                                }
                                break;
                            }
                        default:
/* 12 */                    ((i0Ol1Ool00) this.I00iiO).I0000Il00O(this.I00iiI);
                            break;
                    }
                }

/* 21 */        public IIiOiIiO01O(int i) {
/* 22 */            this.I00iOIl = i;
                }
            }
