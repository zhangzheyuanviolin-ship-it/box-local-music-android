            package p000;

            import java.io.IOException;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class iOlOoOlI0li1 extends iOl10IOiOi0 {
                private static final Map zzd = new ConcurrentHashMap();
                private int zzb;
                protected iOo00o zzc;

                public iOlOoOlI0li1() {
/* 5 */             this.zza = 0;
/* 8 */             this.zzb = -1;
/* 12 */            this.zzc = iOo00o.I0000oI00;
                }

                public static iOlOoOlI0li1 I0000O(Class cls) throws ClassNotFoundException {
/* 1 */             Map map = zzd;
/* 7 */             iOlOoOlI0li1 ioloooli0li1 = (iOlOoOlI0li1) map.get(cls);
/* 10 */            if (ioloooli0li1 == null) {
                        try {
/* 21 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 28 */                    ioloooli0li1 = (iOlOoOlI0li1) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 34 */                    IoOOl0iOl1io.I000l1("Class initialization cannot fail.", e);
/* 9 */                     return null;
                        }
                    }
/* 38 */            if (ioloooli0li1 != null) {
/* 77 */                return ioloooli0li1;
                    }
                    try {
/* 53 */                iOlOoOlI0li1 ioloooli0li12 = (iOlOoOlI0li1) ((iOlOoOlI0li1) iOo0Ii1l.I00000oIO.allocateInstance(cls)).I000O01llI0(6);
/* 55 */                if (ioloooli0li12 != null) {
/* 57 */                    map.put(cls, ioloooli0li12);
/* 60 */                    return ioloooli0li12;
                        }
/* 61 */                IOOlIIilOl0.I000iOII();
/* 9 */                 return null;
                    } catch (InstantiationException e2) {
/* 66 */                OoOil11Ol1o.I000oI1ioi(e2);
/* 9 */                 return null;
                    }
                }

                public static void I0000oI00(Class cls, iOlOoOlI0li1 ioloooli0li1) {
/* 1 */             ioloooli0li1.I00000oOI();
/* 6 */             zzd.put(cls, ioloooli0li1);
                }

                public static Object I0001Ioi1lo(Method method, iOlOoOlI0li1 ioloooli0li1, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(ioloooli0li1, objArr);
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

                public static iOlOoOlI0li1 I000II(iOlOoOlI0li1 ioloooli0li1, byte[] bArr, iOlO11i iolo11i) throws iOlio0iO001 {
/* 1 */             int length = bArr.length;
/* 2 */             if (length != 0) {
/* 11 */                iOlOoOlI0li1 ioloooli0li12 = (iOlOoOlI0li1) ioloooli0li1.I000O01llI0(4);
                        try {
/* 19 */                    iOloi11 ioloi11I00000oIO = iOloOOOIOII.I00000oOI.I00000oIO(ioloooli0li12.getClass());
/* 25 */                    i1O1ll0i0 i1o1ll0i0 = new i1O1ll0i0();
/* 28 */                    iolo11i.getClass();
/* 33 */                    ioloi11I00000oIO.I00000oOI(ioloooli0li12, bArr, 0, length, i1o1ll0i0);
/* 36 */                    ioloi11I00000oIO.I0000O(ioloooli0li12);
/* 39 */                    ioloooli0li1 = ioloooli0li12;
                        } catch (iOlio0iO001 e) {
/* 408 */                   throw e;
                        } catch (iOo00I0 e2) {
/* 145 */                   throw new iOlio0iO001(e2.getMessage());
                        } catch (IOException e3) {
/* 115 */                   if (e3.getCause() instanceof iOlio0iO001) {
/* 123 */                       throw ((iOlio0iO001) e3.getCause());
                            }
/* 133 */                   throw new iOlio0iO001(e3.getMessage(), e3);
                        } catch (IndexOutOfBoundsException unused) {
/* 106 */                   throw new iOlio0iO001("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    }
/* 40 */            if (ioloooli0li1 != null) {
/* 42 */                boolean zZzi = true;
/* 49 */                byte bByteValue = ((Byte) ioloooli0li1.I000O01llI0(1)).byteValue();
/* 53 */                if (bByteValue != 1) {
/* 56 */                    if (bByteValue == 0) {
/* 58 */                        zZzi = false;
                            } else {
/* 70 */                        zZzi = iOloOOOIOII.I00000oOI.I00000oIO(ioloooli0li1.getClass()).zzi(ioloooli0li1);
/* 75 */                        ioloooli0li1.I000O01llI0(2);
                            }
                        }
/* 78 */                if (!zZzi) {
/* 97 */                    throw new iOlio0iO001(new iOo00I0("Message was missing required fields.  (Lite runtime could not determine which fields were missing).").getMessage());
                        }
                    }
/* 98 */            return ioloooli0li1;
                }

                public final boolean I00000oIO() {
                    return (this.zzb & Integer.MIN_VALUE) != 0;
                }

                public final void I00000oOI() {
                    this.zzb &= Integer.MAX_VALUE;
                }

                public final void I0000Il00O() {
/* 10 */            this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
                }

                public abstract Object I000O01llI0(int i);

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 32 */            return iOloOOOIOII.I00000oOI.I00000oIO(getClass()).I0000Il00O(this, (iOlOoOlI0li1) obj);
                }

                public final int hashCode() {
/* 5 */             if (I00000oIO()) {
/* 38 */                return iOloOOOIOII.I00000oOI.I00000oIO(getClass()).I00000oIO(this);
                    }
/* 7 */             int i = this.zza;
/* 9 */             if (i != 0) {
/* 27 */                return i;
                    }
/* 21 */            int iI00000oIO = iOloOOOIOII.I00000oOI.I00000oIO(getClass()).I00000oIO(this);
/* 25 */            this.zza = iI00000oIO;
/* 27 */            return iI00000oIO;
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = iOllO0110.I00000oIO;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            iOllO0110.I00000oOI(this, sb, 0);
/* 24 */            return sb.toString();
                }
            }
