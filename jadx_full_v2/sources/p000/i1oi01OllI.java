            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class i1oi01OllI extends i1ilO0II {
                public static final int zzd = 0;
                private static final Map zze = new ConcurrentHashMap();
                private int zzb;
                protected iI1O01I1 zzc;

                public i1oi01OllI() {
/* 5 */             this.zza = 0;
/* 8 */             this.zzb = -1;
/* 12 */            this.zzc = iI1O01I1.I0001Ioi1lo;
                }

                public static i1oi01OllI I0000O(i1oi01OllI i1oi01olli, byte[] bArr, i1o0l0i i1o0l0iVar) throws iI00lI {
/* 1 */             int length = bArr.length;
/* 2 */             if (length != 0) {
/* 5 */                 i1oi01OllI i1oi01olliI000O01llI0 = i1oi01olli.I000O01llI0();
                        try {
/* 15 */                    iI110OIoiOl ii110oioiolI00000oIO = iI10O00O.I0000Il00O.I00000oIO(i1oi01olliI000O01llI0.getClass());
/* 26 */                    ii110oioiolI00000oIO.I000II(i1oi01olliI000O01llI0, bArr, 0, length, new i1O1ll0i0(i1o0l0iVar));
/* 29 */                    ii110oioiolI00000oIO.I0000Il00O(i1oi01olliI000O01llI0);
/* 32 */                    i1oi01olli = i1oi01olliI000O01llI0;
                        } catch (iI00lI e) {
/* 82 */                    if (e.I00iOIl) {
/* 93 */                        throw new iI00lI(e.getMessage(), e);
                            }
/* 98 */                    throw e;
                        } catch (iI11ol0olo e2) {
/* 77 */                    throw e2.I00000oIO();
                        } catch (IOException e3) {
/* 52 */                    if (e3.getCause() instanceof iI00lI) {
/* 60 */                        throw ((iI00lI) e3.getCause());
                            }
/* 70 */                    throw new iI00lI(e3.getMessage(), e3);
                        } catch (IndexOutOfBoundsException unused) {
/* 39 */                    iilo0lOo110.I000II("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 42 */                    return null;
                        }
                    }
/* 33 */            I0010I0i(i1oi01olli);
/* 36 */            return i1oi01olli;
                }

                public static i1oi01OllI I000lI(Class cls) throws ClassNotFoundException {
/* 1 */             Map map = zze;
/* 7 */             i1oi01OllI i1oi01olli = (i1oi01OllI) map.get(cls);
/* 10 */            if (i1oi01olli == null) {
                        try {
/* 21 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 28 */                    i1oi01olli = (i1oi01OllI) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 34 */                    IoOOl0iOl1io.I000l1("Class initialization cannot fail.", e);
/* 9 */                     return null;
                        }
                    }
/* 38 */            if (i1oi01olli != null) {
/* 77 */                return i1oi01olli;
                    }
                    try {
/* 53 */                i1oi01OllI i1oi01olli2 = (i1oi01OllI) ((i1oi01OllI) iI1Oili0OI.I00000oIO.allocateInstance(cls)).I0010o(6);
/* 55 */                if (i1oi01olli2 != null) {
/* 57 */                    map.put(cls, i1oi01olli2);
/* 60 */                    return i1oi01olli2;
                        }
/* 61 */                IOOlIIilOl0.I000iOII();
/* 9 */                 return null;
                    } catch (InstantiationException e2) {
/* 66 */                OoOil11Ol1o.I000oI1ioi(e2);
/* 9 */                 return null;
                    }
                }

                public static void I000o00OoI0I(Class cls, i1oi01OllI i1oi01olli) {
/* 1 */             i1oi01olli.I000II();
/* 6 */             zze.put(cls, i1oi01olli);
                }

                public static iI10oo00io I000oI1ioi(i1ilO0II i1ilo0ii, String str, Object[] objArr) {
                    char cCharAt;
/* 3 */             iI10oo00io ii10oo00io = new iI10oo00io();
/* 6 */             ii10oo00io.I00000oIO = i1ilo0ii;
/* 8 */             ii10oo00io.I00000oOI = str;
/* 10 */            ii10oo00io.I0000Il00O = objArr;
/* 13 */            char cCharAt2 = str.charAt(0);
/* 20 */            if (cCharAt2 < 55296) {
/* 22 */                ii10oo00io.I0000O = cCharAt2;
                    } else {
/* 28 */                int i = cCharAt2 & 8191;
/* 30 */                int i2 = 1;
/* 31 */                int i3 = 13;
                        while (true) {
/* 33 */                    int i4 = i2 + 1;
/* 35 */                    cCharAt = str.charAt(i2);
/* 39 */                    if (cCharAt < 55296) {
                                break;
                            }
/* 44 */                    i |= (cCharAt & 8191) << i3;
/* 45 */                    i3 += 13;
/* 47 */                    i2 = i4;
                        }
/* 52 */                ii10oo00io.I0000O = i | (cCharAt << i3);
                    }
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            return ii10oo00io;
                }

                public static Object I00100l0(Method method, i1oi01OllI i1oi01olli, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(i1oi01olli, objArr);
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

                public static final boolean I00100o1O0lo(i1oi01OllI i1oi01olli, boolean z) {
/* 8 */             byte bByteValue = ((Byte) i1oi01olli.I0010o(1)).byteValue();
/* 12 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 15 */            if (bByteValue == 0) {
/* 17 */                return false;
                    }
/* 29 */            boolean zI0000O = iI10O00O.I0000Il00O.I00000oIO(i1oi01olli.getClass()).I0000O(i1oi01olli);
/* 33 */            if (z) {
/* 36 */                i1oi01olli.I0010o(2);
                    }
/* 106 */           return zI0000O;
                }

                public static void I0010I0i(i1oi01OllI i1oi01olli) throws iI00lI {
/* 1 */             if (i1oi01olli != null && !I00100o1O0lo(i1oi01olli, true)) {
/* 20 */                throw new iI11ol0olo().I00000oIO();
                    }
                }

                @Override
                public final int I0000Il00O(iI110OIoiOl ii110oioiol) {
/* 6 */             if (I0001Ioi1lo()) {
/* 8 */                 int iI0000oI00 = ii110oioiol.I0000oI00(this);
/* 12 */                if (iI0000oI00 >= 0) {
/* 14 */                    return iI0000oI00;
                        }
/* 25 */                OoOil11Ol1o.I00100o1O0lo(String.valueOf(iI0000oI00).length() + 42, iI0000oI00);
/* 5 */                 return 0;
                    }
/* 34 */            int i = this.zzb & Integer.MAX_VALUE;
/* 35 */            if (i != Integer.MAX_VALUE) {
/* 77 */                return i;
                    }
/* 37 */            int iI0000oI002 = ii110oioiol.I0000oI00(this);
/* 41 */            if (iI0000oI002 >= 0) {
/* 49 */                this.zzb = (this.zzb & Integer.MIN_VALUE) | iI0000oI002;
/* 51 */                return iI0000oI002;
                    }
/* 62 */            OoOil11Ol1o.I00100o1O0lo(String.valueOf(iI0000oI002).length() + 42, iI0000oI002);
/* 5 */             return 0;
                }

                public final void I0000oI00(i1lllO0 i1lllo0) {
/* 7 */             iI110OIoiOl ii110oioiolI00000oIO = iI10O00O.I0000Il00O.I00000oIO(getClass());
/* 11 */            Oi1ol0llI oi1ol0llI = i1lllo0.I00000oIO;
/* 13 */            if (oi1ol0llI == null) {
/* 21 */                oi1ol0llI = new Oi1ol0llI(23, false);
/* 24 */                oi1ol0llI.I00iiI = i1lllo0;
/* 26 */                i1lllo0.I00000oIO = oi1ol0llI;
/* 28 */                VarHandle.storeStoreFence();
                    }
/* 31 */            ii110oioiolI00000oIO.I000OOo1O(this, oi1ol0llI);
                }

                public final boolean I0001Ioi1lo() {
                    return (this.zzb & Integer.MIN_VALUE) != 0;
                }

                public final void I000II() {
                    this.zzb &= Integer.MAX_VALUE;
                }

                public final i1oi01OllI I000O01llI0() {
/* 6 */             return (i1oi01OllI) I0010o(4);
                }

                public final i1oIooioiO I000OOo1O() {
/* 6 */             return (i1oIooioiO) I0010o(5);
                }

                public final i1oIooioiO I000OiO() {
/* 6 */             i1oIooioiO i1oiooioio = (i1oIooioiO) I0010o(5);
/* 8 */             i1oiooioio.I0001Ioi1lo(this);
/* 20 */            return i1oiooioio;
                }

                public final void I000iOII() {
/* 10 */            this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
                }

                public final int I000l1() {
/* 6 */             if (I0001Ioi1lo()) {
/* 18 */                int iI0000oI00 = iI10O00O.I0000Il00O.I00000oIO(getClass()).I0000oI00(this);
/* 22 */                if (iI0000oI00 >= 0) {
/* 24 */                    return iI0000oI00;
                        }
/* 35 */                OoOil11Ol1o.I00100o1O0lo(String.valueOf(iI0000oI00).length() + 42, iI0000oI00);
/* 5 */                 return 0;
                    }
/* 44 */            int i = this.zzb & Integer.MAX_VALUE;
/* 45 */            if (i != Integer.MAX_VALUE) {
/* 47 */                return i;
                    }
/* 58 */            int iI0000oI002 = iI10O00O.I0000Il00O.I00000oIO(getClass()).I0000oI00(this);
/* 62 */            if (iI0000oI002 >= 0) {
/* 70 */                this.zzb = (this.zzb & Integer.MIN_VALUE) | iI0000oI002;
/* 72 */                return iI0000oI002;
                    }
/* 83 */            OoOil11Ol1o.I00100o1O0lo(String.valueOf(iI0000oI002).length() + 42, iI0000oI002);
/* 5 */             return 0;
                }

                public abstract Object I0010o(int i);

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 32 */            return iI10O00O.I0000Il00O.I00000oIO(getClass()).I000OiO(this, (i1oi01OllI) obj);
                }

                public final int hashCode() {
/* 5 */             if (I0001Ioi1lo()) {
/* 38 */                return iI10O00O.I0000Il00O.I00000oIO(getClass()).I000O01llI0(this);
                    }
/* 7 */             int i = this.zza;
/* 9 */             if (i != 0) {
/* 27 */                return i;
                    }
/* 21 */            int iI000O01llI0 = iI10O00O.I0000Il00O.I00000oIO(getClass()).I000O01llI0(this);
/* 25 */            this.zza = iI000O01llI0;
/* 27 */            return iI000O01llI0;
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = iI0o1il1.I00000oIO;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            iI0o1il1.I00000oOI(this, sb, 0);
/* 24 */            return sb.toString();
                }
            }
