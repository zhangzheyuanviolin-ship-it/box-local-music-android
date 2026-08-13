            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.nio.charset.Charset;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class Io00l0 extends I01Ilo0i {
                private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
                private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
                static final int UNINITIALIZED_HASH_CODE = 0;
                static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
                private static Map<Object, Io00l0> defaultInstanceMap = new ConcurrentHashMap();
                private int memoizedSerializedSize;
                protected OoiO0l unknownFields;

                public Io00l0() {
/* 5 */             this.memoizedHashCode = 0;
/* 8 */             this.memoizedSerializedSize = -1;
/* 12 */            this.unknownFields = OoiO0l.I0001Ioi1lo;
                }

                public static Io00l0 I0000O(Class cls) throws ClassNotFoundException {
/* 3 */             Io00l0 io00l0 = defaultInstanceMap.get(cls);
/* 10 */            if (io00l0 == null) {
                        try {
/* 21 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 26 */                    io00l0 = defaultInstanceMap.get(cls);
                        } catch (ClassNotFoundException e) {
/* 36 */                    IoOOl0iOl1io.I000l1("Class initialization cannot fail.", e);
/* 9 */                     return null;
                        }
                    }
/* 40 */            if (io00l0 != null) {
/* 77 */                return io00l0;
                    }
                    try {
/* 55 */                Io00l0 io00l02 = (Io00l0) ((Io00l0) OoilIIl.I00000oIO.allocateInstance(cls)).I0000Il00O(6);
/* 57 */                if (io00l02 != null) {
/* 61 */                    defaultInstanceMap.put(cls, io00l02);
/* 64 */                    return io00l02;
                        }
/* 65 */                IOOlIIilOl0.I000iOII();
/* 9 */                 return null;
                    } catch (InstantiationException e2) {
/* 70 */                OoOil11Ol1o.I000oI1ioi(e2);
/* 9 */                 return null;
                    }
                }

                public static Object I0000oI00(Method method, Io00l0 io00l0, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(io00l0, objArr);
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

                public static final boolean I0001Ioi1lo(Io00l0 io00l0, boolean z) {
/* 8 */             byte bByteValue = ((Byte) io00l0.I0000Il00O(1)).byteValue();
/* 12 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 15 */            if (bByteValue == 0) {
/* 17 */                return false;
                    }
/* 19 */            OOi1oI oOi1oI = OOi1oI.I0000Il00O;
/* 21 */            oOi1oI.getClass();
/* 32 */            boolean zI0000Il00O = oOi1oI.I00000oIO(io00l0.getClass()).I0000Il00O(io00l0);
/* 36 */            if (z) {
/* 39 */                io00l0.I0000Il00O(2);
                    }
/* 106 */           return zI0000Il00O;
                }

                public static OOlI0Ol I000OOo1O(Io00l0 io00l0, String str, Object[] objArr) {
                    char cCharAt;
/* 3 */             OOlI0Ol oOlI0Ol = new OOlI0Ol();
/* 6 */             oOlI0Ol.I00000oIO = io00l0;
/* 8 */             oOlI0Ol.I00000oOI = str;
/* 10 */            oOlI0Ol.I0000Il00O = objArr;
/* 13 */            char cCharAt2 = str.charAt(0);
/* 20 */            if (cCharAt2 < 55296) {
/* 22 */                oOlI0Ol.I0000O = cCharAt2;
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
/* 52 */                oOlI0Ol.I0000O = i | (cCharAt << i2);
                    }
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            return oOlI0Ol;
                }

                public static void I000iOII(Class cls, Io00l0 io00l0) {
/* 1 */             io00l0.I000O01llI0();
/* 6 */             defaultInstanceMap.put(cls, io00l0);
                }

                @Override
                public final int I00000oIO(OiOIlIo oiOIlIo) {
                    int iI000OOo1O;
                    int iI000OOo1O2;
/* 5 */             if (I000II()) {
/* 7 */                 if (oiOIlIo == null) {
/* 9 */                     OOi1oI oOi1oI = OOi1oI.I0000Il00O;
/* 11 */                    oOi1oI.getClass();
/* 22 */                    iI000OOo1O2 = oOi1oI.I00000oIO(getClass()).I000OOo1O(this);
                        } else {
/* 27 */                    iI000OOo1O2 = oiOIlIo.I000OOo1O(this);
                        }
/* 31 */                if (iI000OOo1O2 >= 0) {
/* 33 */                    return iI000OOo1O2;
                        }
/* 40 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(iI000OOo1O2, "serialized size must be non-negative, was "));
/* 43 */                return 0;
                    }
/* 45 */            int i = this.memoizedSerializedSize;
/* 52 */            if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
/* 54 */                return i & Integer.MAX_VALUE;
                    }
/* 57 */            if (oiOIlIo == null) {
/* 59 */                OOi1oI oOi1oI2 = OOi1oI.I0000Il00O;
/* 61 */                oOi1oI2.getClass();
/* 72 */                iI000OOo1O = oOi1oI2.I00000oIO(getClass()).I000OOo1O(this);
                    } else {
/* 77 */                iI000OOo1O = oiOIlIo.I000OOo1O(this);
                    }
/* 81 */            I000l1(iI000OOo1O);
/* 168 */           return iI000OOo1O;
                }

                @Override
                public final void I00000oOI(IOOOio0o iOOOio0o) {
/* 1 */             OOi1oI oOi1oI = OOi1oI.I0000Il00O;
/* 3 */             oOi1oI.getClass();
/* 10 */            OiOIlIo oiOIlIoI00000oIO = oOi1oI.I00000oIO(getClass());
/* 14 */            IIOOoll iIOOoll = iOOOio0o.I00000oIO;
/* 16 */            if (iIOOoll == null) {
/* 23 */                iIOOoll = new IIOOoll(9);
/* 26 */                Charset charset = IoolIIolo1lI.I00000oIO;
/* 28 */                iIOOoll.I00iiI = iOOOio0o;
/* 30 */                iOOOio0o.I00000oIO = iIOOoll;
/* 32 */                VarHandle.storeStoreFence();
                    }
/* 35 */            oiOIlIoI00000oIO.I000O01llI0(this, iIOOoll);
                }

                public abstract Object I0000Il00O(int i);

                public final boolean I000II() {
                    return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
                }

                public final void I000O01llI0() {
                    this.memoizedSerializedSize &= Integer.MAX_VALUE;
                }

                public final Io00l0 I000OiO() {
/* 6 */             return (Io00l0) I0000Il00O(4);
                }

                public final void I000l1(int i) {
/* 1 */             if (i < 0) {
/* 22 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(i, "serialized size must be non-negative, was "));
                    } else {
/* 13 */                this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 20 */            OOi1oI oOi1oI = OOi1oI.I0000Il00O;
/* 22 */            oOi1oI.getClass();
/* 35 */            return oOi1oI.I00000oIO(getClass()).I0001Ioi1lo(this, (Io00l0) obj);
                }

                public final int hashCode() {
/* 5 */             if (I000II()) {
/* 7 */                 OOi1oI oOi1oI = OOi1oI.I0000Il00O;
/* 9 */                 oOi1oI.getClass();
/* 20 */                return oOi1oI.I00000oIO(getClass()).I000II(this);
                    }
/* 25 */            int i = this.memoizedHashCode;
/* 27 */            if (i != 0) {
/* 55 */                return i;
                    }
/* 29 */            OOi1oI oOi1oI2 = OOi1oI.I0000Il00O;
/* 31 */            oOi1oI2.getClass();
/* 42 */            int iI000II = oOi1oI2.I00000oIO(getClass()).I000II(this);
/* 46 */            this.memoizedHashCode = iI000II;
/* 55 */            return iI000II;
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = O1lIo0iI.I00000oIO;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            O1lIo0iI.I0000Il00O(this, sb, 0);
/* 24 */            return sb.toString();
                }
            }
