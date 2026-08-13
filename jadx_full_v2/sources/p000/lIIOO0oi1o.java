            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.nio.charset.Charset;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class lIIOO0oi1o extends l1Ii10o {
                private static final Map zzb = new ConcurrentHashMap();
                protected lOOlilii zzc;
                private int zzd;

                public lIIOO0oi1o() {
/* 5 */             this.zza = 0;
/* 8 */             this.zzd = -1;
/* 12 */            this.zzc = lOOlilii.I0001Ioi1lo;
                }

                public static Object I0000Il00O(Method method, lIIOO0oi1o liioo0oi1o, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(liioo0oi1o, objArr);
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

                public static void I0000oI00(Class cls, lIIOO0oi1o liioo0oi1o) {
/* 1 */             liioo0oi1o.I0000O();
/* 6 */             zzb.put(cls, liioo0oi1o);
                }

                public static final boolean I000II(lIIOO0oi1o liioo0oi1o, boolean z) {
/* 9 */             byte bByteValue = ((Byte) liioo0oi1o.I000OiO(1, null)).byteValue();
/* 13 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 16 */            if (bByteValue == 0) {
/* 18 */                return false;
                    }
/* 30 */            boolean zI0000Il00O = lO1Ilo0lloiO.I0000Il00O.I00000oIO(liioo0oi1o.getClass()).I0000Il00O(liioo0oi1o);
/* 34 */            if (z) {
/* 41 */                liioo0oi1o.I000OiO(2, true == zI0000Il00O ? liioo0oi1o : null);
                    }
/* 106 */           return zI0000Il00O;
                }

                public static lIIOO0oi1o I000iOII(lIIOO0oi1o liioo0oi1o, byte[] bArr, int i, lI0011loIOIo li0011loioio) throws lIi0II001O1I {
/* 1 */             if (i == 0) {
/* 3 */                 return liioo0oi1o;
                    }
/* 11 */            lIIOO0oi1o liioo0oi1o2 = (lIIOO0oi1o) liioo0oi1o.I000OiO(4, null);
                    try {
/* 19 */                lO1liolI0IO lo1lioli0ioI00000oIO = lO1Ilo0lloiO.I0000Il00O.I00000oIO(liioo0oi1o2.getClass());
/* 25 */                i111i0I1 i111i0i1 = new i111i0I1();
/* 28 */                li0011loioio.getClass();
/* 31 */                i111i0i1.I0000oI00 = li0011loioio;
/* 36 */                lo1lioli0ioI00000oIO.I000O01llI0(liioo0oi1o2, bArr, 0, i, i111i0i1);
/* 39 */                lo1lioli0ioI00000oIO.I00000oIO(liioo0oi1o2);
/* 42 */                return liioo0oi1o2;
                    } catch (IOException e) {
/* 60 */                if (e.getCause() instanceof lIi0II001O1I) {
/* 68 */                    throw ((lIi0II001O1I) e.getCause());
                        }
/* 78 */                throw new lIi0II001O1I(e.getMessage(), e);
                    } catch (IndexOutOfBoundsException unused) {
/* 48 */                iilo0lOo110.I0001Ioi1lo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 5 */                 return null;
                    } catch (lIi0II001O1I e2) {
/* 204 */               throw e2;
                    } catch (lOOOIoiiilo e3) {
/* 83 */                iilo0lOo110.I0001Ioi1lo(e3.getMessage());
/* 5 */                 return null;
                    }
                }

                public static lIIOO0oi1o I000lI(Class cls) throws ClassNotFoundException {
/* 1 */             Map map = zzb;
/* 7 */             lIIOO0oi1o liioo0oi1o = (lIIOO0oi1o) map.get(cls);
/* 10 */            if (liioo0oi1o == null) {
                        try {
/* 21 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 28 */                    liioo0oi1o = (lIIOO0oi1o) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 34 */                    IoOOl0iOl1io.I000l1("Class initialization cannot fail.", e);
/* 9 */                     return null;
                        }
                    }
/* 38 */            if (liioo0oi1o != null) {
/* 77 */                return liioo0oi1o;
                    }
                    try {
/* 53 */                lIIOO0oi1o liioo0oi1o2 = (lIIOO0oi1o) ((lIIOO0oi1o) lOiiillo.I00000oIO.allocateInstance(cls)).I000OiO(6, null);
/* 55 */                if (liioo0oi1o2 != null) {
/* 57 */                    map.put(cls, liioo0oi1o2);
/* 60 */                    return liioo0oi1o2;
                        }
/* 61 */                IOOlIIilOl0.I000iOII();
/* 9 */                 return null;
                    } catch (InstantiationException e2) {
/* 66 */                OoOil11Ol1o.I000oI1ioi(e2);
/* 9 */                 return null;
                    }
                }

                @Override
                public final int I00000oIO(lO1liolI0IO lo1lioli0io) {
/* 8 */             if (I000O01llI0()) {
/* 10 */                int iI0000O = lo1lioli0io.I0000O(this);
/* 14 */                if (iI0000O >= 0) {
/* 16 */                    return iI0000O;
                        }
/* 21 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(iI0000O, "serialized size must be non-negative, was "));
/* 5 */                 return 0;
                    }
/* 30 */            int i = this.zzd & Integer.MAX_VALUE;
/* 31 */            if (i != Integer.MAX_VALUE) {
/* 77 */                return i;
                    }
/* 33 */            int iI0000O2 = lo1lioli0io.I0000O(this);
/* 37 */            if (iI0000O2 >= 0) {
/* 45 */                this.zzd = (this.zzd & Integer.MIN_VALUE) | iI0000O2;
/* 47 */                return iI0000O2;
                    }
/* 52 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(iI0000O2, "serialized size must be non-negative, was "));
/* 5 */             return 0;
                }

                public final void I0000O() {
                    this.zzd &= Integer.MAX_VALUE;
                }

                public final void I0001Ioi1lo() {
/* 10 */            this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
                }

                public final boolean I000O01llI0() {
                    return (this.zzd & Integer.MIN_VALUE) != 0;
                }

                public final void I000OOo1O(l1lo010IOi0 l1lo010ioi0) {
/* 7 */             lO1liolI0IO lo1lioli0ioI00000oIO = lO1Ilo0lloiO.I0000Il00O.I00000oIO(getClass());
/* 11 */            i11I1Ili i11i1ili = l1lo010ioi0.I00000oIO;
/* 13 */            if (i11i1ili == null) {
/* 19 */                i11i1ili = new i11I1Ili(7);
/* 22 */                Charset charset = lIOOlo11OOii.I00000oIO;
/* 24 */                i11i1ili.I00iiI = l1lo010ioi0;
/* 26 */                l1lo010ioi0.I00000oIO = i11i1ili;
/* 28 */                VarHandle.storeStoreFence();
                    }
/* 31 */            lo1lioli0ioI00000oIO.I0000oI00(this, i11i1ili);
                }

                public abstract Object I000OiO(int i, lIIOO0oi1o liioo0oi1o);

                public final int I000l1() {
/* 8 */             if (I000O01llI0()) {
/* 20 */                int iI0000O = lO1Ilo0lloiO.I0000Il00O.I00000oIO(getClass()).I0000O(this);
/* 24 */                if (iI0000O >= 0) {
/* 26 */                    return iI0000O;
                        }
/* 31 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(iI0000O, "serialized size must be non-negative, was "));
/* 5 */                 return 0;
                    }
/* 40 */            int i = this.zzd & Integer.MAX_VALUE;
/* 41 */            if (i != Integer.MAX_VALUE) {
/* 43 */                return i;
                    }
/* 54 */            int iI0000O2 = lO1Ilo0lloiO.I0000Il00O.I00000oIO(getClass()).I0000O(this);
/* 58 */            if (iI0000O2 >= 0) {
/* 66 */                this.zzd = (this.zzd & Integer.MIN_VALUE) | iI0000O2;
/* 68 */                return iI0000O2;
                    }
/* 73 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(iI0000O2, "serialized size must be non-negative, was "));
/* 5 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 32 */            return lO1Ilo0lloiO.I0000Il00O.I00000oIO(getClass()).I0001Ioi1lo(this, (lIIOO0oi1o) obj);
                }

                public final int hashCode() {
/* 5 */             if (I000O01llI0()) {
/* 38 */                return lO1Ilo0lloiO.I0000Il00O.I00000oIO(getClass()).I000II(this);
                    }
/* 7 */             int i = this.zza;
/* 9 */             if (i != 0) {
/* 27 */                return i;
                    }
/* 21 */            int iI000II = lO1Ilo0lloiO.I0000Il00O.I00000oIO(getClass()).I000II(this);
/* 25 */            this.zza = iI000II;
/* 27 */            return iI000II;
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = lO01oiio.I00000oIO;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            lO01oiio.I0000Il00O(this, sb, 0);
/* 24 */            return sb.toString();
                }
            }
