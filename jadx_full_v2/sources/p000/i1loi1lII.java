            package p000;

            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class i1loi1lII extends i1i1lOIiiIIO {
                private static final Map zzb = new ConcurrentHashMap();
                protected iI0Ol11Il010 zzc;
                private int zzd;

                public i1loi1lII() {
/* 5 */             this.zza = 0;
/* 8 */             this.zzd = -1;
/* 12 */            this.zzc = iI0Ol11Il010.I0000oI00;
                }

                public static i1loi1lII I00000oOI(Class cls) throws ClassNotFoundException {
/* 1 */             Map map = zzb;
/* 7 */             i1loi1lII i1loi1lii = (i1loi1lII) map.get(cls);
/* 10 */            if (i1loi1lii == null) {
                        try {
/* 21 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 28 */                    i1loi1lii = (i1loi1lII) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 34 */                    IoOOl0iOl1io.I000l1("Class initialization cannot fail.", e);
/* 9 */                     return null;
                        }
                    }
/* 38 */            if (i1loi1lii != null) {
/* 77 */                return i1loi1lii;
                    }
                    try {
/* 53 */                i1loi1lII i1loi1lii2 = (i1loi1lII) ((i1loi1lII) iI0lo1Oli.I00000oIO.allocateInstance(cls)).I00000oIO(6);
/* 55 */                if (i1loi1lii2 != null) {
/* 57 */                    map.put(cls, i1loi1lii2);
/* 60 */                    return i1loi1lii2;
                        }
/* 61 */                IOOlIIilOl0.I000iOII();
/* 9 */                 return null;
                    } catch (InstantiationException e2) {
/* 66 */                OoOil11Ol1o.I000oI1ioi(e2);
/* 9 */                 return null;
                    }
                }

                public static Object I0000O(Method method, i1loi1lII i1loi1lii, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(i1loi1lii, objArr);
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

                public static void I0001Ioi1lo(Class cls, i1loi1lII i1loi1lii) {
/* 1 */             i1loi1lii.I0000oI00();
/* 6 */             zzb.put(cls, i1loi1lii);
                }

                public abstract Object I00000oIO(int i);

                public final i1loi1lII I0000Il00O() {
/* 6 */             return (i1loi1lII) I00000oIO(4);
                }

                public final void I0000oI00() {
                    this.zzd &= Integer.MAX_VALUE;
                }

                public final void I000II() {
/* 10 */            this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
                }

                public final boolean I000O01llI0() {
                    return (this.zzd & Integer.MIN_VALUE) != 0;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 32 */            return iI00o0I11.I0000Il00O.I00000oIO(getClass()).I0000O(this, (i1loi1lII) obj);
                }

                public final int hashCode() {
/* 5 */             if (I000O01llI0()) {
/* 38 */                return iI00o0I11.I0000Il00O.I00000oIO(getClass()).I0000Il00O(this);
                    }
/* 7 */             int i = this.zza;
/* 9 */             if (i != 0) {
/* 27 */                return i;
                    }
/* 21 */            int iI0000Il00O = iI00o0I11.I0000Il00O.I00000oIO(getClass()).I0000Il00O(this);
/* 25 */            this.zza = iI0000Il00O;
/* 27 */            return iI0000Il00O;
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = i1ooli0o1oO1.I00000oIO;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            i1ooli0o1oO1.I0000Il00O(this, sb, 0);
/* 24 */            return sb.toString();
                }
            }
