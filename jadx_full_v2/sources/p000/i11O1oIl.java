            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.nio.charset.Charset;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class i11O1oIl extends i1111ll {
                private static final Map zbb = new ConcurrentHashMap();
                protected i11o1i zbc;
                private int zbd;

                public i11O1oIl() {
/* 5 */             this.zba = 0;
/* 8 */             this.zbd = -1;
/* 12 */            this.zbc = i11o1i.I0001Ioi1lo;
                }

                public static void I0000O(Class cls, i11O1oIl i11o1oil) {
/* 1 */             i11o1oil.I0000Il00O();
/* 6 */             zbb.put(cls, i11o1oil);
                }

                public static final boolean I0001Ioi1lo(i11O1oIl i11o1oil, boolean z) {
/* 9 */             byte bByteValue = ((Byte) i11o1oil.I000OOo1O(1, null)).byteValue();
/* 13 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 16 */            if (bByteValue == 0) {
/* 18 */                return false;
                    }
/* 30 */            boolean zI0001Ioi1lo = i11liii0.I0000Il00O.I00000oIO(i11o1oil.getClass()).I0001Ioi1lo(i11o1oil);
/* 34 */            if (z) {
/* 41 */                i11o1oil.I000OOo1O(2, true == zI0001Ioi1lo ? i11o1oil : null);
                    }
/* 106 */           return zI0001Ioi1lo;
                }

                public static i11O1oIl I000l1(Class cls) throws ClassNotFoundException {
/* 1 */             Map map = zbb;
/* 7 */             i11O1oIl i11o1oil = (i11O1oIl) map.get(cls);
/* 10 */            if (i11o1oil == null) {
                        try {
/* 21 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 28 */                    i11o1oil = (i11O1oIl) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 34 */                    IoOOl0iOl1io.I000l1("Class initialization cannot fail.", e);
/* 9 */                     return null;
                        }
                    }
/* 38 */            if (i11o1oil != null) {
/* 77 */                return i11o1oil;
                    }
                    try {
/* 53 */                i11O1oIl i11o1oil2 = (i11O1oIl) ((i11O1oIl) i11oI1O.I00000oIO.allocateInstance(cls)).I000OOo1O(6, null);
/* 55 */                if (i11o1oil2 != null) {
/* 57 */                    map.put(cls, i11o1oil2);
/* 60 */                    return i11o1oil2;
                        }
/* 61 */                IOOlIIilOl0.I000iOII();
/* 9 */                 return null;
                    } catch (InstantiationException e2) {
/* 66 */                OoOil11Ol1o.I000oI1ioi(e2);
/* 9 */                 return null;
                    }
                }

                public static i11O1oIl I000lI(i11O1oIl i11o1oil, byte[] bArr, i11IO0ii i11io0ii) throws i11i01Oo {
/* 1 */             int length = bArr.length;
/* 3 */             if (length != 0) {
/* 12 */                i11O1oIl i11o1oil2 = (i11O1oIl) i11o1oil.I000OOo1O(4, null);
                        try {
/* 20 */                    i11lo1 i11lo1VarI00000oIO = i11liii0.I0000Il00O.I00000oIO(i11o1oil2.getClass());
/* 26 */                    i111i0I1 i111i0i1 = new i111i0I1();
/* 29 */                    i11io0ii.getClass();
/* 32 */                    i111i0i1.I0000oI00 = i11io0ii;
/* 36 */                    i11lo1VarI00000oIO.I00000oOI(i11o1oil2, bArr, 0, length, i111i0i1);
/* 39 */                    i11lo1VarI00000oIO.I0000oI00(i11o1oil2);
/* 42 */                    i11o1oil = i11o1oil2;
                        } catch (i11i01Oo e) {
/* 408 */                   throw e;
                        } catch (i11o1IiO e2) {
/* 107 */                   OoOil11Ol1o.I001IIilI0O(e2.getMessage());
/* 2 */                     return null;
                        } catch (IOException e3) {
/* 84 */                    if (e3.getCause() instanceof i11i01Oo) {
/* 92 */                        throw ((i11i01Oo) e3.getCause());
                            }
/* 102 */                   throw new i11i01Oo(e3.getMessage(), e3);
                        } catch (IndexOutOfBoundsException unused) {
/* 72 */                    OoOil11Ol1o.I001IIilI0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 2 */                     return null;
                        }
                    }
/* 43 */            if (i11o1oil == null || I0001Ioi1lo(i11o1oil, true)) {
/* 66 */                return i11o1oil;
                    }
/* 62 */            OoOil11Ol1o.I001IIilI0O(new i11o1IiO().getMessage());
/* 2 */             return null;
                }

                public static Object I000o00OoI0I(Method method, i11O1oIl i11o1oil, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(i11o1oil, objArr);
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

                @Override
                public final int I00000oIO(i11lo1 i11lo1Var) {
/* 8 */             if (I000II()) {
/* 10 */                int iI000O01llI0 = i11lo1Var.I000O01llI0(this);
/* 14 */                if (iI000O01llI0 >= 0) {
/* 16 */                    return iI000O01llI0;
                        }
/* 21 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(iI000O01llI0, "serialized size must be non-negative, was "));
/* 5 */                 return 0;
                    }
/* 30 */            int i = this.zbd & Integer.MAX_VALUE;
/* 31 */            if (i != Integer.MAX_VALUE) {
/* 77 */                return i;
                    }
/* 33 */            int iI000O01llI02 = i11lo1Var.I000O01llI0(this);
/* 37 */            if (iI000O01llI02 >= 0) {
/* 45 */                this.zbd = (this.zbd & Integer.MIN_VALUE) | iI000O01llI02;
/* 47 */                return iI000O01llI02;
                    }
/* 52 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(iI000O01llI02, "serialized size must be non-negative, was "));
/* 5 */             return 0;
                }

                public final void I0000Il00O() {
                    this.zbd &= Integer.MAX_VALUE;
                }

                public final void I0000oI00() {
/* 10 */            this.zbd = (this.zbd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
                }

                public final boolean I000II() {
                    return (this.zbd & Integer.MIN_VALUE) != 0;
                }

                public final void I000O01llI0(i11I0o0ii i11i0o0ii) {
/* 7 */             i11lo1 i11lo1VarI00000oIO = i11liii0.I0000Il00O.I00000oIO(getClass());
/* 11 */            i11I1Ili i11i1ili = i11i0o0ii.I00000oIO;
/* 13 */            if (i11i1ili == null) {
/* 19 */                i11i1ili = new i11I1Ili(0);
/* 22 */                Charset charset = i11Oo1I1i.I00000oIO;
/* 24 */                i11i1ili.I00iiI = i11i0o0ii;
/* 26 */                i11i0o0ii.I00000oIO = i11i1ili;
/* 28 */                VarHandle.storeStoreFence();
                    }
/* 31 */            i11lo1VarI00000oIO.I000II(this, i11i1ili);
                }

                public abstract Object I000OOo1O(int i, i11O1oIl i11o1oil);

                public final int I000OiO() {
/* 8 */             if (I000II()) {
/* 20 */                int iI000O01llI0 = i11liii0.I0000Il00O.I00000oIO(getClass()).I000O01llI0(this);
/* 24 */                if (iI000O01llI0 >= 0) {
/* 26 */                    return iI000O01llI0;
                        }
/* 31 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(iI000O01llI0, "serialized size must be non-negative, was "));
/* 5 */                 return 0;
                    }
/* 40 */            int i = this.zbd & Integer.MAX_VALUE;
/* 41 */            if (i != Integer.MAX_VALUE) {
/* 43 */                return i;
                    }
/* 54 */            int iI000O01llI02 = i11liii0.I0000Il00O.I00000oIO(getClass()).I000O01llI0(this);
/* 58 */            if (iI000O01llI02 >= 0) {
/* 66 */                this.zbd = (this.zbd & Integer.MIN_VALUE) | iI000O01llI02;
/* 68 */                return iI000O01llI02;
                    }
/* 73 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(iI000O01llI02, "serialized size must be non-negative, was "));
/* 5 */             return 0;
                }

                public final i11Ill1l I000iOII() {
/* 7 */             return (i11Ill1l) I000OOo1O(5, null);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 32 */            return i11liii0.I0000Il00O.I00000oIO(getClass()).I00000oIO(this, (i11O1oIl) obj);
                }

                public final int hashCode() {
/* 5 */             if (I000II()) {
/* 38 */                return i11liii0.I0000Il00O.I00000oIO(getClass()).I0000Il00O(this);
                    }
/* 7 */             int i = this.zba;
/* 9 */             if (i != 0) {
/* 27 */                return i;
                    }
/* 21 */            int iI0000Il00O = i11liii0.I0000Il00O.I00000oIO(getClass()).I0000Il00O(this);
/* 25 */            this.zba = iI0000Il00O;
/* 27 */            return iI0000Il00O;
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = i11lIoIO0I.I00000oIO;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            i11lIoIO0I.I0000Il00O(this, sb, 0);
/* 24 */            return sb.toString();
                }
            }
