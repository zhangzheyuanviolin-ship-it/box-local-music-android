            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.nio.charset.Charset;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class Io00Io0IO11 extends I01Iio10lo {
                private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
                private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
                static final int UNINITIALIZED_HASH_CODE = 0;
                static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
                private static Map<Object, Io00Io0IO11> defaultInstanceMap = new ConcurrentHashMap();
                private int memoizedSerializedSize;
                protected OoiO0I1O1II unknownFields;

                public Io00Io0IO11() {
/* 5 */             this.memoizedHashCode = 0;
/* 8 */             this.memoizedSerializedSize = -1;
/* 12 */            this.unknownFields = OoiO0I1O1II.I0001Ioi1lo;
                }

                public static void I000II(Io00Io0IO11 io00Io0IO11) throws O000oiiiOI0 {
/* 6 */             if (!I000lI(io00Io0IO11, true)) {
/* 49 */                throw new O000oiiiOI0(new OoiI1iioio1().getMessage());
                    }
                }

                public static Io00Io0IO11 I000OiO(Class cls) throws ClassNotFoundException {
/* 3 */             Io00Io0IO11 io00Io0IO11 = defaultInstanceMap.get(cls);
/* 10 */            if (io00Io0IO11 == null) {
                        try {
/* 21 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 26 */                    io00Io0IO11 = defaultInstanceMap.get(cls);
                        } catch (ClassNotFoundException e) {
/* 36 */                    IoOOl0iOl1io.I000l1("Class initialization cannot fail.", e);
/* 9 */                     return null;
                        }
                    }
/* 40 */            if (io00Io0IO11 != null) {
/* 186 */               return io00Io0IO11;
                    }
                    try {
/* 50 */                Io00Io0IO11 io00Io0IO11I00000oIO = ((Io00Io0IO11) Ooil11Oi.I00000oIO.allocateInstance(cls)).I00000oIO();
/* 54 */                if (io00Io0IO11I00000oIO != null) {
/* 58 */                    defaultInstanceMap.put(cls, io00Io0IO11I00000oIO);
/* 61 */                    return io00Io0IO11I00000oIO;
                        }
/* 62 */                IOOlIIilOl0.I000iOII();
/* 9 */                 return null;
                    } catch (InstantiationException e2) {
/* 67 */                OoOil11Ol1o.I000oI1ioi(e2);
/* 9 */                 return null;
                    }
                }

                public static Object I000l1(Method method, Io00Io0IO11 io00Io0IO11, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(io00Io0IO11, objArr);
                    } catch (IllegalAccessException e) {
/* 35 */                OIiilo1Ool0o.I000iOII("Couldn't use Java reflection to implement protocol message reflection.", e);
/* 1 */                 return null;
                    } catch (InvocationTargetException e2) {
/* 8 */                 Throwable cause = e2.getCause();
/* 14 */                if (cause instanceof RuntimeException) {
/* 31 */                    throw ((RuntimeException) cause);
                        }
/* 18 */                if (cause instanceof Error) {
/* 28 */                    throw ((Error) cause);
                        }
/* 22 */                OIiilo1Ool0o.I000iOII("Unexpected exception thrown by generated accessor method.", cause);
/* 1 */                 return null;
                    }
                }

                public static final boolean I000lI(Io00Io0IO11 io00Io0IO11, boolean z) {
/* 8 */             byte bByteValue = ((Byte) io00Io0IO11.I000OOo1O(1)).byteValue();
/* 12 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 15 */            if (bByteValue == 0) {
/* 17 */                return false;
                    }
/* 19 */            OOi1lIO1Oi oOi1lIO1Oi = OOi1lIO1Oi.I0000Il00O;
/* 21 */            oOi1lIO1Oi.getClass();
/* 32 */            boolean zI0000Il00O = oOi1lIO1Oi.I00000oIO(io00Io0IO11.getClass()).I0000Il00O(io00Io0IO11);
/* 36 */            if (z) {
/* 39 */                io00Io0IO11.I000OOo1O(2);
                    }
/* 89 */            return zI0000Il00O;
                }

                public static OOl1oi1OO I00100o1O0lo(I01Iio10lo i01Iio10lo, String str, Object[] objArr) {
                    char cCharAt;
/* 3 */             OOl1oi1OO oOl1oi1OO = new OOl1oi1OO();
/* 6 */             oOl1oi1OO.I00000oIO = i01Iio10lo;
/* 8 */             oOl1oi1OO.I00000oOI = str;
/* 10 */            oOl1oi1OO.I0000Il00O = objArr;
/* 13 */            char cCharAt2 = str.charAt(0);
/* 20 */            if (cCharAt2 < 55296) {
/* 22 */                oOl1oi1OO.I0000O = cCharAt2;
                    } else {
/* 28 */                int i = cCharAt2 & 8191;
/* 30 */                int i2 = 13;
/* 32 */                int i3 = 1;
                        while (true) {
/* 33 */                    int i4 = i3 + 1;
/* 35 */                    cCharAt = str.charAt(i3);
/* 39 */                    if (cCharAt < 55296) {
                                break;
                            }
/* 44 */                    i |= (cCharAt & 8191) << i2;
/* 45 */                    i2 += 13;
/* 47 */                    i3 = i4;
                        }
/* 52 */                oOl1oi1OO.I0000O = i | (cCharAt << i2);
                    }
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            return oOl1oi1OO;
                }

                public static Io00Io0IO11 I0010o(Io00Io0IO11 io00Io0IO11, IIOI1Ii1I iIOI1Ii1I, Il1llO11O il1llO11O) throws O000oiiiOI0 {
/* 1 */             IIO1i10I iIO1i10I = (IIO1i10I) iIOI1Ii1I;
/* 14 */            IOOIliool iOOIlioolI000OOo1O = IOOOI0.I000OOo1O(iIO1i10I.I00iio, iIO1i10I.I000iOII(), iIO1i10I.size(), true);
/* 18 */            Io00Io0IO11 io00Io0IO11I001IIilI0O = I001IIilI0O(io00Io0IO11, iOOIlioolI000OOo1O, il1llO11O);
/* 23 */            iOOIlioolI000OOo1O.I00000oOI(0);
/* 26 */            I000II(io00Io0IO11I001IIilI0O);
/* 215 */           return io00Io0IO11I001IIilI0O;
                }

                public static Io00Io0IO11 I00111O(Io00Io0IO11 io00Io0IO11, ByteArrayInputStream byteArrayInputStream, Il1llO11O il1llO11O) throws O000oiiiOI0 {
/* 3 */             IOOIol10lI iOOIol10lI = new IOOIol10lI();
/* 9 */             iOOIol10lI.I000OiO = Integer.MAX_VALUE;
/* 11 */            Charset charset = Iool1iOO11.I00000oIO;
/* 13 */            iOOIol10lI.I0000Il00O = byteArrayInputStream;
/* 19 */            iOOIol10lI.I0000O = new byte[Barcode.FORMAT_AZTEC];
/* 22 */            iOOIol10lI.I0000oI00 = 0;
/* 24 */            iOOIol10lI.I000II = 0;
/* 26 */            iOOIol10lI.I000OOo1O = 0;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            Io00Io0IO11 io00Io0IO11I001IIilI0O = I001IIilI0O(io00Io0IO11, iOOIol10lI, il1llO11O);
/* 35 */            I000II(io00Io0IO11I001IIilI0O);
/* 215 */           return io00Io0IO11I001IIilI0O;
                }

                public static Io00Io0IO11 I001IIilI0O(Io00Io0IO11 io00Io0IO11, IOOOI0 ioooi0, Il1llO11O il1llO11O) throws O000oiiiOI0 {
/* 1 */             Io00Io0IO11 io00Io0IO11I0010I0i = io00Io0IO11.I0010I0i();
                    try {
/* 5 */                 OOi1lIO1Oi oOi1lIO1Oi = OOi1lIO1Oi.I0000Il00O;
/* 7 */                 oOi1lIO1Oi.getClass();
/* 14 */                OiOIiIO0 oiOIiIO0I00000oIO = oOi1lIO1Oi.I00000oIO(io00Io0IO11I0010I0i.getClass());
/* 20 */                IOOOi1 iOOOi1 = (IOOOi1) ioooi0.I00000oOI;
/* 22 */                if (iOOOi1 == null) {
/* 28 */                    iOOOi1 = new IOOOi1(0);
/* 31 */                    iOOOi1.I0000O = 0;
/* 33 */                    Charset charset = Iool1iOO11.I00000oIO;
/* 35 */                    iOOOi1.I0000oI00 = ioooi0;
/* 37 */                    ioooi0.I00000oOI = iOOOi1;
/* 39 */                    VarHandle.storeStoreFence();
                        }
/* 42 */                oiOIiIO0I00000oIO.I000O01llI0(io00Io0IO11I0010I0i, iOOOi1, il1llO11O);
/* 45 */                oiOIiIO0I00000oIO.I00000oOI(io00Io0IO11I0010I0i);
/* 48 */                return io00Io0IO11I0010I0i;
                    } catch (O000oiiiOI0 e) {
/* 106 */               if (e.I00iOIl) {
/* 215 */                   throw new O000oiiiOI0(e.getMessage(), e);
                        }
/* 215 */               throw e;
                    } catch (OoiI1iioio1 e2) {
/* 102 */               throw new O000oiiiOI0(e2.getMessage());
                    } catch (IOException e3) {
/* 73 */                if (e3.getCause() instanceof O000oiiiOI0) {
/* 81 */                    throw ((O000oiiiOI0) e3.getCause());
                        }
/* 91 */                throw new O000oiiiOI0(e3.getMessage(), e3);
                    } catch (RuntimeException e4) {
/* 56 */                if (e4.getCause() instanceof O000oiiiOI0) {
/* 64 */                    throw ((O000oiiiOI0) e4.getCause());
                        }
/* 65 */                throw e4;
                    }
                }

                public static void I001IO000(Class cls, Io00Io0IO11 io00Io0IO11) {
/* 1 */             io00Io0IO11.I000oI1ioi();
/* 6 */             defaultInstanceMap.put(cls, io00Io0IO11);
                }

                @Override
                public final int I00000oOI(OiOIiIO0 oiOIiIO0) {
                    int iI0000oI00;
                    int iI0000oI002;
/* 5 */             if (I000o00OoI0I()) {
/* 7 */                 if (oiOIiIO0 == null) {
/* 9 */                     OOi1lIO1Oi oOi1lIO1Oi = OOi1lIO1Oi.I0000Il00O;
/* 11 */                    oOi1lIO1Oi.getClass();
/* 22 */                    iI0000oI002 = oOi1lIO1Oi.I00000oIO(getClass()).I0000oI00(this);
                        } else {
/* 27 */                    iI0000oI002 = oiOIiIO0.I0000oI00(this);
                        }
/* 31 */                if (iI0000oI002 >= 0) {
/* 33 */                    return iI0000oI002;
                        }
/* 40 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(iI0000oI002, "serialized size must be non-negative, was "));
/* 43 */                return 0;
                    }
/* 45 */            int i = this.memoizedSerializedSize;
/* 52 */            if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
/* 54 */                return i & Integer.MAX_VALUE;
                    }
