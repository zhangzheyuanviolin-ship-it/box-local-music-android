            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.ListIterator;
            
            public final class Ol1Iil extends I01Io11IiiiO {
                public static final Ol1Iil I00iiI = new Ol1Iil(new Object[0]);
                public final Object[] I00iOIl;

                public Ol1Iil(Object[] objArr) {
/* 4 */             this.I00iOIl = objArr;
                }

                @Override
                public final int I00000oOI() {
/* 3 */             return this.I00iOIl.length;
                }

                @Override
                public final I01Io11IiiiO I0000O(int i, Object obj) {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 4 */             l10ioi0.I00000oOI(i, objArr.length);
/* 8 */             if (i == objArr.length) {
/* 10 */                return I000OOo1O(obj);
                    }
/* 19 */            if (objArr.length < 32) {
/* 24 */                Object[] objArr2 = new Object[objArr.length + 1];
/* 27 */                I1IoiO1l.I000oI1ioi(objArr, 0, objArr2, i, 6);
/* 33 */                I1IoiO1l.I000iOII(objArr, i + 1, objArr2, i, objArr.length);
/* 36 */                objArr2[i] = obj;
/* 40 */                return new Ol1Iil(objArr2);
                    }
/* 45 */            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
/* 54 */            I1IoiO1l.I000iOII(objArr, i + 1, objArrCopyOf, i, objArr.length - 1);
/* 57 */            objArrCopyOf[i] = obj;
/* 63 */            Object[] objArr3 = new Object[32];
/* 65 */            objArr3[0] = objArr[31];
/* 72 */            return new OO0oo1iO1lio(objArrCopyOf, objArr3, objArr.length + 1, 0);
                }

                @Override
                public final I01Io11IiiiO I000OOo1O(Object obj) {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 6 */             if (objArr.length < 32) {
/* 11 */                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
/* 16 */                objArrCopyOf[objArr.length] = obj;
/* 20 */                return new Ol1Iil(objArrCopyOf);
                    }
/* 24 */            Object[] objArr2 = new Object[32];
/* 27 */            objArr2[0] = obj;
/* 34 */            return new OO0oo1iO1lio(objArr, objArr2, objArr.length + 1, 0);
                }

                @Override
                public final I01Io11IiiiO I000OiO(Collection collection) {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 11 */            if (collection.size() + objArr.length > 32) {
/* 50 */                OO100II1 oo100ii1I000iOII = I000iOII();
/* 54 */                oo100ii1I000iOII.addAll(collection);
/* 57 */                return oo100ii1I000iOII.I000OOo1O();
                    }
/* 19 */            Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
/* 23 */            int length = objArr.length;
/* 24 */            Iterator it = collection.iterator();
/* 32 */            while (it.hasNext()) {
/* 40 */                objArrCopyOf[length] = it.next();
/* 38 */                length++;
                    }
/* 46 */            return new Ol1Iil(objArrCopyOf);
                }

                @Override
                public final OO100II1 I000iOII() {
/* 7 */             return new OO100II1(this, null, this.I00iOIl, 0);
                }

                @Override
                public final I01Io11IiiiO I000lI(I01Io1 i01Io1) {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 3 */             int length = objArr.length;
/* 4 */             int length2 = objArr.length;
/* 6 */             Object[] objArrCopyOf = objArr;
/* 8 */             boolean z = false;
/* 9 */             for (int i = 0; i < length2; i++) {
/* 11 */                Object obj = objArr[i];
/* 23 */                if (((Boolean) i01Io1.invoke(obj)).booleanValue()) {
/* 25 */                    if (!z) {
/* 28 */                        objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
/* 32 */                        z = true;
/* 33 */                        length = i;
                            }
                        } else if (z) {
/* 39 */                    objArrCopyOf[length] = obj;
/* 37 */                    length++;
                        }
                    }
                    return length == objArr.length ? this : length == 0 ? I00iiI : new Ol1Iil(I1IoiO1l.I00100o1O0lo(objArrCopyOf, 0, length));
                }

                @Override
                public final I01Io11IiiiO I000o00OoI0I(int i) {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 4 */             l10ioi0.I00000oIO(i, objArr.length);
/* 9 */             if (objArr.length == 1) {
/* 11 */                return I00iiI;
                    }
/* 16 */            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
/* 23 */            I1IoiO1l.I000iOII(objArr, i, objArrCopyOf, i + 1, objArr.length);
/* 28 */            return new Ol1Iil(objArrCopyOf);
                }

                @Override
                public final I01Io11IiiiO I000oI1ioi(int i, Object obj) {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 4 */             l10ioi0.I00000oIO(i, objArr.length);
/* 8 */             Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
/* 12 */            objArrCopyOf[i] = obj;
/* 16 */            return new Ol1Iil(objArrCopyOf);
                }

                @Override
                public final Object get(int i) {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 4 */             l10ioi0.I00000oIO(i, objArr.length);
/* 7 */             return objArr[i];
                }

                @Override
                public final int indexOf(Object obj) {
/* 3 */             return I1IoiO1l.I001l0I00(this.I00iOIl, obj);
                }

                @Override
                public final int lastIndexOf(Object obj) {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 4 */             if (obj == null) {
                        int length = objArr.length - 1;
/* 8 */                 if (length >= 0) {
                            while (true) {
                                int i = length - 1;
/* 14 */                        if (objArr[length] == null) {
/* 16 */                            return length;
                                }
/* 17 */                        if (i < 0) {
                                    break;
                                }
/* 20 */                        length = i;
                            }
                        }
                    } else {
                        int length2 = objArr.length - 1;
/* 24 */                if (length2 >= 0) {
                            while (true) {
                                int i2 = length2 - 1;
/* 34 */                        if (obj.equals(objArr[length2])) {
/* 36 */                            return length2;
                                }
/* 37 */                        if (i2 < 0) {
                                    break;
                                }
/* 40 */                        length2 = i2;
                            }
                        }
                    }
/* 3 */             return -1;
                }

                @Override
                public final ListIterator listIterator(int i) {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 4 */             l10ioi0.I00000oOI(i, objArr.length);
/* 11 */            IIII0IoOO iIII0IoOO = new IIII0IoOO(i, objArr.length, 0);
/* 14 */            iIII0IoOO.I00iio = objArr;
/* 16 */            VarHandle.storeStoreFence();
/* 29 */            return iIII0IoOO;
                }
            }
