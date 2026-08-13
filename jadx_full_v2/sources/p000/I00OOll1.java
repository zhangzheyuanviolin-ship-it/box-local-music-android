            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Enumeration;
            import java.util.Iterator;
            
/* 20 */    public abstract class I00OOll1 extends I00OIO1 implements Iterable {
                public static final I001lllioOl I00iiI = new I001lllioOl(7, I00OOll1.class);
                public I00IO1oi11O[] I00iOIl;

                public I00OOll1(I00OIO1 i00oio1) {
/* 4 */             if (i00oio1 != null) {
/* 12 */                this.I00iOIl = new I00IO1oi11O[]{i00oio1};
                    } else {
/* 17 */                IOOlIIilOl0.I000II("'element' cannot be null");
/* 49 */                throw null;
                    }
                }

                public static I00OOll1 I001lIiIIo1O(I00Ol1ll1 i00Ol1ll1, boolean z) {
/* 7 */             return (I00OOll1) I00iiI.I0001Ioi1lo(i00Ol1ll1, z);
                }

                public static I00OOll1 I001lllioOl(Object obj) {
/* 1 */             if (obj == null || (obj instanceof I00OOll1)) {
/* 71 */                return (I00OOll1) obj;
                    }
/* 11 */            if (obj instanceof I00IO1oi11O) {
/* 16 */                I00OIO1 i00oio1I0000O = ((I00IO1oi11O) obj).I0000O();
/* 22 */                if (i00oio1I0000O instanceof I00OOll1) {
/* 24 */                    return (I00OOll1) i00oio1I0000O;
                        }
                    } else if (obj instanceof byte[]) {
                        try {
/* 39 */                    return (I00OOll1) I00iiI.I0000Il00O((byte[]) obj);
                        } catch (IOException e) {
/* 49 */                    IoOOl0iOl1io.I001l0I00("failed to construct sequence from byte[]: ", e.getMessage());
/* 10 */                    return null;
                        }
                    }
/* 67 */            I000II.I000iOII("unknown object in getInstance: ".concat(obj.getClass().getName()));
/* 10 */            return null;
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
/* 4 */             if (i00oio1 instanceof I00OOll1) {
/* 7 */                 I00OOll1 i00OOll1 = (I00OOll1) i00oio1;
/* 9 */                 int size = size();
/* 17 */                if (i00OOll1.size() == size) {
/* 21 */                    for (int i = 0; i < size; i++) {
/* 27 */                        I00OIO1 i00oio1I0000O = this.I00iOIl[i].I0000O();
/* 35 */                        I00OIO1 i00oio1I0000O2 = i00OOll1.I00iOIl[i].I0000O();
/* 39 */                        if (i00oio1I0000O == i00oio1I0000O2 || i00oio1I0000O.I000o00OoI0I(i00oio1I0000O2)) {
                                }
                            }
/* 51 */                    return true;
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
/* 6 */             Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(this.I00iOIl, 0);
/* 10 */            ii0ol0ii01I.I00iio = -1;
/* 29 */            return ii0ol0ii01I;
                }

                @Override
                public I00OIO1 I001IO000() {
/* 6 */             Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(this.I00iOIl, 1);
/* 10 */            ii0ol0ii01I.I00iio = -1;
/* 29 */            return ii0ol0ii01I;
                }

                public final I001lloI[] I001i1O0Ol() {
/* 1 */             int size = size();
/* 5 */             I001lloI[] i001lloIArr = new I001lloI[size];
/* 8 */             for (int i = 0; i < size; i++) {
/* 18 */                i001lloIArr[i] = I001lloI.I001iOo1i0O(this.I00iOIl[i]);
                    }
/* 29 */            return i001lloIArr;
                }

                public final I00O0o1oo[] I001iOo1i0O() {
/* 1 */             int size = size();
/* 5 */             I00O0o1oo[] i00O0o1ooArr = new I00O0o1oo[size];
/* 8 */             for (int i = 0; i < size; i++) {
/* 18 */                i00O0o1ooArr[i] = I00O0o1oo.I001i1O0Ol(this.I00iOIl[i]);
                    }
/* 29 */            return i00O0o1ooArr;
                }

                public I00IO1oi11O I001lloI(int i) {
/* 3 */             return this.I00iOIl[i];
                }

                public Enumeration I00II0Ol1O0l() {
/* 3 */             I00OIo i00OIo = new I00OIo();
/* 6 */             i00OIo.I00000oOI = this;
/* 9 */             i00OIo.I00000oIO = 0;
/* 11 */            VarHandle.storeStoreFence();
/* 29 */            return i00OIo;
                }

                public abstract I001lloI I00II0oii1o();

                public abstract I00O0o1oo I00IO1();

                public abstract I00OilO00Il I00IO1oi11O();

                @Override
                public int hashCode() {
/* 3 */             int length = this.I00iOIl.length;
/* 4 */             int iHashCode = length + 1;
                    while (true) {
                        length--;
/* 8 */                 if (length < 0) {
/* 29 */                    return iHashCode;
                        }
/* 24 */                iHashCode = (iHashCode * 257) ^ this.I00iOIl[length].I0000O().hashCode();
                    }
                }

                @Override
                public Iterator iterator() {
/* 5 */             return new I1IoOOl1l1oo(this.I00iOIl);
                }

                public int size() {
/* 3 */             return this.I00iOIl.length;
                }

                public final String toString() {
/* 1 */             int size = size();
/* 5 */             if (size == 0) {
/* 7 */                 return "[]";
                    }
/* 14 */            StringBuffer stringBuffer = new StringBuffer("[");
/* 17 */            int i = 0;
                    while (true) {
/* 22 */                stringBuffer.append(this.I00iOIl[i]);
/* 25 */                i++;
/* 27 */                if (i >= size) {
/* 31 */                    stringBuffer.append(']');
/* 34 */                    return stringBuffer.toString();
                        }
/* 41 */                stringBuffer.append(", ");
                    }
                }

/* 21 */        public I00OOll1(I00IOO i00ioo) {
                    if (i00ioo != null) {
/* 23 */                this.I00iOIl = i00ioo.I000OiO();
                    } else {
                        IOOlIIilOl0.I000II("'elementVector' cannot be null");
                        throw null;
                    }
                }

/* 23 */        public I00OOll1() {
/* 25 */            this.I00iOIl = I00IOO.I0000O;
                }
            }
