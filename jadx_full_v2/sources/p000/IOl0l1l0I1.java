            package p000;

            import java.util.ArrayList;
            
/* 27 */    public abstract class IOl0l1l0I1 implements O0iI1ol {
                public final ArrayList I00iOIl;

                public IOl0l1l0I1(int i) {
                    switch (i) {
                        case 1:
/* 23 */                    this.I00iOIl = new ArrayList();
                            break;
                        default:
/* 12 */                    this.I00iOIl = new ArrayList();
                            break;
                    }
                }

                @Override
                public O0iI0IlO0iI I00000oIO(IOIOill iOIOill) {
/* 1 */             return null;
                }

                @Override
                public void I00000oOI(Object obj) {
/* 3 */             if (obj instanceof String) {
/* 9 */                 this.I00iOIl.add((String) obj);
                    }
                }

                public boolean I0000O(int i, IloI10l1l iloI10l1l, Object obj) {
/* 1 */             ArrayList arrayList = iloI10l1l.I00000oIO;
/* 4 */             if (arrayList == null) {
/* 7 */                 I0001Ioi1lo(i, iloI10l1l, null);
/* 3 */                 return true;
                    }
/* 11 */            int size = arrayList.size();
/* 16 */            int i2 = 0;
                    while (true) {
/* 17 */                if (i2 >= size) {
                            break;
                        }
/* 19 */                Object obj2 = arrayList.get(i2);
/* 25 */                if (!(obj2 instanceof Ilo1iIi1OI01)) {
/* 36 */                    if (!(obj2 instanceof IloI10l1l)) {
/* 56 */                        IOOlIIilOl0.I000lI("Unexpected child source info ", obj2);
                                break;
                            }
/* 45 */                    if (I0000O(i, (IloI10l1l) obj2, obj)) {
/* 47 */                        I0001Ioi1lo(0, iloI10l1l, obj2);
/* 3 */                         return true;
                            }
                        } else if (obj2 == obj) {
/* 30 */                    I0001Ioi1lo(0, iloI10l1l, obj2);
/* 3 */                     return true;
                        }
/* 51 */                i2++;
                    }
/* 15 */            return false;
                }

                public void I0001Ioi1lo(int i, IloI10l1l iloI10l1l, Object obj) {
/* 9 */             this.I00iOIl.add(new IOl0o1(i, null, null));
                }

                public void I000II(int i, Object obj, IloI10l1l iloI10l1l, Object obj2) {
/* 7 */             if (O0000Ioio00.I0000O(obj, IOl11li.I00000oIO)) {
/* 11 */                I0001Ioi1lo(i, iloI10l1l, null);
                    }
                }

                public abstract void I000O01llI0(String[] strArr);

                @Override
                public void I000OOo1O() {
/* 12 */            I000O01llI0((String[]) this.I00iOIl.toArray(new String[0]));
                }

                @Override
/* 28 */        public void I0000oI00(IOIOo1o iOIOo1o) {
                }

                @Override
/* 36 */        public void I0000Il00O(IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii1) {
                }
            }
