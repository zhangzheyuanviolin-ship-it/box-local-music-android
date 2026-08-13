            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Set;
            
            public final class Ol1OI1II0ll extends I01Io001O {
                public static final int I00iiO = 0;
                public Object I00iOIl;
                public int I00iiI;

                @Override
                public final int I00000oOI() {
/* 1 */             return this.I00iiI;
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
                
                    if (p000.OoOOI1100oI0.I00000oOI(r2).add(r7) == false) goto L26;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v4, types: [java.util.AbstractCollection, java.util.Collection, java.util.LinkedHashSet] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean add(Object obj) {
                    Object[] objArr;
/* 1 */             int i = this.I00iiI;
/* 4 */             if (i == 0) {
/* 6 */                 this.I00iOIl = obj;
                    } else {
/* 9 */                 Object obj2 = this.I00iOIl;
/* 12 */                if (i == 1) {
/* 18 */                    if (!O0000Ioio00.I0000O(obj2, obj)) {
/* 27 */                        this.I00iOIl = new Object[]{this.I00iOIl, obj};
                            }
/* 11 */                    return false;
                        }
/* 31 */                if (i < 5) {
/* 33 */                    Object[] objArr2 = (Object[]) obj2;
/* 39 */                    if (!I1IoiO1l.I0001Ioi1lo(objArr2, obj)) {
/* 42 */                        int i2 = this.I00iiI;
/* 45 */                        if (i2 == 4) {
/* 48 */                            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
/* 59 */                            ?? linkedHashSet = new LinkedHashSet(O1Oii0o0Oi.I00000oIO(objArrCopyOf.length));
/* 63 */                            for (Object obj3 : objArrCopyOf) {
/* 67 */                                linkedHashSet.add(obj3);
                                    }
/* 73 */                            linkedHashSet.add(obj);
                                    objArr = linkedHashSet;
                                } else {
/* 78 */                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, i2 + 1);
/* 84 */                            objArrCopyOf2[objArrCopyOf2.length - 1] = obj;
                                    objArr = objArrCopyOf2;
                                }
/* 86 */                        this.I00iOIl = objArr;
                            }
/* 11 */                    return false;
                        }
                    }
                    this.I00iiI++;
/* 3 */             return true;
                }

                @Override
                public final void clear() {
/* 2 */             this.I00iOIl = null;
/* 5 */             this.I00iiI = 0;
                }

                @Override
                public final boolean contains(Object obj) {
/* 5 */             if (I00000oOI() == 0) {
/* 7 */                 return false;
                    }
/* 14 */            if (I00000oOI() == 1) {
/* 18 */                return O0000Ioio00.I0000O(this.I00iOIl, obj);
                    }
/* 23 */            int iI00000oOI = I00000oOI();
/* 27 */            Object obj2 = this.I00iOIl;
                    return iI00000oOI < 5 ? I1IoiO1l.I0001Ioi1lo((Object[]) obj2, obj) : ((Set) obj2).contains(obj);
                }

                @Override
                public final Iterator iterator() {
/* 1 */             int i = this.I00iiI;
/* 3 */             if (i == 0) {
/* 7 */                 return Collections.EMPTY_SET.iterator();
                    }
/* 12 */            Object obj = this.I00iOIl;
/* 15 */            if (i == 1) {
/* 19 */                OilOIO0i01l oilOIO0i01l = new OilOIO0i01l(1);
/* 22 */                oilOIO0i01l.I00iiI = obj;
/* 24 */                oilOIO0i01l.I00iiO = true;
/* 26 */                VarHandle.storeStoreFence();
/* 29 */                return oilOIO0i01l;
                    }
/* 31 */            if (i >= 5) {
/* 54 */                return OoOOI1100oI0.I00000oOI(obj).iterator();
                    }
/* 37 */            OO0o1ooIIi oO0o1ooIIi = new OO0o1ooIIi(1);
/* 44 */            oO0o1ooIIi.I00iiI = iOO1OO.I00000oIO((Object[]) obj);
/* 46 */            VarHandle.storeStoreFence();
/* 49 */            return oO0o1ooIIi;
                }
            }
