            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.nio.charset.Charset;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class o001IlOi0O extends loOo1oOil {
                private static final Map zzb = new ConcurrentHashMap();
                protected o0i0oOOIl1Io zzc;
                private int zzd;

                public o001IlOi0O() {
/* 5 */             this.zza = 0;
/* 8 */             this.zzd = -1;
/* 12 */            this.zzc = o0i0oOOIl1Io.I0001Ioi1lo;
                }

                public static Object I0000Il00O(Method method, o001IlOi0O o001iloi0o, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(o001iloi0o, objArr);
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

                public static o0O110 I0000O(loOo1oOil looo1ooil, String str, Object[] objArr) {
                    char cCharAt;
/* 3 */             o0O110 o0o110 = new o0O110();
/* 6 */             o0o110.I00000oIO = looo1ooil;
/* 8 */             o0o110.I00000oOI = str;
/* 10 */            o0o110.I0000Il00O = objArr;
/* 13 */            char cCharAt2 = str.charAt(0);
/* 20 */            if (cCharAt2 < 55296) {
/* 22 */                o0o110.I0000O = cCharAt2;
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
/* 52 */                o0o110.I0000O = i | (cCharAt << i3);
                    }
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            return o0o110;
                }

                public static void I0001Ioi1lo(Class cls, o001IlOi0O o001iloi0o) {
/* 1 */             o001iloi0o.I0000oI00();
/* 6 */             zzb.put(cls, o001iloi0o);
                }

                public static final boolean I000O01llI0(o001IlOi0O o001iloi0o, boolean z) {
/* 9 */             byte bByteValue = ((Byte) o001iloi0o.I000iOII(1, null)).byteValue();
/* 13 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 16 */            if (bByteValue == 0) {
/* 18 */                return false;
                    }
/* 30 */            boolean zI0000Il00O = o0Ioolo.I0000Il00O.I00000oIO(o001iloi0o.getClass()).I0000Il00O(o001iloi0o);
/* 34 */            if (z) {
/* 41 */                o001iloi0o.I000iOII(2, true == zI0000Il00O ? o001iloi0o : null);
                    }
/* 106 */           return zI0000Il00O;
                }

                public static o001IlOi0O I000o00OoI0I(Class cls) throws ClassNotFoundException {
/* 1 */             Map map = zzb;
/* 7 */             o001IlOi0O o001iloi0o = (o001IlOi0O) map.get(cls);
/* 10 */            if (o001iloi0o == null) {
                        try {
/* 21 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 28 */                    o001iloi0o = (o001IlOi0O) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 34 */                    IoOOl0iOl1io.I000l1("Class initialization cannot fail.", e);
/* 9 */                     return null;
                        }
                    }
/* 38 */            if (o001iloi0o != null) {
/* 77 */                return o001iloi0o;
                    }
                    try {
/* 53 */                o001IlOi0O o001iloi0o2 = (o001IlOi0O) ((o001IlOi0O) o0ii0oo.I00000oIO.allocateInstance(cls)).I000iOII(6, null);
/* 55 */                if (o001iloi0o2 != null) {
/* 57 */                    map.put(cls, o001iloi0o2);
/* 60 */                    return o001iloi0o2;
                        }
/* 61 */                IOOlIIilOl0.I000iOII();
/* 9 */                 return null;
                    } catch (InstantiationException e2) {
/* 66 */                OoOil11Ol1o.I000oI1ioi(e2);
/* 9 */                 return null;
                    }
                }

                @Override
                public final int I00000oIO(o0O1iOilloll o0o1ioilloll) {
/* 8 */             if (I000OOo1O()) {
/* 10 */                int iI0000O = o0o1ioilloll.I0000O(this);
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
/* 33 */            int iI0000O2 = o0o1ioilloll.I0000O(this);
/* 37 */            if (iI0000O2 >= 0) {
/* 45 */                this.zzd = (this.zzd & Integer.MIN_VALUE) | iI0000O2;
/* 47 */                return iI0000O2;
                    }
/* 52 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(iI0000O2, "serialized size must be non-negative, was "));
/* 5 */             return 0;
                }

                public final void I0000oI00() {
                    this.zzd &= Integer.MAX_VALUE;
                }

                public final void I000II() {
/* 10 */            this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
                }

                public final boolean I000OOo1O() {
                    return (this.zzd & Integer.MIN_VALUE) != 0;
                }

                public final void I000OiO(loliO00 lolio00) {
/* 7 */             o0O1iOilloll o0o1ioillollI00000oIO = o0Ioolo.I0000Il00O.I00000oIO(getClass());
/* 11 */            o0iO1llOoO o0io1llooo = lolio00.I00000oIO;
/* 13 */            if (o0io1llooo == null) {
/* 18 */                o0io1llooo = new o0iO1llOoO();
/* 21 */                Charset charset = o00oIoII0l1.I00000oIO;
/* 23 */                o0io1llooo.I00000oIO = lolio00;
/* 25 */                lolio00.I00000oIO = o0io1llooo;
/* 27 */                VarHandle.storeStoreFence();
                    }
/* 30 */            o0o1ioillollI00000oIO.I000II(this, o0io1llooo);
                }

                public abstract Object I000iOII(int i, o001IlOi0O o001iloi0o);

                public final int I000l1() {
/* 8 */             if (I000OOo1O()) {
/* 20 */                int iI0000O = o0Ioolo.I0000Il00O.I00000oIO(getClass()).I0000O(this);
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
/* 54 */            int iI0000O2 = o0Ioolo.I0000Il00O.I00000oIO(getClass()).I0000O(this);
/* 58 */            if (iI0000O2 >= 0) {
/* 66 */                this.zzd = (this.zzd & Integer.MIN_VALUE) | iI0000O2;
/* 68 */                return iI0000O2;
                    }
/* 73 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(iI0000O2, "serialized size must be non-negative, was "));
/* 5 */             return 0;
                }

                public final loolIIl0000i I000lI() {
/* 7 */             return (loolIIl0000i) I000iOII(5, null);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 32 */            return o0Ioolo.I0000Il00O.I00000oIO(getClass()).I0000oI00(this, (o001IlOi0O) obj);
                }

                public final int hashCode() {
/* 5 */             if (I000OOo1O()) {
/* 38 */                return o0Ioolo.I0000Il00O.I00000oIO(getClass()).I000O01llI0(this);
                    }
/* 7 */             int i = this.zza;
/* 9 */             if (i != 0) {
/* 27 */                return i;
                    }
/* 21 */            int iI000O01llI0 = o0Ioolo.I0000Il00O.I00000oIO(getClass()).I000O01llI0(this);
/* 25 */            this.zza = iI000O01llI0;
/* 27 */            return iI000O01llI0;
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = o0IO1l1Il.I00000oIO;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            o0IO1l1Il.I0000Il00O(this, sb, 0);
/* 24 */            return sb.toString();
                }

                @Override
                public final boolean zzt() {
/* 2 */             return I000O01llI0(this, true);
                }
            }
