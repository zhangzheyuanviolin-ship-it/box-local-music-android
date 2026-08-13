            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.nio.charset.Charset;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class illOil extends il00ioIl {
                private static final Map zzb = new ConcurrentHashMap();
                protected l01IO0I1I zzc;
                private int zzd;

                public illOil() {
/* 5 */             this.zza = 0;
/* 8 */             this.zzd = -1;
/* 12 */            this.zzc = l01IO0I1I.I0001Ioi1lo;
                }

                public static void I0000oI00(l1o1I1oIO l1o1i1oio, illOil illoil, int i, l0OIO1o l0oio1o) {
/* 1 */             if (l1o1i1oio != null) {
/* 3 */                 l0OIO1o l0oio1o2 = l0OIO1o.I00iiI;
                    } else {
/* 8 */                 I000II.I000iOII("Null containingTypeDefaultInstance");
                    }
                }

                public static illOil I0001Ioi1lo(Class cls) throws ClassNotFoundException {
/* 1 */             Map map = zzb;
/* 7 */             illOil illoil = (illOil) map.get(cls);
/* 10 */            if (illoil == null) {
                        try {
/* 21 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 28 */                    illoil = (illOil) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 34 */                    IoOOl0iOl1io.I000l1("Class initialization cannot fail.", e);
/* 9 */                     return null;
                        }
                    }
/* 38 */            if (illoil != null) {
/* 77 */                return illoil;
                    }
                    try {
/* 53 */                illOil illoil2 = (illOil) ((illOil) l0II0IlI.I00000oIO.allocateInstance(cls)).I000oI1ioi(6, null);
/* 55 */                if (illoil2 != null) {
/* 57 */                    map.put(cls, illoil2);
/* 60 */                    return illoil2;
                        }
/* 61 */                IOOlIIilOl0.I000iOII();
/* 9 */                 return null;
                    } catch (InstantiationException e2) {
/* 66 */                OoOil11Ol1o.I000oI1ioi(e2);
/* 9 */                 return null;
                    }
                }

                public static Object I000II(Method method, illOil illoil, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(illoil, objArr);
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

                public static ioilo0olI0lI I000O01llI0(il00ioIl il00ioil, String str, Object[] objArr) {
                    char cCharAt;
/* 3 */             ioilo0olI0lI ioilo0oli0li = new ioilo0olI0lI();
/* 6 */             ioilo0oli0li.I00000oIO = il00ioil;
/* 8 */             ioilo0oli0li.I00000oOI = str;
/* 10 */            ioilo0oli0li.I0000Il00O = objArr;
/* 13 */            char cCharAt2 = str.charAt(0);
/* 20 */            if (cCharAt2 < 55296) {
/* 22 */                ioilo0oli0li.I0000O = cCharAt2;
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
/* 52 */                ioilo0oli0li.I0000O = i | (cCharAt << i3);
                    }
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            return ioilo0oli0li;
                }

                public static void I000OiO(Class cls, illOil illoil) {
/* 1 */             illoil.I000OOo1O();
/* 6 */             zzb.put(cls, illoil);
                }

                public static final boolean I000l1(illOil illoil, boolean z) {
/* 9 */             byte bByteValue = ((Byte) illoil.I000oI1ioi(1, null)).byteValue();
/* 13 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 16 */            if (bByteValue == 0) {
/* 18 */                return false;
                    }
/* 30 */            boolean zI0000Il00O = ioiO0iOooii.I0000Il00O.I00000oIO(illoil.getClass()).I0000Il00O(illoil);
/* 34 */            if (z) {
/* 41 */                illoil.I000oI1ioi(2, true == zI0000Il00O ? illoil : null);
                    }
/* 106 */           return zI0000Il00O;
                }

                @Override
                public final boolean I00000oIO() {
/* 2 */             return I000l1(this, true);
                }

                @Override
                public final int I00000oOI(iooIIllo iooiillo) {
/* 8 */             if (I000lI()) {
/* 10 */                int iI0000oI00 = iooiillo.I0000oI00(this);
/* 14 */                if (iI0000oI00 >= 0) {
/* 16 */                    return iI0000oI00;
                        }
/* 21 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(iI0000oI00, "serialized size must be non-negative, was "));
/* 5 */                 return 0;
                    }
/* 30 */            int i = this.zzd & Integer.MAX_VALUE;
/* 31 */            if (i != Integer.MAX_VALUE) {
/* 77 */                return i;
                    }
/* 33 */            int iI0000oI002 = iooiillo.I0000oI00(this);
/* 37 */            if (iI0000oI002 >= 0) {
/* 45 */                this.zzd = (this.zzd & Integer.MIN_VALUE) | iI0000oI002;
/* 47 */                return iI0000oI002;
                    }
/* 52 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(iI0000oI002, "serialized size must be non-negative, was "));
/* 5 */             return 0;
                }

                public final int I0000Il00O() {
/* 8 */             if (I000lI()) {
/* 20 */                int iI0000oI00 = ioiO0iOooii.I0000Il00O.I00000oIO(getClass()).I0000oI00(this);
/* 24 */                if (iI0000oI00 >= 0) {
/* 26 */                    return iI0000oI00;
                        }
/* 31 */                I000II.I001IO000(Oi010OO0.I000oI1ioi(iI0000oI00, "serialized size must be non-negative, was "));
/* 5 */                 return 0;
                    }
/* 40 */            int i = this.zzd & Integer.MAX_VALUE;
/* 41 */            if (i != Integer.MAX_VALUE) {
/* 43 */                return i;
                    }
/* 54 */            int iI0000oI002 = ioiO0iOooii.I0000Il00O.I00000oIO(getClass()).I0000oI00(this);
/* 58 */            if (iI0000oI002 >= 0) {
/* 66 */                this.zzd = (this.zzd & Integer.MIN_VALUE) | iI0000oI002;
/* 68 */                return iI0000oI002;
                    }
/* 73 */            I000II.I001IO000(Oi010OO0.I000oI1ioi(iI0000oI002, "serialized size must be non-negative, was "));
/* 5 */             return 0;
                }

                public final ililOli1l I0000O() {
/* 7 */             return (ililOli1l) I000oI1ioi(5, null);
                }

                public final void I000OOo1O() {
                    this.zzd &= Integer.MAX_VALUE;
                }

                public final void I000iOII() {
/* 10 */            this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
                }

                public final boolean I000lI() {
                    return (this.zzd & Integer.MIN_VALUE) != 0;
                }

                public final void I000o00OoI0I(ilIO10iO ilio10io) {
/* 7 */             iooIIllo iooiilloI00000oIO = ioiO0iOooii.I0000Il00O.I00000oIO(getClass());
/* 11 */            i1IoOl i1iool = ilio10io.I00000oIO;
/* 13 */            if (i1iool == null) {
/* 18 */                i1iool = new i1IoOl();
/* 21 */                Charset charset = iloi1OI100li.I00000oIO;
/* 23 */                i1iool.I00iOIl = ilio10io;
/* 25 */                ilio10io.I00000oIO = i1iool;
/* 27 */                VarHandle.storeStoreFence();
                    }
/* 30 */            iooiilloI00000oIO.I0000O(this, i1iool);
                }

                public abstract Object I000oI1ioi(int i, illOil illoil);

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 32 */            return ioiO0iOooii.I0000Il00O.I00000oIO(getClass()).I0001Ioi1lo(this, (illOil) obj);
                }

                public final int hashCode() {
/* 5 */             if (I000lI()) {
/* 38 */                return ioiO0iOooii.I0000Il00O.I00000oIO(getClass()).I000O01llI0(this);
                    }
/* 7 */             int i = this.zza;
/* 9 */             if (i != 0) {
/* 27 */                return i;
                    }
/* 21 */            int iI000O01llI0 = ioiO0iOooii.I0000Il00O.I00000oIO(getClass()).I000O01llI0(this);
/* 25 */            this.zza = iI000O01llI0;
/* 27 */            return iI000O01llI0;
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = ioOiI0OI.I00000oIO;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            ioOiI0OI.I0000Il00O(this, sb, 0);
/* 24 */            return sb.toString();
                }
            }
