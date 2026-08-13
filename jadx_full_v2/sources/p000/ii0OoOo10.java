            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.nio.charset.Charset;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class ii0OoOo10 extends ii00oo {
                private static final Map zzb = new ConcurrentHashMap();
                protected ii10O1i0I zzc;
                private int zzd;

                public ii0OoOo10() {
/* 5 */             this.zza = 0;
/* 8 */             this.zzd = -1;
/* 12 */            this.zzc = ii10O1i0I.I0001Ioi1lo;
                }

                public static ii0OoOo10 I0001Ioi1lo(Class cls) throws ClassNotFoundException {
/* 1 */             Map map = zzb;
/* 7 */             ii0OoOo10 ii0oooo10 = (ii0OoOo10) map.get(cls);
/* 10 */            if (ii0oooo10 == null) {
                        try {
/* 21 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 28 */                    ii0oooo10 = (ii0OoOo10) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 34 */                    IoOOl0iOl1io.I000l1("Class initialization cannot fail.", e);
/* 9 */                     return null;
                        }
                    }
/* 38 */            if (ii0oooo10 != null) {
/* 77 */                return ii0oooo10;
                    }
                    try {
/* 53 */                ii0OoOo10 ii0oooo102 = (ii0OoOo10) ((ii0OoOo10) ii10Oo1I0.I00000oIO.allocateInstance(cls)).I0010I0i(6, null);
/* 55 */                if (ii0oooo102 != null) {
/* 57 */                    map.put(cls, ii0oooo102);
/* 60 */                    return ii0oooo102;
                        }
/* 61 */                IOOlIIilOl0.I000iOII();
/* 9 */                 return null;
                    } catch (InstantiationException e2) {
/* 66 */                OoOil11Ol1o.I000oI1ioi(e2);
/* 9 */                 return null;
                    }
                }

                public static ii0OoOo10 I000O01llI0(ii0OoOo10 ii0oooo10, byte[] bArr, ii0II11oi0I ii0ii11oi0i) throws ii0iI11ol {
/* 1 */             int length = bArr.length;
/* 3 */             if (length != 0) {
/* 6 */                 ii0OoOo10 ii0oooo10I000II = ii0oooo10.I000II();
                        try {
/* 16 */                    ii0oioOi00i ii0oiooi00iI00000oIO = ii0oIOiIl.I0000Il00O.I00000oIO(ii0oooo10I000II.getClass());
/* 22 */                    i111i0I1 i111i0i1 = new i111i0I1();
/* 25 */                    ii0ii11oi0i.getClass();
/* 28 */                    i111i0i1.I0000oI00 = ii0ii11oi0i;
/* 32 */                    ii0oiooi00iI00000oIO.I000II(ii0oooo10I000II, bArr, 0, length, i111i0i1);
/* 35 */                    ii0oiooi00iI00000oIO.I00000oIO(ii0oooo10I000II);
/* 38 */                    ii0oooo10 = ii0oooo10I000II;
                        } catch (ii0iI11ol e) {
/* 111 */                   if (e.I00iOIl) {
/* 122 */                       throw new ii0iI11ol(e.getMessage(), e);
                            }
/* 408 */                   throw e;
                        } catch (ii10Il0l e2) {
/* 103 */                   OoOil11Ol1o.I001iOo1i0O(e2.getMessage());
/* 2 */                     return null;
                        } catch (IOException e3) {
/* 80 */                    if (e3.getCause() instanceof ii0iI11ol) {
/* 88 */                        throw ((ii0iI11ol) e3.getCause());
                            }
/* 98 */                    throw new ii0iI11ol(e3.getMessage(), e3);
                        } catch (IndexOutOfBoundsException unused) {
/* 68 */                    OoOil11Ol1o.I001iOo1i0O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 2 */                     return null;
                        }
                    }
/* 39 */            if (ii0oooo10 == null || I000oI1ioi(ii0oooo10, true)) {
/* 62 */                return ii0oooo10;
                    }
/* 58 */            OoOil11Ol1o.I001iOo1i0O(new ii10Il0l().getMessage());
/* 2 */             return null;
                }

                public static ii0i1l11 I000OOo1O(ii0i1l11 ii0i1l11Var) {
/* 1 */             int size = ii0i1l11Var.size();
/* 11 */            return ii0i1l11Var.zzd(size == 0 ? 10 : size + size);
                }

                public static Object I000OiO(Method method, ii0OoOo10 ii0oooo10, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(ii0oooo10, objArr);
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

                public static void I000lI(Class cls, ii0OoOo10 ii0oooo10) {
/* 1 */             ii0oooo10.I000l1();
/* 6 */             zzb.put(cls, ii0oooo10);
                }

                public static final boolean I000oI1ioi(ii0OoOo10 ii0oooo10, boolean z) {
/* 9 */             byte bByteValue = ((Byte) ii0oooo10.I0010I0i(1, null)).byteValue();
/* 13 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 16 */            if (bByteValue == 0) {
/* 18 */                return false;
                    }
/* 30 */            boolean zI0000O = ii0oIOiIl.I0000Il00O.I00000oIO(ii0oooo10.getClass()).I0000O(ii0oooo10);
/* 34 */            if (z) {
/* 41 */                ii0oooo10.I0010I0i(2, true == zI0000O ? ii0oooo10 : null);
                    }
/* 106 */           return zI0000O;
                }

                @Override
                public final int I00000oIO(ii0oioOi00i ii0oiooi00i) {
/* 8 */             if (I00100l0()) {
/* 10 */                int iI000OOo1O = ii0oiooi00i.I000OOo1O(this);
/* 14 */                if (iI000OOo1O >= 0) {
/* 16 */                    return iI000OOo1O;
                        }
/* 21 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(iI000OOo1O, "serialized size must be non-negative, was "));
/* 5 */                 return 0;
                    }
/* 30 */            int i = this.zzd & Integer.MAX_VALUE;
/* 31 */            if (i != Integer.MAX_VALUE) {
/* 77 */                return i;
                    }
/* 33 */            int iI000OOo1O2 = ii0oiooi00i.I000OOo1O(this);
/* 37 */            if (iI000OOo1O2 >= 0) {
/* 45 */                this.zzd = (this.zzd & Integer.MIN_VALUE) | iI000OOo1O2;
/* 47 */                return iI000OOo1O2;
                    }
/* 52 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(iI000OOo1O2, "serialized size must be non-negative, was "));
/* 5 */             return 0;
                }

                public final ii0OOl I0000oI00() {
/* 7 */             return (ii0OOl) I0010I0i(5, null);
                }

                public final ii0OoOo10 I000II() {
/* 7 */             return (ii0OoOo10) I0010I0i(4, null);
                }

                public final void I000iOII() {
/* 11 */            ii0oIOiIl.I0000Il00O.I00000oIO(getClass()).I00000oIO(this);
/* 14 */            I000l1();
                }

                public final void I000l1() {
                    this.zzd &= Integer.MAX_VALUE;
                }

                public final void I000o00OoI0I() {
/* 10 */            this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
                }

                public final boolean I00100l0() {
                    return (this.zzd & Integer.MIN_VALUE) != 0;
                }

                public final void I00100o1O0lo(ii0I1Il ii0i1il) {
/* 7 */             ii0oioOi00i ii0oiooi00iI00000oIO = ii0oIOiIl.I0000Il00O.I00000oIO(getClass());
/* 11 */            i0OI1l1Oo i0oi1l1oo = ii0i1il.I00000oIO;
/* 13 */            if (i0oi1l1oo == null) {
/* 18 */                i0oi1l1oo = new i0OI1l1Oo();
/* 21 */                Charset charset = ii0i1ll10I0.I00000oIO;
/* 23 */                i0oi1l1oo.I00iOIl = ii0i1il;
/* 25 */                ii0i1il.I00000oIO = i0oi1l1oo;
/* 27 */                VarHandle.storeStoreFence();
                    }
/* 30 */            ii0oiooi00iI00000oIO.I0000Il00O(this, i0oi1l1oo);
                }

                public abstract Object I0010I0i(int i, ii0OoOo10 ii0oooo10);

                public final int I0010o() {
/* 8 */             if (I00100l0()) {
/* 20 */                int iI000OOo1O = ii0oIOiIl.I0000Il00O.I00000oIO(getClass()).I000OOo1O(this);
/* 24 */                if (iI000OOo1O >= 0) {
/* 26 */                    return iI000OOo1O;
                        }
/* 31 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(iI000OOo1O, "serialized size must be non-negative, was "));
/* 5 */                 return 0;
                    }
/* 40 */            int i = this.zzd & Integer.MAX_VALUE;
/* 41 */            if (i != Integer.MAX_VALUE) {
/* 43 */                return i;
                    }
/* 54 */            int iI000OOo1O2 = ii0oIOiIl.I0000Il00O.I00000oIO(getClass()).I000OOo1O(this);
/* 58 */            if (iI000OOo1O2 >= 0) {
/* 66 */                this.zzd = (this.zzd & Integer.MIN_VALUE) | iI000OOo1O2;
/* 68 */                return iI000OOo1O2;
                    }
/* 73 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(iI000OOo1O2, "serialized size must be non-negative, was "));
/* 5 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 32 */            return ii0oIOiIl.I0000Il00O.I00000oIO(getClass()).I0001Ioi1lo(this, (ii0OoOo10) obj);
                }

                public final int hashCode() {
/* 5 */             if (I00100l0()) {
/* 38 */                return ii0oIOiIl.I0000Il00O.I00000oIO(getClass()).I0000oI00(this);
                    }
/* 7 */             int i = this.zza;
/* 9 */             if (i != 0) {
/* 27 */                return i;
                    }
/* 21 */            int iI0000oI00 = ii0oIOiIl.I0000Il00O.I00000oIO(getClass()).I0000oI00(this);
/* 25 */            this.zza = iI0000oI00;
/* 27 */            return iI0000oI00;
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = ii0lOioi10.I00000oIO;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            ii0lOioi10.I0000Il00O(this, sb, 0);
/* 24 */            return sb.toString();
                }
            }
