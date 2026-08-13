            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class Io00Ol1o10O extends I01IlIoOI {
                private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
                private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
                static final int UNINITIALIZED_HASH_CODE = 0;
                static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
                private static final Map<Class<?>, Io00Ol1o10O> defaultInstanceMap = new ConcurrentHashMap();
                private int memoizedSerializedSize;
                protected OoiO0IO0il unknownFields;

                public Io00Ol1o10O() {
/* 5 */             this.memoizedHashCode = 0;
/* 8 */             this.memoizedSerializedSize = -1;
/* 12 */            this.unknownFields = OoiO0IO0il.I0001Ioi1lo;
                }

                public static Io00Ol1o10O I0001Ioi1lo(Class cls) throws ClassNotFoundException {
/* 1 */             Map<Class<?>, Io00Ol1o10O> map = defaultInstanceMap;
/* 3 */             Io00Ol1o10O io00Ol1o10O = map.get(cls);
/* 10 */            if (io00Ol1o10O == null) {
                        try {
/* 21 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 24 */                    io00Ol1o10O = map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 34 */                    IoOOl0iOl1io.I000l1("Class initialization cannot fail.", e);
/* 9 */                     return null;
                        }
                    }
/* 38 */            if (io00Ol1o10O != null) {
/* 186 */               return io00Ol1o10O;
                    }
                    try {
/* 53 */                Io00Ol1o10O io00Ol1o10O2 = (Io00Ol1o10O) ((Io00Ol1o10O) Ooil1O.I00000oIO.allocateInstance(cls)).I0000oI00(6);
/* 55 */                if (io00Ol1o10O2 != null) {
/* 57 */                    map.put(cls, io00Ol1o10O2);
/* 60 */                    return io00Ol1o10O2;
                        }
/* 61 */                IOOlIIilOl0.I000iOII();
/* 9 */                 return null;
                    } catch (InstantiationException e2) {
/* 66 */                OoOil11Ol1o.I000oI1ioi(e2);
/* 9 */                 return null;
                    }
                }

                public static Object I000II(Method method, Io00Ol1o10O io00Ol1o10O, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(io00Ol1o10O, objArr);
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

                public static final boolean I000O01llI0(Io00Ol1o10O io00Ol1o10O, boolean z) {
/* 8 */             byte bByteValue = ((Byte) io00Ol1o10O.I0000oI00(1)).byteValue();
/* 12 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 15 */            if (bByteValue == 0) {
/* 17 */                return false;
                    }
/* 19 */            OOi1o101lI oOi1o101lI = OOi1o101lI.I0000Il00O;
/* 21 */            oOi1o101lI.getClass();
/* 32 */            boolean zI0000Il00O = oOi1o101lI.I00000oIO(io00Ol1o10O.getClass()).I0000Il00O(io00Ol1o10O);
/* 36 */            if (z) {
/* 39 */                io00Ol1o10O.I0000oI00(2);
                    }
/* 89 */            return zI0000Il00O;
                }

                public static OOlI00I I000l1(I01IlIoOI i01IlIoOI, String str, Object[] objArr) {
                    char cCharAt;
/* 3 */             OOlI00I oOlI00I = new OOlI00I();
/* 6 */             oOlI00I.I00000oIO = i01IlIoOI;
/* 8 */             oOlI00I.I00000oOI = str;
/* 10 */            oOlI00I.I0000Il00O = objArr;
/* 13 */            char cCharAt2 = str.charAt(0);
/* 20 */            if (cCharAt2 < 55296) {
/* 22 */                oOlI00I.I0000O = cCharAt2;
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
/* 52 */                oOlI00I.I0000O = i | (cCharAt << i2);
                    }
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            return oOlI00I;
                }

                public static Io00Ol1o10O I000o00OoI0I(Io00Ol1o10O io00Ol1o10O, FileInputStream fileInputStream) throws O0010I0o {
/* 3 */             IOOO0l10l iOOO0l10l = new IOOO0l10l();
/* 9 */             iOOO0l10l.I000iOII = Integer.MAX_VALUE;
/* 11 */            byte[] bArr = Iool1iioooil.I00000oIO;
/* 13 */            iOOO0l10l.I0000O = fileInputStream;
/* 19 */            iOOO0l10l.I0000oI00 = new byte[Barcode.FORMAT_AZTEC];
/* 22 */            iOOO0l10l.I0001Ioi1lo = 0;
/* 24 */            iOOO0l10l.I000O01llI0 = 0;
/* 26 */            iOOO0l10l.I000OiO = 0;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            Il1llOool il1llOoolI00000oIO = Il1llOool.I00000oIO();
/* 35 */            Io00Ol1o10O io00Ol1o10OI000lI = io00Ol1o10O.I000lI();
                    try {
/* 39 */                OOi1o101lI oOi1o101lI = OOi1o101lI.I0000Il00O;
/* 41 */                oOi1o101lI.getClass();
/* 48 */                OiOIl0 oiOIl0I00000oIO = oOi1o101lI.I00000oIO(io00Ol1o10OI000lI.getClass());
/* 56 */                oiOIl0I00000oIO.I000OOo1O(io00Ol1o10OI000lI, IOOOi1.I00000oOI(iOOO0l10l), il1llOoolI00000oIO);
/* 59 */                oiOIl0I00000oIO.I00000oOI(io00Ol1o10OI000lI);
/* 67 */                if (I000O01llI0(io00Ol1o10OI000lI, true)) {
/* 69 */                    return io00Ol1o10OI000lI;
                        }
/* 84 */                throw new O0010I0o(new OoiII1I11l().getMessage());
                    } catch (O0010I0o e) {
/* 142 */               if (e.I00iOIl) {
/* 551 */                   throw new O0010I0o(e.getMessage(), e);
                        }
/* 551 */               throw e;
                    } catch (OoiII1I11l e2) {
/* 138 */               throw new O0010I0o(e2.getMessage());
                    } catch (IOException e3) {
/* 109 */               if (e3.getCause() instanceof O0010I0o) {
/* 117 */                   throw ((O0010I0o) e3.getCause());
                        }
/* 127 */               throw new O0010I0o(e3.getMessage(), e3);
                    } catch (RuntimeException e4) {
/* 92 */                if (e4.getCause() instanceof O0010I0o) {
/* 100 */                   throw ((O0010I0o) e4.getCause());
                        }
/* 101 */               throw e4;
                    }
                }

                public static void I000oI1ioi(Class cls, Io00Ol1o10O io00Ol1o10O) {
/* 1 */             io00Ol1o10O.I000iOII();
/* 6 */             defaultInstanceMap.put(cls, io00Ol1o10O);
                }

                @Override
                public final int I00000oIO(OiOIl0 oiOIl0) {
                    int iI0000oI00;
                    int iI0000oI002;
/* 5 */             if (I000OOo1O()) {
/* 7 */                 if (oiOIl0 == null) {
/* 9 */                     OOi1o101lI oOi1o101lI = OOi1o101lI.I0000Il00O;
/* 11 */                    oOi1o101lI.getClass();
/* 22 */                    iI0000oI002 = oOi1o101lI.I00000oIO(getClass()).I0000oI00(this);
                        } else {
/* 27 */                    iI0000oI002 = oiOIl0.I0000oI00(this);
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
/* 57 */            if (oiOIl0 == null) {
/* 59 */                OOi1o101lI oOi1o101lI2 = OOi1o101lI.I0000Il00O;
/* 61 */                oOi1o101lI2.getClass();
/* 72 */                iI0000oI00 = oOi1o101lI2.I00000oIO(getClass()).I0000oI00(this);
                    } else {
/* 77 */                iI0000oI00 = oiOIl0.I0000oI00(this);
                    }
/* 81 */            I00100l0(iI0000oI00);
/* 186 */           return iI0000oI00;
                }

                @Override
                public final void I00000oOI(IOOOiI0 iOOOiI0) {
/* 1 */             OOi1o101lI oOi1o101lI = OOi1o101lI.I0000Il00O;
/* 3 */             oOi1o101lI.getClass();
/* 10 */            OiOIl0 oiOIl0I00000oIO = oOi1o101lI.I00000oIO(getClass());
/* 14 */            Oi1ol0llI oi1ol0llI = iOOOiI0.I00000oIO;
/* 16 */            if (oi1ol0llI == null) {
/* 23 */                oi1ol0llI = new Oi1ol0llI(6, false);
/* 26 */                byte[] bArr = Iool1iioooil.I00000oIO;
/* 28 */                oi1ol0llI.I00iiI = iOOOiI0;
/* 30 */                iOOOiI0.I00000oIO = oi1ol0llI;
/* 32 */                VarHandle.storeStoreFence();
                    }
/* 35 */            oiOIl0I00000oIO.I0001Ioi1lo(this, oi1ol0llI);
                }

                public final IloooliOooIO I0000O() {
/* 6 */             return (IloooliOooIO) I0000oI00(5);
                }

                public abstract Object I0000oI00(int i);

                public final boolean I000OOo1O() {
                    return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
                }

                public final void I000OiO() {
/* 1 */             OOi1o101lI oOi1o101lI = OOi1o101lI.I0000Il00O;
/* 3 */             oOi1o101lI.getClass();
/* 14 */            oOi1o101lI.I00000oIO(getClass()).I00000oOI(this);
/* 17 */            I000iOII();
                }

                public final void I000iOII() {
                    this.memoizedSerializedSize &= Integer.MAX_VALUE;
                }

                public final Io00Ol1o10O I000lI() {
/* 6 */             return (Io00Ol1o10O) I0000oI00(4);
                }

                public final void I00100l0(int i) {
/* 1 */             if (i < 0) {
/* 22 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(i, "serialized size must be non-negative, was "));
                    } else {
/* 13 */                this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
                    }
                }

                public final IloooliOooIO I00100o1O0lo() {
/* 6 */             IloooliOooIO iloooliOooIO = (IloooliOooIO) I0000oI00(5);
/* 14 */            if (iloooliOooIO.I00iOIl.equals(this)) {
/* 16 */                return iloooliOooIO;
                    }
/* 17 */            iloooliOooIO.I0000O();
/* 22 */            IloooliOooIO.I0000oI00(iloooliOooIO.I00iiI, this);
/* 29 */            return iloooliOooIO;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 20 */            OOi1o101lI oOi1o101lI = OOi1o101lI.I0000Il00O;
/* 22 */            oOi1o101lI.getClass();
/* 35 */            return oOi1o101lI.I00000oIO(getClass()).I000II(this, (Io00Ol1o10O) obj);
                }

                public final int hashCode() {
/* 5 */             if (I000OOo1O()) {
/* 7 */                 OOi1o101lI oOi1o101lI = OOi1o101lI.I0000Il00O;
/* 9 */                 oOi1o101lI.getClass();
/* 20 */                return oOi1o101lI.I00000oIO(getClass()).I000O01llI0(this);
                    }
/* 25 */            int i = this.memoizedHashCode;
/* 27 */            if (i != 0) {
/* 113 */               return i;
                    }
/* 29 */            OOi1o101lI oOi1o101lI2 = OOi1o101lI.I0000Il00O;
/* 31 */            oOi1o101lI2.getClass();
/* 42 */            int iI000O01llI0 = oOi1o101lI2.I00000oIO(getClass()).I000O01llI0(this);
/* 46 */            this.memoizedHashCode = iI000O01llI0;
/* 113 */           return iI000O01llI0;
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = O1lIo01O1oI.I00000oIO;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            O1lIo01O1oI.I0000Il00O(this, sb, 0);
/* 24 */            return sb.toString();
                }
            }
