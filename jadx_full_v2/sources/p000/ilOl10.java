            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class ilOl10 extends iilO1O {
                private static final Map zzb = new ConcurrentHashMap();
                protected iooIiiOli zzc;
                private int zzd;

                public ilOl10() {
/* 5 */             this.zza = 0;
/* 8 */             this.zzd = -1;
/* 12 */            this.zzc = iooIiiOli.I0001Ioi1lo;
                }

                public static ilOl10 I0000O(Class cls) throws ClassNotFoundException {
/* 1 */             Map map = zzb;
/* 7 */             ilOl10 ilol10 = (ilOl10) map.get(cls);
/* 10 */            if (ilol10 == null) {
                        try {
/* 21 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 28 */                    ilol10 = (ilOl10) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 34 */                    IoOOl0iOl1io.I000l1("Class initialization cannot fail.", e);
/* 9 */                     return null;
                        }
                    }
/* 38 */            if (ilol10 != null) {
/* 77 */                return ilol10;
                    }
                    try {
/* 53 */                ilOl10 ilol102 = (ilOl10) ((ilOl10) l00iIli.I00000oIO.allocateInstance(cls)).I000lI(6);
/* 55 */                if (ilol102 != null) {
/* 57 */                    map.put(cls, ilol102);
/* 60 */                    return ilol102;
                        }
/* 61 */                IOOlIIilOl0.I000iOII();
/* 9 */                 return null;
                    } catch (InstantiationException e2) {
/* 66 */                OoOil11Ol1o.I000oI1ioi(e2);
/* 9 */                 return null;
                    }
                }

                public static Object I0001Ioi1lo(Method method, ilOl10 ilol10, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(ilol10, objArr);
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

                public static ioIloOilIii I000II(ilOl10 ilol10, String str, Object[] objArr) {
                    char cCharAt;
/* 3 */             ioIloOilIii ioilooiliii = new ioIloOilIii();
/* 6 */             ioilooiliii.I00000oIO = ilol10;
/* 8 */             ioilooiliii.I00000oOI = str;
/* 10 */            ioilooiliii.I0000Il00O = objArr;
/* 13 */            char cCharAt2 = str.charAt(0);
/* 20 */            if (cCharAt2 < 55296) {
/* 22 */                ioilooiliii.I0000O = cCharAt2;
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
/* 52 */                ioilooiliii.I0000O = i | (cCharAt << i3);
                    }
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            return ioilooiliii;
                }

                public static void I000OOo1O(Class cls, ilOl10 ilol10) {
/* 1 */             ilol10.I000O01llI0();
/* 6 */             zzb.put(cls, ilol10);
                }

                @Override
                public final int I00000oIO(ioO0I1oi1lio ioo0i1oi1lio) {
/* 8 */             if (I000l1()) {
/* 10 */                int iI000II = ioo0i1oi1lio.I000II(this);
/* 14 */                if (iI000II >= 0) {
/* 16 */                    return iI000II;
                        }
/* 21 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(iI000II, "serialized size must be non-negative, was "));
/* 5 */                 return 0;
                    }
/* 30 */            int i = this.zzd & Integer.MAX_VALUE;
/* 31 */            if (i != Integer.MAX_VALUE) {
/* 77 */                return i;
                    }
/* 33 */            int iI000II2 = ioo0i1oi1lio.I000II(this);
/* 37 */            if (iI000II2 >= 0) {
/* 45 */                this.zzd = (this.zzd & Integer.MIN_VALUE) | iI000II2;
/* 47 */                return iI000II2;
                    }
/* 52 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(iI000II2, "serialized size must be non-negative, was "));
/* 5 */             return 0;
                }

                @Override
                public final int I0000Il00O() {
/* 8 */             if (I000l1()) {
/* 20 */                int iI000II = ioIOiiiiO0.I0000Il00O.I00000oIO(getClass()).I000II(this);
/* 24 */                if (iI000II >= 0) {
/* 26 */                    return iI000II;
                        }
/* 31 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(iI000II, "serialized size must be non-negative, was "));
/* 5 */                 return 0;
                    }
/* 40 */            int i = this.zzd & Integer.MAX_VALUE;
/* 41 */            if (i != Integer.MAX_VALUE) {
/* 43 */                return i;
                    }
/* 54 */            int iI000II2 = ioIOiiiiO0.I0000Il00O.I00000oIO(getClass()).I000II(this);
/* 58 */            if (iI000II2 >= 0) {
/* 66 */                this.zzd = (this.zzd & Integer.MIN_VALUE) | iI000II2;
/* 68 */                return iI000II2;
                    }
/* 73 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(iI000II2, "serialized size must be non-negative, was "));
/* 5 */             return 0;
                }

                public final ilOl10 I0000oI00() {
/* 6 */             return (ilOl10) I000lI(4);
                }

                public final void I000O01llI0() {
                    this.zzd &= Integer.MAX_VALUE;
                }

                public final void I000OiO() {
/* 10 */            this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
                }

                public final boolean I000iOII() {
/* 8 */             byte bByteValue = ((Byte) I000lI(1)).byteValue();
/* 12 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 15 */            if (bByteValue == 0) {
/* 17 */                return false;
                    }
/* 29 */            boolean zI0000O = ioIOiiiiO0.I0000Il00O.I00000oIO(getClass()).I0000O(this);
/* 34 */            I000lI(2);
/* 55 */            return zI0000O;
                }

                public final boolean I000l1() {
                    return (this.zzd & Integer.MIN_VALUE) != 0;
                }

                public abstract Object I000lI(int i);

                public final ilOI1I0llIi I000o00OoI0I() {
/* 6 */             ilOI1I0llIi iloi1i0llii = (ilOI1I0llIi) I000lI(5);
/* 14 */            if (!iloi1i0llii.I00iOIl.equals(this)) {
/* 22 */                if (!iloi1i0llii.I00iiI.I000l1()) {
/* 26 */                    ilOl10 ilol10I0000oI00 = iloi1i0llii.I00iOIl.I0000oI00();
/* 42 */                    ioIOiiiiO0.I0000Il00O.I00000oIO(ilol10I0000oI00.getClass()).I00000oOI(ilol10I0000oI00, iloi1i0llii.I00iiI);
/* 45 */                    iloi1i0llii.I00iiI = ilol10I0000oI00;
                        }
/* 47 */                ilOl10 ilol10 = iloi1i0llii.I00iiI;
/* 59 */                ioIOiiiiO0.I0000Il00O.I00000oIO(ilol10.getClass()).I00000oOI(ilol10, this);
                    }
/* 110 */           return iloi1i0llii;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 32 */            return ioIOiiiiO0.I0000Il00O.I00000oIO(getClass()).I000O01llI0(this, (ilOl10) obj);
                }

                public final int hashCode() {
/* 5 */             if (I000l1()) {
/* 38 */                return ioIOiiiiO0.I0000Il00O.I00000oIO(getClass()).I0000Il00O(this);
                    }
/* 7 */             int i = this.zza;
/* 9 */             if (i != 0) {
/* 27 */                return i;
                    }
/* 21 */            int iI0000Il00O = ioIOiiiiO0.I0000Il00O.I00000oIO(getClass()).I0000Il00O(this);
/* 25 */            this.zza = iI0000Il00O;
/* 27 */            return iI0000Il00O;
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = io1O00i.I00000oIO;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            io1O00i.I0000Il00O(this, sb, 0);
/* 24 */            return sb.toString();
                }
            }