/* 57 */            if (oiOIiIO0 == null) {
/* 59 */                OOi1lIO1Oi oOi1lIO1Oi2 = OOi1lIO1Oi.I0000Il00O;
/* 61 */                oOi1lIO1Oi2.getClass();
/* 72 */                iI0000oI00 = oOi1lIO1Oi2.I00000oIO(getClass()).I0000oI00(this);
                    } else {
/* 77 */                iI0000oI00 = oiOIiIO0.I0000oI00(this);
                    }
/* 81 */            I001i1O0Ol(iI0000oI00);
/* 186 */           return iI0000oI00;
                }

                @Override
                public final void I0001Ioi1lo(IOOOi1I1I1 iOOOi1I1I1) {
/* 1 */             OOi1lIO1Oi oOi1lIO1Oi = OOi1lIO1Oi.I0000Il00O;
/* 3 */             oOi1lIO1Oi.getClass();
/* 10 */            OiOIiIO0 oiOIiIO0I00000oIO = oOi1lIO1Oi.I00000oIO(getClass());
/* 14 */            iiOlilo0IIIl iiolilo0iiil = iOOOi1I1I1.I00000oIO;
/* 16 */            if (iiolilo0iiil == null) {
/* 21 */                iiolilo0iiil = new iiOlilo0IIIl();
/* 24 */                Charset charset = Iool1iOO11.I00000oIO;
/* 26 */                iiolilo0iiil.I00iOIl = iOOOi1I1I1;
/* 28 */                iOOOi1I1I1.I00000oIO = iiolilo0iiil;
/* 30 */                VarHandle.storeStoreFence();
                    }
/* 33 */            oiOIiIO0I00000oIO.I0001Ioi1lo(this, iiolilo0iiil);
                }

                public final IloooliI0I I000O01llI0() {
/* 6 */             return (IloooliI0I) I000OOo1O(5);
                }

                public abstract Object I000OOo1O(int i);

                @Override
                public final Io00Io0IO11 I00000oIO() {
/* 6 */             return (Io00Io0IO11) I000OOo1O(6);
                }

                public final boolean I000o00OoI0I() {
                    return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
                }

                public final void I000oI1ioi() {
                    this.memoizedSerializedSize &= Integer.MAX_VALUE;
                }

                @Override
                public final IloooliI0I I0000O() {
/* 6 */             return (IloooliI0I) I000OOo1O(5);
                }

                public final Io00Io0IO11 I0010I0i() {
/* 6 */             return (Io00Io0IO11) I000OOo1O(4);
                }

                public final void I001i1O0Ol(int i) {
/* 1 */             if (i < 0) {
/* 22 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(i, "serialized size must be non-negative, was "));
                    } else {
/* 13 */                this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
                    }
                }

                public final IloooliI0I I001i1lo1io() {
/* 6 */             IloooliI0I iloooliI0I = (IloooliI0I) I000OOo1O(5);
/* 14 */            if (!iloooliI0I.I00iOIl.equals(this)) {
/* 17 */                iloooliI0I.I0000oI00();
/* 22 */                IloooliI0I.I0001Ioi1lo(iloooliI0I.I00iiI, this);
                    }
/* 29 */            return iloooliI0I;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 20 */            OOi1lIO1Oi oOi1lIO1Oi = OOi1lIO1Oi.I0000Il00O;
/* 22 */            oOi1lIO1Oi.getClass();
/* 35 */            return oOi1lIO1Oi.I00000oIO(getClass()).I000OiO(this, (Io00Io0IO11) obj);
                }

                public final int hashCode() {
/* 5 */             if (I000o00OoI0I()) {
/* 7 */                 OOi1lIO1Oi oOi1lIO1Oi = OOi1lIO1Oi.I0000Il00O;
/* 9 */                 oOi1lIO1Oi.getClass();
/* 20 */                return oOi1lIO1Oi.I00000oIO(getClass()).I000II(this);
                    }
/* 25 */            int i = this.memoizedHashCode;
/* 27 */            if (i != 0) {
/* 113 */               return i;
                    }
/* 29 */            OOi1lIO1Oi oOi1lIO1Oi2 = OOi1lIO1Oi.I0000Il00O;
/* 31 */            oOi1lIO1Oi2.getClass();
/* 42 */            int iI000II = oOi1lIO1Oi2.I00000oIO(getClass()).I000II(this);
/* 46 */            this.memoizedHashCode = iI000II;
/* 113 */           return iI000II;
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = O1lIiliolo.I00000oIO;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            O1lIiliolo.I0000Il00O(this, sb, 0);
/* 24 */            return sb.toString();
                }
            }
