            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.List;
            import java.util.RandomAccess;
            
            public final class OI110O0 implements RandomAccess {
                public Object[] I00iOIl;
                public OI0oIOI I00iiI;
                public int I00iiO = 0;

                public OI110O0(Object[] objArr) {
/* 4 */             this.I00iOIl = objArr;
                }

                public final void I00000oIO(int i, Object obj) {
/* 3 */             int i2 = this.I00iiO + 1;
/* 8 */             if (this.I00iOIl.length < i2) {
/* 10 */                I000o00OoI0I(i2);
                    }
/* 13 */            Object[] objArr = this.I00iOIl;
/* 15 */            int i3 = this.I00iiO;
/* 17 */            if (i != i3) {
/* 22 */                System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
                    }
/* 25 */            objArr[i] = obj;
                    this.I00iiO++;
                }

                public final void I00000oOI(Object obj) {
/* 3 */             int i = this.I00iiO + 1;
/* 8 */             if (this.I00iOIl.length < i) {
/* 10 */                I000o00OoI0I(i);
                    }
/* 13 */            Object[] objArr = this.I00iOIl;
/* 15 */            int i2 = this.I00iiO;
/* 17 */            objArr[i2] = obj;
/* 21 */            this.I00iiO = i2 + 1;
                }

                public final void I0000Il00O(int i, OI110O0 oi110o0) {
/* 1 */             int i2 = oi110o0.I00iiO;
/* 3 */             if (i2 == 0) {
/* 5 */                 return;
                    }
/* 8 */             int i3 = this.I00iiO + i2;
/* 12 */            if (this.I00iOIl.length < i3) {
/* 14 */                I000o00OoI0I(i3);
                    }
/* 17 */            Object[] objArr = this.I00iOIl;
/* 19 */            int i4 = this.I00iiO;
/* 21 */            if (i != i4) {
/* 26 */                System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
                    }
/* 32 */            System.arraycopy(oi110o0.I00iOIl, 0, objArr, i, i2);
                    this.I00iiO += i2;
                }

                public final void I0000O(int i, List list) {
/* 5 */             if (list.isEmpty()) {
/* 7 */                 return;
                    }
/* 8 */             int size = list.size();
/* 14 */            int i2 = this.I00iiO + size;
/* 18 */            if (this.I00iOIl.length < i2) {
/* 20 */                I000o00OoI0I(i2);
                    }
/* 23 */            Object[] objArr = this.I00iOIl;
/* 25 */            int i3 = this.I00iiO;
/* 27 */            if (i != i3) {
/* 32 */                System.arraycopy(objArr, i, objArr, i + size, i3 - i);
                    }
/* 38 */            int size2 = list.size();
/* 43 */            for (int i4 = 0; i4 < size2; i4++) {
/* 51 */                objArr[i + i4] = list.get(i4);
                    }
                    this.I00iiO += size;
                }

                public final boolean I0000oI00(int i, Collection collection) {
/* 5 */             int i2 = 0;
/* 6 */             if (collection.isEmpty()) {
/* 5 */                 return false;
                    }
/* 9 */             int size = collection.size();
/* 15 */            int i3 = this.I00iiO + size;
/* 19 */            if (this.I00iOIl.length < i3) {
/* 21 */                I000o00OoI0I(i3);
                    }
/* 24 */            Object[] objArr = this.I00iOIl;
/* 26 */            int i4 = this.I00iiO;
/* 28 */            if (i != i4) {
/* 33 */                System.arraycopy(objArr, i, objArr, i + size, i4 - i);
                    }
/* 46 */            for (Object obj : collection) {
/* 52 */                int i5 = i2 + 1;
/* 54 */                if (i2 < 0) {
/* 61 */                    IOOi1I.I000lI();
/* 65 */                    throw null;
                        }
/* 57 */                objArr[i2 + i] = obj;
/* 59 */                i2 = i5;
                    }
                    this.I00iiO += size;
/* 71 */            return true;
                }

                public final List I0001Ioi1lo() {
/* 1 */             OI0oIOI oI0oIOI = this.I00iiI;
/* 3 */             if (oI0oIOI != null) {
/* 20 */                return oI0oIOI;
                    }
/* 8 */             OI0oIOI oI0oIOI2 = new OI0oIOI(1);
/* 11 */            oI0oIOI2.I00iiI = this;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            this.I00iiI = oI0oIOI2;
/* 20 */            return oI0oIOI2;
                }

                public final void I000II() {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 3 */             int i = this.I00iiO;
/* 7 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                objArr[i2] = null;
                    }
/* 15 */            this.I00iiO = 0;
                }

                public final boolean I000OOo1O(Object obj) {
/* 4 */             int i = this.I00iiO - 1;
/* 6 */             if (i >= 0) {
/* 17 */                for (int i2 = 0; !O0000Ioio00.I0000O(this.I00iOIl[i2], obj); i2++) {
/* 20 */                    if (i2 != i) {
                            }
                        }
/* 3 */                 return true;
                    }
/* 5 */             return false;
                }

                public final int I000OiO(Object obj) {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 3 */             int i = this.I00iiO;
/* 6 */             for (int i2 = 0; i2 < i; i2++) {
/* 14 */                if (O0000Ioio00.I0000O(obj, objArr[i2])) {
/* 16 */                    return i2;
                        }
                    }
/* 20 */            return -1;
                }

                public final boolean I000iOII(Object obj) {
/* 1 */             int iI000OiO = I000OiO(obj);
/* 5 */             if (iI000OiO < 0) {
/* 12 */                return false;
                    }
/* 7 */             I000l1(iI000OiO);
/* 10 */            return true;
                }

                public final Object I000l1(int i) {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 3 */             Object obj = objArr[i];
/* 5 */             int i2 = this.I00iiO;
/* 9 */             if (i != i2 - 1) {
/* 11 */                int i3 = i + 1;
/* 14 */                System.arraycopy(objArr, i3, objArr, i, i2 - i3);
                    }
                    int i4 = this.I00iiO - 1;
/* 21 */            this.I00iiO = i4;
/* 24 */            objArr[i4] = null;
/* 29 */            return obj;
                }

                public final void I000lI(int i, int i2) {
/* 1 */             if (i2 > i) {
/* 3 */                 int i3 = this.I00iiO;
/* 5 */                 if (i2 < i3) {
/* 7 */                     Object[] objArr = this.I00iOIl;
/* 10 */                    System.arraycopy(objArr, i2, objArr, i, i3 - i2);
                        }
/* 13 */                int i4 = this.I00iiO;
/* 16 */                int i5 = i4 - (i2 - i);
                        int i6 = i4 - 1;
/* 20 */                if (i5 <= i6) {
/* 22 */                    int i7 = i5;
                            while (true) {
/* 26 */                        this.I00iOIl[i7] = null;
/* 28 */                        if (i7 == i6) {
                                    break;
                                } else {
/* 30 */                            i7++;
                                }
                            }
                        }
/* 33 */                this.I00iiO = i5;
                    }
                }

                public final void I000o00OoI0I(int i) {
/* 1 */             Object[] objArr = this.I00iOIl;
/* 3 */             int length = objArr.length;
/* 10 */            Object[] objArr2 = new Object[Math.max(i, length * 2)];
/* 13 */            System.arraycopy(objArr, 0, objArr2, 0, length);
/* 16 */            this.I00iOIl = objArr2;
                }
            }
