            package p000;

            import java.io.IOException;
            import java.util.Iterator;
            
/* 27 */    public abstract class I00OilO00Il extends I00OIO1 implements Iterable {
                public static final I001lllioOl I00iiO = new I001lllioOl(8, I00OilO00Il.class);
                public I00IO1oi11O[] I00iOIl;
                public boolean I00iiI;

                public I00OilO00Il(I00IOO i00ioo) {
/* 4 */             if (i00ioo == null) {
/* 24 */                IOOlIIilOl0.I000II("'elementVector' cannot be null");
/* 49 */                throw null;
                    }
/* 6 */             I00IO1oi11O[] i00IO1oi11OArrI000OiO = i00ioo.I000OiO();
/* 10 */            this.I00iOIl = i00IO1oi11OArrI000OiO;
/* 19 */            this.I00iiI = i00IO1oi11OArrI000OiO.length < 2;
                }

                public static byte[] I001i1O0Ol(I00IO1oi11O i00IO1oi11O) {
                    try {
/* 5 */                 return i00IO1oi11O.I0000O().I000lI();
                    } catch (IOException unused) {
/* 12 */                I000II.I000iOII("cannot encode object added to SET");
/* 15 */                return null;
                    }
                }

                public static I00OilO00Il I001iOo1i0O(Object obj) {
/* 1 */             if (obj == null || (obj instanceof I00OilO00Il)) {
/* 71 */                return (I00OilO00Il) obj;
                    }
/* 11 */            if (obj instanceof I00IO1oi11O) {
/* 16 */                I00OIO1 i00oio1I0000O = ((I00IO1oi11O) obj).I0000O();
/* 22 */                if (i00oio1I0000O instanceof I00OilO00Il) {
/* 24 */                    return (I00OilO00Il) i00oio1I0000O;
                        }
                    } else if (obj instanceof byte[]) {
                        try {
/* 39 */                    return (I00OilO00Il) I00iiO.I0000Il00O((byte[]) obj);
                        } catch (IOException e) {
/* 49 */                    IoOOl0iOl1io.I001l0I00("failed to construct set from byte[]: ", e.getMessage());
/* 10 */                    return null;
                        }
                    }
/* 67 */            I000II.I000iOII("unknown object in getInstance: ".concat(obj.getClass().getName()));
/* 10 */            return null;
                }

                public static boolean I001lIiIIo1O(byte[] bArr, byte[] bArr2) {
/* 4 */             int i = bArr[0] & (-33);
/* 8 */             int i2 = bArr2[0] & (-33);
/* 11 */            if (i != i2) {
                        return i < i2;
                    }
/* 23 */            int iMin = Math.min(bArr.length, bArr2.length) - 1;
/* 25 */            for (int i3 = 1; i3 < iMin; i3++) {
/* 27 */                byte b = bArr[i3];
/* 29 */                byte b2 = bArr2[i3];
/* 31 */                if (b != b2) {
                            return (b & 255) < (b2 & 255);
                        }
                    }
                    return (bArr[iMin] & 255) <= (bArr2[iMin] & 255);
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
/* 4 */             if (i00oio1 instanceof I00OilO00Il) {
/* 7 */                 I00OilO00Il i00OilO00Il = (I00OilO00Il) i00oio1;
/* 11 */                int length = this.I00iOIl.length;
/* 15 */                if (i00OilO00Il.I00iOIl.length == length) {
/* 22 */                    Ii0olO1 ii0olO1 = (Ii0olO1) I001IIilI0O();
/* 28 */                    Ii0olO1 ii0olO12 = (Ii0olO1) i00OilO00Il.I001IIilI0O();
/* 31 */                    for (int i = 0; i < length; i++) {
/* 37 */                        I00OIO1 i00oio1I0000O = ii0olO1.I00iOIl[i].I0000O();
/* 45 */                        I00OIO1 i00oio1I0000O2 = ii0olO12.I00iOIl[i].I0000O();
/* 49 */                        if (i00oio1I0000O == i00oio1I0000O2 || i00oio1I0000O.I000o00OoI0I(i00oio1I0000O2)) {
                                }
                            }
/* 61 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return true;
                }

                @Override
                public I00OIO1 I001IIilI0O() {
                    int i;
/* 1 */             boolean z = this.I00iiI;
/* 3 */             I00IO1oi11O[] i00IO1oi11OArr = this.I00iOIl;
/* 7 */             if (!z) {
/* 15 */                i00IO1oi11OArr = (I00IO1oi11O[]) i00IO1oi11OArr.clone();
/* 19 */                int length = i00IO1oi11OArr.length;
/* 21 */                if (length >= 2) {
/* 25 */                    I00IO1oi11O i00IO1oi11O = i00IO1oi11OArr[0];
/* 27 */                    I00IO1oi11O i00IO1oi11O2 = i00IO1oi11OArr[1];
/* 29 */                    byte[] bArrI001i1O0Ol = I001i1O0Ol(i00IO1oi11O);
/* 33 */                    byte[] bArrI001i1O0Ol2 = I001i1O0Ol(i00IO1oi11O2);
/* 41 */                    if (I001lIiIIo1O(bArrI001i1O0Ol2, bArrI001i1O0Ol)) {
/* 44 */                        i00IO1oi11O2 = i00IO1oi11O;
/* 45 */                        i00IO1oi11O = i00IO1oi11O2;
/* 47 */                        bArrI001i1O0Ol2 = bArrI001i1O0Ol;
/* 48 */                        bArrI001i1O0Ol = bArrI001i1O0Ol2;
                            }
/* 49 */                    for (int i2 = 2; i2 < length; i2++) {
/* 51 */                        I00IO1oi11O i00IO1oi11O3 = i00IO1oi11OArr[i2];
/* 53 */                        byte[] bArrI001i1O0Ol3 = I001i1O0Ol(i00IO1oi11O3);
/* 61 */                        if (I001lIiIIo1O(bArrI001i1O0Ol2, bArrI001i1O0Ol3)) {
/* 65 */                            i00IO1oi11OArr[i2 - 2] = i00IO1oi11O;
/* 67 */                            i00IO1oi11O = i00IO1oi11O2;
/* 68 */                            bArrI001i1O0Ol = bArrI001i1O0Ol2;
/* 69 */                            i00IO1oi11O2 = i00IO1oi11O3;
/* 70 */                            bArrI001i1O0Ol2 = bArrI001i1O0Ol3;
                                } else if (I001lIiIIo1O(bArrI001i1O0Ol, bArrI001i1O0Ol3)) {
/* 80 */                            i00IO1oi11OArr[i2 - 2] = i00IO1oi11O;
/* 82 */                            i00IO1oi11O = i00IO1oi11O3;
/* 83 */                            bArrI001i1O0Ol = bArrI001i1O0Ol3;
                                } else {
                                    int i3 = i2 - 1;
                                    while (true) {
                                        i = i3 - 1;
/* 89 */                                if (i <= 0) {
                                            break;
                                        }
/* 93 */                                I00IO1oi11O i00IO1oi11O4 = i00IO1oi11OArr[i3 - 2];
/* 103 */                               if (I001lIiIIo1O(I001i1O0Ol(i00IO1oi11O4), bArrI001i1O0Ol3)) {
                                            break;
                                        }
/* 106 */                               i00IO1oi11OArr[i] = i00IO1oi11O4;
/* 108 */                               i3 = i;
                                    }
/* 110 */                           i00IO1oi11OArr[i] = i00IO1oi11O3;
                                }
                            }
/* 117 */                   i00IO1oi11OArr[length - 2] = i00IO1oi11O;
/* 120 */                   i00IO1oi11OArr[length - 1] = i00IO1oi11O2;
                        }
                    }
/* 124 */           Ii0olO1 ii0olO1 = new Ii0olO1(0, true, i00IO1oi11OArr);
/* 128 */           ii0olO1.I00ilI0I1 = -1;
/* 541 */           return ii0olO1;
                }

                @Override
                public I00OIO1 I001IO000() {
/* 8 */             return new Ii0olO1(1, this.I00iiI, this.I00iOIl);
                }

                @Override
                public final int hashCode() {
/* 1 */             I00IO1oi11O[] i00IO1oi11OArr = this.I00iOIl;
/* 3 */             int length = i00IO1oi11OArr.length;
/* 4 */             int iHashCode = length + 1;
                    while (true) {
                        length--;
/* 8 */                 if (length < 0) {
/* 29 */                    return iHashCode;
                        }
/* 20 */                iHashCode += i00IO1oi11OArr[length].I0000O().hashCode();
                    }
                }

                @Override
                public final Iterator iterator() {
/* 3 */             I00IO1oi11O[] i00IO1oi11OArr = this.I00iOIl;
/* 20 */            return new I1IoOOl1l1oo(i00IO1oi11OArr.length < 1 ? I00IOO.I0000O : (I00IO1oi11O[]) i00IO1oi11OArr.clone());
                }

                public final String toString() {
/* 1 */             I00IO1oi11O[] i00IO1oi11OArr = this.I00iOIl;
/* 3 */             int length = i00IO1oi11OArr.length;
/* 4 */             if (length == 0) {
/* 6 */                 return "[]";
                    }
/* 13 */            StringBuffer stringBuffer = new StringBuffer("[");
/* 16 */            int i = 0;
                    while (true) {
/* 19 */                stringBuffer.append(i00IO1oi11OArr[i]);
/* 22 */                i++;
/* 24 */                if (i >= length) {
/* 28 */                    stringBuffer.append(']');
/* 31 */                    return stringBuffer.toString();
                        }
/* 38 */                stringBuffer.append(", ");
                    }
                }

/* 28 */        public I00OilO00Il(boolean z, I00IO1oi11O[] i00IO1oi11OArr) {
/* 30 */            this.I00iOIl = i00IO1oi11OArr;
                    this.I00iiI = z || i00IO1oi11OArr.length < 2;
                }
            }
